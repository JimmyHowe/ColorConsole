/*
 * MIT License
 *
 * Copyright (c) 2017 Jimmy Howe
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.jimmyhowe.colorconsole;

/**
 * Console
 */
public class Console
{
    /**
     * Prints the message to the console
     */
    private static boolean autoPrint = false;

    /**
     * Helper method to print with color
     *
     * @param color   Color
     * @param message Message to be displayed
     *
     * @return Message surrounded by color characters
     */
    private static String withColor(String color, String message)
    {
        String s = color + message + Colors.RESET;

        if ( autoPrint ) System.out.println(s);

        return s;
    }

    /**
     * Auto prints to the console
     */
    public static void autoPrint()
    {
        autoPrint = true;
    }

    public static String black(String message)
    {
        return withColor(Colors.BLACK, message);
    }

    public static String blackBold(String message)
    {
        return withColor(Colors.BLACK_BOLD, message);
    }

    public static String blackUnderlined(String message)
    {
        return withColor(Colors.BLACK_UNDERLINED, message);
    }

    public static String blackBackground(String message)
    {
        return withColor(Colors.BLACK_BACKGROUND, message);
    }

    public static String blackBright(String message)
    {
        return withColor(Colors.BLACK_BRIGHT, message);
    }

    public static String blackBoldBright(String message)
    {
        return withColor(Colors.BLACK_BOLD_BRIGHT, message);
    }

    public static String blackBackgroundBright(String message)
    {
        return withColor(Colors.BLACK_BACKGROUND_BRIGHT, message);
    }

    public static String red(String message)
    {
        return withColor(Colors.RED, message);
    }

    public static String redBold(String message)
    {
        return withColor(Colors.RED_BOLD, message);
    }

    public static String redUnderlined(String message)
    {
        return withColor(Colors.RED_UNDERLINED, message);
    }

    public static String redBackground(String message)
    {
        return withColor(Colors.RED_BACKGROUND, message);
    }

    public static String redBright(String message)
    {
        return withColor(Colors.RED_BRIGHT, message);
    }

    public static String redBoldBright(String message)
    {
        return withColor(Colors.RED_BOLD_BRIGHT, message);
    }

    public static String redBackgroundBright(String message)
    {
        return withColor(Colors.RED_BACKGROUND_BRIGHT, message);
    }

    public static String green(String message)
    {
        return withColor(Colors.GREEN, message);
    }

    public static String greenBold(String message)
    {
        return withColor(Colors.GREEN_BOLD, message);
    }

    public static String greenUnderlined(String message)
    {
        return withColor(Colors.GREEN_UNDERLINED, message);
    }

    public static String greenBackground(String message)
    {
        return withColor(Colors.GREEN_BACKGROUND, message);
    }

    public static String greenBright(String message)
    {
        return withColor(Colors.GREEN_BRIGHT, message);
    }

    public static String greenBoldBright(String message)
    {
        return withColor(Colors.GREEN_BOLD_BRIGHT, message);
    }

    public static String greenBackgroundBright(String message)
    {
        return withColor(Colors.GREEN_BACKGROUND_BRIGHT, message);
    }

    public static String yellow(String message)
    {
        return withColor(Colors.YELLOW, message);
    }

    public static String yellowBold(String message)
    {
        return withColor(Colors.YELLOW_BOLD, message);
    }

    public static String yellowUnderlined(String message)
    {
        return withColor(Colors.YELLOW_UNDERLINED, message);
    }

    public static String yellowBackground(String message)
    {
        return withColor(Colors.YELLOW_BACKGROUND, message);
    }

    public static String yellowBright(String message)
    {
        return withColor(Colors.YELLOW_BRIGHT, message);
    }

    public static String yellowBoldBright(String message)
    {
        return withColor(Colors.YELLOW_BOLD_BRIGHT, message);
    }

    public static String yellowBackgroundBright(String message)
    {
        return withColor(Colors.YELLOW_BACKGROUND_BRIGHT, message);
    }

    public static String blue(String message)
    {
        return withColor(Colors.BLUE, message);
    }

    public static String blueBold(String message)
    {
        return withColor(Colors.BLUE_BOLD, message);
    }

    public static String blueUnderlined(String message)
    {
        return withColor(Colors.BLUE_UNDERLINED, message);
    }

    public static String blueBackground(String message)
    {
        return withColor(Colors.BLUE_BACKGROUND, message);
    }

    public static String blueBright(String message)
    {
        return withColor(Colors.BLUE_BRIGHT, message);
    }

    public static String blueBoldBright(String message)
    {
        return withColor(Colors.BLUE_BOLD_BRIGHT, message);
    }

    public static String blueBackgroundBright(String message)
    {
        return withColor(Colors.BLUE_BACKGROUND_BRIGHT, message);
    }

    public static String purple(String message)
    {
        return withColor(Colors.PURPLE, message);
    }

    public static String purpleBold(String message)
    {
        return withColor(Colors.PURPLE_BOLD, message);
    }

    public static String purpleUnderlined(String message)
    {
        return withColor(Colors.PURPLE_UNDERLINED, message);
    }

    public static String purpleBackground(String message)
    {
        return withColor(Colors.PURPLE_BACKGROUND, message);
    }

    public static String purpleBright(String message)
    {
        return withColor(Colors.PURPLE_BRIGHT, message);
    }

    public static String purpleBoldBright(String message)
    {
        return withColor(Colors.PURPLE_BOLD_BRIGHT, message);
    }

    public static String purpleBackgroundBright(String message)
    {
        return withColor(Colors.PURPLE_BACKGROUND_BRIGHT, message);
    }

    public static String cyan(String message)
    {
        return withColor(Colors.CYAN, message);
    }

    public static String cyanBold(String message)
    {
        return withColor(Colors.CYAN_BOLD, message);
    }

    public static String cyanUnderlined(String message)
    {
        return withColor(Colors.CYAN_UNDERLINED, message);
    }

    public static String cyanBackground(String message)
    {
        return withColor(Colors.CYAN_BACKGROUND, message);
    }

    public static String cyanBright(String message)
    {
        return withColor(Colors.CYAN_BRIGHT, message);
    }

    public static String cyanBoldBright(String message)
    {
        return withColor(Colors.CYAN_BOLD_BRIGHT, message);
    }

    public static String cyanBackgroundBright(String message)
    {
        return withColor(Colors.CYAN_BACKGROUND_BRIGHT, message);
    }

    public static String white(String message)
    {
        return withColor(Colors.WHITE, message);
    }

    public static String whiteBold(String message)
    {
        return withColor(Colors.WHITE_BOLD, message);
    }

    public static String whiteUnderlined(String message)
    {
        return withColor(Colors.WHITE_UNDERLINED, message);
    }

    public static String whiteBackground(String message)
    {
        return withColor(Colors.WHITE_BACKGROUND, message);
    }

    public static String whiteBright(String message)
    {
        return withColor(Colors.WHITE_BRIGHT, message);
    }

    public static String whiteBoldBright(String message)
    {
        return withColor(Colors.WHITE_BOLD_BRIGHT, message);
    }

    public static String whiteBackgroundBright(String message)
    {
        return withColor(Colors.WHITE_BACKGROUND_BRIGHT, message);
    }
}