#Q1
dice1 = replicate(10000, sample(1:6, 2, replace = T))
dim(dice1)
sum1=colSums(dice1)
prob1=mean(dice1[1,]==5 | dice1[2,]==5 & sum1>8)
prob1
prob2 = mean(sum1 > 8)
prob2
prob3 = prob1/prob2

#Q2
coins1=replicate(10000, sample(c("H","T"), 3, replace = TRUE))
Heads=colSums(coins1 == "H")
A=Heads == 3        
B=Heads >= 2
P=mean(A[B])
P

#Q3
n = 10000
prob3 = 1:6 / sum(1:6)
S3 = sample(1:6, n , replace = T , prob = prob3)
mean(S3 > 4)

#Q4
population=sample(c("Urban","Rural"), n, replace = TRUE, prob = c(0.6, 0.4))
Prob4=sum(population == "Urban") / n
prob4

#Q5
n=100000
coin5 = sample(c("H","T"), n , replace = T)
dice = numeric(n)
for (i in 1:n) {
  if (coin5[i]=="H") {
    sum[i]=sample(1:6, 1, replace = T)
  }else{
    sum[i]=sum(sample(1:6, 2, replace = T))
  }
}
sum
prob5 = mean(sum>8)

#Q6
n=40
count=0

for (i in 1:10000) {
  bday=sample(1:365, n, replace = TRUE)
  freq=table(bday)               
  if (any(freq >= 3)) {            
    count=count + 1
  }
}
prob=count / 10000
prob




