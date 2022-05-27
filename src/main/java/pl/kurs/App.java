package pl.kurs;

import pl.kurs.burdel.task.dao.BrothelDao;
import pl.kurs.burdel.task.dao.BrothelDaoImpl;
import pl.kurs.burdel.task.dao.ProstituteDao;
import pl.kurs.burdel.task.dao.ProstituteDaoImpl;
import pl.kurs.burdel.task.model.Brothel;
import pl.kurs.burdel.task.model.Prostitute;
import pl.kurs.burdel.task.service.ProstituteService;
import pl.kurs.dao.CarDao;
import pl.kurs.dao.CarDaoImpl;
import pl.kurs.model.Car;

import java.util.List;

public class App {
    public static void main(String[] args) {

        /*

            ORM - object relation maping

            java app -> object -> orm -> baza danych

            JPA layer - zbior interfejsow

            Hibernate - implementacja interfejsow

            app code -> jpa layer -> jdbc -> baza danych

            POJO - plain old java object

            entity manager -

            entity manager factory -

         */

//
//        Car car = new Car("BMW", "M3", "BLACK", 2022);
//        CarDao carDao = new CarDaoImpl();
//
//        carDao.save(car);
//
//        System.out.println("Zapisano samochod!");
//
//        Car loadedCar = carDao.getCar(1L);
//        System.out.println(loadedCar);
//
//        carDao.cleanUp();


        /* Wykorzstyujac poznane technologie stwórz serwis do zarządzania domem publicznym.
           Mamy tabele prostytuka która ma id, imie, nazwisko, preferencje, wiek oraz to czy dziwka ma hiv.

           Kolejna tabela bedzie burdel id, nazwa, pseudonim burdel mamy.

           Stwórz model dziwki i burdelu.
           Stwórz dao do zapisu i odczytu dziwek i burdelu.
           Zapisz kilka dziwek i burdelow do bazy danych
           Odczytaj dziwki, znajdz dziwki które maja hiv ale sa niepelnoletnie
        */

        Brothel brothel = new Brothel("JavowyKurwidolek", "Dagmara Kazmierska");
        BrothelDao brothelDao = new BrothelDaoImpl();
        brothelDao.save(brothel);
        brothelDao.cleanUp();

        Prostitute prostitute1 = new Prostitute("Elwira","Kowalska","BDSM",19,false);
        Prostitute prostitute2 = new Prostitute("Edyta","Nowak","Anal",29,true);
        Prostitute prostitute3 = new Prostitute("Aldona","Latwa","BJ",35,false);
        Prostitute prostitute4 = new Prostitute("RoxxAnna","Tajemnicza","Bogaci",26,true);
        Prostitute prostitute5 = new Prostitute("Klaudia","Blacharska","Lamborghini",17,true);
        Prostitute prostitute6 = new Prostitute("Test","Test","Lamborghini",17,true);

        ProstituteDao prostituteDao = new ProstituteDaoImpl();
        prostituteDao.save(prostitute1);
        prostituteDao.save(prostitute2);
        prostituteDao.save(prostitute3);
        prostituteDao.save(prostitute4);
        prostituteDao.save(prostitute5);
        prostituteDao.save(prostitute6);

        List<Prostitute> allProstitutes = prostituteDao.getAllProstitutes();

        prostituteDao.cleanUp();

        System.out.println(ProstituteService.getProstituteFilteredByHivAndAge(allProstitutes, 18, true));

    }
}
