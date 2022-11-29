import logo from './logo.svg';
import './App.css';
import Button from "./Components/Button"
import Container from "./Components/Container"

const originData = ["Origin","Paris","Monaco", "Roma", "Venecia"];
const destinationData = ["Destination", "Madrid", "Dublin", "Berlin", "Lisbon"];
/*
function App() {
  return (
    <div>
    <div className="App">
      <Button places = {originData} />
    </div>
    <div className="App">
      <Button places = {destinationData} />
    </div>
    </div>
  );
}
*/
function App () {
  return (
      <div className="App">
      <Container/>
    </div>
  );

}
export default App;
