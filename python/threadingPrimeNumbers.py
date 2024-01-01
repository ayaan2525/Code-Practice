import math
import threading
import time as t

def is_prime(num):
    """
    Check if a number is prime.
    """
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def countPrime(lock, limit, counter, finish_event):
    """
    Continuously take the next available number and check whether it's prime.
    Update the shared counter.
    """
    while True:
        with lock:
            current_number = counter[0]
            if current_number > limit:
                finish_event.set()  # Signal that the work is done
                break  # Exit the loop if the limit is reached

            if is_prime(current_number):
                counter[1] += 1
            counter[0] += 1

# Initialize shared counter, lock, and finish event
counter = [2, 0]
lock = threading.Lock()
finish_event = threading.Event()

# Set the limit for prime number calculation
limit = 10000000

# Record start time
startTime = t.perf_counter()

# Create and start 10 threads, each counting primes
threads = []

for i in range(10):
    thread = threading.Thread(target=countPrime, args=(lock, limit, counter, finish_event), name=f'Thread-{i}')
    thread.start()
    threads.append(thread)

# Wait for all threads to finish
finish_event.wait()

# Record end time
endTime = t.perf_counter()

# Print the total prime numbers and time taken
total_primes = counter[1]
print(f'Total prime numbers up to {limit} are {total_primes} and time taken is {endTime - startTime}')
