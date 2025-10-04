import logo from './logo.svg';
import './App.css';
import React from 'react';

function App() {
  const [tasks, setTasks] = React.useState([]);
  const [input, setInput] = React.useState("");

function handleAddTask() {
    if (input.trim() !== "") {
      setTasks([...tasks, input]);
      setInput("");
    }
 }

 function handleRemoveTask(index) {
    const newTasks = tasks.filter((_, idx) => idx !== index);
    setTasks(newTasks);
 }

  return (
    <span>
      <h1>Hello World</h1>
      <p>
        Hmm:
        <input
          type='text'
          value={input}
          onChange={e => setInput(e.target.value)}
          placeholder='Enter'
        />
        <button onClick={handleAddTask} type='button'>Add</button>
      </p>
      <TaskList tasks={tasks} onRemoveTask={handleRemoveTask} />
    </span>
  );
}

function TaskList({tasks, onRemoveTask}) {
  return (
    <div>
      {tasks.map((task, idx) => (
        < div key={idx}  >
          <span>Task: {task}</span>
          <button onClick={() => onRemoveTask(idx)} >
            Remove
          </button>
        </div>
      ))}
    </div>
  );
}

export default App;
