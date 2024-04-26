import React from 'react';
import { Link } from 'react-router-dom';

const CustomerDashboard = () => {
    return (
        <div style={styles.container}>
            <div style={styles.box}>
                <h2 style={styles.heading}>Welcome to Loan Application</h2>
            </div>
            <div style={styles.box}>
                <p style={styles.text}>Please select an option:</p>
                <ul style={styles.list}>
                    <li style={styles.listItem}>
                        <Link to="/register" style={styles.link}>Register</Link>
                    </li>
                    <li style={styles.listItem}>
                        <Link to="/login" style={styles.link}>Login</Link>
                    </li>
                </ul>
            </div>
        </div>
    );
};

const styles = {
    container: {
        textAlign: 'center',
        marginTop: '50px',
        maxWidth: '500px', // Reduce the maximum width of the container
        margin: '0 auto', // Center the container horizontally
    },
    box: {
        border: '3px solid #333',
        padding: '20px', // Adjust padding as needed
        borderRadius: '10px',
        marginBottom: '20px',
    },
    heading: {
        fontSize: '24px',
        color: '#333',
        marginBottom: '20px',
    },
    text: {
        fontSize: '18px',
        color: '#666',
        marginBottom: '30px',
    },
    list: {
        listStyle: 'none',
        padding: 0,
    },
    listItem: {
        marginBottom: '15px',
    },
    link: {
        textDecoration: 'none',
        color: '#007bff',
        fontSize: '20px',
        fontWeight: 'bold',
    },
};

export default CustomerDashboard;
