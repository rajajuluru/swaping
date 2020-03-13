public class shilpacode {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
      int temp1,temp2;
      int a[] = {2,10,9,5,6,-4,-9,-10,23,32,-43};
      int n=a.length;
      /*for(int t=0;t<n;t++){
      System.out.println("Sum of x+y = " + a[t]);
        }*/
      for(int i=0;i<n;i++){
          if(a[i]<0){//negative
              for(int k=0;k<=i;k++){//loop upto firtd negative
                 // System.out.println("loop " + a[k]);
                  if(a[k]>=0){//firt +ve
                    //  System.out.println("if " + a[k]);
                      temp1=a[k];//swap first +ve with first -ve
                      a[k]=a[i];
                      for(int j=k+1;j<=i;j++){// loop from first +veindex+1 to first -ve index
                          temp2=a[j];
                        a[j]=temp1;
                        temp1=temp2;
                         
                          
                          
                      }
                      break;
                  }
              }
          }
      }

 for(int t=0;t<n;t++){
      System.out.println(a[t]);
 }
    }
}