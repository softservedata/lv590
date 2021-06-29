import time, subprocess
import MySQLdb

db = MySQLdb.connect(db='lv590', host='192.168.153.134', user='devops', passwd='DevOps_553')
cursor = db.cursor()
#cursor.execute("show databases;")
#cursor.execute("INSERT INTO person (city,name) VALUES ('Rivne','Stepan')")
#cursor.execute("INSERT INTO person (city,name) VALUES ('Rivne','Vasja')")
#cursor.execute("UPDATE person SET name='Vasja' WHERE pid=9;")
#cursor.execute("DELETE FROM person WHERE name='Vasja';")
#db.commit()
#
cursor.execute("select * from temp;")
for d1 in cursor.fetchall():
  print("d1 = ", d1)
#
cursor.close()
db.close()
print( "DONE")



# pip install MySQL

