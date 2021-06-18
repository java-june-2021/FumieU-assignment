public class PhoneTester{
    public static void main(String[] args){
        
        Galaxy s9 = new Galaxy("S9", 99, "Verizon","Ring ring ring!" );
        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());
        
        IPhone ten =  new IPhone("Ten", 100, "AT&T", "Zing!" );
        ten.displayInfo();
        System.out.println(ten.ring());
        System.out.println(ten.unlock());
        }

}