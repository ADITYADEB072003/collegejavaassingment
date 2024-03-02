class book{

String name;
String author;
int price;
public static void main(String args[]){
book e=new book();
e.add();
e.display();
}
void add(){
name="JAVA";
author="A.K SEN";
price=300;

}
void display(){
System.out.println("BOOK_name="+name);
System.out.println("BOOK_author="+author);
System.out.println("BOOK_price="+price);

}
}
