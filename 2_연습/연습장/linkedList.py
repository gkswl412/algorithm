class Node:
    def __init__(self,key):
        self.key = key
        self.link = None
    
    def __str__(self):
        return str(self.key)

a = Node(5)
b = Node(-3)
c = Node(7)
d = Node(31)

a.link = b
b.link = d
d.link = c

print(str(a))
print(str(a.link.link.link.link))