import React, { useState } from 'react';
import axios from 'axios';

const ApplyLoanForm = () => {
    const [loanType, setLoanType] = useState('');
    const [amount, setAmount] = useState('');
    const [term, setTerm] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();
        
        try {
            // Send form data to the server
            const response = await axios.post('http://example.com/api/apply-loan', {
                loanType,
                amount,
                term
            });
            
            console.log('Server response:', response.data);
            
            // Reset form fields after successful submission
            setLoanType('');
            setAmount('');
            setTerm('');
            
            // Optionally, show a success message to the user
            alert('Loan application submitted successfully!');
        } catch (error) {
            console.error('Error:', error);
            
            // Optionally, show an error message to the user
            alert('Failed to submit loan application. Please try again.');
        }
    };

    return (
        <div>
            <h2>Apply for Loan</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label htmlFor="loanType">Loan Type:</label>
                    <select id="loanType" value={loanType} onChange={(e) => setLoanType(e.target.value)} required>
                        <option value="">Select a Loan Type</option>
                        <option value="Housing Loan">Housing Loan</option>
                        <option value="Educational Loan">Educational Loan</option>
                        <option value="Gold Loan">Gold Loan</option>
                        {/* Add other loan types here */}
                    </select>
                </div>
                <div>
                    <label htmlFor="amount">Amount:</label>
                    <input
                        type="number"
                        id="amount"
                        value={amount}
                        onChange={(e) => setAmount(e.target.value)}
                        placeholder="Enter Loan Amount"
                        required
                    />
                </div>
                <div>
                    <label htmlFor="term">Term (in months):</label>
                    <input
                        type="number"
                        id="term"
                        value={term}
                        onChange={(e) => setTerm(e.target.value)}
                        placeholder="Enter Loan Term"
                        required
                    />
                </div>
                <button type="submit">Apply</button>
            </form>
        </div>
    );
};

export default ApplyLoanForm;