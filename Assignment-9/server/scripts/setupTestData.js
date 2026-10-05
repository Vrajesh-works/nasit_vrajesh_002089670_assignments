require('dotenv').config();
const mongoose = require('mongoose');
const User = require('../models/User');
const Company = require('../models/Company');

const testUsers = [
  {
    username: 'admin',
    password: 'admin123',
    email: 'admin@example.com'
  },
  {
    username: 'testuser',
    password: 'password123',
    email: 'testuser@example.com'
  },
  {
    username: 'john',
    password: 'john123',
    email: 'john@example.com'
  }
];

const testCompanies = [
  {
    name: 'Tech Corp',
    image: 'company1.jpg',
    description: 'Leading technology company'
  },
  {
    name: 'Digital Solutions',
    image: 'company2.jpg',
    description: 'Digital transformation experts'
  },
  {
    name: 'Innovation Labs',
    image: 'company3.jpg',
    description: 'Research and development firm'
  }
];

async function setupTestData() {
  try {
    await mongoose.connect(process.env.MONGODB_URI || 'mongodb://localhost:27017/job-portal');
    
    // Clear existing data
    await User.deleteMany({});
    await Company.deleteMany({});

    // Create test users
    for (const userData of testUsers) {
      const user = new User(userData);
      await user.save();
      console.log(`Created user: ${userData.username}`);
    }

    // Create test companies
    for (const companyData of testCompanies) {
      const company = new Company(companyData);
      await company.save();
      console.log(`Created company: ${companyData.name}`);
    }

    console.log('\nTest data created successfully!');
    console.log('\nAvailable test users:');
    testUsers.forEach(user => {
      console.log(`\nUsername: ${user.username}`);
      console.log(`Password: ${user.password}`);
      console.log(`Email: ${user.email}`);
    });

  } catch (error) {
    console.error('Error setting up test data:', error);
  } finally {
    await mongoose.connection.close();
  }
}

setupTestData();