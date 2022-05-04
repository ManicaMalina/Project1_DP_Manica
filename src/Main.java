package src;

public class Main {

    public static void main(String[] args) {
        CarManufacturerRepository CarManufacturerRepository = new CarManufacturerRepository();

        for(Iterator iterator = CarManufacturerRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Nume: " + name);
        }
    }
}