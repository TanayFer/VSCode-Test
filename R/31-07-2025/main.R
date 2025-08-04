Names=c("Tanay","Anish","Ashish","Deepinder");
Names;
Stats=c(25,24,23,22);
Stats;
Math=c(24,10,20,21);
Math;

D=data.frame(Names,Stats,Math);
D;

A=dim(D);
A;

A1=D$Stats;
A1;

colnames(D)=c("A","B","C");
D;

colnames(D)[1]="A1";
D;
colnames(D)[3]="C1";
D;

colnames(D)[c(1,3)]=c("A2","C2");
D;

History=c(22,08,21,25);
History;

D1=cbind(D,History);

D2=subset(D1, subset=Math<20);
D2;

D3=subset(D1, subset=Math>20);
D3;

D4=subset(D1, subset=(B>20)&(C<20));
D4;

D5=subset(D1, subset=(B>20)|(C<20));
D5;

M1=D$B;
M2=D$C;
M1;M2;

plot(M1,M2, main="Score");
plot(M1,M2, main="Score", xlab="Statistics",ylab="Mathematics");
plot(M1,M2,type="c" ,main="Score", xlab="Statistics",ylab="Mathematics");
plot(M1,M2,type="l",lwd=10 ,main="Score", xlab="Statistics",ylab="Mathematics");
plot(M1,M2,type="s",lwd=10,col="Blue" ,main="Score", xlab="Statistics",ylab="Mathematics");

plot(M1,M2,type="l",lwd=10,lty=101 ,col="Blue" ,main="Score", xlab="Statistics",ylab="Mathematics");

abline(h=20)
abline(v=23.5, col="Red" , lwd=5)

#data1=scan();
data1;

print(A);


sum=0;
for(i in 1:15)
{
	sum = sum + data1[i];
}
sum;

























