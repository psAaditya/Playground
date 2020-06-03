#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int found=s.find("the");
  s.erase(found,4);
  found=s.find("the",found+1,3);
  s.erase(found,4);
  cout<<s;
}