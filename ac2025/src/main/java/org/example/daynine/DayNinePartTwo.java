package org.example.daynine;

import java.util.*;

public class DayNinePartTwo {
    public static void main(String[] args) {
        String inputReal = """
                98154,50433
                98154,51659
                98318,51659
                98318,52839
                97531,52839
                97531,54072
                97795,54072
                97795,55273
                97599,55273
                97599,56438
                97163,56438
                97163,57630
                96985,57630
                96985,58862
                97008,58862
                97008,60001
                96540,60001
                96540,61238
                96525,61238
                96525,62389
                96136,62389
                96136,63729
                96399,63729
                96399,64863
                95924,64863
                95924,66096
                95742,66096
                95742,67229
                95265,67229
                95265,68026
                93975,68026
                93975,69483
                94298,69483
                94298,70437
                93447,70437
                93447,71702
                93255,71702
                93255,72471
                92092,72471
                92092,73807
                91997,73807
                91997,74541
                90844,74541
                90844,75747
                90491,75747
                90491,76890
                90014,76890
                90014,77857
                89265,77857
                89265,78572
                88186,78572
                88186,79561
                87489,79561
                87489,80961
                87282,80961
                87282,81285
                85786,81285
                85786,82279
                85089,82279
                85089,83598
                84715,83598
                84715,84056
                83449,84056
                83449,85206
                82869,85206
                82869,85762
                81730,85762
                81730,86992
                81183,86992
                81183,87726
                80201,87726
                80201,88040
                78902,88040
                78902,89210
                78253,89210
                78253,89823
                77189,89823
                77189,90009
                75855,90009
                75855,90815
                74933,90815
                74933,91606
                73991,91606
                73991,92411
                73044,92411
                73044,92934
                71938,92934
                71938,93433
                70822,93433
                70822,93648
                69581,93648
                69581,94314
                68546,94314
                68546,95024
                67517,95024
                67517,94716
                66105,94716
                66105,95285
                65025,95285
                65025,96388
                64097,96388
                64097,96208
                62773,96208
                62773,96508
                61596,96508
                61596,96717
                60399,96717
                60399,96734
                59166,96734
                59166,97217
                58025,97217
                58025,97725
                56872,97725
                56872,97536
                55620,97536
                55620,97385
                54388,97385
                54388,97698
                53201,97698
                53201,97956
                51999,97956
                51999,98476
                50792,98476
                50792,97657
                49571,97657
                49571,97890
                48355,97890
                48355,98145
                47124,98145
                47124,98316
                45883,98316
                45883,97952
                44687,97952
                44687,97958
                43453,97958
                43453,97033
                42361,97033
                42361,96816
                41173,96816
                41173,97033
                39892,97033
                39892,96956
                38657,96956
                38657,96441
                37528,96441
                37528,96130
                36350,96130
                36350,95671
                35217,95671
                35217,95273
                34069,95273
                34069,95070
                32845,95070
                32845,94644
                31699,94644
                31699,93613
                30817,93613
                30817,93489
                29542,93489
                29542,93176
                28337,93176
                28337,92481
                27321,92481
                27321,91694
                26364,91694
                26364,90870
                25443,90870
                25443,90230
                24418,90230
                24418,89472
                23473,89472
                23473,88942
                22372,88942
                22372,88622
                21100,88622
                21100,87565
                20378,87565
                20378,86615
                19591,86615
                19591,86172
                18377,86172
                18377,85663
                17192,85663
                17192,84787
                16331,84787
                16331,83324
                16070,83324
                16070,82800
                14866,82800
                14866,82182
                13727,82182
                13727,80646
                13644,80646
                13644,80193
                12282,80193
                12282,79304
                11429,79304
                11429,78018
                11116,78018
                11116,77212
                10142,77212
                10142,75913
                9901,75913
                9901,74888
                9258,74888
                9258,74205
                8022,74205
                8022,73085
                7511,73085
                7511,71792
                7349,71792
                7349,70816
                6580,70816
                6580,69681
                6128,69681
                6128,68714
                5284,68714
                5284,67466
                5106,67466
                5106,66359
                4578,66359
                4578,65036
                4680,65036
                4680,63974
                4016,63974
                4016,62754
                3859,62754
                3859,61611
                3430,61611
                3430,60462
                2997,60462
                2997,59180
                3198,59180
                3198,57968
                3115,57968
                3115,56786
                2871,56786
                2871,55659
                2129,55659
                2129,54386
                2631,54386
                2631,53203
                2260,53203
                2260,51991
                2244,51991
                2244,50781
                2169,50781
                2169,50401
                94699,50401
                94699,48346
                1840,48346
                1840,47122
                1834,47122
                1834,45904
                1930,45904
                1930,44738
                2511,44738
                2511,43572
                2915,43572
                2915,42343
                2857,42343
                2857,41166
                3146,41166
                3146,39955
                3257,39955
                3257,38776
                3536,38776
                3536,37554
                3652,37554
                3652,36292
                3674,36292
                3674,35141
                4091,35141
                4091,33976
                4464,33976
                4464,32898
                5069,32898
                5069,31972
                6021,31972
                6021,30493
                5649,30493
                5649,29455
                6326,29455
                6326,28642
                7432,28642
                7432,27428
                7720,27428
                7720,26421
                8405,26421
                8405,25199
                8722,25199
                8722,24020
                9143,24020
                9143,23327
                10310,23327
                10310,21943
                10453,21943
                10453,21244
                11568,21244
                11568,20019
                11979,20019
                11979,19219
                12936,19219
                12936,18221
                13648,18221
                13648,17813
                15012,17813
                15012,16324
                15205,16324
                15205,16070
                16674,16070
                16674,14784
                17123,14784
                17123,14187
                18224,14187
                18224,13164
                18948,13164
                18948,12901
                20301,12901
                20301,12140
                21235,12140
                21235,10741
                21711,10741
                21711,10344
                22925,10344
                22925,10007
                24155,10007
                24155,9447
                25226,9447
                25226,8483
                26060,8483
                26060,8154
                27263,8154
                27263,7684
                28378,7684
                28378,6350
                29073,6350
                29073,6326
                30407,6326
                30407,6127
                31638,6127
                31638,4808
                32417,4808
                32417,5034
                33804,5034
                33804,4750
                34986,4750
                34986,4343
                36124,4343
                36124,3377
                37112,3377
                37112,3398
                38380,3398
                38380,3461
                39640,3461
                39640,3182
                40816,3182
                40816,2907
                41995,2907
                41995,2161
                43111,2161
                43111,2019
                44327,2019
                44327,2137
                45567,2137
                45567,2347
                46801,2347
                46801,2084
                48001,2084
                48001,1828
                49212,1828
                49212,2439
                50427,2439
                50427,2250
                51639,2250
                51639,2565
                52833,2565
                52833,2148
                54077,2148
                54077,2164
                55299,2164
                55299,2738
                56451,2738
                56451,2802
                57665,2802
                57665,3238
                58815,3238
                58815,2830
                60136,2830
                60136,3636
                61199,3636
                61199,3429
                62505,3429
                62505,3635
                63718,3635
                63718,4523
                64718,4523
                64718,5061
                65813,5061
                65813,5459
                66953,5459
                66953,5293
                68325,5293
                68325,6415
                69169,6415
                69169,6668
                70383,6668
                70383,6681
                71733,6681
                71733,7882
                72484,7882
                72484,7927
                73849,7927
                73849,8994
                74637,8994
                74637,9180
                75955,9180
                75955,10353
                76643,10353
                76643,10757
                77840,10757
                77840,11923
                78490,11923
                78490,12448
                79611,12448
                79611,13185
                80573,13185
                80573,13529
                81882,13529
                81882,14572
                82591,14572
                82591,15742
                83155,15742
                83155,16606
                83999,16606
                83999,17071
                85270,17071
                85270,18173
                85870,18173
                85870,19222
                86510,19222
                86510,20214
                87207,20214
                87207,21071
                88074,21071
                88074,22170
                88622,22170
                88622,22934
                89641,22934
                89641,23738
                90637,23738
                90637,24863
                91147,24863
                91147,25941
                91723,25941
                91723,26996
                92336,26996
                92336,28213
                92638,28213
                92638,29042
                93713,29042
                93713,30301
                93909,30301
                93909,31451
                94317,31451
                94317,32685
                94502,32685
                94502,33573
                95609,33573
                95609,34821
                95747,34821
                95747,36122
                95663,36122
                95663,37280
                96014,37280
                96014,38330
                96801,38330
                96801,39562
                96891,39562
                96891,40803
                96883,40803
                96883,42002
                97055,42002
                97055,43148
                97578,43148
                97578,44409
                97285,44409
                97285,45554
                97999,45554
                97999,46811
                97513,46811
                97513,48015
                97582,48015
                97582,49215
                98001,49215
                98001,50433
                """;
        String inputTest = """
                7,1
                11,1
                11,7
                9,7
                9,5
                2,5
                2,3
                7,3
                """;
        // Expected output: 24

        String[] stringIntervals = inputReal.split("\n");
        DayNinePartTwo dayNine = new DayNinePartTwo();
        ArrayList<Long[]> intervals = dayNine.arrayStringToArrayIntervals(stringIntervals);

        // Cria matriz comprimida
        HashMap<Long, Long> mapUncompressedX = new HashMap<>();
        HashMap<Long, Long> mapUncompressedY = new HashMap<>();

        ArrayList<Long[]> compressIntervals = dayNine.compressIntervals(intervals, mapUncompressedX, mapUncompressedY);

        // Ordena pelo menor valor X e Y
        compressIntervals.sort(Comparator.comparingLong(a -> a[0]));
        Long biggerX = compressIntervals.getLast()[0];
        compressIntervals.sort(Comparator.comparingLong(a -> a[1]));
        Long biggerY = compressIntervals.getLast()[1];

        ArrayList<ArrayList<String>> matrix = dayNine.createMatrix(biggerX+1, biggerY+1);

        dayNine.defineRedLightsOnMatrix(matrix, compressIntervals);
        dayNine.printMatrix(matrix);

        dayNine.drawLines(matrix, compressIntervals);
        dayNine.printMatrix(matrix);

        dayNine.fillBetweenLines(matrix);
        dayNine.printMatrix(matrix);

        Points biggestInterval = dayNine.findBiggestArea(matrix, compressIntervals, mapUncompressedX, mapUncompressedY);
        Long[] firstReduced = biggestInterval.first;
        Long[] firstInterval = {
            mapUncompressedX.get(firstReduced[0]),
            mapUncompressedY.get(firstReduced[1])
        };

        Long[] secondReduced = biggestInterval.second;
        Long[] secondInterval = {
            mapUncompressedX.get(secondReduced[0]),
            mapUncompressedY.get(secondReduced[1])
        };

        long realWidth  = Math.abs(secondInterval[0] - firstInterval[0])+1;
        long realHeight = Math.abs(secondInterval[1] - firstInterval[1])+1;
        long calcArea = realWidth * realHeight;

        System.out.println("Result: " + calcArea);
    }

