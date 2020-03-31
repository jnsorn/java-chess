package controller;

import static view.InputView.*;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.command.Command;
import domain.command.InvalidCommandException;
import domain.command.MoveInfo;
import domain.piece.team.Team;
import view.OutputView;

public class ChessController {
	ChessController() {
		Board board = BoardFactory.create();
		Team turn = Team.WHITE;
		run(board, turn);
	}

	private void run(Board board, Team turn) {
		OutputView.printChessBoard(board);
		Command command;
		do {
			String inputCommand = inputCommand();
			command = Command.of(inputCommand);
			if (command.isMove()) {
				MoveInfo moveInfo = new MoveInfo(inputCommand);
				board.move(moveInfo.getSourcePosition(), moveInfo.getTargetPosition(), turn);
				OutputView.printChessBoard(board);
				turn = Team.changeTurn(turn);
			}

			if (command.isStatus()) {
				OutputView.printScore(board.calculateScore());
			}

			if (command.isStart()) {
				throw new InvalidCommandException(InvalidCommandException.INVALID_COMMAND_TYPE);
			}
		} while (command.isNotEnd() && board.isKingAlive());
		OutputView.printGameIsEnd();
		System.exit(0);
	}
}