public class FirstGeneration {
    public static boolean[][] plantStillLife(){

        boolean[][] stillLifeTemplate = new boolean[50][25];

        //creates the "Block"
        stillLifeTemplate[2][2] = true;
        stillLifeTemplate[2][3] = true;
        stillLifeTemplate[3][2] = true;
        stillLifeTemplate[3][3] = true;

        //creates the "Beehive"
        stillLifeTemplate[20][4] = true;
        stillLifeTemplate[21][4] = true;
        stillLifeTemplate[19][5] = true;
        stillLifeTemplate[22][5] = true;
        stillLifeTemplate[20][6] = true;
        stillLifeTemplate[21][6] = true;

        //creates the "Loaf"
        stillLifeTemplate[40][10] = true;
        stillLifeTemplate[41][10] = true;
        stillLifeTemplate[39][11] = true;
        stillLifeTemplate[42][11] = true;
        stillLifeTemplate[40][12] = true;
        stillLifeTemplate[42][12] = true;
        stillLifeTemplate[41][13] = true;

        //creates the "Boat"
        stillLifeTemplate[7][11] = true;
        stillLifeTemplate[8][11] = true;
        stillLifeTemplate[7][12] = true;
        stillLifeTemplate[9][12] = true;
        stillLifeTemplate[8][13] = true;

        //creates the "Tub"
        stillLifeTemplate[31][20] = true;
        stillLifeTemplate[30][21] = true;
        stillLifeTemplate[32][21] = true;
        stillLifeTemplate[31][22] = true;

        return stillLifeTemplate;

    }

    public static boolean[][] plantChaos(){

        boolean[][] chaosTemplate = new boolean[400][200];

        for (int i = 0; i < chaosTemplate.length; i++) {
            for (int j = 0; j < chaosTemplate[i].length; j++) {
                if (Math.random() < 0.5){
                    chaosTemplate[i][j] = true;
                }
            }
        }

        return chaosTemplate;

    }

    public static boolean[][] plantSmallPeriodOscillators(){

        boolean[][] smallOscillatorsTemplate = new boolean[50][25];

        //creates the "Blinker"
        smallOscillatorsTemplate[3][3] = true;
        smallOscillatorsTemplate[3][4] = true;
        smallOscillatorsTemplate[3][5] = true;

        //creates the "Toad"
        smallOscillatorsTemplate[11][8] = true;
        smallOscillatorsTemplate[12][8] = true;
        smallOscillatorsTemplate[13][8] = true;
        smallOscillatorsTemplate[10][9] = true;
        smallOscillatorsTemplate[11][9] = true;
        smallOscillatorsTemplate[12][9] = true;

        //creates the "Beacon"
        smallOscillatorsTemplate[6][15] = true;
        smallOscillatorsTemplate[7][15] = true;
        smallOscillatorsTemplate[6][16] = true;
        smallOscillatorsTemplate[9][17] = true;
        smallOscillatorsTemplate[8][18] = true;
        smallOscillatorsTemplate[9][18] = true;

        //creates the "Pulsar"
        smallOscillatorsTemplate[30][9] = true;
        smallOscillatorsTemplate[30][10] = true;
        smallOscillatorsTemplate[30][11] = true;
        smallOscillatorsTemplate[30][15] = true;
        smallOscillatorsTemplate[30][16] = true;
        smallOscillatorsTemplate[30][17] = true;
        smallOscillatorsTemplate[32][7] = true;
        smallOscillatorsTemplate[32][12] = true;
        smallOscillatorsTemplate[32][14] = true;
        smallOscillatorsTemplate[32][19] = true;
        smallOscillatorsTemplate[33][7] = true;
        smallOscillatorsTemplate[33][12] = true;
        smallOscillatorsTemplate[33][14] = true;
        smallOscillatorsTemplate[33][19] = true;
        smallOscillatorsTemplate[34][7] = true;
        smallOscillatorsTemplate[34][12] = true;
        smallOscillatorsTemplate[34][14] = true;
        smallOscillatorsTemplate[34][19] = true;
        smallOscillatorsTemplate[35][9] = true;
        smallOscillatorsTemplate[35][10] = true;
        smallOscillatorsTemplate[35][11] = true;
        smallOscillatorsTemplate[35][15] = true;
        smallOscillatorsTemplate[35][16] = true;
        smallOscillatorsTemplate[35][17] = true;
        smallOscillatorsTemplate[37][9] = true;
        smallOscillatorsTemplate[37][10] = true;
        smallOscillatorsTemplate[37][11] = true;
        smallOscillatorsTemplate[37][15] = true;
        smallOscillatorsTemplate[37][16] = true;
        smallOscillatorsTemplate[37][17] = true;
        smallOscillatorsTemplate[42][9] = true;
        smallOscillatorsTemplate[42][10] = true;
        smallOscillatorsTemplate[42][11] = true;
        smallOscillatorsTemplate[42][15] = true;
        smallOscillatorsTemplate[42][16] = true;
        smallOscillatorsTemplate[42][17] = true;
        smallOscillatorsTemplate[38][7] = true;
        smallOscillatorsTemplate[38][12] = true;
        smallOscillatorsTemplate[38][14] = true;
        smallOscillatorsTemplate[38][19] = true;
        smallOscillatorsTemplate[39][7] = true;
        smallOscillatorsTemplate[39][12] = true;
        smallOscillatorsTemplate[39][14] = true;
        smallOscillatorsTemplate[39][19] = true;
        smallOscillatorsTemplate[40][7] = true;
        smallOscillatorsTemplate[40][12] = true;
        smallOscillatorsTemplate[40][14] = true;
        smallOscillatorsTemplate[40][19] = true;

        return smallOscillatorsTemplate;
    }

