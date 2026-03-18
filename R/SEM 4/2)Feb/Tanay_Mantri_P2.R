#Problem Set 2
#------------------Q1------------------
# A : Student studying Maths
# B : Student studying Stats
# A both B : Student studying Both
A1 = 70
B1 = 60
A1_B1 = 40
Prob_estiA1 = A1_B1 / B1
Prob_estiB1 = A1_B1 / A1

#------------------Q2------------------
# A : People Using Internet
# B : People Using broadband
# A both B : People Using Both
A2 = 110
B2 = 90
A2_B2 = 50
Prob_estiA2 = A2_B2 / B2
Prob_estiB2 = A2_B2 / A2

#------------------Q3------------------
n = 10000
# A : No is Even
# B : No > 4
# A both B : No is in Both
A3 = sample(c(1:6), n, replace = T)
A3
Even3 = 0
Mul4 = 0
Both3 = 0
for (i in A3) {
  if (i %% 2 == 0) {
    Even3 = Even3 + 1
  }
  if (i>4) {
    Mul4 = Mul4 + 1
  }
  if (i %% 2 ==0 & i > 4) {
    Both3 = Both3 + 1
  }
}

Prob_estiA3 = Both3 / Mul4 ;Prob_estiA3 
Prob_estiB3 = Both3 / Even3 ; Prob_estiB3

#------------------Q4------------------
n = 10000
#A : Card is a Queen and 
#B : Card is a face card.
#C : Card is A or B.
Cards4 = c(
  rep("queen" , 4),
  rep("face" , 8),
  rep("other" , 40)
)
A4 = sample(Cards4, n , replace = T)
face4 = 0
both4 = 0
for (i in A4) {
  if (i == "queen" | i == "face") {
    face4 = face4 + 1
  }
  if (i == "queen") {
    both4 = both4 +1
  }
}
Prob_estiA4 = both4 / face4 ; Prob_estiA4

#------------------Q5------------------
#A : Person has disease
#B : Person not having disease
#C : Test is Positive
P_A5 = 0.08
P_B5 = 0.92
P_T_A5 = 0.85
P_F_B5 = 0.10

Prob_esti5 = (P_A5 * P_T_A5) /(  (P_A5 * P_T_A5) + (P_B5 * P_F_B5) )
Prob_esti5

#------------------Q6------------------
# A = Defective
# B = Good
# C1= Failed and Defective
# C2= Failed and Good
P_Defective=0.06
P_Good=0.94
P_Fail_Defective=0.70
P_Fail_Good=0.05

P_Failed_Inspection=(P_Fail_Given_Defective * P_Defective) + (P_Fail_Given_Good * P_Good)

P_Defective_Given_Failed=(P_Fail_Given_Defective * P_Defective) / P_Failed_Inspection

print(P_Defective_Given_Failed)

#------------------Q7------------------
# A : attended classes regularly
# B : passed the exam
# A & B : passed the exam
A = 90
B = 75
A_B = 60

Prob_estiA7 = A_B / B
Prob_estiB7 = A_B / A

#------------------Q8------------------
#A : Probability of rain
#B : Probability of traffic jam
#A_B : Probability of both

A8 = 0.3
B8 = 0.4
A_B8 = 0.18

Prob_estiA8 = A_B8 / B8
Prob_estiB8 = A_B8 / A8

#------------------Q9------------------
n = 1000
#A : getting an odd number
#B : number less than 4
A9 = sample(c(1,2,3,4,5,6),n,replace = T)
A9
Odd9 = 0
LT4 = 0
Both9 = 0
for (i in A9) {
  if (i %% 2 != 0) {
    Odd9 = Odd9 + 1
  }
  if (i < 4) {
    LT4 = LT4 + 1
  }
  if (i %% 2 != 0 & i < 4) {
    Both9 = Both9 + 1
  }
}

Prob_estiA9 = Odd9 / n 
Prob_estiB9 = LT4 / n
Prob_estiC9 = Both9 / n
#Event A&B Not Independant 

