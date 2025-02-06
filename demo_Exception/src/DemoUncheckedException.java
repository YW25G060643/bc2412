public class DemoUncheckedException {
  //2 types: unchecked(Runtime), checked(Compile-time)
  //define check exception
  public static class BusinessException extends Exception {
  
    
  }

  public static class BusinessRuntimeException extends RuntimeException {
  
    
  }
  //whose the caller of main() method?
  //JVM call the main method
    public static void main(String[] args) {
      int sum = 0;
        try {
          sum = sum(10, 1);//throws checked exception(compile error)
          System.out.println("Sum = " + sum);
        } catch (BusinessException e) {
          System.out.println("cannot be null");
        }

        //for runtime exception, you can catch or not catch (Syntax Perspective)
        sum = sum2(10, null);//syntax OK, but exception still exits
        try {
          sum = sum2(10, 1);//throws unchecked exception(Runtime error)
          System.out.println("Sum = " + sum);
        } catch (BusinessRuntimeException e) {
          System.out.println("cannot be null");
        }
    }

    public static int sum(Integer x, Integer y) throws BusinessException {
        if (x == null || y == null) {
            throw new BusinessException();
        }
        return x.intValue() + y.intValue();
    }

    public static int sum2(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new BusinessRuntimeException();
        }
        return x.intValue() + y.intValue();
    }
}
