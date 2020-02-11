/**
 * PersonalCode
 */
public class PersonalCode {

    private String code ="39808110838";
    public static void main(String[] args) {
        PersonalCode myCode = new PersonalCode();
        myCode.code = "49808110838";
        System.out.println(myCode.gender());
    }

    String gender(){
        int firstNumber = Integer.parseInt(code.substring(0, 1));
        String gender;

        if (firstNumber % 2 == 0){
            gender = "Female";
        } else {
            gender = "Male";
        }
        return gender;
    }

    public int getAge(){
        int ageNumber = Integer.parseInt(code.substring(1, 2));

        if (ageNumber == 3 || ageNumber == 2){
            year = "19" + code.substring(1, 3);
        } else if (ageNumber == 4 || ageNumber == 5){
            year = "20" + yearPortion; 
        }


    }
}