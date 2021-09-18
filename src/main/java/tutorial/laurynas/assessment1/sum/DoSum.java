package tutorial.laurynas.assessment1.sum;

import org.springframework.stereotype.Service;

@Service
public class DoSum {
    public int sum(int a, int b) {
        return a + b;
    }
}
