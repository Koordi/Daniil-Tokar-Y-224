def f(n):
    if len(n) == 0:
        return n
    else:
        return f(n[1:]) + n[0]

number = str(input('Введите число: '))
print(f(number))