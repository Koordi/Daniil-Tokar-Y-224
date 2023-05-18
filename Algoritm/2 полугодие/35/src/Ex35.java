// Требуется написать программу по расшифровке алгоритма Цезаря.
// Для формирования словаря используем текст https://fish-text.ru на 10000 символов.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class Ex35 {
    private static final String ALPHABET = "абвгдежзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) throws Exception {

        BufferedReader in1 = new BufferedReader(
                new FileReader("text.txt", StandardCharsets.UTF_8));
        String plaintext = in1.lines().reduce("", (line1, line2) -> line1 + line2)
                .replaceAll("[^а-яА-Я ]", "").toLowerCase();


        StringBuilder ciphertext = new StringBuilder();for (char c : plaintext.toCharArray()) {
            if (c == ' ') {
                ciphertext.append(' ');
            } else if (ALPHABET.indexOf(Character.toLowerCase(c)) == -1) {
                continue;
            } else {
                char encrChar = (char) (Character.isUpperCase(c) ?
                        ('А' + (((c - 'А') + 3) % 33)) :
                        ('а' + (((c - 'а') + 3) % 33)));
                ciphertext.append(encrChar);
            }
        }


        BufferedWriter out1 = new BufferedWriter(
                new FileWriter("cipher.txt", StandardCharsets.UTF_8));
        out1.write(ciphertext.toString());
        out1.newLine();
        out1.close();


        StringBuilder decryptedText = new StringBuilder();
        for (char c : ciphertext.toString().toCharArray()) {
            if (c == ' ') {
                decryptedText.append(' ');
            } else if (ALPHABET.indexOf(Character.toLowerCase(c)) == -1) {
                continue;
            } else {
                char decrChar = (char) (Character.isUpperCase(c) ?
                        ('А' + (((c - 'А') - 3 + 33) % 33)) :
                        ('а' + (((c - 'а') - 3 + 33) % 33)));
                decryptedText.append(decrChar);
            }
        }

        BufferedWriter out2 = new BufferedWriter(
                new FileWriter("cipher.txt", StandardCharsets.UTF_8, true));
        out2.write(decryptedText.toString());
        out2.newLine();
        out2.close();

        System.out.println(decryptedText.toString().replaceAll("\\s+", " "));
    }
}
