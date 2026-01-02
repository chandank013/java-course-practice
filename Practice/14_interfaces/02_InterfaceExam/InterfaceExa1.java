import java.lang.*;


class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}
public class InterfaceExa1
{

    public static void main(String[] args) 
    {
        SmartPhone sp=new SmartPhone();  //(Here smartphone is references at smartphone we can take {phone,ICamara,IMultiplayer as refrerences } or Phone s=sc,ICamara c=sc,Imultipalyer im=sc)
        sp.call();
        sp.sms();
        
    }
    
}