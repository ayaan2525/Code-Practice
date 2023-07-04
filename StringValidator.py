def anyDigit(s):
    for i in s:
        if i.isdigit():
            return True
    return False

def anyLower(s):
    for i in s:
        if i.islower():
            return True
    return False

def anyUpper(s):
    for i in s:
        if i.isupper():
            return True
    return False
def anyAlpha(s):
    for i in s:
        if i.isalpha():
            return True
    return False

def anyAlNum(s):
    for i in s:
        if i.isalnum():
            return True
    return False

def check(s):
    print(anyAlNum(s))
    print(anyAlpha(s))
    print(anyDigit(s))
    print(anyLower(s))
    print(anyUpper(s))

if __name__ == '__main__':
    s = input()
    check(s)
