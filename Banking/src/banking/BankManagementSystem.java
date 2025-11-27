package banking;

import java.util.ArrayList;
import java.util.List;

public class BankManagementSystem
{
   public static void main(String[]args)
   {
	   List<Savings> obj = new ArrayList<>();
	   obj.add(new Savings(123,"pranavi",10000,"Current"));
	   obj.add(new Savings(345,"Nani",20000,"Savings"));
	   for(Savings s:obj)
	   {
		   System.out.println(s);
	   }
	   System.out.println(" ");
	   System.out.println("after updating:");
	   obj.get(0).deposit(500);
	   obj.get(1).deposit(1000);
	   try {
		    obj.get(1).withdraw(500);
		    obj.get(1).withdraw(20000000);
		    obj.get(0).withdraw(1000);
		} catch (InsufficientBalanceException e) {
		    System.out.println(e);
		}

	   for(Savings s:obj)
	   {
		   System.out.println(s);
	   }
	   
   }
}
