const Company = require('../models/Company');

class CompanyController {
  async getAllCompanies(req, res) {
    try {
      const companies = await Company.find();
      // Add full URL path to images
      const companiesWithImageUrls = companies.map(company => ({
        ...company.toObject(),
        image: `${req.protocol}://${req.get('host')}/uploads/${company.image}`
      }));
      res.json(companiesWithImageUrls);
    } catch (error) {
      res.status(500).json({ message: error.message });
    }
  }

  // For admin use - to add new companies
  async addCompany(req, res) {
    try {
      const { name, description } = req.body;
      const image = req.file.filename;

      const company = new Company({
        name,
        description,
        image
      });

      await company.save();
      res.status(201).json(company);
    } catch (error) {
      res.status(400).json({ message: error.message });
    }
  }
}

module.exports = new CompanyController();