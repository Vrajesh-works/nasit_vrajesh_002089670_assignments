import React from 'react';
import { Link as RouterLink } from 'react-router-dom';
import {
  Container,
  Typography,
  Box,
  Button,
  Grid,
  Paper,
  Card,
  CardContent,
  CardActions,
} from '@mui/material';
import WorkIcon from '@mui/icons-material/Work';
import BusinessIcon from '@mui/icons-material/Business';
import SearchIcon from '@mui/icons-material/Search';

const Home = () => {
  const features = [
    {
      icon: <SearchIcon fontSize="large" color="primary" />,
      title: 'Job Search',
      description: 'Find your dream job from thousands of listings across various industries.',
    },
    {
      icon: <WorkIcon fontSize="large" color="primary" />,
      title: 'Career Growth',
      description: 'Discover opportunities that align with your career goals and aspirations.',
    },
    {
      icon: <BusinessIcon fontSize="large" color="primary" />,
      title: 'Top Companies',
      description: 'Connect with industry-leading companies looking for talent like you.',
    },
  ];

  return (
    <Box>
      {/* Hero Section */}
      <Paper
        sx={{
          position: 'relative',
          bgcolor: 'grey.800',
          color: '#fff',
          mb: 4,
          backgroundSize: 'cover',
          backgroundRepeat: 'no-repeat',
          backgroundPosition: 'center',
          backgroundImage: 'url(/api/placeholder/1500/400)',
          py: 8,
        }}
      >
        <Container maxWidth="md">
          <Box textAlign="center">
            <Typography
              component="h1"
              variant="h3"
              color="inherit"
              gutterBottom
            >
              Find Your Next Career Opportunity
            </Typography>
            <Typography variant="h5" color="inherit" paragraph>
              Explore thousands of job opportunities with all the information you need.
            </Typography>
            <Button
              variant="contained"
              size="large"
              component={RouterLink}
              to="/jobs"
              sx={{ mt: 2 }}
            >
              Browse Jobs
            </Button>
          </Box>
        </Container>
      </Paper>

      {/* Features Section */}
      <Container maxWidth="lg" sx={{ py: 6 }}>
        <Grid container spacing={4}>
          {features.map((feature, index) => (
            <Grid item xs={12} md={4} key={index}>
              <Card sx={{ height: '100%' }}>
                <CardContent>
                  <Box sx={{ textAlign: 'center', mb: 2 }}>
                    {feature.icon}
                  </Box>
                  <Typography variant="h5" component="h2" gutterBottom align="center">
                    {feature.title}
                  </Typography>
                  <Typography align="center" color="text.secondary">
                    {feature.description}
                  </Typography>
                </CardContent>
                <CardActions sx={{ justifyContent: 'center' }}>
                  <Button size="small" color="primary">
                    Learn More
                  </Button>
                </CardActions>
              </Card>
            </Grid>
          ))}
        </Grid>
      </Container>
    </Box>
  );
};

export default Home;