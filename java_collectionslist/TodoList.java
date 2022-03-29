package practice;

import java.util.ArrayList;

public class TodoList {

    ArrayList <String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело: " + todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index > todoList.size()) {
            index = todoList.size();
            System.out.println("Заданый индекс не существует списке, " +
                    "поэтому введенное значение добавляется в конец списка.");
            todoList.add(index, todo);
        } else {
            todoList.add(index, todo);
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index > todoList.size()) {
            System.out.println("Задачи с таким индексом не существует");
        } else {
            todoList.set(index, todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index >= todoList.size()){
            System.out.println("Задачи с таким индексом не существует");
        } else {
            todoList.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.indexOf(todoList.get(i))+ " - " + todoList.get(i));
        }
        return todoList;
    }

}