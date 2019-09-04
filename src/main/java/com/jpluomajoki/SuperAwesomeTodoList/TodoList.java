package com.jpluomajoki.SuperAwesomeTodoList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    private List<TodoItem> todoItems;

    public TodoList() {
        this.todoItems = new ArrayList<>();
    }

    public TodoList(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    public TodoList insert(TodoItem todoItem) {
        this.todoItems.add(todoItem);
        return this;
    }

    /**
     * Get all the todoItems for a given date
     */
    public TodoList get(LocalDate deadlineDate) {
        return new TodoList(this.todoItems.stream().filter(
                todoItem -> deadlineDate.equals(todoItem.getDeadline().toLocalDate())
        ).collect(Collectors.toList()));
    }

    /**
     * TodoLists with identical contents are considered equal
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        TodoList otherList = (TodoList) other;
        return this.todoItems.equals(otherList.todoItems);
    }
}
