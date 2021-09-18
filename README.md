#Spring Boot Fundamentals - Assessments

## Assessment 1
Create a class, that do sum of 2 numbers. Create a test, inject class into test class and verify sum method.

Assessment 1 is in [main] branch.

Do following actions to get and run assigment project:
```bash
# Clone project:

git clone https://github.com/laurynas-s/spring-boot-assessment1.git

# Enter project directory:

cd .\spring-boot-assessment1\

# Run test:

./mvnw clean test
```

Program output should print:
```text
[INFO] Running tutorial.laurynas.assessment1.DoSumTest
...
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s - in tutorial.laurynas.assessment1.DoSumTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

## Assessment 2

Create Jpa entity named Student with fields id, name, score. Create test to validate CRUD operations - create, get, update, delete.

Assessment 1 is in [assessment-1] branch.

Do following actions to get and run assigment project:
```bash
# Clone project:

git clone https://github.com/laurynas-s/spring-boot-assessment1.git

# Enter project directory:

cd .\spring-boot-assessment1\

# Check out assessment-2 branch:

git checkout assessment-2

# Run test:

./mvnw clean test
```

Program output should print:
```text
[INFO] Running tutorial.laurynas.assessment1.jpa.StudentRepositoryTest
...
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.127 s - in tutorial.laurynas.assessment1.jpa.StudentRepositoryTest
...
[INFO] Results:
[INFO]
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
