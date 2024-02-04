import org.junit.jupiter.api.*;

public class MyJUnitTest {
    // класс, в котором может содержаться несколько тестов,
    // по признаку того, что у них несколько тестовых методов,
    // по одной области тестирования (например, логинка)

    //чтобы не копипастить каждый раз, можно написать как метод
//по предварительным тестам сверху как на примере ниже,
    //где, бифореич - анотация метки/
    // метод тоже должен начинаться воид и нести то название
    //которое мы ему придумаем/
    //он может что-то делать, что необходимо для всех тестов как
    //предварительные условия.
    int result;


    //также, можно вынести в общие условия,
    // чтобы запускался браузер например в 75%,  какой именно браузер
    // (позже в уроках подробно)
    @BeforeAll
    static void BeforeAll() {
        System.out.println("\n###     beforeAll()\n");
    }
    // и вынести в общие условия, чтобы запускался после теста
    // (например, почистить базу данных, закрыть браузер,
    // удалить заказ, прочее)
    @AfterAll
    static void AfterAll() {
        System.out.println("\n###     AfterAll()\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###     beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("###     afterEach()\n");
        result = 0;
    }

    @Test
    void firstTest() {
        // int result = getResult();
        // можно закопипастить каждый раз инт результ гет результ
        //в каждый тест. А можно вынести в отдельный метод.
        System.out.println("###     FirstTest()");
        Assertions.assertTrue(result > 2);
    }

    // @тест и его содержимое - это называется метод -
    // тест. в одном классе может быть несколько методов.

    @Test
    void secondTest() {
        System.out.println("###     secondTest()");
        Assertions.assertTrue(result > 2);
    }
    //остановилась на 50 минут. ошибки. завтра надо будет посмотреть

    @Test
    void thirdTest() {
        System.out.println("###    thirdTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }
}