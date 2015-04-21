/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Bryce
 */
@Entity
public class Series implements Serializable {
    private static final long serialVersionUID = 1L;

    private int epsBehind;
    @Id
    private String seriesName;
    private String airingDay;
    private String type;

    public String getType() {
        return type;
    }


    public void setType(String type){
        this.type = type;
    }

    public Series()
    {
        this.epsBehind = 0;
    }
    
    public Series(String name, String day)
    {
       this.seriesName = name;
       this.epsBehind = 0;
       this.airingDay = day;
    }

    public void setDay(String day)
    {
        this.airingDay = day;
    }
    
    public String getDay()
    {
        return this.airingDay;
    }
    
    public int getEps()
    {
        return this.epsBehind;
    }

    public Series incEps()
    {
        this.epsBehind++;
        return this;
    }
    
    public Series decEps()
    {
        this.epsBehind--;
        return this;
    }
    
    public String getName()
    {
        return this.seriesName;
    }
    
    public void setName(String name)
    {
        this.seriesName = name;
    }
}
