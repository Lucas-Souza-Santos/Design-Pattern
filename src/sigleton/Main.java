package sigleton;

    public class Main 
    {
        public static void main(String[] args) 
        {
            GerenciadorImpressao g1 = GerenciadorImpressao.getInstancie();
            GerenciadorImpressao g2 = GerenciadorImpressao.getInstancie();
            GerenciadorImpressao g3 = GerenciadorImpressao.getInstancie();
            GerenciadorImpressao g4 = GerenciadorImpressao.getInstancie();
            
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
            System.out.println(g4);
        }
    
    }
