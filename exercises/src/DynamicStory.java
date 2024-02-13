import java.util.Scanner;

public class DynamicStory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Dynamic Story
        System.out.println("You write the character name:");
        String characterName = scan.nextLine();
        System.out.println("Yor write the programming language :");
        String programingLanguage = scan.nextLine();
        String story = "Érase una vez en un reino digital, un valiente aventurero conocido como " + characterName + ". Este intrépido personaje navegaba por las tierras del ciberespacio en busca de tesoros ocultos y desafíos por superar. Sin embargo, en su camino, se encontró con un desafío único y desconcertante: el Reino del Código " + programingLanguage + ".\n" +
                "\n" +
                characterName + " sabía que este era un lugar peligroso, donde los errores podían convertirse en monstruos imbatibles y las trampas de código podían atrapar incluso al aventurero más experimentado. Pero armado con su destreza y conocimientos de programación, decidió enfrentar el desafío.\n" +
                "\n" +
                "Con cada línea de código que escribía, " + characterName + " se adentraba más en el laberinto de instrucciones y algoritmos. Se encontró con bucles infinitos que amenazaban con atraparlo para siempre y con errores de sintaxis que intentaban confundirlo. Sin embargo, con paciencia y determinación, " + characterName + " perseveró.\n" +
                "\n" +
                "Con cada desafío que superaba, " + characterName + " se volvía más fuerte y más sabio. Aprendió a detectar los errores antes de que pudieran atraparlo y a utilizar sus habilidades de depuración para desentrañar los enigmas más difíciles del código. Finalmente, después de muchas pruebas y tribulaciones, llegó al corazón del Reino del Código " + programingLanguage + ".\n" +
                "\n" +
                "Allí, encontró al temido Guardián del Código, un ser formidable hecho de algoritmos y lógica. El Guardián desafió a " + characterName + " a un duelo de programación, donde solo el más hábil sobreviviría. Con sus dedos volando sobre el teclado, " + characterName + " se enfrentó al Guardián en un enfrentamiento épico de codificación.\n" +
                "\n" +
                "Después de una intensa batalla, " + characterName + " emergió victorioso. Había demostrado su valía como programador y había conquistado el Reino del Código " + programingLanguage + ". Como recompensa, fue aclamado como un héroe por sus habilidades incomparables y su coraje inquebrantable.\n" +
                "\n" +
                "Y así, " + characterName + " continuó su viaje a través del ciberespacio, llevando consigo la lección de que con determinación y habilidad, cualquier desafío puede ser superado. Y su nombre, ahora legendario en los anales del reino digital, sería recordado por generaciones venideras como un símbolo de ingenio y valentía en el mundo de la programación.";

        System.out.println("story = " + story);
    }
}