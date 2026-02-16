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
