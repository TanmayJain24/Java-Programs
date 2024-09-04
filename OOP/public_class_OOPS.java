public class OOPS{
    public static void main(String args[]){
        PEN p1=new PEN();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Yellow";
        System.out.println(p1.color);
        p1.color="Red";
        System.out.println(p1.color);
    }
}

class PEN{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}





