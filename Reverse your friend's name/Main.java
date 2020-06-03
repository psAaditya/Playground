#include<iostream>
using namespace std;
#include<string>
int main() 
{ 
//Type your code here
  string str;
  getline(cin,str);
  for(auto i=str.crbegin();i<str.crend();i++)
  {
    std::cout<<*i;
  }
}