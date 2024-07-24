package domain;

public enum Operacoes {

    ADICAO("+"){
      @Override
      public double operacao(double num1, double num2){
        return num1 +num2;
      }
    },

    SUBTRACAO("-"){
        @Override
        public double operacao(double num1, double num2){
            return num1 - num2;
        }
    },

    MULTIPLICACAO("*"){
        @Override
        public double operacao(double num1, double num2){
            return num1 * num2

                    ;
        }
    };


    private final String IDENTIFICADOR;

    Operacoes(String indeitificador){
        this.IDENTIFICADOR = indeitificador;
    }

    public String getIDENTIFICADOR() {
        return IDENTIFICADOR;
    }

    public static Operacoes selectOperacao(String identificador){
        for (Operacoes tipo: values()){
            if(tipo.getIDENTIFICADOR().equals(identificador)){
                return tipo;
            }
        }
        return null;
    }

    public abstract double operacao(double num1,double num2);
}
