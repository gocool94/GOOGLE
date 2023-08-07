"""

#1 Python Programming Exercise

Create a Python application that process an input from the user.

The input is an integer and you have to check the following:

if the given integer is smaller than 0:
then show a message to the user that the given integer is smaller than zero

if the given integer is greater than
(or equal to) 0 and smaller than (or equal to) 10: then show a message
to the user that the given integer is within the range [0,10]

if the given integer is greater than 10:
show a message to the user that the integer is greater than 10

Good luck!
"""

num = int(input("Enter the number - "))

if (num<0):
    print("Given number is smaller than 1")
elif(num>=0 and num<=10):
    print("the given integer is within the range [0,10]")
elif(num>10):
    print("integer is greater than 10")
