package lesson20200831TaskListPersonAndEmail;

/**
 * JavaAdvanced
 * 31.08.20 20: 14
 */
//public class PersonAddress {
//    private String address;
//    private AddressType type;
//
//    public PersonAddress(String address, String type) {// второй конструктор: передаем String и String
//        this.address = address;
//        try {
//            this.type = AddressType.valueOf(type); //основное преобразование здесь
//        } catch (Exception ex){ // если пошло что-то не так ...  это место, где мы пишем, что делать, если
//            // что-то не так пошло
//            this.type = AddressType.EMAIL;
//            System.out.println("ALARM! The type is not correct!");
//            throw ex; // чтобы объект не создался
//        }
//    }
//
//    public PersonAddress(String address, AddressType type) {
//        this.address = address;
//        this.type = type;
//    }
//
////    public void send(){
////        type.send();
////    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public AddressType getType() {
//        return type;
//    }
//
//    @Override
//    public String toString() {
//        return "Address:" + address + '(' + type + ')';
//    }
//}