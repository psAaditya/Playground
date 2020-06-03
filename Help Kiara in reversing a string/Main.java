#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code her
  string name;
  getline(cin,name);
 // cout<<name;
  for(auto i=name.crbegin();i<name.crend();i++)
  {
    cout<<*i;
  }
}