import React from 'react';
import Box from '@mui/material/Box';
import SubmitButton from "./Submit Button";
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import TextField from '@mui/material/TextField';

export default function SecondPage(){
    return (
    <Box component="form" sx={{'& .MuiTextField-root': { m: 1, width: '25ch' },}} noValidate autoComplete="off">
        <div>
        <TextField
          label="Name and Surname"
          type="name"
        />
        </div>
        <div>
        <TextField
          label="Nacionality"
          type="nacionality"
        />
        </div>
        <div>
        <TextField
        label="Identification"
        type="identification"
        />
        </div>
        <div>
        <TextField
        label="Age"
        type="age"
        />
        </div>
        <div>
            <FormControlLabel control={<Checkbox />} label="Carrying bags" labelPlacement="start"/>
        </div>
        <div>
            <SubmitButton/>
        </div>
    </Box>
    );
}