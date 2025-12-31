# Simple Interest Calculator

principal = float(input("Enter principal amount: "));
rate = float(input("Enter rate of interest (per annum): "));
time = float(input("Enter time period (in years): "));

simple_interest = (principal * rate * time) / 100;

print("Simple Interest: {simple_interest}");
print("Total Amount: {principal + simple_interest}");