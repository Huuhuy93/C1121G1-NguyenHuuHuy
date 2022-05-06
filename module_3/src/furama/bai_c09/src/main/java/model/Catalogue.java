package model;

public class Catalogue {
    Integer idCatalogue;
    String nameCatalogue;

    public Catalogue() {
    }

    public Catalogue(Integer idCatalogue, String nameCatalogue) {
        this.idCatalogue = idCatalogue;
        this.nameCatalogue = nameCatalogue;
    }

    public Integer getIdCatalogue() {
        return idCatalogue;
    }

    public void setIdCatalogue(Integer idCatalogue) {
        this.idCatalogue = idCatalogue;
    }

    public String getNameCatalogue() {
        return nameCatalogue;
    }

    public void setNameCatalogue(String nameCatalogue) {
        this.nameCatalogue = nameCatalogue;
    }
}
