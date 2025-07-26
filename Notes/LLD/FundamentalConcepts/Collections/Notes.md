# Collection

1. All collections are present in = java.util package
2. Memory wise = Not efficient
3. Performance Type = Efficient

## |Array|Collection|

|same data| diff data|
|fix size| dynamic |
|no methods|pre define method support|
|store obj + primitive|store obj|

## Collection framework - comparision

| Feature / Class           | List                  | Set                   | Queue                  | ArrayList             | LinkedList            | Vector                | HashSet              | LinkedHashSet            | TreeSet              | PriorityQueue        | HashMap                        | LinkedHashMap         | TreeMap                          | Hashtable             |
| ------------------------- | --------------------- | --------------------- | ---------------------- | --------------------- | --------------------- | --------------------- | -------------------- | ------------------------ | -------------------- | -------------------- | ------------------------------ | --------------------- | -------------------------------- | --------------------- |
| **1. What is it?**        | Ordered collection    | Unordered unique data | FIFO collection        | Resizable array list  | Doubly-linked list    | Synchronized list     | Hash table           | Hash table with order    | Sorted set           | Priority-based queue | Key-value map                  | Ordered key-value map | Sorted key-value map             | Synchronized map      |
| **2. Data Storage**       | Index-based           | Hashing               | Priority or FIFO       | Dynamic array         | Doubly-linked list    | Array                 | Hash table           | Hash table + linked list | Red-Black tree       | Heap (min-heap)      | Hashing                        | Hashing + linked list | Red-Black tree                   | Hash table            |
| **3. Retrieval**          | By index              | Iterator              | Poll/peek              | By index              | By index / iterator   | By index              | Iterator             | Iterator (ordered)       | Iterator (sorted)    | Head element access  | Key lookup                     | Key lookup (ordered)  | Key lookup (sorted)              | Key lookup            |
| **4. Accepts null?**      | Yes                   | One null element      | One null element       | Yes                   | Yes                   | Yes                   | One null             | One null                 | No (throws NPE)      | One null             | One null key, many null values | Same as HashMap       | No null key, null values allowed | No null key/value     |
| **5. Insertion Order?**   | Maintained            | Not maintained        | FIFO / Priority        | Maintained            | Maintained            | Maintained            | Not maintained       | Maintained               | Sorted by comparator | Priority order       | Not maintained                 | Maintained            | Sorted by key                    | Not maintained        |
| **6. Allows Duplicates?** | Yes                   | No                    | Yes                    | Yes                   | Yes                   | Yes                   | No                   | No                       | No                   | Yes                  | Keys: No, Values: Yes          | Keys: No, Values: Yes | Keys: No, Values: Yes            | Keys: No, Values: Yes |
| **7. Default Value**      | null for object types | null for object types | null (head when empty) | null elements allowed | null elements allowed | null elements allowed | null element allowed | null element allowed     | No null element      | null if empty        | null for absent keys           | null for absent keys  | null for absent keys             | null not allowed      |
| **8. Synchronized?**      | No                    | No                    | No                     | No                    | No                    | **Yes**               | No                   | No                       | No                   | No                   | No                             | No                    | No                               | **Yes**               |
