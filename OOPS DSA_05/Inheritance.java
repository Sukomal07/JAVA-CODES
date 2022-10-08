public class Inheritance {
    public static void main(String[] args) {
        // Fox shark= new Fox();
        // littledog.eat();
        Dog kalu = new Dog();// dog kalu is refrence and new dog() is object , refrence is always make in left side and object always make in right side
        // refrence is store obj address and we can also create parent refrence = child object
        kalu.eat();
        kalu.legs=4;
        System.out.println(kalu.legs);
    }
}
// base class
class Animal{
    String color;
    void  eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}

// derived class
// Use extends to use funtions in base class 
class Fox extends Animal{
    int run;
    int legs;
    void kill(){
        System.out.println("how much kill");
    }
}
class Dog extends Fox{
    String breed;

}