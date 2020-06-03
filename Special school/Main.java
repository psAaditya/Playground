#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s1[20],s2[20];
  cin>>s1>>s2;
  char ch[20];
  int k=strlen(s2);
  int j=0;
  for(int i=k-1;i>=0;i--)
  {
    ch[j]=s2[i];
    j++;
  }
  //cout<<ch;
  int flag=0;
  for(int i=0;s1[i]!='\0';i++)
    if(s1[i]!=ch[i])
    {
      flag=1;
      break;
    }
  if(flag==1)
    cout<<"It is wrong";
  else
    cout<<"It is correct";
}