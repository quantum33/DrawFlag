package com.helloWorld.drawFlag;

/**
 * Created by Jamyz on 14/01/2017.
 * draw flag using an array - another way to to this exercise
 */
public class ArrayDrawer implements IDrawer {
    @Override
    public void draw()  {
        char[][] tab = new char[Constants.MAX_LINES][Constants.MAX_COL];

        // draw line with stars
        fillTabWithStarsLines(tab);

        // draw the full line with "=" char
        fillTabWithCommonLines(tab);

        // draw the entire array:
        drawTab(tab);
    }

    private void drawTab(char[][] tab) {
        for (int i = 0; i < Constants.MAX_LINES; i++) {
            for (int j = 0; j < Constants.MAX_COL; j++) {
                System.out.print(tab[i][j]);
                if (j == Constants.MAX_COL - 1)
                    System.out.println("");
            }
        }
    }

    private void fillTabWithCommonLines(char[][] tab) {
        for (int i = Constants.LINE_WITH_STARS; i < Constants.MAX_LINES; i++)
            for (int j = 0; j < Constants.MAX_COL; j++)
                tab[i][j] = '=';
    }

    private void fillTabWithStarsLines(char[][] tab) {
        for (int i = 0; i < Constants.LINE_WITH_STARS; i++) {
            for (int j = 0; j < Constants.MAX_COL; j++) {
                if (j < Constants.COL_WITH_STARS) {
                    if (i % 2 == 0) {
                        // 6 stars line:
                        tab[i][j] = (j % 2 == 0) ? '*' : ' ';
                    } else {
                        // 5 stars:
                        tab[i][j] = (j % 2 == 0) ? ' ' : '*';
                    }
                }
                else if (j == Constants.COL_WITH_STARS)
                    tab[i][j] = ' ';
                else {
                    // Fill the last characters line with "=":
                    tab[i][j] = '=';
                }
            }
        }
    }
}
