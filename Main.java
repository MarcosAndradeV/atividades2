/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
      Media2Notas.resultado();
      CastDoubleInt.resultado();
      CharAndString.resultado();
      Produto.resultado();
      ReaisDolar.resultado();
      PrecoComDesconto.resultado();
    }
}

/**
 * PrecoComDesconto
 */
class PrecoComDesconto {
    public static void resultado() {
        double precoOriginal = 890.43;
        double percentualDesconto = 25;
        double novoPreco = precoOriginal - (precoOriginal*percentualDesconto / 100);
        System.out.println("ReaisDolar");
        System.out.println("    Preco original: %.2f".formatted(precoOriginal));
        System.out.println("    Percentual desconto: %.2f %%".formatted(percentualDesconto));
        System.out.println("    Novo preço: %.2f".formatted(novoPreco));
    }
    
}

/**
 * ReaisDolar
 */
class ReaisDolar {
    public static void resultado() {
        double valorEmDolares = 99.99;
        double valorEmReais = valorEmDolares*4.94;
        System.out.println("ReaisDolar");
        System.out.println("    Cotação: 4.94");
        System.out.println("    Valor em Dolares: ".formatted(valorEmDolares));
        System.out.println("    Valor em Reais: ".formatted(valorEmReais));
    }
}

/**
 * Produto
 */
class Produto {
    public static void resultado() {
        double precoProduto = 23.49;
        int quantidade = 34;
        double rslt = precoProduto * quantidade;
        System.out.println("Produto");
        System.out.println("    Preço do produto: " + precoProduto);
        System.out.println("    Quantidade do produto: " + quantidade);
        System.out.println("    Valor do produto: " + rslt);
    }
}

/**
 * CharAndString
 */
class CharAndString {
    public static void resultado() {
        char a = 'A';
        String b = " é a primeira letra do alfabeto.";
        System.out.println("CharAndString");
        System.out.println("    " + a + b);
    }
}

/**
 * CastDoubleInt
 */
class CastDoubleInt {
    public static void resultado() {
        double a = 54.65;
        int b = (int) a;
        System.out.println("CastDoubleInt");
        System.out.println("    %.2f -> %d".formatted(a, b));
    }
}

/**
 * Media2Notas
 */
class Media2Notas {
    public static void resultado() {
        double nota1 = 2.34; 
        double nota2 = 5.64;
        double media = nota1 + nota2 / 2;

        System.out.println(
            """
            Media2Notas
                Nota1: %.2f
                Nota2: %.2f
                Media: %.2f""".formatted(nota1, nota2, media)
        );
    }
}