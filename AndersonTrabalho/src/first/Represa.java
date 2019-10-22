package first;

public class Represa {

	String nomeRepresa;
	String sistemaRepresa;
	String sistemaAbastecimento;
	Double volumeUtil;
	Double reservaTecnica;
	Double volumeTotal;
	
	public Represa(String nomeRepresa, String sistemaRepresa) {
		this.nomeRepresa = nomeRepresa;
		this.sistemaRepresa = sistemaRepresa;
		this.sistemaAbastecimento = sistemaAbastecimento;
	}
	
	public String getNomeRepresa() {
		return nomeRepresa;
	}
	public void setNomeRepresa(String nomeRepresa) {
		this.nomeRepresa = nomeRepresa;
	}
	
	public String getSistemaRepresa() {
		return sistemaRepresa;
	}
	public void setSistemaRepresa(String sistemaRepresa) {
		this.sistemaRepresa = sistemaRepresa;
	}
	
	public String getSistemaAbastecimento() {
		return sistemaAbastecimento;
	}
	public void setSistemaAbastecimento(String sistemaAbastecimento) {
		this.sistemaAbastecimento = sistemaAbastecimento;
	}
	
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
	
	public void GerarRelatório() {
		
		System.out.printf("%n Nome da represa: "+this.getNomeRepresa()+
				"%n Sistema da represa: "+this.getSistemaRepresa()+
				"%n Volume útil: "+this.getVolumeUtil()+
				"%n Reserva técnica: "+this.getReservaTecnica()+
				"%n Volume total: "+this.getVolumeTotal());
	}
	
}

