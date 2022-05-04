package src;

public class CarManufacturerRepository implements Container {
    public String CarManufacturerNames[] = {"Skoda" , "Volkswagen" ,"Audi" , "Reanult"};

    @Override
    public Iterator getIterator() {
        return new CarManufacturerIterator();
    }

    private class CarManufacturerIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < CarManufacturerNames.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return CarManufacturerNames[index++];
            }
            return null;
        }
    }
}