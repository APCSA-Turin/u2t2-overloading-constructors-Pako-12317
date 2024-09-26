public class Point {
    private int x;
    private int y;

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int z) {
        this.x = z;
        this.y = z;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public String coordinate() {
        return("("+x+", "+y+")");
    }

    public String quadrant() {
       String rtrn = "";
        if(x==0 && y==0){
            rtrn = "origin";
        }else if (x==0 || y==0) {
            rtrn = "on an axis";
        }else if(x>0 && y>0){
            rtrn = "I";
        }else if(x<0 && y>0){
            rtrn = "II";
        }else if(x<0 && y<0){
            rtrn = "III";
        }else if(x>0 && y<0){
            rtrn = "IV";
        }
        return rtrn;
    }
}
