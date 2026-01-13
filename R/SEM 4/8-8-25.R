#-----------Q7------------
A=10000
coin1=sample(c(0, 1), A, replace = TRUE)
coin2=sample(c(0, 1), A, replace = TRUE)

tosses=data.frame(coin1, coin2)

tosses$heads_count=rowSums(tosses)

at_least_one=tosses[tosses$heads_count >= 1, ]

prob_estimate=mean(at_least_one$heads_count == 1)

print(paste("Estimated Probability:", prob_estimate))

#-----------Q8------------
#Simulate rolling two fair dice and estimate the probability that the absolute difference between the outcomes is at least 3.
A = 10000
Die1 = sample(1:6, A, replace = TRUE)
Die2 = sample(1:6, A, replace = TRUE)

Abs1 = abs(Die1 - Die2)

prob_estimate = mean(Abs1 >= 3)

print(paste("Estimated Probability:", prob_estimate))

#-----------------Q9------------------------
#Three fair coins are tossed simultaneously. Estimate the probability that the number of heads is greater than the number of tails.
A = 10000
coin1 = sample(c(0, 1), A, replace = T)
coin2 = sample(c(0, 1), A, replace = T)
coin3 = sample(c(0, 1), A, replace = T)

D9 = data.frame(coin1, coin2, coin3)
D9$heads_count = rowSums(D9)
prob_estimate = mean(D9$heads_count > 1.5)

print(paste("Estimated Probability:", prob_estimate))

#---------------Q10------------------
#Simulate rolling two fair dice and estimate the probability that the product of the outcomes is a multiple of 6.
A = 10000
Die1 = sample(1:6, A, replace = TRUE)
Die2 = sample(1:6, A, replace = TRUE)

D10 = data.frame(Die1, Die2)
D10$product = D10$Die1 * D10$Die2
multiple_6 = (D10$product %% 6 == 0)

prob_estimate = mean(multiple_6)
print(paste("Estimated Probability:", prob_estimate))

#-------------Q11-----------------
#A box contains 5 red and 3 blue balls. Two balls are drawn with replacement. Estimate the probability that both balls are of the same color.
Balls = replicate(10000, sample(c(rep("R",5),rep("B",3)), 2, replace = T))
prob_estimate = mean(Balls [1,] == Balls[2,])

#-------------Q12---------------
#A box contains 5 red and 3 blue balls. Two balls are drawn without replacement. Estimate the probability that both balls are red.
Balls = replicate(10000, sample(c(rep("R", 5), rep("B", 3)), 2, replace = FALSE))
prob_estimate = mean(Balls[1,] == "R" & Balls[2,] == "R")

print(prob_estimate)

#-------------------Q13----------------
#Simulate the experiment of tossing four fair coins simultaneously. Estimate the probability of obtaining exactly two heads.
A = 10000
coin1 = sample(c(0, 1), A, replace = T)
coin2 = sample(c(0, 1), A, replace = T)
coin3 = sample(c(0, 1), A, replace = T)
coin4 = sample(c(0, 1), A, replace = T)

D13 = data.frame(coin1,coin2,coin3,coin4)
D13$heads_count = rowSums(D13)
prob_estimate = mean(D13$heads_count == 2)
prob_estimate

#-------------Q14------------
#Roll three fair dice simultaneously. Estimate the probability that the maximum of the three outcomes is at least 5.
A = 10000
Die1 = sample(1:6, A, replace = TRUE)
Die2 = sample(1:6, A, replace = TRUE)
Die3 = sample(1:6, A, replace = TRUE)

D14 = data.frame(Die1,Die2,Die3)
D14$least5 = rowsum(D14)
prob_estimate = mean(D14$least5 >= 5)








