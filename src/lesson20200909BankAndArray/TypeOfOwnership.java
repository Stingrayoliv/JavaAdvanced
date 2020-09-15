package lesson20200909BankAndArray;

public enum TypeOfOwnership {
    GMBH
            {
                @Override
                public String getTypeString(){
                    return "GmbH";
                }
            },
    AG
            {
                @Override
                public String getTypeString(){
                    return "AG";
                }
            },
    EV
            {
                public String getTypeString(){
                    return "e.V.";
                }
            };

    public abstract String getTypeString(); // сделали aбстрактный метод и в Enum переопределили

    @Override
    public String toString() {
        return getTypeString();
    }

    public static TypeOfOwnership gerTypeStringByString(String s){ // вариант как выводить enum
        if (s.equals("GmbH")){
            return TypeOfOwnership.GMBH;
        } else if (s.equals("AG")){
            return TypeOfOwnership.AG;
        } else if (s.equals("e.V.")){
            return TypeOfOwnership.EV;
        } else {
            return null;
        }

    }
}
