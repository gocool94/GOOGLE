def majorityWins(arr, n, x, y):
    x_count = 0
    y_count = 0
    for i in arr:
        if i == x:
            x_count += 1
        elif i == y:
            y_count += 1

    if x_count == y_count:
        if x < y:
            return x
        elif y < x:
            return y
    elif x_count < y_count:
        return y
    elif y_count < x_count:
        return x

print(majorityWins(arr = [5,22,29,12,32,69,1,75],n = 8,x = 29,y = 96))