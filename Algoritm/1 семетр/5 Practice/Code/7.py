def ok():
    x=int(input("Введите число: "))
    l=[]
    while x != 0:
        l.append(x)
        x=int(input("Введите число: "))

    c=0
    for i in range(0, len(l)-1):
        if l[i] < l[i+1]:
           c += 1
    print(c, "элементов(а) больше предыдущего элемента последовательности")
ok()
