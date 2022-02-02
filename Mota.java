package Exerc6;

public class Mota {

        public String Marca;
        public String Modelo;
        public double Custo;


        public Mota() {}

        public Mota(String marca, String modelo, double custo) {
            this.Marca=marca;
            this.Modelo=modelo;
            this.Custo=custo;
        }
        public String getMarca() { return (this.Marca); }
        public String getModelo() {
            return(this.Modelo);
        }
        public double getCusto() {
            return (this.Custo);
        }

        public String  setMarca() { return(this.Marca);}
        public String setModelo() { return (this.Modelo);}
        public double setCusto() { return (this.Custo); }
    }

