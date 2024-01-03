import logging
import threading
import random
import time

# Configure logging
logging.basicConfig(level=logging.DEBUG, format='%(asctime)s - %(threadName)s - %(message)s')

# Function to generate random numbers, calculate square and cube, and log results
def generate_random_operations(thread_id, num_count):
    for _ in range(num_count):
        random_number = random.randint(1, 100)

        # Log generated random number
        logging.info(f"Thread {thread_id}: Generated random number: {random_number}")

        # Calculate square
        square_result = random_number ** 2
        logging.info(f"Thread {thread_id}: Square of {random_number}: {square_result}")

        # Calculate cube
        cube_result = random_number ** 3
        logging.info(f"Thread {thread_id}: Cube of {random_number}: {cube_result}")

        time.sleep(0.1)  # Simulate some processing time

# Main function
def main():
    # Number of threads and random numbers to generate
    num_threads = 3
    numbers_per_thread = 5

    # Create threads
    threads = []
    for i in range(num_threads):
        thread = threading.Thread(target=generate_random_operations, args=(i + 1, numbers_per_thread), name=f"Thread-{i + 1}")
        threads.append(thread)

    # Start threads
    for thread in threads:
        thread.start()

    # Wait for all threads to finish
    for thread in threads:
        thread.join()

    logging.info("All threads have finished.")

if __name__ == "__main__":
    main()
