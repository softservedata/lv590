import re

print("START2")
#p=re.compile( "\\d+(\\.+\\d+)+" )
#p = re.compile(r"[\.\d]+", re.IGNORECASE | re.DOTALL)
#m=p.match('first 192.168.103.141, second 192.168.103.142, 192.168.103.143')
#print("m.span() = ", m)

#m=p.findall("first 192.168.103.141, second 192.168.103.142, 192.168.103.143")

m=re.findall(r"\b[\.\d]+\b", "first 192.168.103.141, second 192.168.103.142, 192.168.103.143")
#m=re.findall(r"\d+\.\d+\.\d+\.\d+", "first 192.168.103.141, second 192.168.103.142, 192.168.103.143")
#m=re.findall(r"(\d+\.)+\d+", "first 192.168.103.141, second 192.168.103.142, 192.168.103.143")
#m=re.findall("(\\d+\\.)+\\d+", "first 192.168.103.141, second 192.168.103.142, 192.168.103.143")
#m=re.findall('(\d{3}\.)+\d{3}', "first 192.168.103.141, second 192.168.103.142, 192.168.103.143")
print("m = ", m)
