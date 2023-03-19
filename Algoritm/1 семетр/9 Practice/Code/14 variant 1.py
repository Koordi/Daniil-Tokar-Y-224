def ok():
    n=int(input('Введите количество строк: '))
    l=[]
    for i in range(n):
        l1=[int(j) for j in input('Введите '+str(i+1)+'-ю строку: ').split()]
        l.append(l1)
    m=int(input('Введите номер строки для перестановки: '))
    b=-99999999999
    for i in range(n):
        if l[i][i]>b:
            b=l[i][i]
            ind=i
    l1=l[m-1]
    l[m-1]=l[ind]
    l[ind]=l1
    for i in range(len(l)):
        for j in range(len(l[i])):
            print(l[i][j], end=' ')
        print()
ok()
