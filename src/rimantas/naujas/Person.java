package rimantas.naujas;

import java.time.LocalDate;
import java.time.Period;

    public class Person{
        public static int CreatedPeopleCount = 0;
        private LocalDate Birthday;
        private String Name;
        private float Weight;
        private float Height;
        // Newborn
        public Person(float weight, float height) {
            Birthday = LocalDate.now();
            Weight = weight;
            Height = height;
            Name = "Patricija";
        }
        // Already existing person
        public Person(String name, float weight, float height, LocalDate birthday) {
            Name = name;
            Weight = weight;
            Height = height;
            Birthday = birthday;
        }

        public Person() {

        }

        public LocalDate getBirthday() {
            return Birthday;
        }
        public void setBirthday(LocalDate birthday) {
            Birthday = birthday;
        }
        public String getName() {
            return Name;
        }
        public void setName(String name) {

          /*  Validation validation;
            if (validation.isNullOrEmpty(name)) {
                Name = name;
            }*/
        }
        public float getWeight() {
            return Weight;
        }
        public void setWeight(float weight) {
            Weight = weight;
        }
        public float getHeight() {
            return Height;
        }
        public void setHeight(float height) {
            Height = height;
        }
        public int getAge() {
            return Period.between(Birthday, LocalDate.now()).getYears();
        }
    }
