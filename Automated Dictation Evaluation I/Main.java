#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str1;
  string str2;
  getline(cin,str1);
  getline(cin,str2);
  int flag=0;
  for(int i=0;(str1[i]!='\0') || (str2[i]!='\0');i++)
  {
    if(str1[i] != str2[i])
    {
      flag=1;
      break;
    }
  }
  if(flag==1)
    cout<<"It is wrong";
  else
    cout<<"It is correct";
}
