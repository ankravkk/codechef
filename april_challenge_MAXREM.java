import java.util.*;

class GFG {
	public static void main (String[] args) {
     Scanner scan =new Scanner (System.in);
              long r=0;
         int n=scan.nextInt();
    
         int []a=new int[n];
         int c = 1;
         for(int i=0;i<n;i++){
             a[i]=scan.nextInt();
             if(c == 1 && i!=0) {
                 if(a[0] != a[i])
                    c = 0;
             }
         }
         if(c == 1){
             System.out.println('0');
         } else {
         Arrays.sort(a);
         int flag=0;
         for(int i=n-1;i>=0;i++){
             for(int j=n-2;j>=0;j--){
                 if(a[j]%a[i]!=0){
                r=a[j]%a[i];
                flag=1;
                     break;
                 }
             }
              if(flag==1){
                     break;
                 }
         } System.out.println(r);
       }
	}
	
}
