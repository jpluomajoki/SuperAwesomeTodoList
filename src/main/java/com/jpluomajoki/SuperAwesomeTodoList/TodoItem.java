package com.jpluomajoki.SuperAwesomeTodoList;

import java.time.LocalDateTime;

/*
 - Add a TodoItem
   - Explanation
   - Priority
   - Deadline
   - IsCompleted
 */
public class TodoItem {
    private String explanation;
    private int priority;
    private LocalDateTime deadline;
    private boolean completed;

    public TodoItem(String explanation, int priority, LocalDateTime deadline) {
        this.explanation = explanation;
        this.priority = priority;
        this.deadline = deadline;
        this.completed = false;
    }

    public TodoItem(String explanation, int priority, LocalDateTime deadline, boolean completed) {
        this.explanation = explanation;
        this.priority = priority;
        this.deadline = deadline;
        this.completed = completed;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null ||  getClass() != other.getClass()) {
            return false;
        }

        TodoItem otherItem = (TodoItem) other;
        return this.explanation.equals(otherItem.explanation) &&
                this.priority == otherItem.priority &&
                this.deadline.equals(otherItem.deadline) &&
                this.completed == otherItem.completed;
    }

    /**
     * Getters & Setters down here
     */

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
