public class Point {
    private int x;
    private int y;
    private String label;
    public Point(String label,int x , int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }
    public String print(){
        return "Point " + label + "is at x = " + x + " , y = " + y;
    }
    public boolean equal(Object o){

    }
}
