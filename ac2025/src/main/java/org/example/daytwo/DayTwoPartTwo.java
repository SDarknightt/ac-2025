package org.example.daytwo;

public class DayTwoPartTwo {
    private Long counter = 0L;
    public static void main(String[] args) {

        /*
        * Pega os ranges, itera entre eles
        * Pega cada valor, da split na metade e testa se ambas as partes são iguais
        * Pega cada valor, da split em partes iguais e testa se todas as partes são iguais
        * Se forem iguais, soma no contador
        * */
        String inputReal = "1061119-1154492,3-23,5180469-5306947,21571-38630,1054-2693,141-277,2818561476-2818661701,21177468-21246892,40-114,782642-950030,376322779-376410708,9936250-10074071,761705028-761825622,77648376-77727819,2954-10213,49589608-49781516,9797966713-9797988709,4353854-4515174,3794829-3861584,7709002-7854055,7877419320-7877566799,953065-1022091,104188-122245,25-39,125490-144195,931903328-931946237,341512-578341,262197-334859,39518-96428,653264-676258,304-842,167882-252124,11748-19561";
        String inputTest = "11-22,95-115,998-1012,1188511880-1188511890,222220-222224,1698522-1698528,446443-446449,38593856-38593862,565653-565659,824824821-824824827,2121212118-2121212124";
        // Expected Output Test: 4174379265
        String[] intervals = inputTest.split(",");
        DayTwoPartTwo dayTwo = new DayTwoPartTwo();

        for (String interval : intervals) {
            dayTwo.splitInterval(interval);
        }

        dayTwo.getResult();
    }

    void splitInterval(String input) {
        String[] splited = input.split("-");
        long start = Long.parseLong(splited[0]);
        long end = Long.parseLong(splited[1]);
        iterateRange(start, end);
    }

    void iterateRange(long start, long end) {
        for (long id = start; id <= end; id++) {
            this.verifyInvalidId(id);
        }
    }

    void verifyInvalidId(Long id) {
        String stringfiedId = String.valueOf(id);
        int lengthString = stringfiedId.length();

        if (lengthString % 2 == 0) {

            String firstPart = stringfiedId.substring(0, (lengthString / 2));
            String secondPart = stringfiedId.substring((lengthString / 2));

            if (firstPart.equals(secondPart)) {
                this.counter += id;
                System.out.println("Invalid: " + id);
            }
        }

        if (lengthString % 2 == 1) {

            String firstPart = stringfiedId.substring(0, (lengthString / 3));
            String secondPart = stringfiedId.substring((lengthString / 3), ((lengthString / 3) * 2));
            String thirdPart = stringfiedId.substring(((lengthString / 3) * 2), ((lengthString / 3) * 3));

            if (firstPart.equals(secondPart) && secondPart.equals(thirdPart)) {
                System.out.println("Invalid: " + id);
//                System.out.println(firstPart + " " + secondPart + " " + thirdPart);
                this.counter += id;
            }
        }

    }

    void getResult() {
        System.out.println("Result: " + this.counter);
    }
}