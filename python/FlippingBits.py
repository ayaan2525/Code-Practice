#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'flippingBits' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts LONG_INTEGER n as parameter.
#

def flippingBits(n):
    bits = ""
    
    # Convert the decimal number to binary
    while n > 0:
        rem = n % 2
        bits = str(rem) + bits
        n = n // 2
    
    # Pad with leading zeros to make it 32 bits
    bits = '0' * (32 - len(bits)) + bits
    
    changedInt = 0
    count = 0
    
    # Flip the bits and calculate the new integer
    for i in reversed(bits):
        if i == '0':
            changedInt += 2 ** count
        count += 1
    
    return changedInt
    
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        n = int(input().strip())

        result = flippingBits(n)

        fptr.write(str(result) + '\n')

    fptr.close()
