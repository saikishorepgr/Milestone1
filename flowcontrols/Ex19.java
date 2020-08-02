package flowcontrols;

public class Ex19 {
	public static void main(String args[]){
	int i,x=0;
	for(i=1;i<200;i++){
		 if(x==5)
	        break;
		 if(i%2==0 && i%3==0 && i%5==0){
		    System.out.println(i+" ");
		      x++;
		    }
		 }
     }
}
