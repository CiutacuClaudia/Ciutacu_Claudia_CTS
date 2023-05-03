package banca.composite.clase;

public interface UnitateBancara {

    void adaugaUnitate(UnitateBancara unitateBancara);

    void stergeUnitate(UnitateBancara unitateBancara);

    UnitateBancara getUnitate(int index);

    void printeazaDescriere(String indentare);
}
