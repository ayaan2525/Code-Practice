import os
import subprocess

# Prompt the user to enter a directory path
dirPath = input("Enter directory path: ")
try:
    # Validate the path
    if not os.path.exists(dirPath):
        raise FileNotFoundError(f"Directory not found: {dirPath}")

    # Change the current working directory
    os.chdir(dirPath)

    # List the contents of the specified directory using 'ls' command
    p1 = subprocess.run(['ls'], stdout=subprocess.PIPE, text=True)
    print("Files in the specified directory: \n", p1.stdout)

    p2 = subprocess.run(['wc', '-l'], stdout=subprocess.PIPE, text=True, input=p1.stdout)
    print(f"Total number of files: {p2.stdout}")

    p3 = subprocess.run(['du', '-sh'], stdout=subprocess.PIPE, text=True)
    print(f"Total directory size: {p3.stdout}")
except FileNotFoundError as e:
    print(f"Error: {e}")
except subprocess.CalledProcessError as e:
    print(f"Command failed with return code {e.returncode}")