package ro.ase.acs.cts.laborator3.update1;

public class Discount {
	public float calculeazaPretCuDiscount(int tipProdus, 
			float pretProdus, int vechimeClientInAni)
	  {
	    float pretCuDiscount = 0;
	    float discountClient = (vechimeClientInAni > 10) ? (float)15/100 : (float)vechimeClientInAni/100; 
	    if (tipProdus == 1)
	    {
	      pretCuDiscount = pretProdus;
	    }
	    else if (tipProdus == 2)
	    {
	      pretCuDiscount = (pretProdus - (0.1f * pretProdus)) - discountClient * (pretProdus - (0.1f * pretProdus));
	    }
	    else if (tipProdus == 3)
	    {
	      pretCuDiscount = (pretProdus - (0.25f * pretProdus)) - discountClient * (pretProdus - (0.25f * pretProdus));
	    }
	    else if (tipProdus == 4)
	    {
	      pretCuDiscount = (pretProdus - (0.35f * pretProdus)) - discountClient * (pretProdus - (0.35f * pretProdus));
	    }
	    return pretCuDiscount;
	  }
}
