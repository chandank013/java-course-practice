import java.lang.*;

import java.lang.annotation.Annotation;

@interface MyAnno     // User define annotation is same as interaface but start with @  that is inheroted from annotation package of java.lang
{
    // Elements of annotation
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }

@MyAnno(name="Ajay",project="Bank") 

public class Annotation1
{
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}