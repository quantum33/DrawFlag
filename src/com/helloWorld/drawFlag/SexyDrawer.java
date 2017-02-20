package com.helloWorld.drawFlag;

/**
 * Created by Jamyz on 14/01/2017.
 * This class draws the flag with some kind of sexyness.
 * In fact, we arrange the implementation code in order of doing sth more SOLID
 */
public class SexyDrawer implements IDrawer {
    @Override
    public void draw() {
        for (int i = 0; i < Constants.LINE_WITH_STARS; i++) {
            drawLineWithStars((i % 2 == 0) ? 6 : 5);
        }
        for (int i = Constants.LINE_WITH_STARS; i < Constants.MAX_LINES; i++)
            fillLineWithChar(0, '=');
    }

    /**
     * Fill the line with the specified character, starting from the specified index
     * @param startIndex the start index
     * @param c the character to print
     */
    private static void fillLineWithChar(int startIndex, @SuppressWarnings("SameParameterValue") char c) {
        for (int i = startIndex; i < Constants.MAX_COL; i++) {
            System.out.print(c);
        }
        System.out.print('\n');
    }

    /**
     * draw a line containing stars
     * @param starsCount the number of stars for the line
     * @throws IllegalArgumentException
     */
    private static void drawLineWithStars(int starsCount) throws IllegalArgumentException {
        if (starsCount != 5 && starsCount != 6)
            throw new IllegalArgumentException("starsCount must be 5 or 6");

        Boolean firstIsStar = (starsCount == 6);

        for (int j = 0; j < Constants.COL_WITH_STARS; j++) {
            if ((j % 2 == 0 && firstIsStar && starsCount > 0) ||
                (j % 2 != 0 && !firstIsStar && starsCount > 0)) {
                System.out.print('*');
                starsCount--;
            }
            else
                System.out.print(' ');
        }
        int startIndex = Constants.COL_WITH_STARS;
        fillLineWithChar(startIndex, '=');
    }
}
