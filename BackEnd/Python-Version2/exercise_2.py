"""
Calculating the Average Exercise

Construct an application that calculates the average of the first 10 items -
starting with 1. So [1,2,3,4,5,6,7,8,9,10] these are the numbers you have to consider -
with loops of course :)

Good luck

"""

list = [1,2,3,4,5,6,7,8,9,10]

count = 0
sum = 0
for i in list:
    count+=1
    sum+=i
print(sum)
print(count)
print(sum/count)
