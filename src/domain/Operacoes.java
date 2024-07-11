package domain;

public enum Operacoes {

    ADICAO("+"){
      @Override
      public void operacao(int num1, int num2){
        num1 + num2
      }
    },

    SUBTRACAO("-"){
        @Override
        public void operacao(int num1, int num2){

        }
    },

    MULTIPLICACAO("*"){
        @Override
        public void operacao(int num1, int num2){

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

    public abstract void operacao(int num1,int num2);
}
