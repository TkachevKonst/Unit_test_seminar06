
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


public class ControllerTest {

    int[] array;
    Controller controller;
    Controller controllerMock;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 1, 1, 1, 1};
        controller = new Controller();
        controllerMock = mock(Controller.class);
    }


    @Test
    void averageListTest() {
        assertThat(controller.averageList(array)).isEqualTo(1.0);
    }


    @Test
    void compareListTest() {
        controllerMock.compareList(1.0, 2.0);

        verify(controllerMock).compareList(1.0, 2.0);
    }
}
