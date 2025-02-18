
class Product{
    int pcode;
    String pname;
    double price;

    Product(int pcode,String pname,double price) {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }

public static void main(String[] args){
Product p1 = new Product(1,"pencil", 5);
Product p2 = new Product(2, "pen",10);
Product p3 =new Product(3, "eraser",3);
Product lowest = p1;
if(p2.price < lowest.price)
{
lowest=p2;
}

if(p3.price<lowest.price){
    lowest=p3;
}

System.out.println(p3.pname+" has the "+p3.price+" is lowest price");

}
}