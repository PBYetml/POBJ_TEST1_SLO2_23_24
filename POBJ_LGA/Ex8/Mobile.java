
public class Mobile
{
    protected byte posX = 0;
    protected byte posY = 0;

    protected float vitesseX;
    protected float vitesseY;

    public final void Mobile( char Param1, byte autreParam)
    {
        char par1 = Param1;
        byte par2 = autreParam;
    }

    private final byte ChoixVitesse()
    {
        byte rien = 0;
        
        return rien;
    }

    public final boolean Run()
    {
        if (vitesseX > 1){
            return true;
        }
        else
        {
        return false;
        }

    }
    
}