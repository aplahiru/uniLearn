package lk.UniLearn.studentlearning.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Material {

    @Id
    private int materialId;
    private String materialName;
}
