package models;

import io.ebean.*;
import io.ebean.annotation.*;

import models.enums.ShoesColor;
import models.enums.ShoesModelType;
import models.enums.ShoesUserCategory;

import javax.persistence.*;

@Entity
public class ShoesModel extends Model {

    @Id
    public int id;

    @NotNull
    @ManyToOne
    public ShoesUserCategory userCategory;

    @NotNull
    @ManyToOne
    public ShoesModelType type;

    @NotNull
    @ManyToOne
    public ShoesManufacturer manufacturer;

    @NotNull
    @ManyToOne
    public ShoesColor color;

    public Double size;
    public Double price;
    public Boolean highHeel;
    public Boolean genuineLeather;
    public Integer monthsOfWarranty;
    public Integer piecesAvailable;

    public static final Finder<Integer, ShoesModel> find = new Finder<>(ShoesModel.class);
}