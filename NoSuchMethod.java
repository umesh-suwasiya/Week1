import java.io.*;
public class NoSuchMethod{
  /*public void print(){
    System.out.println("Method is printing");
  }*/
  public static void main(String[] args){
    Print p = new Print();
    p.printHello();
    p.printWorld();
  }
}
