# Using Interface

Provide Full abstraction & contains Abstract + default/static methods

## Use

when you need

1. Want to define contracts (rules), not implementation.
2. Want to achieve multiple inheritance (via interfaces).
3. Don’t need constructors or instance variables.
4. Need only constants (public static final variables).
5. Want to provide shared behavior via default methods.
6. Want to allow default, static, and private methods (Java 8+ and Java 9+).
7. Want to implement the interface in unrelated classes (like Car and Printer implementing Startable).

## Interface keypoints

1. not mandatory to write abstract method in it : can be empty
2. can contain : abstract,default,static,private =methods + public static final =instance variable
3. does not create obj of abstract class
4. In interfaces, all non-default methods are implicitly abstract — no abstract keyword even needed.
5. Implementing class =mandatory override all abstract methods `unless implementing class also marked abstract.`
6. Interface class methods are called using: interface class refrence with implementing class obj
7. **To access interface variable in implementation class** : use INTERFACE_NAME.VARIABLE_NAME 🌟
8. **You cannot access private interface methods outside the interface**🌟
