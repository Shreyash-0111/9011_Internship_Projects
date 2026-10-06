print("Enter your age: ")
age = int(input())

if age >= 18 and age <= 100:
    print("You are eligible to vote.")
else:
    print("Invalid age. Please enter a valid age between 18 and 100 OR you are not eligible to vote.")