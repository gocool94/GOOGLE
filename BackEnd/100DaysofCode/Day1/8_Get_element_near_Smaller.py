def immediateSmaller(arr,x):
    new_list = []
    for i in arr:
        if i < x:
            new_list.append(i)
    if len(new_list)== 0:
        return -1
    else:
        return new_list[-1]