#include <cstring>
#include <iostream> 
using namespace std; 
int main() 
{ //Your code goes here
char str[100]; 
  cin.getline(str,100); 
  int i,count=0; 
  for(i=0;str[i]!='\0';i++) 
  { 
    if(str[i]==' ') 
      count++; 
  } 
  if(count<=10) 
    cout<<"Caption eligible for the contest"; 
  else 
    cout<<"Caption not eligible for the contest";
}