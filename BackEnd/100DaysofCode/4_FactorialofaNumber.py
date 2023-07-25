"""
def factorial_of_a_number(n):
    number = 1
    for i in range(1,n+1):

        number = number * i

    return number

print(factorial_of_a_number(5))

"""



def factorial_of_a_number(n):

    if n == 0:
       return 1

    return n * factorial_of_a_number(n - 1)

print(factorial_of_a_number(998))
