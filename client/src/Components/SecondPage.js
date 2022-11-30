import React, { useState } from 'react';
import Grid from '@mui/material/Grid'; // Grid version 1
import { styled } from '@mui/material/styles';
import Box from '@mui/material/Box';
import Paper from '@mui/material/Paper';
import Container2 from '@mui/material/Container';
import { positions } from '@mui/system';
import Button from "./Button"
import SubmitButton from "./Submit Button"
import FormGroup from '@mui/material/FormGroup';
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import Radio from '@mui/material/Radio';
import RadioGroup from '@mui/material/RadioGroup';
import FormControl from '@mui/material/FormControl';
import FormLabel from '@mui/material/FormLabel';

const airlineNames = ["Big Airline", "Modest Airlene", "Roma Airline"];

const Item = styled(Paper)(({ theme }) => ({
    backgroundColor: theme.palette.mode === 'dark' ? '#1A2027' : '#fff',
    ...theme.typography.body2,
    padding: theme.spacing(1),
    textAlign: 'center',
    color: theme.palette.text.secondary,
  }));

  

export default function SecondPage(){

    function getAirlines() {
        return (
            <FormControl>
            <FormLabel>Airlines</FormLabel>
            <RadioGroup
                aria-labelledby="demo-radio-buttons-group-label"
                defaultValue="0"
                name="radio-buttons-group"
            >
                
                <FormControlLabel value="0" control={<Radio />} label="Female" />
                <FormControlLabel value="1" control={<Radio />} label="Male" />
                <FormControlLabel value="2" control={<Radio />} label="Other" />
            </RadioGroup>
            </FormControl> 
                        
        );
    }
    return(
        
    
        <Box sx={{margin: 0,  width: 250}}>
            <Grid container direction="column" justifyContent="flex-start" alignItems="flex-start" margin = {3}>
            
            <Item>
                <Grid margin = {3}>
                <FormLabel >Filters</FormLabel>
                </Grid>
                <Grid margin = {2}>
            
                    <FormControl>
                    <FormLabel>Airlines</FormLabel>
                    <RadioGroup
                        aria-labelledby="demo-radio-buttons-group-label"
                        defaultValue="0"
                        name="radio-buttons-group"
                    >
                        
                        <FormControlLabel value="0" control={<Radio />} label="Female" />
                        <FormControlLabel value="1" control={<Radio />} label="Male" />
                        <FormControlLabel value="2" control={<Radio />} label="Other" />
                    </RadioGroup>
                    </FormControl>               
            
                </Grid>
            
            </Item>
                
            </Grid>

            <Grid container justifyContent="center" alignItems="flex-end" >
                
            </Grid>
        </Box>
    
    );

}