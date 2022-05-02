public class Pro2_64010842 {
    public static void main(String[] args){
        RegularPolygon polygonObject1 = new RegularPolygon();
        RegularPolygon polygonObject2 = new RegularPolygon(6,4);
        RegularPolygon polygonObject3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("");
        System.out.printf("  Polygon Object #1 ->\t perimeter : %2.0f \t area : %.3f\n"
                            ,polygonObject1.getPerimeter(),polygonObject1.getArea());
        System.out.printf("  Polygon Object #2 ->\t perimeter : %2.0f \t area : %.3f\n"
                            ,polygonObject2.getPerimeter(),polygonObject2.getArea());
        System.out.printf("  Polygon Object #3 ->\t perimeter : %2.0f \t area : %.3f\n"
                            ,polygonObject3.getPerimeter(),polygonObject3.getArea());
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
    }
}
