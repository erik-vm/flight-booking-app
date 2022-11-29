import logo from './logo.svg';
import './App.css';
import Button from "./Components/Button"

const options = ["Origin","Paris","Monaco", "Roma", "Venecia"];

function App() {
  return (
    <div className="App">
      <Button origins = {["Origin","Paris","Monaco", "Roma", "Venecia"]} />
    </div>
  );
}

export default App;
