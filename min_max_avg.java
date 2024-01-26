package ifellow;


class MinMaxAvg
{
    public static void main(String[] args)
    {
        double[] myArray = new double[10];
        for (int i = 0; i < myArray.length; i++)
        {
            var randomNumber = Math.random();
            myArray[i] = randomNumber;
            //System.out.println(myArray[i]);
        }
        double max = myArray[0];
        double min = myArray[0];
        double avg = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i])
            max = myArray[i];
            if (min > myArray[i])
            min = myArray[i];
            avg += myArray[i]/myArray.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
