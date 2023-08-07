def segregate_list(ls):
    even_list = []
    odd_list = []
    for i in ls:
        if (i%2==0):
            even_list.append(i)
        else:
            odd_list.append(i)
    print(even_list)
    print(odd_list)

segregate_list(ls = [1,2,3,4,5])