Validations & Exception HandLing

step-1: Check the Applciation by Giving invalid data but it will store in Database.

Step-2 : Give the Validation Annotations notNuLL @Email @max Test the applciation we will get the Bad Request. In console we cal see Exception MethodArgumentNotValidException.
Step-3 : Handle the MethodArgumentNotValidException in @RestControllerAdvice

Then we can see proper error messages in console.
Step 4: While getting the data give id which is not present. Then we will get blank without any errors.
Step 5: Handle the UserIdNotFound Exception also.
