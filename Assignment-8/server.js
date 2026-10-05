require('dotenv').config();
const express = require('express');
const cors = require('cors');
const connectDB = require('./config/db');
const userRoutes = require('./routes/userRoutes');

const app = express();
const PORT = process.env.PORT || 3000;

// Connect to MongoDB
connectDB();

// Middleware
app.use(cors());
app.use(express.json());
app.use('/uploads', express.static('uploads'));

// Routes
app.use('/user', userRoutes);

// Error handling middleware
app.use((err, req, res, next) => {
  res.status(500).json({
    status: 'error',
    message: err.message
  });
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});