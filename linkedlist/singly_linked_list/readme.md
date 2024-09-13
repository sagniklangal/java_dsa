- **Command Line Troubleshooting**: If you'd like to get it running from the command line, make sure your `javac` and `java` commands match the package structure and classpath correctly.

    **To Compile**:
    From the project root (`~/coding/java/java_dsa/`), use:
    ```bash
    javac linkedlist/singly_linked_list/*.java
    ```

    **To Run**:
    ```bash
    java linkedlist.singly_linked_list.Main
    ```

    Ensure you're using the correct package structure, which is critical for Java to find the necessary classes (like `Node`) when compiling and running manually.


When you’re working with Java projects and packages, the directory structure and compilation commands need to match how Java expects packages and classes to be organized. Here’s why the compilation command worked from the parent directory but not from within the `singly_linked_list` folder:

### **Understanding the Directory Structure and Compilation**

1. **Java Package Structure**:
   - Java packages correspond to directories in your file system.
   - For example, `package linkedlist.singly_linked_list;` should be in the `linkedlist/singly_linked_list` directory.

2. **Compilation from Parent Directory**:
   - When you compile from the parent directory (`~/coding/java/java_dsa/`), you provide the relative path to the `*.java` files, and `javac` can locate them as long as the package structure is correctly matched.

3. **Compilation from Within the Package Directory**:
   - If you are inside the `singly_linked_list` directory, `javac` expects the files to be in the root package level (e.g., `linkedlist.singly_linked_list`) and may not correctly resolve paths or package declarations.
   - Running `javac *.java` from within a package directory often fails because it doesn't handle the package structure properly or lacks the correct classpath context.

### **Correct Compilation Commands**

- **From Parent Directory**:
  ```bash
  cd ~/coding/java/java_dsa/
  javac linkedlist/singly_linked_list/*.java
  ```

- **From Within the Package Directory**:
  If you want to compile from within the `singly_linked_list` directory, you need to ensure the correct classpath and include the parent directory in the classpath. Here’s how you can do it:

  ```bash
  cd ~/coding/java/java_dsa/singly_linked_list
  javac -d ../ *.java
  ```

  This `-d ../` flag tells `javac` to place the compiled `.class` files in the parent directory (`java_dsa`), maintaining the package structure.

### **Running the Compiled Code**

- **From Parent Directory**:
  ```bash
  java linkedlist.singly_linked_list.Main
  ```

- **From Within the Package Directory**:
  Ensure the classpath is set correctly if needed:
  ```bash
  java -cp ../ linkedlist.singly_linked_list.Main
  ```
