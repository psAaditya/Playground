#include<iostream>
using namespace std;
struct time
{
  int hr;
  int min;
  int sec;
};
int main()
{
  //Type your code here.
  struct time t1;
  struct time t2;
  cin>>t1.hr;
  cin>>t1.min;
  cin>>t1.sec;
  cin>>t2.hr;
  cin>>t2.min;
  cin>>t2.sec;
  int h,m,s;
  if(t1.sec >= t2.sec)
    s=t1.sec-t2.sec;
  else
  {
    t1.sec=60+t1.sec;
    s=t1.sec-t2.sec;
    t1.min-=1;
  }
  if(t1.min >= t2.min)
    m=t1.min-t2.min;
  else
  {
    t1.min=60+t1.min;
    m=t1.min-t2.min;
    t1.hr-=1;
  }
  h=t1.hr-t2.hr;
  cout<<h<<":"<<m<<":"<<s;
}
