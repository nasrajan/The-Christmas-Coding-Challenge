package DSA.Bronze;


public class CandyCaneFeast {
    int[] cows;
    int[] candy;
    CandyCaneFeast(int[] cows, int[] candy) {
        this.cows = cows;
        this.candy = candy;
    }
    int[] eatAndGrow() {

        for(int j=0; j < candy.length; j++) {
            int candyHeight = candy[j];
            int heightFromGround = 0;
            int i = 0;
            while(i < cows.length && candyHeight > 0) {
                if(cows[i] >= heightFromGround) {
                    int ate;
                    //cow will eat height - heightfromGround
                    if(heightFromGround == 0 && candyHeight < cows[i])
                        ate = candyHeight;
                    else {
                        ate = cows[i] - heightFromGround;
                    }
                    heightFromGround += ate;
                    candyHeight -= ate;
                    cows[i] += ate;
                }
                i++;

            }
        }

        return cows;
    }
}
