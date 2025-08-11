import mypack.MyPackClass;

public class PackageDemo {
   public static void main(String[] args){
    MyPackClass myPackObj= new MyPackClass();
   
    myPackObj.displayMessage();

    int result= MyPackClass.addNum(5,10);
    System.out.println("Resutl of addtion" + result);
   }
}
