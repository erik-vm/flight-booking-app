import * as React from 'react';
import Button from '@mui/material/Button';
import Stack from '@mui/material/Stack';
import {Routes, Route, useNavigate} from 'react-router-dom';

export default function SubmitButtons({handle}) {
  const navigate = useNavigate();
    const handleSubmit = () => {
        navigate(handle);
    };
  return (
    <Stack direction="row" alignItems="center" spacing={2}>
      <Button variant="contained" component="label" onClick={handleSubmit} type="submit">
        Submit
      </Button>
    </Stack>
  );
}