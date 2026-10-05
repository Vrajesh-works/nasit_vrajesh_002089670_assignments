const express = require('express');
const router = express.Router();
const userController = require('../controllers/userController');
const upload = require('../middleware/upload');

router.post('/create', userController.createUser);
router.put('/edit', userController.updateUser);
router.delete('/delete', userController.deleteUser);
router.get('/getAll', userController.getAllUsers);
router.post('/uploadImage', upload.single('image'), userController.uploadImage);

module.exports = router;