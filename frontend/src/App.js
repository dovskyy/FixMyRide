import React, { useState, useEffect } from 'react';
import axios from 'axios';
import logo from './logo.svg';
import './App.css';

function App() {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/employees')
        .then(response => {
          setEmployees(response.data);
        })
        .catch(error => {
          console.error('There was an error fetching the employees!', error);
        });
  }, []);

  return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1>Employee List</h1>
          <ul>
            {employees.map(employee => (
                <li key={employee.id}>{employee.name}</li>
            ))}
          </ul>
        </header>
      </div>
  );
}

export default App;