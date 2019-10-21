package first;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Represa represa = new Represa();
		represa.setReservaTecnica(5.0);
		represa.setVolumeUtil(4.0);
		System.out.print("O volume total da represa é "+represa.getVolumeTotal());
	}

}
