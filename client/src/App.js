import logo from './logo.svg';
import './App.css';
import Button from "./Components/Button"
import FirstPage from "./Components/FirstPage"
import SecondPage from "./Components/SecondPage"
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App () {
  return (
      //<div className="App"><FirstPage/></div>
    <div className="App">
    <BrowserRouter>
          <Routes>
            <Route path="/" >
              <Route index element={<SecondPage />} />
            </Route>
          </Routes>
    </BrowserRouter>
  </div>

  );

}
export default App;

/*
                      <Route path="signin" element={<SignIn />} />
                      <Route path="personal" element={<NavBar home={<Transactions></Transactions>}></NavBar>}/>
                      <Route path="user/settings" element={<NavBar home={<Settingshome></Settingshome>}></NavBar>} />
                      <Route path="bankaccounts" element={<NavBar home={<BankAccounts></BankAccounts>}></NavBar>}  />
                      <Route path="transaction" element={<Transaction />} />
                      <Route path="user" element={<NavBar home={<Home></Home>}></NavBar>} />
                      <Route path="user/home" element={<NavBar home={<Home></Home>}></NavBar>} />
                      <Route path="user/balance" element={<Balance />} />
                      */