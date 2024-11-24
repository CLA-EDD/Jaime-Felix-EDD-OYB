package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
 static SortingAndSearching<Integer> sas;
 static Integer[] array01;
 static Integer[] array02;
 static Integer[] array03;

    @BeforeAll public static void setUp() {
        sas = new SortingAndSearching<Integer>();
        array01 = new Integer[] {9, 6, 8, 12, 3, 1, 7};
        array02 = new Integer[] {9, 6, 8, 12, 3, 1, 7};
        array03 = new Integer[] {1,3,6,7,8,9,12};
    }

    @Test public void testLinearSort() {
        sas.bubbleSort( array01 );
        assertTrue(java.util.Arrays.toString(array01).equals("[1, 3, 6, 7, 8, 9, 12]"));
    }

    @Test public void testLogarithmicSort() {
        sas.mergeSort(array02, 0, array02.length - 1);
        assertTrue(java.util.Arrays.toString(array02).equals("[12, 9, 8, 7, 6, 3, 1]"));
    }

    @Test public void testLinearSearch() {
        assertTrue( sas.linearSearch(array03, 0, array03.length - 1, 7) == 3);
    }

    @Test public void testBinarySearch() {
        assertTrue( sas.binarySearch(array03, 0, array03.length - 1, 10) == -1);
    }

}