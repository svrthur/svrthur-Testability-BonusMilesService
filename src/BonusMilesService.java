public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRuble = 20; // количество рублей для одной мили
        int miles = price / milesPerRuble; // расчёт количества миль
        return miles;
    }
}