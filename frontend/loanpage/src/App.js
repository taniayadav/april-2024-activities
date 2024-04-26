import React from 'react';
import { BrowserRouter as Router, Link, Route, Routes } from 'react-router-dom';
import CustomerDashboard from './components/CustomerDashboard';
import CustomerLogin from './components/CustomerLogin';
import CustomerRegistration from './components/CustomerRegistration';
import ApplyLoanForm from './components/ApplyLoanForm';

const App = () => {
  return (
    <Router>
      <div>
        <Routes>
          <Route exact path="/" element={<CustomerDashboard />} />
          <Route path="/login" element={<CustomerLogin />} />
          <Route path="/register" element={<CustomerRegistration />} />
          <Route path="/apply-loan" element={<ApplyLoanForm />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;