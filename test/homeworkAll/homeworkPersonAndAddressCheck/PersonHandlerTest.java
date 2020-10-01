package homeworkAll.homeworkPersonAndAddressCheck;

/**
 * JavaAdvanced
 * 06.09.20 01: 11
 */
//class PersonHandlerTest {
//    @Test
//    public void PersonHandler_ListStringAndListPerson_newListPerson_true() {
//        List<String> emailWithPerson = new ArrayList<>();
//        emailWithPerson.add("qwe@mail.com1 Jack1 Nicolson1");
//        //emailWithPerson.add("qwe@mail.com2 Jack2 Nicolson2");
//        //emailWithPerson.add("qwe@mail.com3 Jack3 Nicolson3");
//
//        List<PersonAddress> personAddresses1 = new ArrayList<>();
//        List<PersonAddress> personAddresses2 = new ArrayList<>();
//        List<PersonAddress> personAddresses3 = new ArrayList<>();
//        personAddresses1.add(new PersonAddress("qwe@mail.com1", AddressType.EMAIL));
//        personAddresses2.add(new PersonAddress("Berlin", AddressType.POST));
//        personAddresses2.add(new PersonAddress("EMAIL@gmail.com", AddressType.EMAIL));
//        personAddresses3.add(new PersonAddress("Berlin", AddressType.POST));
//        personAddresses3.add(new PersonAddress("qwe@mail.com3", AddressType.EMAIL));
//
//        Person p1 = new Person("Jack1", "Nicolson1", personAddresses1);// полностью совпал - убрать из списка
//        Person p2 = new Person("Jack2", "Nicolson2", personAddresses2);// добавить email
//        Person p3 = new Person("Jack3", "Nicolson3", personAddresses3);
//        List<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//        //people.add(p3);
//
//        List<Person> expected = new ArrayList<>();
//        expected.add(new Person("Jack1", "Nicolson1", Arrays.asList(new PersonAddress("qwe@mail.com1", AddressType.EMAIL))));
//        expected.add(new Person("Jack2", "Nicolson2", Arrays.asList(
//                new PersonAddress("Berlin", AddressType.POST),
//                new PersonAddress("EMAIL@gmail.com", AddressType.EMAIL))));
//
//     //первый emailWithPerson cовпал с Person из списка персон. Добавить всех персон в список (вариант 3)
//        assertEquals(expected, PersonHandler.getNewListPersons(people, emailWithPerson, PersonHandler.getNewEmailsList(emailWithPerson)));
//    }
//
//    @Test //вариант без совпадений
//    public void PersonHandler_ListStringNullAndListPerson_newListPerson_true() {
//        List<String> emailWithPerson = new ArrayList<>();
//        emailWithPerson.add("qwe@mail.com3 Jack3 Nicolson3");
//
//        List<PersonAddress> personAddresses1 = new ArrayList<>();
//        List<PersonAddress> personAddresses2 = new ArrayList<>();
//        personAddresses1.add(new PersonAddress("qwe@mail.com1", AddressType.EMAIL));
//        personAddresses2.add(new PersonAddress("Berlin", AddressType.POST));
//        personAddresses2.add(new PersonAddress("EMAIL@gmail.com", AddressType.EMAIL));;
//
//        Person p1 = new Person("Jack1", "Nicolson1", personAddresses1);// полностью совпал - убрать из списка
//        Person p2 = new Person("Jack2", "Nicolson2", personAddresses2);// добавить email
//        List<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//
//        List<Person> expected = new ArrayList<>();
//        expected.add(new Person("Jack3", "Nicolson3", Arrays.asList(new PersonAddress("qwe@mail.com3", AddressType.EMAIL))));
//        expected.add(new Person("Jack1", "Nicolson1", Arrays.asList(new PersonAddress("qwe@mail.com1", AddressType.EMAIL))));
//        expected.add(new Person("Jack2", "Nicolson2", Arrays.asList(
//                new PersonAddress("Berlin", AddressType.POST),
//                new PersonAddress("EMAIL@gmail.com", AddressType.EMAIL))));

//        //первый emailWithPerson cовпал с Person из списка персон. Добавить всех персон в список (вариант 3)
//        assertEquals(expected, PersonHandler.getNewListPersons(people, emailWithPerson, PersonHandler.getNewEmailsList(emailWithPerson)));


//    }
//
//}