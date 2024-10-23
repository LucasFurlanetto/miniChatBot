import java.util.Scanner;

class MiniChatbot {

    public String nome = "MiniChatbot";

    public String saudacoes() {
        return "Olá!";
    }

    public String perguntaNome() {
        return "Eu sou o " + nome ;
    }

    public String comoVoceEsta() {
        return "Estou funcionando perfeitamente, obrigado!";
    }

    public String respostaPadrao() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }

    public String responder(String entrada) {
        entrada = entrada.toLowerCase();
        if (entrada.contains("oi") || entrada.contains("ola") ) {
            return saudacoes();
        } else if (entrada.contains("qual e o seu nome")) {
            return perguntaNome();
        } else if (entrada.contains("como você esta")) {
            return comoVoceEsta();
        } else if (entrada.contains("sair")) {
            return "Tchau! Até a próxima.";
        } else {
            return respostaPadrao();
        }
    }

    public static void main(String[] args) {
        MiniChatbot chatbot = new MiniChatbot();
        Scanner scanner = new Scanner(System.in);
        System.out.println(chatbot.saudacoes());

        while (true) {
            System.out.print("Usuário: ");
            String usuarioInput = scanner.nextLine();
            String resposta = chatbot.responder(usuarioInput);
            System.out.println("MiniChatbot: " + resposta);
            if (usuarioInput.toLowerCase().contains("sair")) {
                break;
            }
        }

        scanner.close();
    }
}