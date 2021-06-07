import re

p = re.compile('(hello)* (world)*', re.IGNORECASE | re.DOTALL)
#print p
m=p.match('hello text world text')

print("m.group(2) = ", m.group(2))
print("m.span() = ", m.span())
#print("m = ", m)


