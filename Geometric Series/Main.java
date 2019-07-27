
  #include<stdio.h>
int main()
{
  int n, a, r, s1, s2, num;
  scanf("%d", &n) ;
        if(n%2==1) 
        {
          a=1;r=2;
          s1=(n+1) /2;
          num=a*pow(r, s1-1) ;
          printf("%d", num) ;
        }
        else
        {
          a=1;r=3;
          s2=n/2;
          num=a*pow(r, s2-1) ;
          printf ("%d", num) ;
        }
  return 0;

}