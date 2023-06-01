class Student{
  private String name;
    
public String getName(){
    return name;}
public void setName(String N){
  this.name = N; 
}
    
}


public class Main{
  public static void main(String[] args) {
    Student obj = new Student();
    obj.setName("akhil reddy");
    System.out.print(obj.getName());
  }
}