#------------------Q10------------------
n = 10000
# A : first coin is Head
# B : second coin is Tail
coin1 = sample(c("H","T"), n , replace = T)
coin2 = sample(c("H","T"), n , replace = T)

A10 = data.frame(coin1, coin2)

A10$Head = colSums(A10 == "H")
A10$Tail = rowSums(A10 == "T")

#---------------Q11---------------
#A : Prob of Maths Passing
#B : Prob of Stats Passing
#C : Prob of Both
PM_Q11 = 0.6
PS_Q11 = 0.5
PB_Q11 = 0.3
Inde_Q11 = PM_Q11 * PS_Q11
Inde_Q11

#---------------Q12---------------
#A : Card is Red.
#B : Card is a King.
#C : Both.
n = 10000
Cards12 = c(
  rep("RK",2),
  rep("RO",24),
  rep("BK",2),
  rep("BO",24)
)
A12 = sample(Cards12 , n , replace = T)
A = 0
B = 0
C = 0
for (i in A12) {
  if (i == "RO" | i == "RK") {
    A = A+1
  }
  if (i == "RK" | i == "BK") {
    B = B+1
  }
  if (i == "RK") {
    C = C+1
  }
} 
Prob_estiA = A / n
Prob_estiB = B / n
Prob_estiC = C / n
Inde_Q12 = Prob_estiA * Prob_estiB
Inde_Q12

#---------------Q13---------------
#A : Probability of Rain
#B : Probability of Wind
#C : Probability of Both
PR_Q13 = 0.25
PW_Q13 = 0.40
PBoth_Q13 = 0.10

Inde_Q13 = PR_Q13 * PW_Q13
Inde_Q13

#---------------Q14---------------
n = 10000
Die1_Q14 = sample(1:6, n, replace = TRUE)
Die2_Q14 = sample(1:6, n, replace = TRUE)

DF_14 = data.frame(Die1_Q14, Die2_Q14)

DF_14$A = (DF_14$Die1_Q14 == 1)
DF_14$B = (DF_14$Die2_Q14 == 1)
DF_14$C = (DF_14$Die1_Q14 + DF_14$Die2_Q14 == 2)

pA = mean(DF_14$A)
pB = mean(DF_14$B)
pC = mean(DF_14$C)

obs_AB = mean(DF_14$A & DF_14$B)
exp_AB = pA * pB
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

obs_AC = mean(DF_14$A & DF_14$C)
exp_AC = pA * pC
print(paste("A & C: Observed =", obs_AC, "| Expected =", exp_AC))

obs_BC = mean(DF_14$B & DF_14$C)
exp_BC = pB * pC
print(paste("B & C: Observed =", obs_BC, "| Expected =", exp_BC))

#---------------Q15---------------
#A : First coin show head
#B : Second coin show head
#C : Third coin show head
n = 10000
coin1_Q15 = sample(c("H","T"), n, replace = T)
coin2_Q15 = sample(c("H","T"), n, replace = T)
coin3_Q15 = sample(c("H","T"), n, replace = T)
DFCoin_A15 = data.frame(coin1_Q15,coin2_Q15,coin3_Q15)
DFCoin_A15

DFCoin1_Head = (DFCoin_A15$coin1_Q15 == "H");DFCoin1_Head
DFCoin2_Head = (DFCoin_A15$coin2_Q15 == "H");DFCoin2_Head
DFCoin3_Head = (DFCoin_A15$coin3_Q15 == "H");DFCoin3_Head

pA_15 = mean(DFCoin1_Head)
pB_15 = mean(DFCoin2_Head)
pC_15 = mean(DFCoin3_Head)

obs_AB = mean(DFCoin1_Head & DFCoin2_Head)
exp_AB = pA_15 * pB_15
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

obs_AB = mean(DFCoin2_Head & DFCoin3_Head)
exp_AB = pB_15 * pC_15
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

obs_AB = mean(DFCoin1_Head & DFCoin3_Head)
exp_AB = pA_15 * pC_15
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

#---------------Q16---------------
#A : Number is Even
#B : divisible by 3
#C : greater than 3
n = 10000
NOS_A16 = sample(1:6, n, replace = TRUE)

DF_16 = data.frame(Number = NOS_A16)

