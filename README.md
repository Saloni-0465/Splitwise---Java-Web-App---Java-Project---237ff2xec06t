Project Structure and Components
Source Directory (src)

  main/java/co/newtonschool/splitwise:
  
    controller: Manages HTTP requests with ExpenseController, UserController, and HomeController.
    model: Defines data structures with Expense, User, and UserExpense.
    repository: Handles database operations via UserRepository and ExpenseRepository.
    service: Implements business logic in ExpenseServiceImpl and UserServiceimpl.
    request: Captures web request data with classes like ExpenseRequest and UserRequest.
    response: Formats data sent back to clients with ExpenseResponse, UserResponse, etc.
  
  main/resources/templates: Contains Thymeleaf HTML templates for the UI:
    
    add-expense.html, create-user.html, expense.html, expense-list.html, home.html, navbar.html, user.html, user-list.html
    Project Objectives
    Develop a robust backend in Java using Spring Boot, alongside a dynamic frontend using Thymeleaf templates. This app should enable efficient management of shared expenses, mimicking real-world financial interactions among users.
