#---------------- Lab Assignment 1 ----------------

#----------------  Q1 ---------------- 
nums = seq(5,100,5)
draws = sample(nums, 10000, replace=TRUE)
prob_div20 = mean(draws %% 20 == 0)
print(prob_div20)

#---------------- Q2 ---------------- 
rolls = sample(1:6, 12000, replace=TRUE)
prob_prime = mean(rolls %in% c(2,3,5))
prob_gt_mean = mean(rolls > mean(1:6))
print(prob_prime); print(prob_gt_mean)

#----------------  Q3 ---------------- 
coins = sample(c("H","T"), 15000, replace=TRUE, prob=c(0.6,0.4))
prob_head = mean(coins=="H")
prob_tail = mean(coins=="T")
print(prob_head); print(prob_tail)

#---------------- Q4 ---------------- 
letters = strsplit("STATISTICS","")[[1]]
draws = sample(letters, 10000, replace=TRUE)
prob_vowel = mean(draws %in% c("A","I"))
prob_S = mean(draws=="S")
print(prob_vowel); print(prob_S)

#----------------  Q5 ---------------- 
balls = c(rep("Red",3),rep("Blue",5),rep("Green",2))
draws = sample(balls, 10000, replace=TRUE)
prob_blue = mean(draws=="Blue")
prob_nonred = mean(draws!="Red")
print(prob_blue); print(prob_nonred)

#----------------  Q6 ---------------- 
d1 = sample(1:6, 10000, replace=TRUE)
d2 = sample(1:6, 10000, replace=TRUE)
sums = d1+d2
A_even = sums %% 2 == 0
B_gt8 = sums > 8
prob_A_given_B = mean(A_even[B_gt8])
prob_B_given_A = mean(B_gt8[A_even])
print(prob_A_given_B); print(prob_B_given_A)

#----------------  Q7 ---------------- 
machines = sample(c("Auto","Manual"), 10000, replace=TRUE, prob=c(0.3,0.7))
defective = ifelse(machines=="Auto",
                   sample(c(1,0),10000,replace=TRUE,prob=c(0.05,0.95)),
                   sample(c(1,0),10000,replace=TRUE,prob=c(0.12,0.88)))
prob_auto_given_def = mean(machines[defective==1]=="Auto")
print(prob_auto_given_def)

#----------------  Q8 ---------------- 
c1 = sample(c("H","T"),12000,replace=TRUE)
c2 = sample(c("H","T"),12000,replace=TRUE)
c3 = sample(c("H","T"),12000,replace=TRUE)
c4 = sample(c("H","T"),12000,replace=TRUE)
heads_count = (c1=="H")+(c2=="H")+(c3=="H")+(c4=="H")
pmf_heads = table(heads_count)/12000
cdf_heads = cumsum(pmf_heads)
print(pmf_heads); print(cdf_heads)
plot(cdf_heads,type="s",main="CDF of Heads",xlab="Heads",ylab="Cumulative Probability")

#----------------  Q9 ---------------- 
nums = sample(1:50,15000,replace=TRUE)
prime_flag = ifelse(nums %in% c(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47),1,0)
pmf_prime = table(prime_flag)/15000
cdf_prime = cumsum(pmf_prime)
print(pmf_prime); print(cdf_prime)
plot(cdf_prime,type="s",main="CDF of Prime Indicator",xlab="X",ylab="F(X)")

#----------------  Q10 ---------------- 
nums = sample(1:15,10000,replace=TRUE)
remainders = nums %% 4
pmf_rem = table(remainders)/10000
cdf_rem = cumsum(pmf_rem)
print(pmf_rem); print(cdf_rem)

#----------------  Q11 ---------------- 
d1 = sample(1:6,10000,replace=TRUE)
d2 = sample(1:6,10000,replace=TRUE)
min_val = pmin(d1,d2)
pmf_min = table(min_val)/10000
cdf_min = cumsum(pmf_min)
print(pmf_min); print(cdf_min)
plot(cdf_min,type="s",main="CDF of Minimum",xlab="X",ylab="F(X)")

#---------------- Q12 ---------------- 
nums = sample(1:20,10000,replace=TRUE)
A_mult4 = nums %% 4 == 0
B_even = nums %% 2 == 0
prob_A = mean(A_mult4)
prob_B = mean(B_even)
prob_AB = mean(A_mult4 & B_even)
print(prob_AB); print(prob_A*prob_B)
