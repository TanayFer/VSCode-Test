def check_number(num):
    if num > 0:
        return "Positive";
    elif num < 0:
        return "Negative";
    else:
        return "Zero";

# Example usage
if __name__ == "__main__":
    number = float(input("Enter a number: "));
    result = check_number(number);
    print(f"The number is: {result}");