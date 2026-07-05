enum laptop
{
    Macbook(1000), Dell(800), Hp(600), Lenovo(700);
    private int price;
    private laptop(int price)//constructor
    {
        this.price=price;
    }
public int getPrice()
{
    return price;
}
public void setPrice(int price)
{
    this.price=price;   
}
public class enumconstructor {
    public static void main(String[] args) {
        laptop l1=laptop.Dell;
        l1.setPrice(200);
        System.out.println(l1.getPrice());
       
    }
}
}
