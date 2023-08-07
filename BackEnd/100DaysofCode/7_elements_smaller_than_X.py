def smaller_elements(lst,x):
    new_list = []
    for i in lst:
        if i < x:
            new_list.append(i)
    print(new_list)

smaller_elements([1,2,3,4,5,6,7,8,9],4)