#include<stdio.h>
int main()
{
  int n,r,a;
  scanf("%d",&n);
  r=n/100;
  a=n%10;
printf("%d",(r+a));
  return 0;
}