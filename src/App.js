
import './App.css';
import NavBar from './NavBar';

function App() {
  return (
    <div style={{
      background: "#E9AC06",
      color: "#F5F1F1",
    }}>
      <NavBar></NavBar>
      <div className='map' style={{
        width: "50px",
        height: "50px"
      }}>
        
      </div>
    </div>
  );
}

export default App;
