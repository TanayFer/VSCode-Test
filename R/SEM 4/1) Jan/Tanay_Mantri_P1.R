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

# Q10: Tossing a fair coin 1,000 times
coin_tosses = sample(c("H", "T"), size = 1000, replace = TRUE)
prob_head = mean(coin_tosses == "H")
print(prob_head)

# Q11: Rolling a fair die 6,000 times
die_rolls = sample(1:6, size = 6000, replace = TRUE)
prob_even = mean(die_rolls %% 2 == 0)
print(prob_even)

# Q12: Tossing two fair coins 5,000 times
coin1 = sample(c(0, 1), size = 5000, replace = TRUE)
coin2 = sample(c(0, 1), size = 5000, replace = TRUE)
total_heads = coin1 + coin2
prob_one_head = mean(total_heads == 1)
print(prob_one_head)

# Q13: Tossing three fair coins (All same: 0,0,0 or 1,1,1)
c1 = sample(c(0, 1), size = 5000, replace = TRUE)
c2 = sample(c(0, 1), size = 5000, replace = TRUE)
c3 = sample(c(0, 1), size = 5000, replace = TRUE)
all_same = mean((c1 == c2) & (c2 == c3))
print(all_same)

# Q14: Rolling two dice, sum = 7
d1 = sample(1:6, size = 10000, replace = TRUE)
d2 = sample(1:6, size = 10000, replace = TRUE)
prob_sum_7 = mean((d1 + d2) == 7)
print(prob_sum_7)

# Q15: Two dice: (a) both even, (b) at least one is 6
d1 = sample(1:6, size = 10000, replace = TRUE)
d2 = sample(1:6, size = 10000, replace = TRUE)
prob_both_even = mean(d1 %% 2 == 0 & d2 %% 2 == 0)
prob_at_least_6 = mean(d1 == 6 | d2 == 6)
print(prob_both_even)
print(prob_at_least_6)

# Q16: Product of two dice > 20
d1 = sample(1:6, size = 10000, replace = TRUE)
d2 = sample(1:6, size = 10000, replace = TRUE)
prob_prod_20 = mean((d1 * d2) > 20)
print(prob_prod_20)

# Q17: Three coins, Heads > Tails (meaning 2 or 3 heads)
c1 = sample(c(0, 1), size = 10000, replace = TRUE)
c2 = sample(c(0, 1), size = 10000, replace = TRUE)
c3 = sample(c(0, 1), size = 10000, replace = TRUE)
prob_h_gt_t = mean((c1 + c2 + c3) >= 2)
print(prob_h_gt_t)

# Q18: Two dice, difference is 0 or 1
d1 = sample(1:6, size = 10000, replace = TRUE)
d2 = sample(1:6, size = 10000, replace = TRUE)
diff = abs(d1 - d2)
prob_diff_1 = mean(diff <= 1)
print(prob_diff_1)