package projects.n2t.myapplication.Models.HomeResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("createdOn")
    @Expose
    private String createdOn;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("taskList")
    @Expose
    private List<TaskList> taskList = null;

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<TaskList> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskList> taskList) {
        this.taskList = taskList;
    }
}

