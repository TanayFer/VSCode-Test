#Q6
n = 10000
x = runif(n , 0 , 1)
prob = mean(x>0.2 & x<0.6)
prob

#Q7
dice= replicate(8000,sample(1:6,2,replace = T),2)
dim(dice)
Sum = colSums(dice)
prob=mean(Sum == 7)

#Q8
n = 10000
dim(bday)
count = 0;
for (i in 1:10000) {
  bday = sample(1:365, 25, replace = T)
  if(anyDuplicated(bday)>0){
    count = count+1;
  } 
}
count
prob=(count)/10000


#Q9
n = 5000
int1 = replicate(n, sample(1:20, replace = T))
dim(int1)
prob = mean(int1%%3==0 | int1 %%5 ==0)
prob

#Q10
dice1= sample(c("H","T"),100, replace = T)
P1=mean(dice1=="H")
P1

dice2= sample(c("H","T"),10000, replace = T)
P2=mean(dice2=="H")
P2

#Q11
Tosses=replicate(8000,sample(c("H","T"),3,replace=T))
dim(Tosses)

Head1=colSums(Tosses=="H")
P1=mean(Head1 == 2)
P1

Tail1=colSums(Tosses=="T")
P2=mean(Tail1 >= 1)
P2

#Q12

