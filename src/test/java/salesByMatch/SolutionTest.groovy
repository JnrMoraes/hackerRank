package salesByMatch

class SolutionTest extends spock.lang.Specification {

    def"receive a random of numbers with have some pairs to match and count how many have "(){

        given:"An array of numbers"
        Solution solution = new Solution();
        def array = [10, 20, 20, 10, 10, 30, 50, 10, 20];

        when:"Try to find if match"
        int response = solution.sockMerchant(array);  // ver pq esta indo para ReflectionUtil class

        then:"Have a number of total pairs"
        response == 3

    }
}
