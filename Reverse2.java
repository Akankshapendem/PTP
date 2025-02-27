class Reverse2 {
    public int reverse(int x) {
      String numStr = Integer.toString(x);
        StringBuilder reversedStr = new StringBuilder();

        
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversedStr.append(numStr.charAt(i));
        }

        // Handle negative numbers
        if (x < 0) {
            reversedStr.insert(0, '-');
        } 

        
        try {
            int result = Integer.parseInt(reversedStr.toString());
            return result;
        } catch (NumberFormatException e) {
            return 0; // Return 0 in case of overflow/underflow
        }
    }
}