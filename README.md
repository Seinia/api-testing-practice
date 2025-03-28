# API Testing Practice

## Test Scenarios

### 1. Verify HTTP Status Code
- **Request**:
  - HTTP Method: `GET`
  - URL: `https://jsonplaceholder.typicode.com/users`
- **Validation**:
  - The status code of the obtained response is `200 OK`.

---

### 2. Verify HTTP Response Header
- **Request**:
  - HTTP Method: `GET`
  - URL: `https://jsonplaceholder.typicode.com/users`
- **Validation**:
  - The `Content-Type` header exists in the obtained response.
  - The value of the `Content-Type` header is `application/json; charset=utf-8`.

---

### 3. Verify HTTP Response Body
- **Request**:
  - HTTP Method: `GET`
  - URL: `https://jsonplaceholder.typicode.com/users`
- **Validation**:
  - The content of the response body is an array of 10 users.

---

## Acceptance Criteria

1. **Testing Framework**:
   - Tests should be created using either **Rest Assured** or **Spring Rest Template**.

2. **Validation**:
   - Tests must include the validations specified in the test scenarios.

3. **Readability**:
   - Implemented tests should be readable and follow proper naming conventions.

4. **Parallel Execution**:
   - Tests must be implemented to support parallel execution.

5. **Code Conventions**:
   - Naming and code conventions should be followed.

6. **Bonus Task**:
   - Additional tests should be created to test **CRUD operations** for the given resource.

---

## Bonus Task: CRUD Operations

Additional tests can be implemented to test **CRUD operations** for the `https://jsonplaceholder.typicode.com/users` resource:

1. **Create a User (POST)**:
   - Send a POST request to create a new post.
   - Validate the response status code and body.

2. **Read a User (GET)**:
   - Send a GET request to retrieve a specific post.
   - Validate the response status code and body.

3. **Update a User (PUT)**:
   - Send a PUT request to update an existing post.
   - Validate the response status code and body.

4. **Delete a User (DELETE)**:
   - Send a DELETE request to remove a post.
   - Validate the response status code.
