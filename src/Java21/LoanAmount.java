//package java21;

public class LoanAmount{
    public static void main(String[] args) {
        int LoanAmt = 15001;
        String LoanRes;

if (LoanAmt == 0)
{
    LoanRes = "Listings";
}
else
{
    if (LoanAmt <= 1000)
{
LoanRes = "£0 - £1,000";
}
else
{
    if (LoanAmt <=2000)
    {
        LoanRes = "£1,001 - £2,000";
    }
    else
    {
       if(LoanAmt <= 3000)
        {
            LoanRes = "£2,001 - £3,000";
        }
        else
        {
            if(LoanAmt <= 4000)
            {
            LoanRes = "£3,001 - £4,000";
            }
            else
                {
                    if(LoanAmt <= 5000)
                    {
                        LoanRes = "£4,001 - £5,000";
                    }
                    else
                    {
                        if(LoanAmt <=7500)
                        {
                            LoanRes = "£5,001 - £7,500";
                        }
                        else
                        {
                            if(LoanAmt <= 15000)
                            {
                                LoanRes = "£7,501 - £15,000";
                            }
                            else
                            {
                                LoanRes = "£15,001 +";
                            }
                    }
                    }
                }
        }
    }

    }
}
    System.out.println(LoanRes);
    }
}
   



/*
Amount - Bandings
£0 - £1,000
£1,001 - £2,000
£2,001 - £3,000
£3,001 - £4,000
£4,001 - £5,000
£5,001 - £7,500
£7,501 - £15,000
£15,001 +

Term - Bandings
<1yr
>1yr <2yr
>2yr <3yr
>3yr <4yr
>5yr
*/