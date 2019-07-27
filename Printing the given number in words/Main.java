#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  switch(a)
  {
      if(a<10)
      {
        case 1:printf("Zero");
        break;
        case 2:printf("Two");
        break;
        case 3:printf("Three");
        break;
        case 4:printf("Four");
        break;
        case 5:printf("Five");
        break;
        default:printf("Invalid");
        break;
      }
      return 0;
  }
}