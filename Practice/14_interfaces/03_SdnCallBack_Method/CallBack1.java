import java.lang.*;


interface Member
{
    public void callBack();
}

class store
{

Member mem[]=new Member[10];
int count=0;


void register(Member m)
{
    mem[count++]=m;
}

void InvideSale()
{
    for(int i=0;i<count;i++)
    {
        mem[i].callBack();
    }
}
}


class customer implements Member
{

    String name;

    public customer(String n)
    {
        name=n;
    }

    public void callBack()
    {
        System.out.println("Ok, I will Visit "+ name);
    }

}

public class CallBack1
{
    public static void main(String[] args)
    {

        store s=new store();
        customer c1=new customer("john");
        customer c2=new customer("smith");

        s.register(c1);
        s.register(c2);

        s.InvideSale();

    }
}


