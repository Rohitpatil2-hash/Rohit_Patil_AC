package company;
import java.util.Arrays;
import java.util.Comparator;



public class Program {

	public static void main(String[] args) {
		Manager array[]=new Manager[40];
        Engineer earray[]= new Engineer[40];
        Salesperson sarray[] = new Salesperson[40];
		int mcount=0;
		int ecount=0;
		int scount=0;
        int counter=0;
        int choice;
        do {
        System.out.println("***********************************************************************");
        System.out.println("***********************************************************************");
        System.out.println("********************************|MENUS|********************************");
        System.out.println("***********************************************************************");
        System.out.println("***********************************************************************");
        System.out.println("1 : Add");
        System.out.println("2 : Display");
        System.out.println("3 : Sort");
        System.out.println("4 : Exit");
        System.out.println("***********************************************************************");
        System.out.println("Enter your choice : ");
        choice=Consoleinput.getInt();
        switch(choice) {
        case 1 : {
        	int innercounter=0;
            int innerchoice ; 
        	do {
        		System.out.println("*****************************|ADD|*****************************");
        	    System.out.println("1 : Manager");
        	    System.out.println("2 : Engineer");
        	    System.out.println("3 : Salesperson");
        	    System.out.println("4 : Exit");
        	    System.out.println("****************************************************************");
        	    System.out.println("Enter your choice");
        	    innerchoice=Consoleinput.getInt();
        	    switch(innerchoice) {
        	    case 1 : {
        	    	if(mcount<40) {
        	    	 array[mcount]=new Manager();;
        	    	array[mcount].managerdetails();
        	    	System.out.println("Manager added successfully");
        	    	mcount++;
        	    	
        	    	}
        	    	break;
        	    }
        	    case 2 : {
        	    	if(ecount<40) {
        	    	 earray[ecount]=new Engineer();
            	    	earray[ecount].engineerdetails();
            	    	System.out.println("Engineer added successfully");
            	    	ecount++;
            	    	//break;
        	    	}
        	    	break;
        	    }
               case 3 : {
            	   if(scount<40) {
        	    	 sarray[scount]=new Salesperson();
        	    	sarray[scount].salespersondetails();
        	    	scount++;
        	    	//break;
        	    }
            	   break;
        	   }
       }
        	    
        	
        	}while(innerchoice<4);
        	break;
        	
        }
        
        	
        case 2 :{
        	for(int i=0;i<mcount;i++) {
        		System.out.println("Manager number : "+ (i + 1));
        		array[i].Display();
        		System.out.println("----------------------------------------------------------");
        	}
        	for(int i=0;i<ecount;i++) {
        		System.out.println("Engineer number : "+ (i + 1));
        		earray[i].eDisplay();
        		System.out.println("----------------------------------------------------------");
        	}
        	for(int i=0;i<scount;i++) {
        		System.out.println("Salesname number : "+ (i + 1));
        		sarray[i].sDisplay();
        		System.out.println("----------------------------------------------------------");
        	}
        	break;
        	}
        
       /* case 3 : {
        	 Arrays.sort(managers, Comparator.comparing(Manager::name));
        }*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        counter++;
        }while(choice<4);
	}  
        }
        

	
        
	
