def getByIndex(arr, n, idx):
    # return required ans
    if n != 0 and idx <= len(arr)-1:
        return arr[idx]
    else:
        return -1

arr = [41,80,8,41,5]
n = 5
idx = 5
print(len(arr))
print(getByIndex(arr,n,idx))
