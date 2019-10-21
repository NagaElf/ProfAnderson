package first;

public class Represa {
	
	Double volumeUtil;
	Double reservaTecnica;
	Double volumeTotal;
	
	public Double getVolumeUtil() {
		return volumeUtil;
	}
	public void setVolumeUtil(Double volumeUtil) {
		this.volumeUtil = volumeUtil;
	}
	
	public Double getReservaTecnica() {
		return reservaTecnica;
	}
	public void setReservaTecnica(Double reservaTecnica) {
		this.reservaTecnica = reservaTecnica;
	}
	
	public Double getVolumeTotal() {
		return volumeUtil+reservaTecnica;
	}
	public void setVolumeTotal(Double volumeTotal) {
		this.volumeTotal = volumeTotal;
	}
	
	public Double CalcularVolumeTotal(double x, double y) {
		return x+y;
	}
	
}