    public static boolean[][] plantLargePeriodOscillators() {

        boolean[][] largeOscillatorsTemplate = new boolean[50][25];

        //creates the "Pentadecathlon"
        largeOscillatorsTemplate[12][7] = true;
        largeOscillatorsTemplate[17][7] = true;
        largeOscillatorsTemplate[12][9] = true;
        largeOscillatorsTemplate[17][9] = true;
        largeOscillatorsTemplate[10][8] = true;
        largeOscillatorsTemplate[11][8] = true;
        largeOscillatorsTemplate[13][8] = true;
        largeOscillatorsTemplate[14][8] = true;
        largeOscillatorsTemplate[15][8] = true;
        largeOscillatorsTemplate[16][8] = true;
        largeOscillatorsTemplate[18][8] = true;
        largeOscillatorsTemplate[19][8] = true;

        //creates the "Octagon2"
        largeOscillatorsTemplate[30][4] = true;
        largeOscillatorsTemplate[30][5] = true;
        largeOscillatorsTemplate[31][3] = true;
        largeOscillatorsTemplate[31][6] = true;
        largeOscillatorsTemplate[32][2] = true;
        largeOscillatorsTemplate[32][7] = true;
        largeOscillatorsTemplate[33][1] = true;
        largeOscillatorsTemplate[33][8] = true;
        largeOscillatorsTemplate[34][1] = true;
        largeOscillatorsTemplate[34][8] = true;
        largeOscillatorsTemplate[35][2] = true;
        largeOscillatorsTemplate[35][7] = true;
        largeOscillatorsTemplate[36][3] = true;
        largeOscillatorsTemplate[36][6] = true;
        largeOscillatorsTemplate[37][4] = true;
        largeOscillatorsTemplate[37][5] = true;

        //creates the "FigureEight"
        largeOscillatorsTemplate[28][14] = true;
        largeOscillatorsTemplate[28][15] = true;
        largeOscillatorsTemplate[29][14] = true;
        largeOscillatorsTemplate[29][15] = true;
        largeOscillatorsTemplate[29][17] = true;
        largeOscillatorsTemplate[30][18] = true;
        largeOscillatorsTemplate[31][15] = true;
        largeOscillatorsTemplate[32][16] = true;
        largeOscillatorsTemplate[32][18] = true;
        largeOscillatorsTemplate[32][19] = true;
        largeOscillatorsTemplate[33][18] = true;
        largeOscillatorsTemplate[33][19] = true;


        return largeOscillatorsTemplate;

    }

