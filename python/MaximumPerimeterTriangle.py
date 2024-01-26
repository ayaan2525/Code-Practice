#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'maximumPerimeterTriangle' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY sticks as parameter.
#

def maximumPerimeterTriangle(sticks):
    # Write your code here
    
    # Sort the sticks in non-decreasing order
    sticks.sort(reverse=True)
    
    # Initialize variables to store sides of the triangle
    a, b, c = 0, 0, 0
    
    # Initialize maximum perimeter to -1
    maxPerimeter = -1
    
    # Iterate through the sticks to find the maximum perimeter triangle
    for i in range(len(sticks) - 2):
        # Current sides of the triangle
        side1, side2, side3 = sticks[i], sticks[i + 1], sticks[i + 2]
        
        # Check if the sides can form a non-degenerate triangle
        if side1 < side2 + side3:
            # perimeter
            perimeter = side1 + side2 + side3
            
            # Update if the current triangle has a larger perimeter
            if perimeter > maxPerimeter:
                maxPerimeter = perimeter
                a, b, c = side1, side2, side3
    
    # If no non-degenerate triangle exists, return [-1]
    if maxPerimeter == -1:
        return [-1]
    
    # Return the sides of the maximum perimeter triangle in non-decreasing order
    return [c, b, a]


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    sticks = list(map(int, input().rstrip().split()))

    result = maximumPerimeterTriangle(sticks)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
 