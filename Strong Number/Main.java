#include <stdio.h>
int main() {
	int n, temp, sum, i, rem;
  scanf("%d", &n) ;
   temp=n;
  while (temp>0) 
  {
    rem=temp%10;
    int fact=1;
    for(i=1;i<=rem;i++) 
    {
      fact=fact*i;
    }
    sum=sum+fact;
    temp=temp/10;
  }
  if(n==sum) 
  {
    printf("Yes") ;
  }
  else
  {
    printf("No") ;
  }
	return 0;
}