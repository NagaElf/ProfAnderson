package first;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepresaTest {

	Represa represa = new Represa();
	
	@Test
	void testGetVolumeTotal() {
		assertEquals("O volume total deve ser a soma do volume técnico + volume util ", represa.CalcularVolumeTotal(5, 5), 10.0, 1.0);
	}
}
