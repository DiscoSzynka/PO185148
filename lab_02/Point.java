public class Point {
    int x;
    int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    void distance(Point point,Point point2){
        System.out.println(Math.sqrt(Math.pow(point2.x-point.x,2)+Math.pow(point2.y-point.y,2)));
    }
}
