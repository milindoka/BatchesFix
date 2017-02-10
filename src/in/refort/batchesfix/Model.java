package in.refort.batchesfix;

import java.io.File;
import java.util.HashSet;

public class Model
{   private int x;
    private String path;
    private HashSet <String> hs = new HashSet <String>();
    private HashSet <String> ts = new HashSet <String>();

    public Model(){
        x = 0;
    }
    
    public Model(int x)  ///// Model Constructor
    {
        this.x = x;
    }
    
    public void incX(){
        x++;
    }
    
    public int getX(){
        return x;
    }
    
    public String getJarPath()
    {
    	File f = new File(System.getProperty("java.class.path"));
     	File dir = f.getAbsoluteFile().getParentFile();
        path=dir.toString();
     	return  path;
    }
    
    public void Test()
    {
    	
    	

hs.add("M0123456");
hs.add("M0123457");
hs.add("M0123458");
hs.add("M0123459");
hs.add("M0123460");


ts.add("M0123460");
ts.add("M0123461");
ts.add("M0123462");
ts.add("M0123463");
ts.add("M0123464");


HashSet<String> in = new HashSet<String>(hs); // use the copy constructor to create in=hs
in.retainAll(ts);

System.out.println(hs);
System.out.println(ts);
System.out.println(in);
System.out.println(in.size());



}
    	
    
}