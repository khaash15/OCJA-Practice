abstract class Car{  

  abstract void run();  

}  

class Hyundai extends Car{  

void run(){System.out.println(“Hyundai manufactures cars”);}  

public static void main(String args[]){  

 Car obj = new Hyundai();  

 obj.run();  

}  

} 
