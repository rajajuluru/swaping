
public class TestingCode {
	
public static void main(String [] args)
{
	int[] arr1= {-10,-9,11,1,3,-20,-11,4};
	//int arr1[] = { 1, 2, -3, 4, 5, 6, -7, 8, -9 }; //-3 2 1
	int temp;
	int temp2;
	int count=0;
	int temp3;
	int temp4;
for(int i=0;i<arr1.length;i++)//ITERATION
{
	if(arr1[i]<0)//first -ve i=2  count=0
	{
	
		 temp=arr1[i];
		 temp2=arr1[count];//1
	
		arr1[count]=temp;
		arr1[i]=temp2;
		
		
		for(int j=count+1;j<=i;j++ )
		{
					 temp3=arr1[j]; //if count=0 ie count=count+1
					// temp4=arr1[j+1];
					arr1[j]=temp2;
					temp2=temp3;
					//arr1[j+1]=temp3;
		
			
		}

		count++;
	}
}

for(int i=0;i<arr1.length;i++)
{
	System.out.println(arr1[i]);
}
}
}
