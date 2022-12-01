import * as React from 'react';
import Button from '@mui/material/Button';
import {useNavigate} from 'react-router-dom';

export default function SubmitButtons({handle}) {
  const navigate = useNavigate();
    const handleSubmit = () => {
        navigate(handle);
    };
  return (
      <Button variant="contained" component="label" onClick={handleSubmit} type="submit">
        Submit
      </Button>
  );
}