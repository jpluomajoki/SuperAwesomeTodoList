package com.jpluomajoki.SuperAwesomeTodoList;

import java.util.Date;

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
    private Date deadline;
    private boolean completed;

    public TodoItem(String explanation, int priority, Date deadline, boolean completed) {
        this.explanation = explanation;
        this.priority = priority;
        this.deadline = deadline;
        this.completed = completed;
    }

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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
