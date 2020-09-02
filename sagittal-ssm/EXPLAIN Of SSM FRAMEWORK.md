

# EXPLAIN OF SSM FRAMEWORK

**DESCRIBE:** This is a SSM framework specification. It helps us build the SSM framework step by step.SSM(Spring + SpringMVC + MyBatis) framework set is integrated by Spring and MyBatis(SpringMVC is part of Spring). Let's take a look at the execution steps below.

**EXECUTION STEP(SpringMVC):**

>1. The user initiates the request to the front controller (DispatcherServlet).
>2. The front controller requests the processor mapper to find the Handler.
>3. The processor mapper forward controller returns Handler.
>4. The front controller calls the processor adapter to execute the Handler.
>5. The processor adapter goes to the Handler.
>6. Handler completes and returns the ModelAndView to the adapter.
>7. The processor adapter forward controller returns the ModelAndView. The ModelAndView is an underlying object of the SpringMVC framework, including the Model and View.
>8. The front controller requests the view parser to parse the view into a real view(JSP) based on the logical graph name.
>9. The View parser returns the View to the forward controller.
>10. The front controller does view rendering, which populates the model data(in the ModelAndView object) into the request domain.
>11. The front controller responds to the user.