    ArrayList<Long[]> compressIntervals(ArrayList<Long[]> intervals, HashMap<Long, Long> mapUncompressedX, HashMap<Long, Long> mapUncompressedY) {
        ArrayList<Long[]> compressedMatrix = new ArrayList<>();

        // Listas de todos os X e Y sem duplicados ja ordenadas crescentemente
        Set<Long> Xset = new TreeSet<>();
        Set<Long> Yset = new TreeSet<>();

        // Para mapear na hora de criar a nova lista reduzida
        HashMap<Long, Long> mapNormalToLowX = new HashMap<>();
        HashMap<Long, Long> mapNormalToLowY = new HashMap<>();

        for (Long[] interval : intervals) {
            Xset.add(interval[0]);
            Yset.add(interval[1]);
        }

        ArrayList<Long> X = new ArrayList<>(Xset);
        ArrayList<Long> Y = new ArrayList<>(Yset);

        // Define os valores comprimidos
        for (long i=0; i < X.size(); i++) {
            mapUncompressedX.put(i, X.get((int) i));
            mapNormalToLowX.put(X.get((int) i), i);
        }

        for (long i = 0; i < Y.size(); i++) {
            mapUncompressedY.put(i, Y.get((int) i));
            mapNormalToLowY.put(Y.get((int) i), i);
        }

        // Cria o novo intervals comprimido para ser usado nos calculos
        for (Long[] interval : intervals) {
            Long reducedX = mapNormalToLowX.get(interval[0]);
            Long reducedY = mapNormalToLowY.get(interval[1]);
            compressedMatrix.add(new Long[]{reducedX, reducedY});
        }

        return  compressedMatrix;
    }

