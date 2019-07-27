#include <stdio.h>
int main() {
	int n, i, fact=0;
  scanf("%d", &n) ;
  for(fact=1;fact<=n;fact++) 
  {
    if(n%fact==0) 
    {
      printf("%d\n", fact) ;
    }
  }
	return 0;
}