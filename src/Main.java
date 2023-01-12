public class Main {
    public static void main(String[] args) {



                String[] languages = {"Arabic","Kyrgyz","German"};
                personLanguages(languages);
                getAge(23,29);
            }

            public static void personLanguages(String[] languages) {
                Person person = new Person("Alan", 20, languages);
                System.out.println(languages.length);
                if (languages.length >= 4) {
                    System.out.println(person.getName() + "" + "You are a polyglot");
                } else if (languages.length == 2 || languages.length == 3) {
                    System.out.println(person.getName() + " " + "Good achievement");
                } else {
                    System.out.println("FINALLY");
                }
            }
            public static void getAge(int a,int b){
                if (a <= 7 && b >= 18){
                    System.out.println("School boy");
                } else if (a <= 18 && b >= 23) {
                    System.out.println("It's a student");
                }else if(a <= 23){
                    System.out.println("Professional of one profession");
                }
            }
        }




