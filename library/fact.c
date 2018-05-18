#include<stdio.h>
#include "math.h"
int fact(int n)
{
     if(n==0)
     {
        return 1;
     }
     else
     {
        return n*fact(n-1);
     }
}
