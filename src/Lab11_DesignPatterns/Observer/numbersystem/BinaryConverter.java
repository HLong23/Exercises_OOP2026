package Lab11_DesignPatterns.Observer.numbersystem;

public class BinaryConverter extends AbstractNumberConverter {
    public BinaryConverter(MyNumber originalNumber) {
        super(originalNumber);
    }

    /*
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 2.
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 2.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        java.math.BigInteger num = new java.math.BigInteger(decimal);
        if (num.equals(java.math.BigInteger.ZERO)) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        while (num.compareTo(java.math.BigInteger.ZERO) > 0) {
            int remainder = num.mod(java.math.BigInteger.valueOf(2)).intValue();
            result.insert(0, remainder);
            num = num.divide(java.math.BigInteger.valueOf(2));
        }
        return result.toString();
    }

    /*
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi. Sau đó in ra terminal
     * số được chuyển đổi theo định dạng a1a2...an(2).
     */
    @Override
    public void update() {
        convert();
        display();
    }

    /*
     * Hiển thị số ra terminal theo định dạng a1a2...an(2).
     */
    @Override
    public void display() {
        System.out.println("Binary: " + convertedNumber);
    }
}
