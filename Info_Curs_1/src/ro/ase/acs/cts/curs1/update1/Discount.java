package ro.ase.acs.cts.curs1.update1;

public class Discount {
	public float AplicaDiscount(int tipProdus, float pret, int vechimeClientInAni)
	  {
		float pretCuDiscount = 0;
		float discountPentruLoialitateInProcente = (vechimeClientInAni > 10) ? (float)15/100 : (float)vechimeClientInAni/100; 
	    if (tipProdus == 1)
	    {
	      pretCuDiscount = pret;
	    }
	    else if (tipProdus == 2)
	    {
	      pretCuDiscount = (pret - (0.1f * pret)) - (discountPentruLoialitateInProcente * (pret - (0.1f * pret)));
	    }
	    else if (tipProdus == 3)
	    {
	      pretCuDiscount = (0.25f * pret) - (discountPentruLoialitateInProcente * (0.25f * pret));
	    }
	    else if (tipProdus == 4)
	    {
	      pretCuDiscount = (pret - (0.35f * pret)) - (discountPentruLoialitateInProcente * (pret - (0.35f * pret)));
	    }
	 
	    return pretCuDiscount;
	  }
}
