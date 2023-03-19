# -*- coding: utf-8 -*-
def ok():
    N = int(input("Введите число N: "))
    K = int(input("Введите число K: "))
    index = 0
    fib_list = [1, 1]
    sum_number = 0
    K_fib_list = []
    while index + 2 < N:
        fib_list.append(fib_list[index] + fib_list[index + 1])
        if index+2 >= K:
            K_fib_list.append(fib_list[index])
        index += 1
    print("Сумма " + str(N-K) + "-и(х) чисел Фибоначчи (от " + str(K) + " )= " + str(sum(K_fib_list)))
ok()
