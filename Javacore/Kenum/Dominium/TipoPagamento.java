package MaratonaJava.Javacore.Kenum.Dominium;

public enum TipoPagamento{
        CREDITO{
            @Override
            public double CALCULAR_DESCONTO(double valor) {
                return valor * 0.1;
            }
        },
        DEBITO{
            @Override
            public double CALCULAR_DESCONTO(double valor) {
                return valor * 0.05;
            }
        };

        public double CALCULAR_DESCONTO(double valor){
            return 0;
        }
    }