public class vehical {
    void drive(){
        System.out.println("driving");

    }
    void vBreak(){
        System.out.println("breaking");

    }
    void reverse() {
        System.out.println("reversing");
    }
}
class car extends vehical{
    void motorRacing() {
        System.out.println("racing");

    }

}
class modernCar extends car{
    void flying(){
        System.out.println("flying");
    }

}
class boat extends vehical{
    void surf(){
        System.out.println("surfing");
    }
}
class modernBoat extends boat{
    void landRiding (){
        System.out.println("land riding");
    }
}
class testOutput {
    public static void main(String[] args) {
        modernBoat mb = new modernBoat();
        modernCar mc = new modernCar();
        mb.landRiding();
        mb.vBreak();
        mb.surf();
        mb.reverse();
        mb.drive();
        mc.flying();
        mc.motorRacing();
        mc.reverse();
        mc.vBreak();
        mc.drive();
    }

}
