print('Запишите числа от 1 до 8 задающие номер столбца и номер строки сначала для первой клетки, потом для второй клетки.')
x1 = int(input())
y1 = int(input())
x2 = int(input())
y2 = int(input())
a1 = ''
a2 = ''
if x1<=8 and x2<=8 and y1<=8 and y2<=8:
    if (x1-1)%2==0 and y1%2==0:
        a1 = 'черная'
    elif (x1%2)==0 and y1%2!=0:
        a1 = 'черная'
    else:
        a1 = 'белая'       
    if (x2-1)%2==0 and y2%2==0:
        a2 = 'черная'
    elif (x2%2)==0 and y2%2!=0:
        a2 = 'черная'
    else:
        a2 = 'белая'        
    if a1 == a2:
        print('да')
    else:
        print('нет')
