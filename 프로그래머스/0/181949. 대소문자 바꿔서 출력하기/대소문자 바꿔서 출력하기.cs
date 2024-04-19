using System;

public class Example
{
    public static void Main()
    {
        String s;

        Console.Clear();
        s = Console.ReadLine();
        char[] c = new char[s.Length];
        for(int i=0; i<s.Length; i++){
            c[i] = s[i]>90 ? (char)(s[i]-32):(char)(s[i]+32);
        }
        Console.WriteLine(new string(c));
        
    }
}