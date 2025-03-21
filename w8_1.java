import java.util.*;
class Product{
    String name;
    double price;
    String type;
    public Product(String name,double price,String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double amount){
        price = amount;
    }
    public String item(){
        return name + " : " + price + " , " + type;
    }
}
class Cart{
    List<Product> shop;
    LinkedList<Product> history;
    Stack<Double> discount;
    Vector<Product> dprods;
    public Cart(){
        shop = new ArrayList<>();
        history = new LinkedList<>();
        discount = new Stack<>();
        dprods = new Vector<>();
    }
    public void addProduct(Product product){
        shop.add(product);
        addhistory(product);
    }
    public void removeProduct(Product product){
        shop.remove(product);
    }
    public void searchProduct(String name){
        for(Product x : shop){
            if(x.getname()==name){
                System.out.println("Present in cart");
                return;
            }
        }
        System.out.println("Not Present in cart");
        return;
    }
    public void displayCart(){
        System.out.println("Cart:");
        for(Product product:shop){
            System.out.println(product.item());
        }
    }
    public void adddiscount(Double amount){
        discount.push(amount);
    }
    public void discountproduct(){
        for(Product product : shop){
            dprods.add(product);
        }
        for(Product product : dprods){
            if(!discount.isEmpty()){
                product.setprice(product.getprice()-discount.peek());
                discount.pop();
            }
            if(discount.empty()){
                product.setprice(product.getprice());
            }
        }
        System.out.println("Discounted Products:");
        for(Product product : dprods){
            System.out.println(product.item());
        }
    }
    public void addhistory(Product product){
        if(history.size()==5){
            history.removeFirst();
        }
        history.addLast(product);
    }
    public void displayhistory(){
        System.out.println("History:");
        for(Product product : history){
            System.out.println(product.item());
        }
    }
    public double checkoutdiscount(){
        double total = 0;
        for(Product product : dprods){
            total += product.getprice();
        }
        dprods.clear();
        return total;
    }
}
public class w8_1{
    public static void main(String[] args){
        Cart cart = new Cart();
        Product p1 = new Product("Laptop",10000,"Electrical");
        Product p2 = new Product("phone",5000,"Electrical");
        Product p3 = new Product("bottle",500,"Appliance");
        Product p4 = new Product("pens",1000,"Appliance");
        Product p5 = new Product("pencil",5000,"Appliance");
        Product p6 = new Product("Book",20000,"Appliance");
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);
        cart.addProduct(p5);
        cart.addProduct(p6);
        cart.displayCart();
        cart.searchProduct("Laptop");
        cart.removeProduct(p6);
        cart.removeProduct(p5);
        cart.displayCart();
        cart.displayhistory();
        cart.adddiscount(10.00);
        cart.adddiscount(25.00);
        cart.adddiscount(17.00);
        cart.discountproduct();
        System.out.println("Total after discount: " + cart.checkoutdiscount());
    }
} 