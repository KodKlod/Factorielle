package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void leResultatDeFactorielleUnDoitEtreUn() {
		Factorielle valeurUn = new Factorielle ();
		long n=1;
		
		long resultat = valeurUn.calculer(n);
		
		assertEquals(1, resultat);
	}

	@Test
	public void leResultatDeFactorielleSixDoitEtre720() {
		Factorielle valeurSix = new Factorielle ();
		long n=6;
		
		long resultat = valeurSix.calculer(n);
		
		assertEquals(720, resultat);
	}
	
	@Test
	public void leResultatDeFactorielleZeroDoitEtreUn() {
		Factorielle valeurZero = new Factorielle ();
		long n=0;
		
		long resultat = valeurZero.calculer(n);
		
		assertEquals(1, resultat);
	}
	
	/*@Test
	public void leResultatDeFactorielleMoinsTroisDoitEtreErreur() {
		Factorielle valeurNegative = new Factorielle ();
		long n=-3;
		
		long resultat = valeurNegative.calculer(n);
		
		assertEquals(Erreur, resultat);*/
	
}
