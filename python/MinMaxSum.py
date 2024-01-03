#!/bin/python3

def miniMaxSum(arr):
    # Find the minimum and maximum values along with their indices
    min_value, max_value = min(arr), max(arr)
    min_index, max_index = arr.index(min_value), arr.index(max_value)

    # Calculate the sum for the minimum and maximum values
    sum_min = sum(arr) - max_value
    sum_max = sum(arr) - min_value

    print(f"{sum_min} {sum_max}")

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))
    miniMaxSum(arr)
