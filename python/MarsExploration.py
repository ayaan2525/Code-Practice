#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'marsExploration' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#

def marsExploration(s):
    count = 0

    # Iterate through the string in chunks of 3
    for i in range(0, len(s) - 2, 3):
        message = s[i:i + 3]
        
        # Compare each character in the message with "SOS"
        for j, char in enumerate(message):
            if char != "SOS"[j]:
                count += 1

    return count


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = marsExploration(s)

    fptr.write(str(result) + '\n')

    fptr.close()
