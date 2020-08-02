package class_and_objects;

public class Box {
	double H,W,D;

    Box(double Height,double Width ,double Depth)
	 {
   	 H=Height;
	     W=Width;
	     D=Depth;
	 }
	    double volume()
	    { 
	    	double volume;
	        volume=H*W*D;
	        return volume;
	    }
	    public static void main(String[] args) 
	    {
	    	Box box = new Box(7.5,77.3,7.6);
	        System.out.println(box.volume());
	    }

}
