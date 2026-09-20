
public class Program {

	public static void main(String[] args) {
		int choice;
		 int caseswitch=0;
		do {
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("*************************Menus***************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("1 : Set Date");
		System.out.println("2 : Add Dates");
		System.out.println("3 : Add Months");
		System.out.println("4 : Add Years");
		System.out.println("5 : Exit");
		
		System.out.println("********************************************************");
		System.out.println("Enter your choice : ");
	     choice=Consoleinput.getInt();
	    
	    switch(choice) {
	    case 1 : {
	    	Setdate obj=new Setdate();
			obj.Takedate();
			break;
	    	}
	    case 2 :{
	    	Setdate.dayadd();
	    	break;
	    }
	    case 3 :{
	    	Setdate.monthadd();
	    	break;
	    }
	    case 4 :{
	    	Setdate.yearadd();
	    	break;
	    }
	    case 5 :{
	    	System.out.println("Menu bar terminated.");
	    	System.out.println("Thank you for using Menu driven service.");
	    	break;
	    }
	    }
		caseswitch++;
	}while(choice<5);

}
}
