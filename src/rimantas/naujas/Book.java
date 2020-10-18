package rimantas.naujas;

import java.time.LocalDate;
import java.util.Scanner;

public class Book {
       //1. Create a class for a book. Add as many fields as you can
       // 2. A book has a release date. Release date CANNOT CHANGE. Model this in a class
       // 3. Author, amount of pages, name cannot change either
       // 4. Setting negative count of pages does not do antyhing
       // 5. Only not null, not empty author name can be set
       // 6. Create a class Validations and a function in it StringNotNullOrEmpty
        // 7. A person name should be logged whenever it changes. For example "Tomas -> Diana" (edited)

           private String Genre;
           private final String Author;
           private final String Name;
           private final int NoOfPages;
           private final LocalDate ReleaseDate;
           private float Score;

           public Book (String genre, String author, String name, int noOfPages, LocalDate releaseDate, float score){

               Genre = genre;
               if (author == null || author.isEmpty() ){
                   System.out.println("Author name is required");
               }
               Author = author;
               if (noOfPages <= 0){
                   System.out.println("Number of pages cannot be less than 1");
               }
               NoOfPages = noOfPages;
               Name = name;
               ReleaseDate = releaseDate;
               Score = score;

           }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public String getAuthor() {
               return Author;
    }

    @Override
           public String toString() {
               return "Book{" +
                       "Genre='" + Genre + '\'' +
                       ", Author='" + Author + '\'' +
                       ", Name='" + Name + '\'' +
                       ", NoOfPages=" + NoOfPages +
                       ", ReleaseDate=" + ReleaseDate +
                       ", Score=" + Score +
                       '}';
           }
       }
