package fr.diginamic.banque;

public abstract class Operation {
	
	private String DateOp;
	private int MontantOp;
	
	/////////////////////////////////
	
	
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
	
////////////////////////////////////////////////////////////////
	
	public Operation(String dateOp, int montantOp) {
		super();
		this.DateOp = dateOp;
		this.MontantOp = montantOp;
	}

}
