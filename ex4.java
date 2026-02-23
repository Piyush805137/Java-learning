class StudentResult {
    int marks = 0;
    double percentage = 0;

    void requirement(String name, String phone, String cls, char section) {
        System.out.println("Name of the student : " + name);
        System.out.println("Phone number        : " + phone);
        System.out.println("Class               : " + cls);
        System.out.println("Section             : " + section);
    }

    void marks(String java, String cLang, String dt, String os, String python, String flutter) {
        // Convert string inputs to integers
        int javaMarks = Integer.parseInt(java);
        int cMarks = Integer.parseInt(cLang);
        int dtMarks = Integer.parseInt(dt);
        int osMarks = Integer.parseInt(os);
        int pythonMarks = Integer.parseInt(python);
        int flutterMarks = Integer.parseInt(flutter);

        // Print subject-wise marks
        System.out.println("Marks in Java    : " + javaMarks);
        System.out.println("Marks in C       : " + cMarks);
        System.out.println("Marks in Design Thinking : " + dtMarks);
        System.out.println("Marks in OS      : " + osMarks);
        System.out.println("Marks in Python  : " + pythonMarks);
        System.out.println("Marks in Flutter : " + flutterMarks);

        // Calculate total and percentage
        marks = javaMarks + cMarks + dtMarks + osMarks + pythonMarks + flutterMarks;
        percentage = marks / 6.0;

        System.out.println("Total Marks  : " + marks);
        System.out.println("Percentage   : " + percentage + "%");
    }

    public static void main(String[] args) {
        StudentResult sr = new StudentResult();
        sr.requirement("Piyush", "8051370133", "MCA", 'A');
        sr.marks("58", "70", "99", "25", "97", "98");
    }
}