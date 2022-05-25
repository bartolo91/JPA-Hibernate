package pl.kurs;

import pl.kurs.dao.CarDao;
import pl.kurs.dao.CarDaoImpl;
import pl.kurs.model.Car;

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


        Car car = new Car("BMW", "M3", "BLACK", 2022);
        CarDao carDao = new CarDaoImpl();

        carDao.save(car);

        System.out.println("Zapisano samochod!");

        Car loadedCar = carDao.getCar(1L);
        System.out.println(loadedCar);

        carDao.cleanUp();


        /* Wykorzstyujac poznane technologie stwórz serwis do zarządzania domem publicznym.
           Mamy tabele prostytuka która ma id, imie, nazwisko, preferencje, wiek oraz to czy dziwka ma hiv.

           Kolejna tabela bedzie burdel id, nazwa, pseudonim burdel mamy.

           Stwórz model dziwki i burdelu.
           Stwórz dao do zapisu i odczytu dziwek i burdelu.
           Zapisz kilka dziwek i burdelow do bazy danych
           Odczytaj dziwki, znajdz dziwki które maja hiv ale sa niepelnoletnie
        */

    }
}
