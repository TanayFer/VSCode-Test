i=0
for(i in 1:10)
{print(i)}
i=0
while(i<10)
{
i=i+1
print(i)
}

i=1
while(i<=10)
{
print(i)
i=i+1
}

5%%2
4%%2

#Write a while loop to print all the even numbers between 0 to 30
i=0
while(i<=30){
	print(i)
	i=i+2;
}

i=0
while(i<=30){
	if(i%%2 == 0){
		print(i)
	}
	i=i+1;
}

#For given int n, start at 0 & print whether each int is odd or even
i=0
n=100
while(i<n){
	if(i%%2 == 0){
		print("Int is Even");
	}
	else
	{
		print("Int is Odd");
	}
	i=i+1;
}

#For Given Vector of integers determine whether each integer is odd or even
a1=c(5,15,45,10,42,89,8,19,55)
l1=length(a1)
i=1
while(i<=l1){
	if(a1[i]%%2 == 0){
		print("Integer is even");
	}
	else
	{
		print("Integer is odd");
	}
	i=i+1
}

#Print values of 1/n till they become less than given epsilon, where n are positive int
epi=0.01
n=1;
a2=c();
while(1/n > epi){
	print(1/n);
	a2[n]=1/n
	n=n+1;
}
length(a2)

#plot
plot(1:99 , a2, type="l", lwd=5, col="blue")

#Use while loop to calculate factorial of given positive int
i=5

f1=0
while(i>0){
	f1 = fact* (i-1)
	
	print(i)
}


























































