import IndiceJogo.Background;
import IndiceJogo.Habilidade;
import IndiceJogo.Item;

public class Main {
    public static void main(String[] args) {
        String nomeClérigo = " 💀👻 Zoroth Herald of the God of Death 💀👻 ";
        int forca = 12;
        int constituicao = 16;
        int destreza = 16;
        int inteligencia = 16;
        int sabedoria = 18;
        int carisma = 14;
        String alinhamento = "Caótico e Mau";
        int nivel = 5;
        // Nível de D&D 3.5

        System.out.println("Ficha do Clérigo:");
        System.out.println("Nome: " + nomeClérigo);
        System.out.println("Força: " + forca +" 💪🏻 ");
        System.out.println("Constituição: " + constituicao +" 🏋️ ");
        System.out.println("Destreza: " + destreza +" 🏃🏻 ");
        System.out.println("Inteligência: " + inteligencia +" 🧠 ");
        System.out.println("Sabedoria: " + sabedoria + " 🦉 ");
        System.out.println("Carisma: " + carisma + " 💖 ");
        System.out.println("Alinhamento: " + alinhamento +" ⚖️ ");
        System.out.println("Nível: " + nivel + " 🔢");
        System.out.println("💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀");

        // Criando itens, background e habilidades (adapte conforme necessário)
        Item espadaSagrada = new Item( "Espada Sagrada" , "Uma espada abençoada");
        espadaSagrada.nome = "Espada Profana do Deus da Morte - \n" +
                "\n" +
               "A Espada Profana é uma relíquia sagrada, concedida apenas aos mais fiéis seguidores do Deus da Morte. \n" +
                "\n" +
                " Ela é uma extensão do próprio deus, uma lâmina que transcende o mundo dos vivos e dos mortos.\n" +
                "\n" +
                "💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀👻💀";


        Background antigoCultista = new Background("Antigo Cultista", "");
        antigoCultista.nome = "Descrição do Antigo Cultista - \n" +
                "\n" +
                "Zoroth nasceu em uma pequena aldeia à beira de um cemitério sombrio. Desde criança, ele sentia uma conexão com o mundo dos mortos, \n" +
                "\n" +
                " ouvindo sussurros e vendo sombras que outros não percebiam. Seus pais, temerosos, o mantiveram isolado, mas Zoroth ansiava por entender sua habilidade única.\n" +
                "\n" +
                "Quando completou a maioridade, Zoroth partiu em busca de respostas. Ele encontrou um templo dedicado ao Deus da Morte, onde os clérigos estudavam \n" +
                "\n" +
                "as forças que regiam a passagem para o além. Lá, ele conheceu o sábio Mestre Thalos, um clérigo experiente que viu potencial em Zoroth.\n" +
                "\n" +
                "Mestre Thalos o treinou nas artes necromânticas, ensinando-o a canalizar a energia da morte. Zoroth aprendeu a conjurar magias que \n" +
                "\n" +
                "causavam dano necrótico e a manipular os mortos-vivos. Ele também estudou os segredos da transformação em lich, uma busca perigosa e proibida.\n" +
                "\n" +
                "Zoroth se tornou o Arauto do Deus da Morte, viajando pelo mundo para coletar almas perdidas e proteger os vivos da influência maligna. \n" +
                "\n" +
                " Ele carrega um cajado de ébano com uma caveira esculpida, símbolo de sua devoção. Seu objetivo final é transcender a mortalidade e se tornar um lich, alcançando a imortalidade e o conhecimento arcano supremo.\n";


        Habilidade curaDivina = new Habilidade("Cura Divina", "Capacidade de curar ferimentos");
        curaDivina.nome = "Cura Profana do Deus da Morte - é um dom concedido pelo Deus da Morte a seus seguidores. Ao contrário da cura tradicional, que traz vida e restauração, essa magia é enraizada na escuridão e na transição entre os mundos.";

        System.out.println(espadaSagrada.nome);
        System.out.println(antigoCultista.nome);
        System.out.println(curaDivina.nome);
        /*
        // Exemplo de uso dos objetos criados
        System.out.println("\nItens:");
        System.out.println(espadaSagrada.get().nome + ": " + espadaSagrada.getDescricao());
        System.out.println("\nBackground:");
        System.out.println(antigoCultista.getNome() + ": " + antigoCultista.getDescricao());
        System.out.println("\nHabilidades:");
        System.out.println(curaDivina.getNome() + ": " + curaDivina.getDescricao());
        */

    }
}