    void printMatrix(ArrayList<ArrayList<String>> matrix) {
        System.out.println();

        for (ArrayList<String> row : matrix) {
            System.out.println(String.join("", row));
        }
    }

    // Inicializa a matriz preenchida com os .
    ArrayList<ArrayList<String>> createMatrix(long width, long height) {
        ArrayList<ArrayList<String>> matrix = new ArrayList<>();

        for (int y = 0; y < height; y++) {
            ArrayList<String> row = new ArrayList<>();
            for (int x = 0; x < width; x++) {
                row.add(".");
            }
            matrix.add(row);
        }

        return matrix;
    }

    // Define os # na matriz
    void defineRedLightsOnMatrix(ArrayList<ArrayList<String>> matrix, ArrayList<Long[]> redPoints) {

        for (Long[] p : redPoints) {
            int x = p[0].intValue();
            int y = p[1].intValue();

            // Garantia contra coordenadas fora do limite
            if (y >= 0 && y < matrix.size() && x >= 0 && x < matrix.get(y).size()) {
                matrix.get(y).set(x, "#");
            }
        }
    }

    // Pinta as linhas no eixo X e Y com "X" caso tenham duas extremidades com #
    void drawLines(ArrayList<ArrayList<String>> matrix, ArrayList<Long[]> redPoints) {
        for (int i = 0; i < redPoints.size(); i++) {
            long x1 = redPoints.get(i)[0];
            long y1 = redPoints.get(i)[1];

            for (int j = i + 1; j < redPoints.size(); j++) {
                long x2 = redPoints.get(j)[0];
                long y2 = redPoints.get(j)[1];

                // Verifica se ambos os valores estão na coluna
                // Itera verticalmente Y
                if (x1 == x2) {
                    long minY = Math.min(y1, y2);
                    long maxY = Math.max(y1, y2);

                    for (long y = minY; y <= maxY; y++) {
                        if (matrix.get((int) y).get((int) x1).equals(".")) {
                            matrix.get((int) y).set((int) x1, "X");
                        }
                    }
                }

                //Verifica se ambos os valores estão na mesma linha
                // Itera horizontalmente X
                if (y1 == y2) {
                    long minX = Math.min(x1, x2);
                    long maxX = Math.max(x1, x2);

                    for (long x = minX; x <= maxX; x++) {
                        if (matrix.get((int) y1).get((int) x).equals(".")) {
                            matrix.get((int) y1).set((int) x, "X");
                        }
                    }
                }
            }
        }
    }

