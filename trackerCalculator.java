public class trackerCalculator {


public static double TrackerCalculator(int rank, int familiarity ){
double divisor = rank*familiarity;
return (Math.ceil(200/divisor))/2;
}

}