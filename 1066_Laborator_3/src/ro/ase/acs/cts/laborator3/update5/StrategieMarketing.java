package ro.ase.acs.cts.laborator3.update5;

public class StrategieMarketing implements InterfataMarketing{

	@Override
	public float calculeazaDiscountClient(int vechimeClientInAni) {
		if(vechimeClientInAni > ConstanteDiscount.VECHIME_MINIMA)
			return ConstanteDiscount.DISCOUNT_MAXIM_VECHIME;
		else return (float)vechimeClientInAni/100;
	}

	@Override
	public float calculeazaValoareDiscount(float pret, float discount) {
		return pret*discount;
	}

}
