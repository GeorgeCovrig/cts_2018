/**
 * 
 */
package ro.ase.acs.cts.laborator1;

/**
 * @author Catalin
 * @version 1.0
 *
 */
public abstract class Cont {
	public abstract void Extrage(double valoare);
	public abstract void Depune(double valoare);
	public abstract void Transfer(Cont destinatie, 
			double valoare);
	public abstract double getBalanta();
	
}
