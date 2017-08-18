package com.jimmyhowe.consolecolors;

import org.junit.Test;

public class ConsoleTest
{
    public ConsoleTest()
    {
        Console.autoPrint();
    }

    @Test
    public void blacks()
    {
        Console.black("message");
        Console.blackBold("message");
        Console.blackUnderlined("message");
        Console.blackBackground("message");
        Console.blackBright("message");
        Console.blackBoldBright("message");
        Console.blackBackgroundBright("message");
    }

    @Test
    public void reds()
    {
        Console.red("message");
        Console.redBold("message");
        Console.redUnderlined("message");
        Console.redBackground("message");
        Console.redBright("message");
        Console.redBoldBright("message");
        Console.redBackgroundBright("message");
    }

    @Test
    public void greens()
    {
        Console.green("message");
        Console.greenBold("message");
        Console.greenUnderlined("message");
        Console.greenBackground("message");
        Console.greenBright("message");
        Console.greenBoldBright("message");
        Console.greenBackgroundBright("message");
    }

    @Test
    public void yellows()
    {
        Console.yellow("message");
        Console.yellowBold("message");
        Console.yellowUnderlined("message");
        Console.yellowBackground("message");
        Console.yellowBright("message");
        Console.yellowBoldBright("message");
        Console.yellowBackgroundBright("message");
    }

    @Test
    public void blues()
    {
        Console.blue("message");
        Console.blueBold("message");
        Console.blueUnderlined("message");
        Console.blueBackground("message");
        Console.blueBright("message");
        Console.blueBoldBright("message");
        Console.blueBackgroundBright("message");
    }

    @Test
    public void purples()
    {
        Console.purple("message");
        Console.purpleBold("message");
        Console.purpleUnderlined("message");
        Console.purpleBackground("message");
        Console.purpleBright("message");
        Console.purpleBoldBright("message");
        Console.purpleBackgroundBright("message");
    }

    @Test
    public void cyans()
    {
        Console.cyan("message");
        Console.cyanBold("message");
        Console.cyanUnderlined("message");
        Console.cyanBackground("message");
        Console.cyanBright("message");
        Console.cyanBoldBright("message");
        Console.cyanBackgroundBright("message");
    }

    @Test
    public void whites()
    {
        Console.white("message");
        Console.whiteBold("message");
        Console.whiteUnderlined("message");
        Console.whiteBackground("message");
        Console.whiteBright("message");
        Console.whiteBoldBright("message");
        Console.whiteBackgroundBright("message");
    }
}