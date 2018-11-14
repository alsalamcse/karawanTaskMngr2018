package om.banat.karawan.karawantaskmngr2018.Data;

import android.widget.SeekBar;

import java.util.Date;

public class MyTask
{
    private String key;
    private String title;
    private String text;
    private SeekBar important;
    private SeekBar necessary;
    private Date createdAt;
    private Date dueDate;
    private String owner;

   public MyTask()
   {
   }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SeekBar getImportant() {
        return important;
    }

    public void setImportant(SeekBar important) {
        this.important = important;
    }

    public SeekBar getNecessary() {
        return necessary;
    }

    public void setNecessary(SeekBar necessary) {
        this.necessary = necessary;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setOwner(String owner) {
       this.owner = owner;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

