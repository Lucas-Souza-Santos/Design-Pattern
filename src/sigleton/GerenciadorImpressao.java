package sigleton;

public class GerenciadorImpressao 
{
    private static GerenciadorImpressao gerenciadorImpressao;

    private GerenciadorImpressao()
    {
        
    }
    
    public static GerenciadorImpressao getInstancie()
    {
        if(gerenciadorImpressao == null)
        {
            gerenciadorImpressao = new GerenciadorImpressao();
        }
        return gerenciadorImpressao;
    }
    
    
}
