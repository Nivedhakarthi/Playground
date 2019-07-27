#include<stdio.h>
int main() 
{
  int n, a, d, s1, s2, num;
  scanf("%d", &n) ;
  if(n%2==1) 
  {
    a=0, d=2;
    s1=(n+1) /2;
    num=a+(s1-1) *d;
    printf ("%d", num) ;
  }
  else
  {
    a=0, d=1;
    s2=n/2;
    num=a+(s2-1) *d;
    printf ("%d", num) ;
  }
  return 0;
}