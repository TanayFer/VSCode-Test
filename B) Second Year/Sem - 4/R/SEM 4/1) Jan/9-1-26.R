#-------------Q15--------------
A15 = 10000
SA = sample(1:20 , A15, replace = T)
SB = sample(1:20 , A15, replace = T)

SDF = data.frame(SA , SB)
SDF$RS = rowSums(SDF)

isPrime = function(x){
  cntr = 0
  for(i in 1:x){
    if(x %% i == 0){
      cntr = cntr + 1
    }
  }
  return(cntr == 2)
}

isPrime_vec = Vectorize(isPrime)
prob_estimate = mean(isPrime_vec(SDF$RS))
prob_estimate

#-------------Q16------------
#Generate random observations from a Uniform(0,1) distribution and estimate the probability that the maximum of three observations exceeds 0.8
A16 = 10000
SA = runif(A16, min = 0, max = 1)
SB = runif(A16, min = 0, max = 1)
SC = runif(A16, min = 0, max = 1)

SDF = data.frame(SA, SB, SC)

SDF$Max = apply(SDF, 1, max)
SDF$Rem = (SDF$Max >= 0.8)

prob_estimate = mean(SDF$Rem)
prob_estimate

#----------------Q17---------------------
#Simulate rolling two fair dice. Given that the sum is even, estimate the probability that both dice show even numbers.
A17 = 10000
DieA = sample(1:6, A17, replace = T)
DieB = sample(1:6, A17, replace = T)
DSum = data.frame(DieA, DieB)

DSum$Sum = DSum$DieA + DSum$DieB
EvenSumRows = DSum[DSum$Sum %% 2 == 0, ]
BothEven = (EvenSumRows$DieA %% 2 == 0) & (EvenSumRows$DieB %% 2 == 0)

prob_estimate = mean(BothEven)
prob_estimate

#----------------Q18------------------
#A biased coin has probability 0.6 of showing head. The coin is tossed three times. Estimate the probability of getting at least two heads.
A18 = 10000
SA = sample(c("H", "T"), A18, replace = TRUE, prob = c(0.6,0.4))
SB = sample(c("H", "T"), A18, replace = TRUE, prob = c(0.6,0.4))
SC = sample(c("H", "T"), A18, replace = TRUE, prob = c(0.6,0.4))

SDF=data.frame(SA, SB, SC)

SDF$Head_Count = rowSums(SDF == "H")
SDF$Least_2 = SDF$Head_Count >= 2
prob_estimate = mean(SDF$Least_2)
prob_estimate

#-----------19-------------
#Simulate tossing three fair coins. Given that not all outcomes are the same, estimate the probability that exactly one head is obtained.
A19 = 10000
SA = sample(c("H", "T"), A18, replace = T)
SB = sample(c("H", "T"), A18, replace = T)
SC = sample(c("H", "T"), A18, replace = T)

SDF=data.frame(SA, SB, SC)
SDF$Short = rowSums(SDF == "H")
SDF$Max_2 = SDF$Short <= 2

prob_estimate = mean(SDF$Max_2)
prob_estimate



