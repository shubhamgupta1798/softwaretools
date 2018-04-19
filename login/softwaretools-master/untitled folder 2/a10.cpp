#include <iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
 cin.tie(NULL);
 int t;
 cin>>t;
 while(t--)
 {
 	int n;
 	int a[n];
 	for(int i=0;i<n;i++)
 	{
 	cin>>a[i];
 	}
 	sort(a,a+n);
 	if(a[0]!=a[1])
 	cout<<a[0]<<"\n";
 	else
 	for(i=1;i<n;i++)
 	{
 	if(i==n-1)
 	cout<<a[n-1]<<"\n";

 	else if((a[i]!=a[i+1])&&(a[i]!=a[i-1]))
 	cout<<a[i]<<"\n";
 	}
 	}}
