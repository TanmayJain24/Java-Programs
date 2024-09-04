public class MethOverloading {
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.sum(2,4));
        System.out.println(c.sum((float)1.5,(float)5.5));
        System.out.println(c.sum(1,5,9));
    }
}

class Calculator{
    int sum(int a,int b){//Method Overloading(same function name but different parameters)
        return a+b;
    }
    float sum(float a,float b){//Method Overloading
        return a+b;
    }
    int sum(int a,int b,int c){//Method Overloading
        return a+b+c;
    }
}
