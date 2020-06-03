#include<iostream>
using namespace std;
struct employee
{
  char name[30];
  int eid;
  int age;
  char des[20];
  float sal;
  };
int main()
{
  //Type your code here.
  struct employee e;
  cout<<"Enter name:"<<"\n";
  cin>>e.name;
  cout<<"Enter ID:"<<"\n";
  cin>>e.eid;
  cout<<"Enter age:"<<"\n";
  cin>>e.age;
  cout<<"Enter designation:"<<"\n";
  cin>>e.des;
  cout<<"Enter Salary:"<<"\n";
  cin>>e.sal;
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<e.eid<<"\n";
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cout<<"Designation of the Employee : "<<e.des<<"\n";
  cout<<"Salary of the Employee : "<<e.sal;
}