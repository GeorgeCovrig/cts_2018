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
	public abstract void Extrage(double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void Depune(double valoare);
	public abstract void Transfer(Cont destinatie, 
			double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	public abstract double getBalanta();
	
}
