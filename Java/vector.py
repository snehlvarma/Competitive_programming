class Vector:
  def__intit__(self, vec):
    self.vec = vec
    
  def __str__(self):
    str1 = ""
    index = 0
    for i in self.vec:
      str += f"{i}a{index} +"
      index +=1
     return str[:-1]
    
   def __add__(self,vec2):
    newlist = []
    for i in range(len(self.vec)):
      newlist.append(self.vec[i] + vec2.vec[i])
    return Verctor(newlist)
  
  def __mul__(self, vec2):
     sum = 0
     for i in range (len(self.vec)):
         sum += self.vec[i] * vec2.vec[i]
        rerturn sum 
        
        
v1 = Vector([1, 4, 6])
v2 = Vector([1, 6, 9])
print(v1+v2)
print(v1*v2)
  
