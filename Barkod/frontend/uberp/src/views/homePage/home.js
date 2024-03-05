import React from 'react';
import Header from '../../components/header/header'

const HomeView = () => {
  return (
    <div>
      <Header />
      <div style={{ padding: '20px' }}>
        <h1>Hoş Geldiniz!</h1>
        <p>örnek view.</p>
      </div>
    </div>
  );
};

export default HomeView;
