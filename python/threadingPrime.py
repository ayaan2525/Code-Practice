import math
import threading
import time as t

def countPrime(start, end):
    """
    Count prime numbers in the given range and append the count to the shared results list.
    """
    count = 0
    for i in range(start, end):
        flag = 0
        for j in range(2, int(math.sqrt(i)) + 1):
            if i % j == 0:
                flag = 1
                break
        if flag == 0:
            count += 1
    results.append(count)

# Initialize shared results list
results = []

# Record start time
startTime = t.perf_counter()

# Create and start 10 threads, each counting primes in a different range
threads = []
start = 2
end = 1000000

for _ in range(10):
    thread = threading.Thread(target=countPrime, args=[start, end])
    thread.start()
    threads.append(thread)
    start = end + 1
    end = end + 1000000

# Wait for all threads to finish
for thread in threads:
    thread.join()

# Record end time
endTime = t.perf_counter()

# Print the total prime numbers and time taken
print(f'Total prime numbers are {sum(results)} and time taken is {endTime - startTime}')
