package lesson20200909BankAndArray;

public class Company extends Owner{
    private String name;
    private TypeOfOwnership typeOfOwnership;

    public TypeOfOwnership getTypeOfOwnership() {
        return typeOfOwnership;
    }

    public Company(String name, TypeOfOwnership typeOfOwnership) {
        this.name = name;
        this.typeOfOwnership = typeOfOwnership;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return name + ": (" + typeOfOwnership +")";
    }


}
