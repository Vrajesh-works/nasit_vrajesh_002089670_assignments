const express = require('express');
const router = express.Router();
const CompanyController = require('../controllers/company.controller');
const upload = require('../middleware/upload');

router.get('/', CompanyController.getAllCompanies.bind(CompanyController));
router.post('/', upload.single('image'), CompanyController.addCompany.bind(CompanyController));

module.exports = router;