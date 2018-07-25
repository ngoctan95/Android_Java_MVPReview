package projects.n2t.myapplication.Models.HomeResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaskList {
    @SerializedName("task")
    @Expose
    private String task;
    @SerializedName("dueDate")
    @Expose
    private String dueDate;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("priority")
    @Expose
    private String priority;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}
