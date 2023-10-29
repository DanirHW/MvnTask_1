import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.BonusService;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные :
        long amount = 1000;
        boolean registred = true;
        long expected = 30;

        //вызываем целевой метод :
        long actual = service.calculate(amount, registred);

        //производим проверку (сравниваем ожидаемый и фактический) :
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegistredOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные :
        long amount = 1_000_000;
        boolean registred = true;
        long expected = 500;

        //вызываем целевой метод :
        long actual = service.calculate(amount, registred);

        //производим проверку (сравниваем ожидаемый и фактический) :
        Assertions.assertEquals(expected, actual);
    }

// дополнительыне проверки

    @Test
    void shouldCalculateForUnRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные :
        long amount = 1000;
        boolean registred = false;
        long expected = 10;

        //вызываем целевой метод :
        long actual = service.calculate(amount, registred);

        //производим проверку (сравниваем ожидаемый и фактический) :
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegistredOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные :
        long amount = 1_000_000;
        boolean registred = false;
        long expected = 500;

        //вызываем целевой метод :
        long actual = service.calculate(amount, registred);

        //производим проверку (сравниваем ожидаемый и фактический) :
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegistredAndEqualsLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные :
        long amount = 50000;
        boolean registred = false;
        long expected = 500;

        //вызываем целевой метод :
        long actual = service.calculate(amount, registred);

        //производим проверку (сравниваем ожидаемый и фактический) :
        Assertions.assertEquals(expected, actual);
    }
}
