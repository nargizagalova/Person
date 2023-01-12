public class Person {
       private String name;
       private int age;
       private String[] languages;

   public Person(String name, int age, String[] languages){
       this.name = name;
       this.age = age;
       this.languages = languages;
   }
   public String getName(){
       return name;
   }

       public void setName(String name) {
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }

       public String[] getLanguages() {
           return languages;
       }

       public void setLanguages(String[] languages) {
           this.languages = languages;
       }


   }
