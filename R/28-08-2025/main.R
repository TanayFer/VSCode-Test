#Taking Help in R
?seq
??seq
help.search("seq")

?plot
??plot
help.search("plot")

?transpose
??transpose
help.search("plot")

#Data Types
#Creating a numeric vector
Marks=c(23,24,18,6,13)
Marks

Names=c("10","15","20","25","30","35","40","45","50","55")
Names

nos=35:45
nos=seq(from=35, to=45, by=0.1)
nos=seq(to=45, from=35, by=0.1)
nos=seq(45,35,-0.1)

#Repeat
R1=rep("Tanay", 5.5)
R2=rep(c(10,15,20), 5.5)
R3=c(rep(2,5),rep(12,7))
length(R3)

#Character Vector
Letters=c("a","b","c","d","e","f","g","h","i","j")
Letters=c("a","b","c","d","e","1","2","3","4","5")
Names=c("Tanay","Deep","Ashish","Anushree","Kavita","Anish")

is.vector(Names)
is.vector(Ashish)

#Transversing a Vector
HM=seq(1,10,0.1)
length(HM)
HM[c(5,7,40)]

#Removing Elements From Vector
HM[-38]
HM[c(-5,-7,-40)]
length(HM)

#Arithmatic Operation with vectorssssssssssssssssssssssssss
a=c(23,25,56)
b=c(1,4,6)
c=a+b

a1=c(23,25,56)
b1=c(1,4,6)
c1=a1-b1

a2=c(23,25,56)
b2=c(1,4,6)
c2=a2*b2

a3=c(23,25,56)
b3=c(1,4,6)
c3=a3/b3

x=c(10,15,20)
y=seq(1,6)
w=seq(11,15)

#Matrix ch kaam
M1=seq(1,9)
M2=matrix(M1, nrow=3, ncol=3, byrow=TRUE)
M3=matrix(M1, nrow=3, ncol=3, byrow=FALSE)

M4=c(1,7,13,69,8,91,4,5)
M5=matrix(M4, nrow=4, ncol=2, byrow=TRUE)
M6=matrix(M4, nrow=4, ncol=2, byrow=FALSE)

dim(M2)
M2[3,2]
M2[c(1,2),c(1,2)]
M2[-3,-3]

M10=matrix(nrow=3, ncol=3)
is.matrix(M10)

############################################################################
1)How to create an empty Matrix
###########################################################################

T=c(1,7,13,69,8,91,4,5)
T=c(1,2,3,4,5,6,7,8,9,10)
T=c(1,8,7,91,13,4,69,5)
T2=matrix(T, nrow=2, ncol=4, byrow=FALSE);T2

T=c(18,17,2,8,1,0.5,2,9,5,7)
T3=matrix(T, nrow=5, ncol=2, byrow=TRUE);T3
T=c(18,2,1,2,5,17,8,0.5,9,7)
T4=matrix(T, nrow=5, ncol=2, byrow=FALSE);T4

T=c(1,2,3,4,5,6,7,8,9,10)
T5=matrix(T, nrow=5, ncol=2, byrow=TRUE);
T6=matrix(T, nrow=5, ncol=2, byrow=FALSE);
Arith1=T5+T6
Arith2=T5-T6

TN=c(1,2,3,4,5,6,7,8,9,10)
T7=matrix(T, nrow=2, ncol=5, byrow=FALSE);T7
Arith3=T5%*%T7

M1=11:20
M2=c(1,2,3,4,5)
T8=matrix(M1, nrow=4, ncol=5, byrow=TRUE);T8
Hm=rbind(T8,M2);Hm

M3=11:20
M4=c(1,2,3,4)
T9=matrix(M1, nrow=4, ncol=5, byrow=TRUE);T9
Hm1=cbind(T8,M2);Hm1
Hm2=cbind(M2,T8);Hm2

Names=c("Anish","Tanay","Sarvesh","Shraddha","Salil","Ankita")
Stats=c(10,9,9.5,8.5,8,7.5)
Maths=c(100,90,90.5,80.5,80,70.5)

D=data.frame(Names,Stats);D
dim(D)
D[3,]

k=c(2,4)
D[k,]
k=c(1,3,4)
D[k,]

Hmm=D$Names;Hmm
Hmm2=D$Stats;Hmm2

D1=data.frame(D,Maths);D1
D1=data.frame(Names,Stats,Maths);D1
colnames(D1)[c(1,3)]=c("A","C");

Da=subset(D1, Stats<8);
Da=subset(D1, C>80.5);
Da=subset(D1, (Stats>8.5)&(Stats<=10));

X=scan();

###Loops###
for(i in 1:10){
	print(i)
}

hm=c("A","B","C","D","E","F","G","H","I","J")
hm2=c("1","2","3","4","5","6","7","8","9","10")
A=data.frame(hm,hm2);A
for(i in 1:10){
	print(A[i,])
}


































