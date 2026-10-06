print("Enter the first string: ")
str1 = input()
print("Enter the second string: ")
str2 = input()

if sorted(str1) == sorted(str2):
    print("The strings are anagrams.")
else:
    print("The strings are not anagrams.")