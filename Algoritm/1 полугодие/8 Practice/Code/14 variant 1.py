def ok():
    m,n=map(int,input("Введите интервал:").split())
    kd=0
    kd2=0
    l=[]
    for i in range(m,n+1):
        for j in range(2,i):
            if i%j==0:
                kd2+=1
        if kd2>kd:
            kd=kd2
        kd2=0
    for i in range(m,n+1):
        for j in range(2,i):
            if i%j==0:
                kd2+=1
        if kd2==kd:
            print(i, end=' ')
        kd2=0    
ok()
