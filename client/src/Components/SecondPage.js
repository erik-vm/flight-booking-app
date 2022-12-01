import React, { useState } from 'react';
import Grid from '@mui/material/Grid';
import { styled } from '@mui/material/styles';
import Box from '@mui/material/Box';
import Paper from '@mui/material/Paper';
import Container from '@mui/material/Container';
import { positions } from '@mui/system';
import Button from "./Button";
import SubmitButton from "./Submit Button";
import FormGroup from '@mui/material/FormGroup';
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import Radio from '@mui/material/Radio';
import RadioGroup from '@mui/material/RadioGroup';
import FormControl from '@mui/material/FormControl';
import FormLabel from '@mui/material/FormLabel';
import Slider from '@mui/material/Slider';
import FilterButton from "./Filter Button";
import NativeSelect from '@mui/material/NativeSelect';
import InputLabel from '@mui/material/InputLabel';
import {FlightsData} from "./provdb"

const airlineNames = ["Big Airline", "Modest Airlene", "Roma Airline"];

const Item = styled(Paper)(({ theme }) => ({
    backgroundColor: theme.palette.mode === 'dark' ? '#1A2027' : '#fff',
    ...theme.typography.body2,
    padding: theme.spacing(1),
    textAlign: 'center',
    color: theme.palette.text.secondary,
  }));

  

export default function SecondPage(){

    const GetAirlines = () => {
        return(
            <NativeSelect
            defaultValue="none"
            inputProps={{
                name: 'airlines',
                id: 'uncontrolled-native',
            }}
            >
            <option value="none">Anyone</option>
            {airlineNames.map(i =>(
            <option value = {i}>{i}</option>))}
            </NativeSelect>
        );
    }
    const GetFlights = () => {
        return(
            <Grid direction="column" justifyContent="flex-start" alignItems="stretch" margin = {3}>
                <RadioGroup
                        aria-labelledby="demo-radio-buttons-group-label"
                        name="flight-group"
                    >
            {Object.keys(FlightsData).map((keyName, i) =>(
            <Grid>
            <Item>
            <FormControlLabel value={i} control={<Radio />} label="Take this Flight" />
            <li className="travelcompany-input" key={i}>
                <span className="input-label"></span>
            </li>
            </Item>
            </Grid>))}
            </RadioGroup>
            </Grid>
        );
    }

    return(
        
        
        <Box container>
            <Grid container>
            <Grid direction="column" justifyContent="flex-start" alignItems="flex-start" margin = {3}>
            
            <Item>
                <Grid margin = {3}>
                <FormLabel style= {{color: "blue"}}>Filters</FormLabel>
                </Grid>
                <Grid margin = {2}>
            
                    <FormControl>
                    <FormLabel style= {{color: "red"}}>Airlines</FormLabel>
                    <GetAirlines/>
                        
                    <FormLabel style= {{color: "red"}}>Scales</FormLabel>
                    <FormControlLabel control={<Checkbox />} label="No Scales" />

                    <FormLabel style= {{color: "red"}}>Luggage</FormLabel>
                    <RadioGroup
                        aria-labelledby="demo-radio-buttons-group-label"
                        defaultValue="none"
                        name="radio-buttons-group"
                    >
                        <FormControlLabel value="none" control={<Radio />} label="Indifferent" />
                        <FormControlLabel value="yes" control={<Radio />} label="Allowed" />
                        <FormControlLabel value="no" control={<Radio />} label="Not Allowed" />
                    </RadioGroup>
                    <FormLabel style= {{color: "red"}}>Time Range</FormLabel>
                    <RadioGroup
                        aria-labelledby="demo-radio-buttons-group-label"
                        defaultValue="3"
                        name="radio-buttons-group"
                    >
                        <FormControlLabel value="1" control={<Radio />} label="1 Day" />
                        <FormControlLabel value="2" control={<Radio />} label="2 Days" />
                        <FormControlLabel value="3" control={<Radio />} label="3 Days" />
                    </RadioGroup>

                    <FilterButton/>

                    </FormControl>               
            
                </Grid>
            
            </Item>
                
            </Grid>

            
                
            <GetFlights/>
                
            
            </Grid>
            
        </Box>
        
        
    
    );

}