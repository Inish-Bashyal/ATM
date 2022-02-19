package test.teacherDashboard;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherHomeIDTest {


    @Test
    public void ID() {
        int ID = 1012;
        int expected = ID;
        int actual = 1012;
        assertEquals( expected,actual);
    }

    @Test
    public void incorrectID() {
        int ID = 1012;
        int expected = ID;
        int actual = 0;
        assertEquals( expected,actual);
    }

}