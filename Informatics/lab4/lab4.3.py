import lab4
import lab4dop1
import time

print('№1')
start = time.time()
for i in range(5):
    lab4.convert()
print(time.time() - start)

print('№2')
start2 = time.time()
for i in range(5):
    lab4dop1.conv()
print(time.time() - start2)

