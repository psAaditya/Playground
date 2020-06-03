//Type your code here.
#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  int j=0;
  string f;
  for(int i=0;str[i]!='\0';i++)
  {
    if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
    {
      string s;
      s=str[i];
      f.insert(j,s);
      j++;
    }
  }
  cout<<f;
}