import React, { useState, useEffect } from 'react';
import axios from 'axios';
import {
  Container,
  Grid,
  Card,
  CardMedia,
  CardContent,
  Typography,
  Skeleton,
} from '@mui/material';

const CompanyShowcase = () => {
  const [companies, setCompanies] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchCompanyImages = async () => {
      try {
        const token = localStorage.getItem('token');
        const response = await axios.get('http://localhost:3001/api/companies/images', {
          headers: { Authorization: `Bearer ${token}` }
        });
        setCompanies(response.data);
        setLoading(false);
      } catch (error) {
        console.error('Error fetching company images:', error);
        setLoading(false);
      }
    };

    fetchCompanyImages();
  }, []);

  if (loading) {
    return (
      <Container sx={{ py: 4 }}>
        <Grid container spacing={3}>
          {[1, 2, 3, 4, 5, 6].map((item) => (
            <Grid item xs={12} sm={6} md={4} key={item}>
              <Card>
                <Skeleton variant="rectangular" height={200} />
                <CardContent>
                  <Skeleton variant="text" width="60%" />
                </CardContent>
              </Card>
            </Grid>
          ))}
        </Grid>
      </Container>
    );
  }

  return (
    <Container sx={{ py: 4 }}>
      <Typography variant="h4" component="h1" gutterBottom>
        Featured Companies
      </Typography>
      <Grid container spacing={3}>
        {companies.map((company) => (
          <Grid item xs={12} sm={6} md={4} key={company.id}>
            <Card elevation={3}>
              <CardMedia
                component="img"
                height="200"
                image={`data:${company.mimetype};base64,${company.image}`}
                alt={company.name}
              />
              <CardContent>
                <Typography variant="h6" component="h2">
                  {company.name}
                </Typography>
              </CardContent>
            </Card>
          </Grid>
        ))}
      </Grid>
    </Container>
  );
};

export default CompanyShowcase;