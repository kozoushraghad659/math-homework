  import java.util.Random;
  
  public class MathHomework {
      private static final Random RANDOM = new Random();
  
      public int generateRandomNumber(int min, int max) {
          return RANDOM.nextInt((max - min) + 1) + min;
      }
  
      public String generateMathExpression(int difficultyLevel) {
          // Generate a random math expression based on the difficulty level
          switch (difficultyLevel) {
              case 1:
                  return String.valueOf(generateRandomNumber(1, 10)) + "+" + generateRandomNumber(1, 10);
              case 2:
                  return String.valueOf(generateRandomNumber(1, 100)) + "-" + generateRandomNumber(1, 50);
              case 3:
                  return String.valueOf(generateRandomNumber(1, 1000)) + "*" + generateRandomNumber(1, 100);
              default:
                  return "";
          }
      }
  }