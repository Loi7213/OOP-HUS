package lab1.ex1;

public class Factorial {
    /*
    Khi khai báo "int n = 20;", chúng ta nhận được kết quả trả về
    mang giá trị âm là vì:
       - Giai thừa của số n = 20 là một giá trị rất lớn, vượt quá
       khả năng biểu diễn của kiểu dữ liệu int trong Java. Do đó,
       chúng ta sẽ gặp phải hiện tượng tràn số nguyên (integer overflow).
       - Trong trường hợp này, ngay thời điểm kết quả bắt đầu vượt quá
       giới hạn biểu diễn, kết quả sẽ ngay lập tức trở lại về giá trị
       biểu diễn nhỏ nhất của kiểu int, rồi tiếp tục cộng dồn kết quả
       cho tới khi kết thúc chương trình.
    Vì vậy, nếu muốn biểu diễn được kết quả chính xác khi n = 20, ta cần
    khai báo kiểu dữ liệu của n là float: "float n = 20;"
     */

    public static void main(String[] args) {
        float n = 20;
        float factorial = 1;

        for (int i = 1;  i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}

