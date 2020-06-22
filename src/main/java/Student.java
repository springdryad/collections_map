public class Student {
  String passport_number;
  String name;

  public Student(String passport_number, String name) {
    this.passport_number = passport_number;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Passport number: " + passport_number + " | " + "Name: " + name;
  }
}
