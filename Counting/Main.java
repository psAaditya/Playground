#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int v=0,c=0,ws=0,d=0,sy=0;
  for(int i=0;s[i]!='\0';i++)
  {
    if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z'))
    {
      if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
        v++;
      else
        c++;
    }
    else if(s[i]==' ')
      ws++;
    else if(s[i]>='0' && s[i]<='9')
      d++;
    else
      sy++;
  }
  cout<<"Vowels:"<<v<<"\n"<<"Consonants:"<<c<<"\n"<<"White Spaces:"<<ws<<"\n"<<"Digits:"<<d<<"\n"<<"Symbols:"<<sy;
}