DF_16$A = (DF_16$Number %% 2 == 0)      # Even
DF_16$B = (DF_16$Number %% 3 == 0)      # Divisible by 3
DF_16$C = (DF_16$Number > 3)           # Greater than 3

pA = mean(DF_16$A)
pB = mean(DF_16$B)
pC = mean(DF_16$C)
# A and B
obs_AB = mean(DF_16$A & DF_16$B)
exp_AB = pA * pB
print(paste("A & B: Observed =", obs_AB, "Expected =", exp_AB))
# A and C
obs_AC = mean(DF_16$A & DF_16$C)
exp_AC = pA * pC
print(paste("A & C: Observed =", obs_AC, "Expected =", exp_AC))
# B and C
obs_BC = mean(DF_16$B & DF_16$C)
exp_BC = pB * pC
print(paste("B & C: Observed =", obs_BC, "Expected =", exp_BC))

#---------------Q17---------------
P_A = 0.5 
P_B = 0.4 
P_C=0.3
P_AB=0.2
P_AC=0.15  
P_BC=0.12

Inde1_Q17 = P_A * P_B; Inde1_Q17
P_AB
Inde2_Q17 = P_A * P_C; Inde2_Q17
P_AC
Inde3_Q17 = P_B * P_C; Inde3_Q17
P_BC

#---------------Q18---------------
#A : First coin show head
#B : Second coin show head
#C : Third coin show head
n = 10000
coin1_Q15 = sample(c("H","T"), n, replace = T)
coin2_Q15 = sample(c("H","T"), n, replace = T)
coin3_Q15 = sample(c("H","T"), n, replace = T)
DFCoin_A15 = data.frame(coin1_Q15,coin2_Q15,coin3_Q15)
DFCoin_A15

DFCoin1_Head = (DFCoin_A15$coin1_Q15 == "H");DFCoin1_Head
DFCoin2_Head = (DFCoin_A15$coin2_Q15 == "H");DFCoin2_Head
DFCoin3_Head = (DFCoin_A15$coin3_Q15 == "H");DFCoin3_Head

pA_15 = mean(DFCoin1_Head)
pB_15 = mean(DFCoin2_Head)
pC_15 = mean(DFCoin3_Head)

obs_AB = mean(DFCoin1_Head & DFCoin2_Head)
exp_AB = pA_15 * pB_15
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

obs_AB = mean(DFCoin2_Head & DFCoin3_Head)
exp_AB = pB_15 * pC_15
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

obs_AB = mean(DFCoin1_Head & DFCoin3_Head)
exp_AB = pA_15 * pC_15
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

#---------------Q19---------------
#A : the number is even
#B : divisible by 3
#C : greater than 2
n = 10000
A19 = sample(c(1:6), n , replace = T)
A_Q19 =  0
B_Q19 =  0
C_Q19 =  0
for (i in A19) {
  if (i %% 2 == 0) {
    A_Q19=  A_Q19+1
  }
  if (i %% 3 ==0) {
    B_Q19= B_Q19+1
  }
  if (i >2) {
    C_Q19= C_Q19+1
  }
}
Prob_AQ19 = A_Q19 / n
Prob_BQ19 = B_Q19 / n
Prob_CQ19 = C_Q19 / n

obs_AB = mean(A_Q19 & B_Q19)
exp_AB = Prob_AQ19 * Prob_BQ19
print(paste("A & B: Observed =", obs_AB, "| Expected =", exp_AB))

obs_AC = mean(A_Q19 & C_Q19)
exp_AC = Prob_AQ19 * Prob_CQ19
print(paste("A & C: Observed =", obs_AC, "| Expected =", exp_AC))

obs_BC = mean(B_Q19 & C_Q19)
exp_BC = Prob_BQ19 * Prob_CQ19
print(paste("B & C: Observed =", obs_BC, "| Expected =", exp_BC))


#---------------Q20---------------
rolls = sample(1:6, 6000, replace = TRUE)

event_B = rolls[rolls > 3]

event_A_given_B = (event_B %% 2 == 0)

probability = mean(event_A_given_B)

probability