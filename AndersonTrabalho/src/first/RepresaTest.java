package first;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class RepresaTest {
	
	Represa represa = new Represa("Represa Goiás", "Sistema moderno");
	Represa represa2;
	
	@Before
	public void setUp() throws Exception {
		represa2 = new Represa("Alagoas", "Sistema moderno");
	}

	@Test
	public void testEquals(){
		Represa represa3 = new Represa("Alagoas", "Sistema moderno");
		assertEquals("Criação da represa", represa3, new Represa("Alagoas", "Sistema moderno"));
	}
	
	@Test
	void testGetVolumeTotal() {
		represa.setReservaTecnica(500.0);
		represa.setVolumeUtil(500.0);
		
		double reservaTecnica = represa.getReservaTecnica();
		double volumeUtil = represa.getVolumeUtil();
		
		assertEquals("O volume total deve ser a soma do volume técnico e volume útil ", represa.CalcularVolumeTotal(reservaTecnica, volumeUtil), 1000.0, 1.0);
	}
}

