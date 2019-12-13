package AdventOfCode2019.Day3;

public class Point {
    private int x;
    private int y;

    public void move(String direction){
        switch (direction) {
            case "R":
                x += 1;
                break;
            case "L":
                x += -1;
                break;
            case "U":
                y += 1;
                break;
            case "D":
                y += -1;
                break;
            default:
                break;
        }
  }

    public int getX(){
        return x;
    }
    public int getY() { return y; }
    public String toString (){
        return (String.valueOf(x)+","+(String.valueOf(y)));
    }
    public int getDistanceFromO(){
        return (Math.abs(x)+Math.abs(y));
    }
    public Point(int xCoordinate, int yCoordinate){
        x = xCoordinate;
        y = yCoordinate;
    }
}
