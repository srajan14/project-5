void cal(){
    System.out.println("this is the grand parent"); 
} 
class addition extends cal{
void add(){
    System.out.println("this is the parent"); 
}
} 
class substraction extends addition{
void minus(){
    System.out.println(" this is the child");
}
}
class Main{
    public static void main(String[] args) {
        substraction s= new substraction(); 
        s.minus();
    }
}
    