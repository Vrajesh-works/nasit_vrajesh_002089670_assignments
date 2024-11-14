import React from 'react';
import {
  Container,
  Typography,
  Box,
  Grid,
  Paper,
} from '@mui/material';

const About = () => {
  return (
    <Container maxWidth="lg" sx={{ py: 4 }}>
      <Typography variant="h4" component="h1" gutterBottom align="center">
        About Us
      </Typography>
      
      <Grid container spacing={4} sx={{ mt: 2 }}>
        <Grid item xs={12} md={6}>
          <Paper elevation={3} sx={{ p: 3 }}>
            <Typography variant="h6" gutterBottom>
              Our Mission
            </Typography>
            <Typography paragraph>
              We're dedicated to connecting talented professionals with outstanding
              opportunities. Our platform serves as a bridge between job seekers
              and employers, facilitating meaningful career connections.
            </Typography>
          </Paper>
        </Grid>
        
        <Grid item xs={12} md={6}>
          <Paper elevation={3} sx={{ p: 3 }}>
            <Typography variant="h6" gutterBottom>
              Our Vision
            </Typography>
            <Typography paragraph>
              To become the leading job portal platform, revolutionizing how
              people find their dream careers and how companies discover exceptional
              talent.
            </Typography>
          </Paper>
        </Grid>

        <Grid item xs={12}>
          <Paper elevation={3} sx={{ p: 3, mt: 2 }}>
            <Typography variant="h6" gutterBottom>
              What Sets Us Apart
            </Typography>
            <Typography paragraph>
              Our platform leverages cutting-edge technology to provide a seamless
              job search experience. We focus on quality over quantity, ensuring
              that every job listing meets our high standards and every candidate
              finds relevant opportunities.
            </Typography>
          </Paper>
        </Grid>
      </Grid>
    </Container>
  );
};

export default About;