//package Java21
public class LoanTerm{
    public static void main(String[] args) {
        int LoanTerm = 0;
        String LoanOut;
        if (LoanTerm == 0)
        {
            LoanOut = "Listings";
        }
        else
        {
                if (LoanTerm <=12)
                {
                    LoanOut = "<1yr";
                }
                else
                {
                    if(LoanTerm <=24)
                    {
                       LoanOut = ">1yr <2yr";
                    }
                    else
                    {
                        if(LoanTerm <=36)
                        {
                            LoanOut = ">2yr <3yr";
                        }
                            else
                            {
                                if(LoanTerm <=48)
                                {
                                    LoanOut = ">3yr <4yr";
                                }
                                    else
                                    {
                                        if(LoanTerm <=60)
                                        {
                                            LoanOut = ">4yr <5yr";
                                        }
                                            else
                                            {
                                                LoanOut =  ">5yr";
                                            }
                                    }
                            }
                    }
                }
        }
    }
}
/*
Term - Bandings
<1yr
>1yr <2yr
>2yr <3yr
>3yr <4yr
>5yr
*/