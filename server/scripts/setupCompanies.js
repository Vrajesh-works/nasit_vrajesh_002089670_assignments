// server/scripts/setupCompanies.js
require('dotenv').config();
const mongoose = require('mongoose');
const fs = require('fs');
const path = require('path');
const Company = require('../models/Company');

const sampleCompanies = [
  {
    name: 'Tech Solutions Inc',
    image: 'tech-solutions.jpg',
    description: 'Leading technology solutions provider'
  },
  {
    name: 'Digital Innovations',
    image: 'digital-innovations.jpg',
    description: 'Digital transformation experts'
  },
  {
    name: 'Future Systems',
    image: 'future-systems.jpg',
    description: 'Building the future of technology'
  },
  {
    name: 'Cloud Computing Co',
    image: 'cloud-computing.jpg',
    description: 'Cloud infrastructure specialists'
  },
  {
    name: 'AI Research Lab',
    image: 'ai-research.jpg',
    description: 'Advancing artificial intelligence'
  }
];

// Function to copy sample images to uploads folder
const copySampleImages = () => {
  const sourceDir = path.join(__dirname, 'sample-images');
  const uploadDir = path.join(__dirname, '..', 'uploads');

  // Create uploads directory if it doesn't exist
  if (!fs.existsSync(uploadDir)) {
    fs.mkdirSync(uploadDir);
  }

  // Copy each sample image
  sampleCompanies.forEach(company => {
    const sourcePath = path.join(sourceDir, company.image);
    const destPath = path.join(uploadDir, company.image);
    
    if (fs.existsSync(sourcePath)) {
      fs.copyFileSync(sourcePath, destPath);
    }
  });
};

async function setupCompanies() {
  try {
    await mongoose.connect(process.env.MONGODB_URI || 'mongodb://localhost:27017/job-portal');
    
    // Clear existing companies
    await Company.deleteMany({});

    // Copy sample images
    copySampleImages();

    // Create companies
    await Company.insertMany(sampleCompanies);

    console.log('Sample companies created successfully!');
  } catch (error) {
    console.error('Error setting up companies:', error);
  } finally {
    await mongoose.connection.close();
  }
}

setupCompanies();