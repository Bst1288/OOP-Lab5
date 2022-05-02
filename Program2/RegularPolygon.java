public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    //creates a regular polygon with default values.
    RegularPolygon(){
        
    }

    RegularPolygon(int new_n, double new_side){
        this.n = new_n;
        this.side = new_side;
    }

    RegularPolygon(int new_n, double new_side, double new_x, double new_y){
        this.n = new_n;
        this.side = new_side;
        this.x = new_x;
        this.y = new_y;
    }

    //-------Methods--------//
    
    //set value
    public void setN(int new_n){
        this.n = new_n;
    }
    public void setSide(double new_side){
        this.side = new_side;
    }
    public void setX(double new_x){
        this.x = new_x;
    }
    public void setY(double new_y){
        this.y = new_y;
    }

    //return value
    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getPerimeter(){
        return side*n;
    }
    public double getArea(){
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI/n));
    }
}
