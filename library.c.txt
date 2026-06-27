#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>
typedef char* string;
string get_string(void)
{
    char *p = malloc(50);
    if (p == NULL)
        return NULL;
    fgets(p,50,stdin);
    int length=strlen(p);
    if(length>=30)
    {
        printf("String too high.\n");
        free(p);
        return NULL;
    }
    return p;
}
int get_int(void)
{
    int int_something;
    scanf("%d",&int_something);
    return int_something;
}
double get_double(void)
{
    double double_something;
    scanf("%lf",&double_something);
    return double_something;
}
char get_char(void)
{
    char c;
    scanf(" %c",&c);
    return c;
}
float get_float(void)
{
    float float_something;
    scanf("%f",&float_something);
    return float_something;
}
long get_long(void)
{
    long long_something;
    scanf("%ld",&long_something);
    return long_something;
}
int main(void)
{}