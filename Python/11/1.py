#Email checking
import re
A = input('Enter A Gmail: ')
A1 = re.search(".*\\.(co|com|in|org)$", A)
if A1:
    print("Valid Gmail")
else:
    print("Invalid Gmail")