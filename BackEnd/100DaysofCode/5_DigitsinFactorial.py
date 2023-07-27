"""

def DigitsinFactorial(n):
    count = 0
    while(n>0):
        n = n//10
        count+=1
    return count

def FactorialNumber(N):

    if N == 0:
        return 1

    return N * FactorialNumber(N-1)

n = FactorialNumber(5)
print(DigitsinFactorial(n))

"""

def digitsInFactorial(n):
    factorial = 1
    while(n>1):
        factorial = factorial * n
        n = n-1
    print(factorial)
    count = 0
    while(factorial>0):
        factorial = factorial//10
        count+=1
    print(count)
digitsInFactorial(5)