    public static boolean[][] plantGlider(){

        boolean[][] gliderTemplate = new boolean[100][50];

        //creates the "Glider"
        gliderTemplate[1][3] = true;
        gliderTemplate[2][1] = true;
        gliderTemplate[2][3] = true;
        gliderTemplate[3][2] = true;
        gliderTemplate[3][3] = true;

        return  gliderTemplate;

    }

    public static boolean[][] plantLightWeightSpaceship(){

        boolean[][] plantLightWeightSpaceship = new boolean[100][50];

        //creates the "LWSS"

        plantLightWeightSpaceship[85][24] = true;
        plantLightWeightSpaceship[85][25] = true;
        plantLightWeightSpaceship[85][26] = true;
        plantLightWeightSpaceship[86][23] = true;
        plantLightWeightSpaceship[86][26] = true;
        plantLightWeightSpaceship[87][26] = true;
        plantLightWeightSpaceship[88][26] = true;
        plantLightWeightSpaceship[89][23] = true;
        plantLightWeightSpaceship[89][25] = true;

        return  plantLightWeightSpaceship;

    }

    public static boolean[][] plantRPentomino(){

        boolean[][] rPentominoTemplate = new boolean[200][100];

        //creates the "R-Pentomino"
        rPentominoTemplate[100][51] = true;
        rPentominoTemplate[101][50] = true;
        rPentominoTemplate[101][51] = true;
        rPentominoTemplate[101][52] = true;
        rPentominoTemplate[102][50] = true;

        return  rPentominoTemplate;
    }

    public static boolean[][] plantGosperGliderGun(){

        boolean[][] gosperGliderGunTemplate = new boolean[200][100];

        //creates the "Gosper glider gun"
        gosperGliderGunTemplate[51][5] = true;
        gosperGliderGunTemplate[51][6] = true;
        gosperGliderGunTemplate[52][5] = true;
        gosperGliderGunTemplate[52][6] = true;
        gosperGliderGunTemplate[61][5] = true;
        gosperGliderGunTemplate[61][6] = true;
        gosperGliderGunTemplate[61][7] = true;
        gosperGliderGunTemplate[62][4] = true;
        gosperGliderGunTemplate[62][8] = true;
        gosperGliderGunTemplate[63][3] = true;
        gosperGliderGunTemplate[63][9] = true;
        gosperGliderGunTemplate[64][3] = true;
        gosperGliderGunTemplate[64][9] = true;
        gosperGliderGunTemplate[65][6] = true;
        gosperGliderGunTemplate[66][4] = true;
        gosperGliderGunTemplate[66][8] = true;
        gosperGliderGunTemplate[67][5] = true;
        gosperGliderGunTemplate[67][6] = true;
        gosperGliderGunTemplate[67][7] = true;
        gosperGliderGunTemplate[68][6] = true;
        gosperGliderGunTemplate[71][3] = true;
        gosperGliderGunTemplate[71][4] = true;
        gosperGliderGunTemplate[71][5] = true;
        gosperGliderGunTemplate[72][3] = true;
        gosperGliderGunTemplate[72][4] = true;
        gosperGliderGunTemplate[72][5] = true;
        gosperGliderGunTemplate[73][2] = true;
        gosperGliderGunTemplate[73][6] = true;
        gosperGliderGunTemplate[75][1] = true;
        gosperGliderGunTemplate[75][2] = true;
        gosperGliderGunTemplate[75][6] = true;
        gosperGliderGunTemplate[75][7] = true;
        gosperGliderGunTemplate[85][3] = true;
        gosperGliderGunTemplate[85][4] = true;
        gosperGliderGunTemplate[86][3] = true;
        gosperGliderGunTemplate[86][4] = true;

        return gosperGliderGunTemplate;
    }
}
