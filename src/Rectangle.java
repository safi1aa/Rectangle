public class Rectangle {
    int centimeter1;
    int  сentimeter2;
    int centimeter3;
    int centimeter4;

    public Rectangle(int centimeter1,int centimeter2,int centimeter3,int centimeter4){
        this.centimeter1 = centimeter1;
        this.сentimeter2 = centimeter2;
        this.centimeter3 = centimeter3;
        this.centimeter4 = centimeter4;
    }
    public Rectangle () {

    }

    @Override
    public String toString() {
        return "Rectangle: \n" +
                "centimeter1: " + centimeter1 + "\n" +
                ", сentimeter2: " + сentimeter2 + "\n" +
                ", centimeter3: " + centimeter3 + "\n" +
                " centimeter4: " + centimeter4;
    }
}


