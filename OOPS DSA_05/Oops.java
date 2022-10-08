public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setcolor("red");
        System.out.println(p1.color);
    }
}
// pen is class
class Pen{
    //{
    String color;
    int tip;
    //{
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newTip){
        tip = newTip;
    }
    //} these are funtions
}
