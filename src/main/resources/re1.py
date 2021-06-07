import re

p = re.compile('[a-z]+', re.IGNORECASE | re.DOTALL)
#print p
m=p.match('hello')
#m=p.match('Now is the time')
if m:
  print("Ok")
else:
  print("NOT")


