#include<stdio.h>
int main()
{
  float p,r, n, si;
  scanf("%f%f%f", &p, &n, &r) ;
  si=(p*n*r) /100;
  printf("%.6f", si) ;
  return 0;
}