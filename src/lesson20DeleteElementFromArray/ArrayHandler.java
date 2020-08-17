package lesson20DeleteElementFromArray;

/**
 * JavaAdvanced
 * 13.08.20 20: 58
 */
public class ArrayHandler {
    private String[] array;

    public ArrayHandler(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void remove(int index) {// первый метод удаления
        String[] res;
        if ((index >= 0) && (index < array.length)) {
            res = new String[array.length - 1];
            for (int i = 0,j=0; i <array.length ; i++) {
                if(i!=index){
                    res[j]=array[i];
                    j++; // или сразу записать res[j++]=array[i];
                }
            }
            array=res;
        }
    }

    public void remove2(int index) {// второй метод удаления
        String[] res;
        if ((index >= 0) && (index < array.length)) {
            res=new String[array.length-1];
            if(index>0){
                System.arraycopy(array, 0, res, 0, index);
            }
            if(index<array.length-1){
                System.arraycopy(array, index+1, res, index, array.length-1-index);
            }
            array=res;
        }
    }
    //[1][2][3][4][5] -->[1][2][4][5][5] (size)
    //копирование самого себя в себя, без удаления, третий вариант
    public void remove3(int index) {
        if ((index >= 0) && (index < array.length)) {
            System.arraycopy(array,index+1, array, index, array.length-1-index);
        }
    }
}
