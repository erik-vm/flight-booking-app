//import * as React from 'react';
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
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';

const originData = ["Origin","Paris","Monaco", "Roma", "Venecia"];
const destinationData = ["Destination", "Madrid", "Dublin", "Berlin", "Lisbon"];


const Item = styled(Paper)(({ theme }) => ({
    backgroundColor: theme.palette.mode === 'dark' ? '#1A2027' : '#fff',
    ...theme.typography.body2,
    padding: theme.spacing(1),
    textAlign: 'center',
    color: theme.palette.text.secondary,
  }));


export default function FirstPage(){
    const [value, onChange] = useState(new Date());
    return(
        
    
        <Box sx={{margin: 25}}>
            <Grid container spacing={1} alignItems="center">
            <Grid xs={2}>
                <Button places = {originData} />
            </Grid>
            <Grid xs={3}>
                <Button places = {destinationData} />
            </Grid>
            <Grid xs={3}>
                <FormControl>
                    <RadioGroup aria-labelledby="demo-radio-buttons-group-label"
                                defaultValue="One-Way"
                                name="radio-buttons-group">
                    <FormControlLabel value="One-Way" control={<Radio/>} label="One-Way" />
                    <FormControlLabel value="Round Trip" control={<Radio/>} label="Round Trip" />
                    </RadioGroup>
                </FormControl>
            </Grid>
            <Grid xs={3}>  
                <Calendar
                    onChange={onChange}
                    value={value}
                />

            </Grid>
            </Grid>

            <Grid container justifyContent="center" alignItems="flex-end" >
                <SubmitButton />
            </Grid>
        </Box>
    
    );

}