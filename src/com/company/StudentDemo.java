package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
	//

        Student firstStudent = new Student ("Andrea" , 237765);
        firstStudent.showStudent();


        List<String> instruments = new ArrayList<>();
        instruments.add ("guitar");
        instruments.add ("violin");
        BandMember secondStudent = new BandMember ("Collin" , 237766 , instruments ,
                15);
        secondStudent.showStudent();
    }
}
