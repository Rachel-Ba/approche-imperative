package fr.diginamic.banque;

public class Debit extends Operation{
//////////Attribut ////////////////
	
	private String DateOp;
	private int MontantOp;

/////////////////////////////////////

	public String getDateOp() {
		return DateOp;
	}
	public void setDateOp(String dateOp) {
		DateOp = dateOp;
	}
	public int getMontantOp() {
		return MontantOp;
	}
	public void setMontantOp(int montantOp) {
		MontantOp = montantOp;
	}
	
	///////////// Constructeur /////////////////////
	
	public Debit(String dateOp, int montantOp) {
		super(dateOp, montantOp);
	}
	@Override
	public String toString() {
		return "Debit [DateOp=" + DateOp + ", MontantOp=" + MontantOp + "]";
	}
	
	public String getType()
	{
		return "DEBIT";
	}
	
	
}
