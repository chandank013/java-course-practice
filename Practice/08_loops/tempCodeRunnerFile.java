

public static void main(String arg[]) {

        Scanner sc=new Scanner(System.in);


        int count = 0;
        for(int i=1; i<6;i++)
        {
            for(int j=0; j<i;j++)
            {
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }

