const User = require('../models/User');
const bcrypt = require('bcryptjs');

exports.createUser = async (req, res) => {
  try {
    const { fullName, email, password } = req.body;

    // Check if user already exists
    const existingUser = await User.findOne({ email });
    if (existingUser) {
      return res.status(400).json({
        status: 'error',
        message: 'Email already exists'
      });
    }

    // Validate password strength
    const user = new User({ fullName, email, password });
    if (!user.isPasswordStrong(password)) {
      return res.status(400).json({
        status: 'error',
        message: 'Password must contain at least 8 characters, one uppercase letter, one lowercase letter, one number and one special character'
      });
    }

    await user.save();

    res.status(201).json({
      status: 'success',
      message: 'User created successfully',
      data: {
        fullName: user.fullName,
        email: user.email
      }
    });
  } catch (error) {
    res.status(400).json({
      status: 'error',
      message: error.message
    });
  }
};

exports.updateUser = async (req, res) => {
  try {
    const { email, fullName, password } = req.body;

    const user = await User.findOne({ email });
    if (!user) {
      return res.status(404).json({
        status: 'error',
        message: 'User not found'
      });
    }

    if (fullName) user.fullName = fullName;
    if (password) {
      if (!user.isPasswordStrong(password)) {
        return res.status(400).json({
          status: 'error',
          message: 'Password must contain at least 8 characters, one uppercase letter, one lowercase letter, one number and one special character'
        });
      }
      user.password = password;
    }

    await user.save();

    res.status(200).json({
      status: 'success',
      message: 'User updated successfully',
      data: {
        fullName: user.fullName,
        email: user.email
      }
    });
  } catch (error) {
    res.status(400).json({
      status: 'error',
      message: error.message
    });
  }
};

exports.deleteUser = async (req, res) => {
  try {
    const { email } = req.body;

    const user = await User.findOneAndDelete({ email });
    if (!user) {
      return res.status(404).json({
        status: 'error',
        message: 'User not found'
      });
    }

    res.status(200).json({
      status: 'success',
      message: 'User deleted successfully'
    });
  } catch (error) {
    res.status(400).json({
      status: 'error',
      message: error.message
    });
  }
};

exports.getAllUsers = async (req, res) => {
  try {
    const users = await User.find().select('fullName email');

    res.status(200).json({
      status: 'success',
      data: users
    });
  } catch (error) {
    res.status(400).json({
      status: 'error',
      message: error.message
    });
  }
};

exports.uploadImage = async (req, res) => {
  try {
    const { email } = req.body;
    const user = await User.findOne({ email });

    if (!user) {
      return res.status(404).json({
        status: 'error',
        message: 'User not found'
      });
    }

    if (!req.file) {
      return res.status(400).json({
        status: 'error',
        message: 'No image file provided'
      });
    }

    user.imagePath = req.file.path;
    await user.save();

    res.status(200).json({
      status: 'success',
      message: 'Image uploaded successfully',
      data: {
        imagePath: user.imagePath
      }
    });
  } catch (error) {
    res.status(400).json({
      status: 'error',
      message: error.message
    });
  }
};