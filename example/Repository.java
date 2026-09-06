package org.example;

public class Repository
{
    private String repositoryName;

    public void initRepository()
    {
        System.out.println("Репозиторий был инициализирован!");
    }

    public void indexFiles()
    {
        System.out.println("Файлы ");
    }

    public void commitChanges(String commentary)
    {
        System.out.println("Был произведен commit с комментарием: " + commentary);
<<<<<<< HEAD
        System.out.println("Тест"); //НОВАЯ ЗАПИСЬ
=======
        System.out.println("Commit был выполнен!"); //НОВАЯ ЗАПИСЬ
>>>>>>> Dev
    }

    public void showCommitStory()
    {
        System.out.println("История коммитов показана");
    }

}
