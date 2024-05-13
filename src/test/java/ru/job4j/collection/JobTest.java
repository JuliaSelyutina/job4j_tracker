package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new JobSortByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorBySameName() {
        Comparator<Job> cmpName = new JobSortByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> cmpName = new JobSortDescByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorBySamePriority() {
        Comparator<Job> cmpPriority = new JobSortByPriority();
        int rsl = cmpPriority.compare(
                new Job("Add task", 1),
                new Job("Delete task", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> cmpPriority = new JobSortDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Add task", 0),
                new Job("Delete task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPriority = new JobSortByPriority();
        int rsl = cmpPriority.compare(
                new Job("Add task", 0),
                new Job("Delete task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobSortByName().thenComparing(new JobSortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorBySameNameAndNotSamePriority() {
        Comparator<Job> cmpNamePriority = new JobSortByName().thenComparing(new JobSortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Add task", 0),
                new Job("Add task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorBySameNameAndSamePriority() {
        Comparator<Job> cmpNamePriority = new JobSortByName().thenComparing(new JobSortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Add task", 0),
                new Job("Add task", 0)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorByNameDescAndPriorityDesc() {
        Comparator<Job> cmpNameDescPriorityDesc = new JobSortDescByName().thenComparing(new JobSortDescByPriority());
        int rsl = cmpNameDescPriorityDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorBySameNameAndPriorityDesc() {
        Comparator<Job> cmpNamePriorityDesc = new JobSortByName().thenComparing(new JobSortDescByPriority());
        int rsl = cmpNamePriorityDesc.compare(
                new Job("New task", 0),
                new Job("New task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}
