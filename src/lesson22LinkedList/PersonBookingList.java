package lesson22LinkedList;

/**
 * JavaAdvanced
 * 20.08.20 20: 16
 */
public class PersonBookingList {
    private Node start = null;
    private Node finish = null;
    private int size = 0;

    public void add(Person person) {
        //1-e создаем новую ноду
        Node node = new Node(person);
        //2 понять если что-то в списке уже
        if (start == null) { // если нет ничего, то start=node, то finish=node;
            start = node;

        } else {// нода, которую добавляем у нас не первая (Добавляем в конец)
            node.setPrev(finish); //меняем ссылки
            finish.setNext(node);// поле prev указывает на поле ноды, которая была раньше последней
        }
        finish = node; // это всегда при добавлении
        size++; // и всегда при добавлении увеличивается размер
    }

    public void remove() {// метод удаления последнего элемента
        // нужно удалить финиш из списка
        if (finish != null) {
            if (finish == start) {// проверка: является ли финишний элемент и стартовым (то есть, если только 1 элемент,
                // который мы удалим
                finish = null;
                start = null;
                size = 0;
            } else {
                finish.getPrev().setNext(null);// обрываем список
                finish.setPerson(null);
                finish = finish.getPrev(); // новый финиш
            }
        }
    }

    public void remove(int index) {// удаление по индексу
        if (index > 0 || index < size) { // проверка на корректность индекса
            if (index == size - 1) { //если удаляем последний элемент
                remove(); // вызваем метод удаления без индекса
                return; // тут служит как break
            }
            if (index == 0) {//удаляет первый элемент
                // start указывает на второй элемент и порвать связи
                start.getNext().setPrev(null);// у второго обнуляем prev
                start = start.getNext();
                size--;
                return; // тут служит как break
            }
            // теперь, если нужный элемент внутри
            Node node = getNodeByIndex(index);
            if (node!=null){
                node.getPrev().setNext(node.getNext()); //поулчаем преведущую и nex делаем новую (она такая же, как у удаляемой
                node.getNext().setPrev(node.getPrev());
                // теперь обнуляем саму ноду
                node.setPrev(null);
                node.setNext(null);
                size--;
            }
        }
    }

    private Node getNodeByIndex(int index) {
        int i = 0;//считаем вместо индекса для каждой ноды/ типо count
        Node currentNode = start;// чтобы хранить текущую
        while (currentNode != null) {
            if(i==index) {
                return currentNode;
            }
            i++;
            currentNode = currentNode.getNext(); // чтобы брать значение следующей
        }
        return null; // если не было такого индекса
    }

    public String toString() {
        Node currentNode = start;// чтобы хранить текущую
        String resString = "";
        while (currentNode != null) {// делаем до тех пор пока не получим null
            resString += currentNode.getPerson().toString() + '\n'; // у текуще ноды берем person и строку и потом в resString
            currentNode = currentNode.getNext(); // чтобы брать значение следующей
        }
        return resString;
    }

    public int find(Person person) {// поиск
        Node currentNode = start;// чтобы хранить текущую
        int res = -1;// вернет, если ничего не нашел
        int index = 0;
        while (currentNode != null) {// делаем до тех пор пока не получим null
            if (currentNode.getPerson().equals(person)) {
                res = index;
                break;
            } else {
                currentNode = currentNode.getNext(); // дальше перебираем
                index++;
            }
        }
        return res;
    }

}
