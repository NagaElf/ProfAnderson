package first;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepresaTest {

	Represa represa = new Represa();
	
	@Test
	void testGetVolumeTotal() {
		represa.setReservaTecnica(500.0);
		represa.setVolumeUtil(500.0);
		
		double reservaTecnica = represa.getReservaTecnica();
		double volumeUtil = represa.getVolumeUtil();
		
		assertEquals("O volume total deve ser a soma do volume técnico e volume útil ", represa.CalcularVolumeTotal(reservaTecnica, volumeUtil), 1000.0, 1.0);
	}
}

