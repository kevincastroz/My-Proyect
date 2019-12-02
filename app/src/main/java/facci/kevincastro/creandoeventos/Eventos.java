package facci.kevincastro.creandoeventos;

public class Eventos {

    private String Name;
    private String Fecha;
    private String Lugar;
    private String Organizador;
    private String Hora;
    private int Photo;

    public Eventos(){
    }

    public Eventos(String name, String fecha, String lugar,String organizador,String hora, int photo){
        Name = name;
        Fecha = fecha;
        Lugar = lugar;
        Organizador = organizador;
        Hora = hora;
        Photo = photo;
    }


    public String getName(){
        return Name;
    }

    public String getFecha(){
        return Fecha;
    }

    public String getLugar(){ return Lugar; }

    public String getOrganizador(){return Organizador;}

    public String getHora(){return Hora;}

    public int getPhoto(){
        return Photo;
    }



    public void setName(String name) {
        Name = name;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public void setOrganizador(String organizador){Organizador = organizador;}

    public void setHora(String hora){Hora = hora;}

    public void setPhoto(int photo) {
        Photo = photo;
    }
}

