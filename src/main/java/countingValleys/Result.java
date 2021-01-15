package countingValleys;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int vale = 0;
        System.out.println("_");

        for(int i = 0; i < steps; i++){

            if(path.charAt(i) == 'U'){
                if(altitude == -1){
                    System.out.println("/");
                    vale++;
                }
                System.out.println("/");
                altitude++;
            }
            if(path.charAt(i) == 'D'){
                System.out.println("\\");
                altitude--;
            }
        }

        System.out.println("_");
        return vale;
    }


}


