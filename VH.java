package Collection3;

public class VH {

	
		
		public String count(String a ) {
		char[] b=a.toCharArray();
	int 	up=0; 
    int 	low=0 ; 
	int num=0;
	int spl=0;
	
		for(int i=0;i<b.length;i++) {
			
			
			if(b[i]>='a' && b[i]>='z') {
				
			
			low++; }
			else if(b[i]>='A' && b[i]>='Z') {
			   up++;
		   }
			else if(b[i]>='0' && b[i]>='9') {
				
			}
			else {
				spl++;}
			}
			
		
		
          return " "+up+low+num+spl;		
		}	

		
		public void method(int num) {
			String a="";
			
			for(int i=0; i<num;i++) {
				a =a+""+i+"";
				System.out.println(a);
			}
		}
		
		
}