// Caneva Ex7 TE PROJ language C#
// Visual Studio 2022
// 16.01.2024 Mélissa Perret 



using System;


public class User 
{
    public bool GenratorConfigure(int freq, float amp, string signalType)
    {
        if (freq < 0)
        {
           freq = false;
           Console.WriteLine("ERROR");
        }
    }
}


public class Generator
{
    private int frequency;
    private float amplitude;

    public double CalulateSignalPoints()
    {
        return frequency;
    }

}