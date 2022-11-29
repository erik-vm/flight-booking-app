import Grid from '@mui/material/Grid'; // Grid version 1
import { styled } from '@mui/material/styles';
import Box from '@mui/material/Box';
import Paper from '@mui/material/Paper';
import Container2 from '@mui/material/Container';
import { positions } from '@mui/system';
import Button from "./Button"
import FormGroup from '@mui/material/FormGroup';
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';

const originData = ["Origin","Paris","Monaco", "Roma", "Venecia"];
const destinationData = ["Destination", "Madrid", "Dublin", "Berlin", "Lisbon"];

const Item = styled(Paper)(({ theme }) => ({
    backgroundColor: theme.palette.mode === 'dark' ? '#1A2027' : '#fff',
    ...theme.typography.body2,
    padding: theme.spacing(1),
    textAlign: 'center',
    color: theme.palette.text.secondary,
  }));

export default function Container(){
    return(
        
    
        <Box sx={{margin: 25}}>
            <Grid container spacing={3}>
            <Grid xs={2}>
                <Button places = {originData} />
            </Grid>
            <Grid xs={2}>
                <Button places = {destinationData} />
            </Grid>
            <Grid xs={2}>
                <FormGroup>
                    <FormControlLabel control={<Checkbox />} label="One-Way" />
                    <FormControlLabel control={<Checkbox />} label="Round Trip" />
                </FormGroup>
            </Grid>
            </Grid>
        </Box>
    
    );

}