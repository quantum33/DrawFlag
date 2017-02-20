package com.helloWorld.drawFlag;

/**
 * Created by Jamyz on 14/01/2017.
 * draw flag in a basic way
 */
public class UglyDrawer implements IDrawer {
    public String Prop1;
    @Override
    public void draw()  {
        // Remember, we used to develop this way when we were young... great time huh? :)
        int starsCount = 0;
        for (int i = 0; i < Constants.LINE_WITH_STARS; i++) {
            if (i % 2 == 0) {
                // 6 stars:
                starsCount = 6;
                for (int j = 0; j < Constants.MAX_COL; j++) {
                    if (j < Constants.COL_WITH_STARS) {
                        if (starsCount > 0 && j % 2 == 0) {
                            starsCount--;
                            System.out.print('*');
                        } else
                            System.out.print(' ');
                    }
                    else if (j == Constants.MAX_COL - 1)
                        System.out.println('=');
                    else
                        System.out.print('=');
                }
            } else {
                // 5 stars:
                starsCount = 5;
                for (int j = 0; j < Constants.MAX_COL; j++) {
                    if (j < Constants.COL_WITH_STARS) {
                        if (j % 2 == 0 || starsCount == 0)
                            System.out.print(' ');
                        else {
                            System.out.print('*');
                            starsCount--;
                        }
                    }
                    else if (j == Constants.MAX_COL - 1)
                        System.out.println('=');
                    else
                        System.out.print('=');
                }
            }
        }

        for (int i = Constants.LINE_WITH_STARS; i < Constants.MAX_LINES; i++)
            for (int j = 0; j < Constants.MAX_COL; j++) {
                if (j == Constants.MAX_COL - 1)
                    System.out.println('=');
                else
                    System.out.print('=');
            }
    }
}
