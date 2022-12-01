import './App.css';
import FirstPage from "./Components/FirstPage"
import SecondPage from "./Components/SecondPage"
import ThirdPage from "./Components/ThirdPage"
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App () {
  return (
      //<div className="App"><FirstPage/></div>
    <div className="App">
    <BrowserRouter>
          <Routes>
            <Route path="/" >
              <Route index element={<FirstPage />} />
              <Route path="second" element={<SecondPage />} />
              <Route path="third" element={<ThirdPage />} />
            </Route>
          </Routes>
    </BrowserRouter>
  </div>
  );
}
export default App;