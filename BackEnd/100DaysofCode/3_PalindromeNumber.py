#Palindrome Number

def isPalindrome(n):

    reverse_digit = 0
    temp_number = n

    while(temp_number != 0):

        """
        last_digit = temp_number%10
        reverse_digit = (reverse_digit * 10) + last_digit
        """

        reverse_digit = ( reverse_digit * 10 ) + (temp_number % 10)

        temp_number = temp_number // 10
        
    print(temp_number)
    print(reverse_digit)
    return n == reverse_digit


print(isPalindrome(123321))