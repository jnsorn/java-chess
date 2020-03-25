package domain.piece;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.piece.position.Position;
import domain.piece.team.Team;

public class RookTest {
	@DisplayName("룩 생성")
	@Test
	void constructor_CreateKnight_Success() {
		Assertions.assertThat(new Rook(Position.of("b1"), Team.WHITE)).isInstanceOf(Rook.class);
	}
}
