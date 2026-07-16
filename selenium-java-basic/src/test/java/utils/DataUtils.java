package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class DataUtils {
    public static String gerarEmail() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss")) +
                "@teste.com";
    }

    public static String gerarNome() {
        return "usuario_" + UUID.randomUUID().toString().substring(0, 8);
    }

    public static String gerarSenha() {
        return "Senha123!";
    }
}
