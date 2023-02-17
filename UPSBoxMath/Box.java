package UPSBoxMath;

public class Box{

    public String name;
    public String type;
    public double x;
    public double y;
    public double z;
    public double v;
    public boolean cutDown;

    public Box(String name, String type, double x, double y, double z, boolean cutDown){
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
        this.v = x*y*z;
        this.cutDown = cutDown;
    }
}