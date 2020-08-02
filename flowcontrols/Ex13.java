package flowcontrols;

public class Ex13 {
	public static void main(String[] n) { 
		int a=Integer.parseInt(n[0]);
		int b=Integer.parseInt(n[1]);
    int i,j,f;
    /*
    for(i=a;i<b;i++) {
    	f=0;
    	for(j=2;j<i;j++) {
    		if(i%j==0) {
    			f=1;
    			break;
    		}
    		
    	}
    	if(f==0)
			System.out.print(i+" ");
    }
    
    */
    
    
    if(a==1){ 
        System.out.print(a+" "); 
        a++; 
        if(b>=2){ 
            System.out.print(a+" "); 
            a++; 
        } 
    } 
    if(a==2) 
        System.out.print(a+" ");  
    if(a%2==0) 
        a++; 
    for(i=a;i<=b;i=i+2){ 
         f=1; 
        for(j=2;j*j<=i;++j){ 
            if(i%j==0){ 
                f=0; 
                break; 
            } 
        }      
        if (f==1) 
            System.out.print(i+" "); 
    } 
  
    } 
} 