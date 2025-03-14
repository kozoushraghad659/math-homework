public static int getRandomNumber() {
  Random rand = new Random();
  int max = 10;
  int min = 1;
  int randomNum = rand.nextInt(max - min + 1) + min;
  return randomNum;
}
