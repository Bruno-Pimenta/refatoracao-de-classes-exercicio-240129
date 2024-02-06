package domain;

import java.util.Scanner;

public interface IColaboradorClt {
	public String exibirColaboradorClt();
	public void salarioLiquidoClt();
	public String beneficios();
	public void salarioEquivalentePj(); 
	public void demitir(Scanner sc);
}
