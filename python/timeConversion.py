def timeConversion(s):
    # Extract hours, minutes, and seconds
    hours, minutes, seconds = map(int, s[:-2].split(':'))

    # Check if it's in PM and not 12:00 PM
    if s[-2:] == 'PM' and hours != 12:
        hours += 12
    # Check if it's in AM and 12:00 AM
    elif s[-2:] == 'AM' and hours == 12:
        hours = 0

    # Convert back to string and format
    military_time = f"{hours:02d}:{minutes:02d}:{seconds:02d}"
    return military_time

if __name__ == '__main__':
    s = input("Enter time in 12-hour format: ")
    result = timeConversion(s)
    print("Converted time in 24-hour format:", result)
