package com.medibooking.bookingserviceserver.repositories;

//import com.medibooking.bookingserviceserver.BookingServiceServerApplicationTests;
import com.medibooking.bookingserviceserver.entities.Doctor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = BookingServiceServerApplicationTests.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
//public class DoctorRepositoryTest {
//
//    @Autowired
//    private DoctorRepository doctorRepository;
//
//    @Test
//    public void shouldAddDoctorIntoDBSuccessfullyGivenProperDoctorObject() {
//        Doctor doctor = new Doctor();
//        doctor.setFirstname("abc");
//        doctor.setPassword("123");
//        Doctor returnedDoctor = doctorRepository.save(doctor);
//        Assertions.assertEquals("abc", returnedDoctor.getFirstname());
//        Assertions.assertNotNull(returnedDoctor.getPassword());
//    }
//}
