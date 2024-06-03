class animal{
    void name(){
        System.out.println("Animal");

    }
}
class mammal extends animal{
    void name1(){
        System.out.println("Mammal");
    }
}
class dog extends mammal{
    void name2(){
        System.out.println("Dog");
        }
        }
class in{
    public static void main(String[] args) {
        dog d=new dog();
        d.name();
        d.name1();
        d.name2();
        }
    }
