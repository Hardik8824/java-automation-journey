class MultipleTestExecution {
    public static void main(String[] args) {

        String[] testCases = {"LoginTest", "SignupTest", "LogoutTest"};

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Executing: " + testCases[i]);
        }
    }
}
