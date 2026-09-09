#Getting Probability

#Q1.Probability of Getting Heads from 1000 Fair Coin Toss
n=1000
heads=sample(c("H","T"),n,replace=TRUE);heads
prob=mean(heads=="H");prob

#Q2.Probability of Getting Heads from 1000 Fair Coin Toss
tails=sample(c("H","T"),n,replace=TRUE);tails
prob1=mean(heads=="T");prob1

#Q2.1Probability of Getting Odd No. from 6000 Fair Dice Rolls
n1=6000
dice=sample(c(1,2,3,4,5,6),n1,replace=TRUE);dice
prob2=mean(dice%%2==1);prob2

#Q2.2Probability of Getting Even No. from 6000 Fair Dice Rolls
prob3=mean(dice%%2==0);prob3

#Q2.3Probability of Getting Multiple of No.3 from 6000 Fair Dice Rolls
prob4=mean(dice%%3==0);prob4

#Q3.Probability of Getting No Greater Than 4 from 6000 Fair Dice Rolls
prob5=mean(dice>4);prob5

#Q4.Probability of Getting a Heart from Drawing 1 card from 52 standard card
suits=c("Heart","Diamond","Club","Spade");suits
draws=sample(suits,10000,replace=TRUE);draws
prob_heart=mean(draws=="Heart");prob_heart

#Q5.Probability of Getting Exactly Head from 5000 2 Fair Coin Toss
coin1=sample(c("H","T"),5000,replace=TRUE);coin1
coin2=sample(c("H","T"),5000,replace=TRUE);coin2
M=matrix(c(coin1,coin2),byrow=TRUE,nrow=2);M
dim(M)
S=colSums(M=="H")
exact_head=mean(S==1);exact_head

#Another Way
Tosses=replicate(5000,sample(c("H","T"),replace=T),2);Tosses
dim(Tosses)
S=colSums(Tosses=="H");S
exact_head=mean(S==1);exact_head

#Mean,Variance,Covariance
x=1:10
y=11:20
mean(x)
var(x)
cov(x,y)