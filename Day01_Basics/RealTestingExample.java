class RealTestingExample {
    public static void main(String[] args) {

        String expectedTitle = "Login";
        String actualTitle = "Login";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
