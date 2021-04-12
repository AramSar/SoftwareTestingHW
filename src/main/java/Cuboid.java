public class Cuboid {
    private double a;
    private double b;
    private double h;

    public Cuboid(double a, double b, double h) {
        if(a<=0 || b<=0 || h<=0){
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public boolean isCube(){
        if(a==b && a==h){
            return true;
        }
        return false;
    }

    public String type(){
        if(h > a && h > b){
            return "tall";
        }
        else if(this.isCube()){
            return "cube";
        }
        return "flat";
    }

    public double getArea(Side side){
        if(side == Side.BASE || side == Side.TOP){
            return a*b;
        }
        else if(side == Side.LEFT || side == Side.RIGHT){
            return a*h;
        }
        else if(side == Side.FRONT || side == Side.BACK){
            return b*h;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}

enum Side{
    BASE,
    RIGHT,
    LEFT,
    TOP,
    FRONT,
    BACK,
    OTHER
}
