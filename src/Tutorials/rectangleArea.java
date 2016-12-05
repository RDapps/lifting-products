package Tutorials;
class rectangleArea{
    
    public static void main(String[] args){
        
        Rectangle R = new Rectangle();
        R.findArea(4,5);
        R.findArea(8,2);
        
    }
    
}


    class Rectangle
    
    {
        
        double longSide;
        double shortSide;
        //double area;
        public void findArea(double l, double s){
        
            longSide = l;
            shortSide = s;
        double area = longSide * longSide * shortSide * shortSide;
        System.out.println(area);
    }

}
