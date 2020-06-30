package fr.diginamic.essais;
import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double op1 = Operations.calcul(4.5,6.3,'+');
		double op2 = Operations.calcul(4.5,6.3,'-');
		double op3 = Operations.calcul(4.5,6.3,'/');
		double op4 = Operations.calcul(4.5,6.3,'*');
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);
		

	}

}