    // Preenche espaços entre X iterando horizontalmente a cada linha
    void fillBetweenLines(ArrayList<ArrayList<String>> matrix) {
        for (int row = 0; row < matrix.size(); row++) {
            ArrayList<String> currentRow = matrix.get(row);
            int start = -1;
            int end = -1;

            // Encontra primeiro e último X ou #
            // Itera, define o indice do primeiro e depois encontra o mais a direita
            for (int col = 0; col < currentRow.size(); col++) {
                String rowItem = currentRow.get(col);
                if (rowItem.equals("X") || rowItem.equals("#")) {
                    if (start == -1) {
                        start = col;
                    }
                    end = col;
                }
            }

            // Se não não encontrar os dois pontos, ignora
            if (start == -1 || end == -1 || start == end) continue;

            // Itera mudando entre os intervalos para X
            for (int col = start; col <= end; col++) {
                String rowItem = currentRow.get(col);
                if (rowItem.equals(".")) {
                    currentRow.set(col, "X");
                }
            }
        }
    }

    // Pega string 12-20 e separa em array com intervalos
    ArrayList<Long[]> arrayStringToArrayIntervals(String[] intervals) {
        ArrayList<Long[]> arrayIntervals = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            arrayIntervals.add(i, this.splitInterval(intervals[i]));
        }
        return arrayIntervals;
    }

    // Retorna inicio e fim de iteração
    Long[] splitInterval(String input) {
        String[] splited = input.split(",");
        long start = Long.parseLong(splited[0]);
        long end = Long.parseLong(splited[1]);
        return new Long[]{start, end};
    }

    // Encontrar a maior área, mas que todos os elementos sejam # ou X
    Points findBiggestArea(ArrayList<ArrayList<String>> matrix, ArrayList<Long[]> intervals, HashMap<Long, Long> mapUncompressedX, HashMap<Long, Long> mapUncompressedY) {
        TreeMap<Long, Points> map = new TreeMap<>();

        // Itera a lista de intervalos
        for (Long[] interval : intervals) {
            Long x1 = interval[0];
            Long y1 = interval[1];

            for (Long[] interval2 : intervals) {
                Long x2 = interval2[0];
                Long y2 = interval2[1];

                // Não compara com o mesmo
                if (interval == interval2) continue;
                //Faz módulo por que não pode ser negativo
                long calcX = (Math.abs(mapUncompressedX.get(x2) - mapUncompressedX.get(x1))) + 1;
                long calcY = (Math.abs(mapUncompressedY.get(y2) - mapUncompressedY.get(y1))) + 1;

                long calcArea = calcX * calcY;

                boolean isValid = validateInterval(matrix, interval, interval2);

                //Adiciona apenas aqueles que seus elementos são apenas valores válidos # X
                if (isValid) {
                    Points points = new Points(interval, interval2);
                    map.put(calcArea, points);
                }
            }
        }
        // Retorna o último valor da lista (maior retangulo)
        return map.get(map.lastKey());
    }

    boolean validateInterval(ArrayList<ArrayList<String>> matrix, Long[] firstInterval, Long[] secondInterval) {

        int x1 = firstInterval[0].intValue();
        int y1 = firstInterval[1].intValue();

        int x2 = secondInterval[0].intValue();
        int y2 = secondInterval[1].intValue();

        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);

        for (int row = minY; row <= maxY; row++) {
            ArrayList<String> currentRow = matrix.get(row);

            for (int col = minX; col <= maxX; col++) {
                String currentItem = currentRow.get(col);

                if (currentItem.equals(".")) {
                    return false;
                }
            }
        }

        return true;
    }

    static class Points {
        Long[] first;
        Long[] second;
        public Points(Long[] first, Long[] second) {
            this.first = first;
            this.second = second;
        }
    }
}


