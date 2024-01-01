#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    totalPositives = 0
    totalNegatives = 0
    totalZeros = 0
    
    for i in arr:
        if i < 0:
            totalNegatives += 1
        elif i > 0:
            totalPositives += 1
        else:
            totalZeros += 1
    print("{:.5f}".format(totalPositives / len(arr)))
    print("{:.5f}".format(totalNegatives / len(arr)))
    print("{:.5f}".format(totalZeros / len(arr)))
    

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)