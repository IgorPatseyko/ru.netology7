package tests;

import org.junit.jupiter.api.Test;
import ru.netology.vacation.VacationPlanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPlannerTest {

    @Test
    public void testVacationPlannerExample1() {
        VacationPlanner planner = new VacationPlanner();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expectedVacationMonths = 4;

        int actualVacationMonths = planner.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    public void testVacationPlannerExample2() {
        VacationPlanner planner = new VacationPlanner();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expectedVacationMonths = 2;

        int actualVacationMonths = planner.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }
}
