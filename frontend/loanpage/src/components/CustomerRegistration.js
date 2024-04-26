import React, { useState } from 'react';
import axios from 'axios';

const CustomerRegistration = () => {
    const [formData, setFormData] = useState({
        firstName: '',
        lastName: '',
        email: '',
        password: '',
        phoneNumber: '',
        pan: ''
    });

    
    const handleChange = (event) => {
        const { name, value } = event.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleSubmit = async (event) => {
        event.preventDefault();
        try {
            //const response = await axios.post('http://localhost:8080/api/customers', formData);
            const response = await axios.post('http://localhost:8080/api/customers/register', formData);
            console.log('Response:', response.data);
            // Reset form fields after successful submission
            setFormData({
                firstName: '',
                lastName: '',
                email: '',
                password: '',
                phoneNumber: '',
                pan: ''
            });
            // Optionally, show a success message to the user
            alert('Registration successful!');
        } catch (error) {
            console.error('Error:', error);
            // Optionally, show an error message to the user
            alert('Registration failed. Please try again.');
        }
    };

    return (
        <div style={styles.container}>
            <h2 style={styles.heading}>Customer Registration</h2>
            <form onSubmit={handleSubmit} style={styles.form}>
                <div style={styles.formGroup}>
                    <label htmlFor="firstName" style={styles.label}>First Name:</label>
                    <input type="text" id="firstName" name="firstName" value={formData.firstName} onChange={handleChange} style={styles.input} required />
                </div>
                <div style={styles.formGroup}>
                    <label htmlFor="lastName" style={styles.label}>Last Name:</label>
                    <input type="text" id="lastName" name="lastName" value={formData.lastName} onChange={handleChange} style={styles.input} required />
                </div>
                <div style={styles.formGroup}>
                    <label htmlFor="email" style={styles.label}>Email:</label>
                    <input type="email" id="email" name="email" value={formData.email} onChange={handleChange} style={styles.input} required />
                </div>
                <div style={styles.formGroup}>
                    <label htmlFor="password" style={styles.label}>Password:</label>
                    <input type="password" id="password" name="password" value={formData.password} onChange={handleChange} style={styles.input} required />
                </div>
                <div style={styles.formGroup}>
                    <label htmlFor="phoneNumber" style={styles.label}>Phone Number:</label>
                    <input type="text" id="phoneNumber" name="phoneNumber" value={formData.phoneNumber} onChange={handleChange} style={styles.input} required />
                </div>
                <div style={styles.formGroup}>
                    <label htmlFor="pan" style={styles.label}>PAN:</label>
                    <input type="text" id="pan" name="pan" value={formData.pan} onChange={handleChange} style={styles.input} required />
                </div>
                <button type="submit" style={styles.button}>Register</button>
            </form>
        </div>
    );
};

const styles = {
    container: {
        textAlign: 'center',
        marginTop: '50px',
        maxWidth: '400px', // Reduce the maximum width of the container
        margin: '0 auto', // Center the container horizontally
    },
    heading: {
        fontSize: '24px',
        color: '#333',
        marginBottom: '20px',
    },
    form: {
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        padding: '20px', // Adjust padding as needed
        border: '3px solid #333',
        borderRadius: '10px',
        backgroundColor: '#f9f9f9',
    },
    formGroup: {
        marginBottom: '20px',
        display: 'flex',
        alignItems: 'center',
    },
    label: {
        fontSize: '18px',
        color: '#333',
        marginRight: '10px',
        minWidth: '120px', // Set minimum width for labels
    },
    input: {
        padding: '8px',
        fontSize: '16px',
        border: '1px solid #ccc',
        borderRadius: '5px',
        width: '100%',
    },
    button: {
        padding: '10px 20px',
        fontSize: '18px',
        backgroundColor: '#007bff',
        color: '#fff',
        border: 'none',
        borderRadius: '5px',
        cursor: 'pointer',
        width: '100%',
        marginTop: '10px',
    },
};

export default CustomerRegistration;
