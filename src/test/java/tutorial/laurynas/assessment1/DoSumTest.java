package tutorial.laurynas.assessment1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tutorial.laurynas.assessment1.sum.DoSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DoSumTest {

    @Autowired
    private DoSum doSum;

    @Test
    void doSum_withValues_returnResult() {
        assertEquals(9, doSum.sum(4, 5));
    }
}
