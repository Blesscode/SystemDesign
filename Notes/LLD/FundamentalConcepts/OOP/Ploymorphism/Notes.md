# POLYMORPHISM

## COMPILETIME POLYMORPHISM - OVERLOAD

- make shure that the parameters are different & method/constructor name is same

## RUNTIME POLYMORPHISM - OVERRIDE

- Inheritance is mandatory
- what i am doing is calling the parent class method with **parent class reference** that holds a **child class object**, but child method got called instead of parent ¯\\\_(ツ)\_/¯
- Note parent reference with child obj is mandatory else:
  i. parent reference with parent obj = obviously lead to parent method
  ii. child reference with child obj = obviously lead to child method
  （￣︶￣）↗

- Static,constructor cannot be overriden
- same return time and access modifiers should be less restrictive for child
