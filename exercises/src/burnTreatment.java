import java.util.Scanner;

public class burnTreatment {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("First recongnize what burn type is.");
        System.out.println("- First-degree burn");
        System.out.println("Redness of the skin: The affected area may appear red.\n" +
                "Pain: There may be mild to moderate pain at the site of the burn.\n" +
                "Swelling: The skin may swell slightly.\n" +
                "Sensitivity: The skin may be sensitive to touch or pressure.\n" +
                "Peeling: In some cases, the skin may peel as it heals.");
        System.out.println("- Second-degree burn");
        System.out.println("Blisters: The affected area may develop fluid-filled blisters.\n" +
                "Severe pain: Second-degree burns can be more painful than first-degree burns.\n" +
                "Redness: The skin surrounding the burn may appear red.\n" +
                "Swelling: The burned area may swell.\n" +
                "Weeping or oozing: Fluid may seep from the burn.\n" +
                "Skin damage: The affected skin may be moist and appear shiny or wet.\n" +
                "Sensitivity: The burned area may be sensitive to touch.\n" +
                "Peeling: As the burn heals, the skin may begin to peel.");
        System.out.println("- Third-degree burn");
        System.out.println("White or charred appearance: The burned area may appear white, brown, or black and can be charred or leathery in texture.\n" +
                "Numbness: The burned area may be numb due to damage to nerve endings.\n" +
                "No pain: Third-degree burns often result in nerve damage, so the affected person may not feel any pain in the burned area.\n" +
                "Difficulty moving: If the burn affects joints or muscles, there may be difficulty moving the affected body part.\n" +
                "Swelling: Despite the severity of the burn, there may be some swelling around the burned area.\n" +
                "Waxy or shiny skin: The skin around the burned area may appear waxy or shiny.");
        System.out.println("Enter burn type");
        System.out.println("1) First-degree burn.");
        System.out.println("2) Second-degree burn.");
        System.out.println("3) Third-degree burn.");
        Scanner scan = new Scanner(System.in);
        int burnType = scan.nextInt();

        if(burnType == 1) {
            System.out.println("Treatment: \n" +
                    "1. White or charred appearance: The burned area may appear white, brown, or black and can be charred or leathery in texture.\n" +
                    "2. Numbness: The burned area may be numb due to damage to nerve endings.\n" +
                    "3. No pain: Third-degree burns often result in nerve damage, so the affected person may not feel any pain in the burned area.\n" +
                    "4. Difficulty moving: If the burn affects joints or muscles, there may be difficulty moving the affected body part.\n" +
                    "5. Swelling: Despite the severity of the burn, there may be some swelling around the burned area.\n" +
                    "6. Waxy or shiny skin: The skin around the burned area may appear waxy or shiny.");
        } else if (burnType == 2) {
            System.out.println("Treatment:" +
                    "\n" + "1. Cool the burn: Hold the burned area under cool, running water for at least 10-15 minutes to reduce skin temperature and alleviate pain. Avoid using ice, as it can worsen the injury.\n" +
                    "2. Protect the burn: Cover the burn with a clean, dry dressing. Avoid using cotton, as it can stick to the burn. Sterile gauze or non-adhesive dressing are suitable options.\n" +
                    "3. Do not pop blisters: If blisters form, do not pop them. Blisters protect the skin underneath and aid in the healing process. If a blister accidentally bursts, gently clean it with water and soap, and cover it with a clean dressing.\n" +
                    "4. Relieve pain: Over-the-counter pain relievers such as acetaminophen (Tylenol) or ibuprofen (Advil, Motrin) can help reduce pain and inflammation. Follow the dosage instructions on the packaging.\n" +
                    "5. Seek medical attention: If the burn is extensive, located in a sensitive area such as the face, hands, feet, or genitals, or causes severe pain, it's important to seek medical attention. Doctors may prescribe topical medications or stronger pain relievers as needed.\n" +
                    "6. Keep the burn clean: Gently wash the burn with water and soap, and apply an antibiotic ointment to prevent infection. Change the dressing daily or as needed.\n" +
                    "7. Elevate the burn: If possible, elevate the burned area above the level of the heart to reduce swelling.\n" +
                    "8. Monitor for signs of infection: Watch for any signs of infection, such as redness, swelling, increased pain, pus, or fever. If signs of infection appear, seek medical attention immediately.");
        } else if (burnType == 3) {
            System.out.println("Treatment: " +
                    "\n" +"1. Seek emergency medical assistance: Third-degree burns are severe and require immediate medical attention. Call emergency services or go to the nearest emergency room as soon as possible.\n" +
                    "2. Do not remove clothing stuck to the burn: If clothing is stuck to the burned area, do not attempt to remove it. Leave it in place and let medical professionals handle it.\n" +
                    "3. Protect the burned area: Cover the burn with a clean, dry cloth or sterile dressing. Avoid applying any ointments or creams to the burn.\n" +
                    "4. Elevate the burned area: If possible, elevate the burned area above the level of the heart to reduce swelling.\n" +
                    "5. Do not break blisters: Third-degree burns may result in blistering, but unlike with lesser burns, it's best not to pop or break these blisters. Let medical professionals assess and treat them.\n" +
                    "6. Monitor for signs of shock: Third-degree burns can lead to shock. Keep an eye out for symptoms such as fainting, rapid heartbeat, shallow breathing, pale or clammy skin, and confusion.\n" +
                    "7. Keep the victim warm: Cover the person with a blanket or coat to prevent hypothermia, as severe burns can cause the body to lose heat rapidly.\n" +
                    "8. Do not give food or drink: Refrain from giving the person anything to eat or drink, as they may require surgery or other medical interventions.\n" +
                    "9. Follow medical advice: Once the person receives medical attention, follow the instructions provided by healthcare professionals closely. This may include wound care, pain management, and possibly surgery or other treatments.");
        } else {
            System.out.println("\n\"You must enter a number from 1 to 3");
            start();
        }
    }
}
