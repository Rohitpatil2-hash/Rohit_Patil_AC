
public class Setdate {

	 int year;
	int month;
	int date;
	
		static int yy;
		static int mm;
		static int dd;
		public  void Takedate() {
		
		System.out.println("enter the year : " );
		yy= Consoleinput.getInt();
		if(yy<1950 || yy>2026) {
			yy= 2026;
			}
		else {
		     year=yy;
		}
		System.out.println("enter the month : " );
		mm= Consoleinput.getInt();
		if(mm<1 || mm>12) {
			mm=9;
		}
		else {
			month=mm;
		}
		System.out.println("enter the date : " );
		dd= Consoleinput.getInt();
		if(dd<1 || dd>31) {
			dd=1;
		}
		else {
			date=dd;
		}
		System.out.println("Date is : "+ dd + "-" + mm + "-" + yy );
	}
	static void dayadd() {
		System.out.println("Date is : "+ dd + "-" + mm + "-" + yy );
		System.out.println("Enter the number of days you want to add : ");
		int num=Consoleinput.getInt();
		System.out.println("Date is : "+ dd + "-" + mm + "-" + yy );
		for(int i=0;i<num;i++) {
			dd++;
			if(mm==2) {
			if (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) {
				if (dd>29) {
					mm++;
					dd=1;
					if(mm>12) {
						yy++;
					}
				}
			} 
			else if(dd>28) {
			    	mm++;
			    	dd=1;
			    	if(mm>12) {
						yy++;
					}
			    }
			}
			
			if (mm==1 || mm==3 ||mm==5 || mm==7 ||  mm==8 ||  mm==10  ||  mm==12) {
				if(dd>31) {
						mm++;
						dd=1;
						if(mm>12) {
							yy++;
						}
			}
			}
			if(mm==4 || mm==6 || mm==9 || mm==11) {
				 if(dd>30) {
						mm++;
						dd=1;
						if(mm>12) {
							yy++;
						}
			}
			
		}
			
	}
		
		System.out.println("Updated Date is : "+ dd + "-" + mm + "-" + yy );
}
	

  static void monthadd() {
	  System.out.println("Date is : "+ dd + "-" + mm + "-" + yy );
	  System.out.println("enter the number of month you want to add");
	  int monthnum=Consoleinput.getInt();
	  System.out.println("Date is : "+ dd + "-" + mm + "-" + yy );
	  for(int i=0;i<monthnum;i++) {
	  mm++;
	  if(mm>12) {
		  yy++;
	  }
  }
	  System.out.println("Updated Date is : "+ dd + "-" + mm + "-" + yy );
}
  
  static void yearadd() {
	  System.out.println("Date is : "+ dd + "-" + mm + "-" + yy );
	  System.out.println("enter the number of year you want to add");
	  int yearnum=Consoleinput.getInt();
	  System.out.println("Date is : "+ dd + "-" + mm + "-" + yy );
	  for(int i=0;i<yearnum;i++) {
		  yy++;
	  }
		  System.out.println("Updated Date is : "+ dd + "-" + mm + "-" + yy );
	}
  }

  
  
  
  
  
  
  
  
  
  
  

	 
	  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	