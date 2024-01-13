#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countingValleys' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER steps
#  2. STRING path
#

def countingValleys(steps, path):
    valley_count = 0
    current_level = 0

    for step in path:
        if step == 'U':
            current_level += 1
        else:
            current_level -= 1

        # Check if the hiker is back at sea level and just completed a valley
        if step == 'U' and current_level == 0:
            valley_count += 1

    return valley_count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    steps = int(input().strip())

    path = input()

    result = countingValleys(steps, path)

    fptr.write(str(result) + '\n')

    fptr.close()
