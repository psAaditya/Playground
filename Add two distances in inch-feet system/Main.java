#include<iostream>
using namespace std;
struct dist
{
  float i;
  int f;
};
int main()
{
  //Type your code here.
  struct dist d1;
  struct dist d2;
  cin>>d1.f>>d1.i>>d2.f>>d2.i;
  int feet;
  float inch;
  feet=d1.f+d2.f;
  inch=d1.i+d2.i;
  if(inch>=12)
  {
    inch-=12;
    feet+=1;
  }
  cout<<feet<<"\'-"<<inch<<"\"";
}
