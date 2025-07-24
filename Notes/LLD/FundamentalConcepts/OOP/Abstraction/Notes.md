# Abstraction

Only showing necessary stuff not details
eg. only showing the concrete method of abstract class and it's implementations are hidden in extended class and we use abstract class method using the implmented class obj

# Abstract class vs Interface in abstraction

| Aspect                     | Abstract Class                       | Interface                                                |
| -------------------------- | ------------------------------------ | -------------------------------------------------------- |
| Keyword                    | `abstract`                           | `interface`                                              |
| Abstract methods           | Can have both abstract and concrete  | Abstract by default (until Java 8)                       |
| Method body                | Allowed                              | Not allowed (before Java 8), default/static after        |
| Constructors               | Can have constructors                | ❌ Cannot have constructors                              |
| Variables                  | Can have instance & static variables | Only `public static final` constants                     |
| Multiple Inheritance       | ❌ No (single abstract class only)   | ✅ Yes (can implement multiple interfaces)               |
| Access Modifiers (methods) | `public`, `protected`, `private`     | `public`, `private` (only `public` is externally usable) |
| Method Types               | abstract, concrete                   | abstract, **default**, static, private                   |
