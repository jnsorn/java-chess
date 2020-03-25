package domain.piece;

import domain.piece.position.Position;
import domain.piece.team.Team;

public abstract class Piece {
	private Position position;
	private Team team;

	public Piece(Position position, Team team) {
		this.position = position;
		this.team = team;
	}
}
