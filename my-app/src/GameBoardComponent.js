import React from 'react';

const Square = (props) => {
    return (
      <button className="square" onClick={props.onClick}>
        {props.value}
      </button>
    );
}
class Board extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            fPlayer: true,
            squares: Array(9).fill(null),
            gameStatus: true,
        }
    }
  alertMe = (i) => {

        const squares = this.state.squares.slice();
        if(squares[i] == null) {
            if(this.state.fPlayer) {
                squares[i] = 'X';
            } else {
                squares[i] = 'O';
            }
        this.setState({fPlayer: !this.state.fPlayer, squares: squares});
        }
    
  }
  renderSquare(i) {
    return <Square 
    value={this.state.squares[i]}
    onClick={() => this.alertMe(i)}
    />;
  }
  calculateWinner(squares) {
    const lines = [
      [0, 1, 2],
      [3, 4, 5],
      [6, 7, 8],
      [0, 3, 6],
      [1, 4, 7],
      [2, 5, 8],
      [0, 4, 8],
      [2, 4, 6],
    ];
    for (let i = 0; i < lines.length; i++) {
      const [a, b, c] = lines[i];
      if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
        return (squares[a] == 'X' ? 'Player 1' : 'Player 2');
      }
    }
    return null;
  }
  render() {
    const winner = this.calculateWinner(this.state.squares);
    let status;
    if (winner) {
        status = 'Winner: ' + winner;
    } else {
        status = 'Next player: ' + (this.state.fPlayer ? 'Player 1' : 'Player 2');
    }
    return (
      <div>
        <div className="status">{status}</div>
        <div className="board-row">
          {this.renderSquare(0)}
          {this.renderSquare(1)}
          {this.renderSquare(2)}
        </div>
        <div className="board-row">
          {this.renderSquare(3)}
          {this.renderSquare(4)}
          {this.renderSquare(5)}
        </div>
        <div className="board-row">
          {this.renderSquare(6)}
          {this.renderSquare(7)}
          {this.renderSquare(8)}
        </div>
      </div>
    );
  }
}
class GameBoardContainer extends React.Component {
  render() {
    return (
      <div className="game">
        <div className="game-board">
          <Board />
        </div>
        <div className="game-info">
          <div>{/* status */}</div>
          <ol>{/* TODO */}</ol>
        </div>
      </div>
    );
  }
}
export default GameBoardContainer;