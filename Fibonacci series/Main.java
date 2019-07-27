#include<stdio.h>
int main()
{
  int n, p1=1, p2=0, next, num;
  scanf("%d", &n) ;
  for(num=1;num<=n;num++) 
  { 
    printf ("%d ", p2) ;
    next=p1+p2;
    p2=p1;
    p1=next;
   
  }
  return 0;
}