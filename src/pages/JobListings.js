import React from 'react';
import {
  Container,
  Grid,
  Card,
  CardContent,
  Typography,
  Button,
  Box,
} from '@mui/material';

const jobPosts = [
  {
    id: 1,
    title: 'Full Stack Developer',
    description: 'Join our dynamic team to work on cutting-edge technologies. Develop and maintain sophisticated web applications for our diverse client base.',
    lastUpdated: 'Last updated 2 days ago',
    applyLink: 'https://example.com/apply/full-stack-developer',
  },
  {
    id: 2,
    title: 'Digital Marketing Specialist',
    description: 'Elevate our digital marketing strategies to promote our innovative products. Proficiency in SEO, SEM, and social media marketing is highly valued.',
    lastUpdated: 'Last updated 1 day ago',
    applyLink: 'https://example.com/apply/digital-marketing-specialist',
  },
  // ... other job posts as provided in the assignment
];

const JobListings = () => {
  return (
    <Container sx={{ py: 4 }}>
      <Typography variant="h4" component="h1" gutterBottom>
        Available Positions
      </Typography>
      <Grid container spacing={3}>
        {jobPosts.map((job) => (
          <Grid item xs={12} md={6} key={job.id}>
            <Card elevation={3}>
              <CardContent>
                <Typography variant="h5" component="h2" gutterBottom>
                  {job.title}
                </Typography>
                <Typography variant="body1" color="text.secondary" paragraph>
                  {job.description}
                </Typography>
                <Box sx={{ mt: 2, display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <Typography variant="caption" color="text.secondary">
                    {job.lastUpdated}
                  </Typography>
                  <Button
                    variant="contained"
                    color="primary"
                    href={job.applyLink}
                    target="_blank"
                    rel="noopener noreferrer"
                  >
                    Apply Now
                  </Button>
                </Box>
              </CardContent>
            </Card>
          </Grid>
        ))}
      </Grid>
    </Container>
  );
};

export default JobListings;