import java.lang.*;



class CoffeeMachine
{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    static private CoffeeMachine my=null;
    
    private CoffeeMachine()  // by making constructor private and use some other method to create an object
    {
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }
    
    static CoffeeMachine getInstance()
    {
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }
    
            
}
public class Singleton1
{
    public static void main(String[] args) 
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
        
    }   
}