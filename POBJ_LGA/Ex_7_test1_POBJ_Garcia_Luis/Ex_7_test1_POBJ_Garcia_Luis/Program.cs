
namespace Ex_7_test1_POBJ_Garcia_Luis
{

    public partial class User
    {
        public bool GeneratorConfigure(int freq, float amp, String singalType)
        {
            // retour des erreurs
            if (singalType == "None")
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }

    public partial class Generator
    {
        private Int64 frequency;
        private double amplitude;

        public Decimal CalculateSignalPoints()
        {
            Decimal test = 0;

            return test;
        }

    }

}
