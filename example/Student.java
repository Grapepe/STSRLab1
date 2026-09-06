package org.example;

public class Student
{
    private String name;
    private String faculty;
    private int course;
    private Repository studentRepository;

    public Student(String name, String faculty, int course)
    {
        this.name = name;
        this.faculty = faculty;
        this.course = course;
    }

    public void labPart1()
    {
        this.studentRepository = new Repository();
        studentRepository.initRepository();
        studentRepository.indexFiles();
        studentRepository.commitChanges("Первый коммит");
        studentRepository.showCommitStory();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
}
