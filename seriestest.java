import series.*;
import java.io.*;

class SeriesTest{

                public static void main(String a[]) throws IOException
                {
                                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

                                System.out.println("Enter no :");
                                int no = Integer.parseInt(br.readLine());
								
                                Prime p= new Prime();
                                System.out.println("Prime no upto given nos are : ");
                                p.prime_range(no);

                                Square s= new Square();
                                System.out.println("Sqaure upto given nos are : ");
                                s.square_range(no);

                }
}





//paste this two file in series folder
//prime.java

package series;
public class Prime
{
	public void prime_range(int no)
	{
		for(int i=1;i<=no;i++)
		{
         		int flag=0;
                 for(int j=2;j<i;j++)
				 {
                       if(i%j==0)
					   {
					       flag=1;
                          break;
                    	}
			     }
                 if(flag==0)
                 System.out.println(i+" ");
         }
	}
}



//sqaure.java
package series;
public class Square{
	public void square_range(int no){
		for(int i=1;i<=no;i++){
                	System.out.println(i+" = "+(i*i));
              	}
	}
}

