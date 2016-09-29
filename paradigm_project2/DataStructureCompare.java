/**
 * Created by yichenzhou on 9/26/16.
 */
package paradigm_project2;


import java.util.HashMap;
import java.util.Random;

public class DataStructureCompare {
    public static int AgeFromHash(String name, HashMap<String, Integer> hashMap) {
        int age = hashMap.get(name);
        System.out.println("Hash: \n" + name + "'s age is " + age);
        return age;
    }

    public static int AgeFromLinkedList(String name, LinkedList<String> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            String[] contents = linkedList.pop();
            if (contents[0].toString() == name) {
                System.out.println("Linked List: \n" + name + "'s age is " + contents[1]);
                return Integer.parseInt(contents[1]);
            }
        }
        System.out.println("Not Found 404");
        return 0;
    }

    public static int[] getRandomIndex() {
        int[] randomIndex = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomIndex[i] = random.nextInt(1000);
        }
        return randomIndex;
    }
    public static void main(String[] args) {
        String[] names = new String[] { "Karen Rose", "Cora Faison", "Donna Jones", "Robert Lowe", "Patricia Johnston", "Maryanne Hicks", "James Mcmurray", "Maria Obando", "Lenora Reiter", "William Demers", "Douglas Kelley", "Jane Montoya", "Robert Burbach", "Angelina Steward", "Amy Delgado", "Grisel Stewart", "Ruth Valle", "Delores Utz", "Ashley Gibson", "Erma Simon", "Kristen Phelps", "Jane Pritchard", "Ferne Murphy", "Eric Gonzalez", "Brenda Degidio", "Mary Rowe", "Walter Childress", "Lydia Mcneal", "Travis Swenson", "Rory Dutton", "Vickie Ball", "Christopher Steward", "Julie Raby", "Mark Kirby", "Wendy Collins", "Pamela Meadows", "Eugene Carter", "Robert Jones", "Francisco Hall", "Lonnie Rider", "Tyson Miranda", "Carol Suk", "Tonya Keith", "Patrick Dreher", "Fred Chapin", "Thomas Parsons", "Stanford Bocanegra", "Alejandra Pena", "Mireya Ashe", "Myrtle Mcmanemy", "Louis Graffagnino", "Richard Phillips", "Ronnie Davis", "Debra Mclean", "Jennifer Vannest", "Carol Myers", "Scarlet Muhammad", "Thomas Morton", "Anna Wells", "Katherine Bland", "Matilde Vaux", "Jenna Porter", "Robert Stokes", "Melissa Nichols", "Dan Fisher", "John Stoops", "Joseph Mcdade", "William Chaney", "Glen Khauv", "Norman Lawley", "Rosa Kelley", "Donna Busch", "Barbara Foster", "Christopher Jennings", "Mark Yates", "Shelia Miller", "Janelle Capozzoli", "Michele Hughes", "Rodney Parnell", "Karl Olson", "Frederick Miller", "Brian Jones", "William Mccloud", "David Nunn", "Clarence Wright", "Victor Maki", "Cleo Boggs", "Lola King", "Michael Gilmore", "Clemente Pergola", "Louise Gingrich", "Therese Cartagena", "Karen Hibbler", "Thomas Schmid", "Jeffrey Rush", "Carmen Marriott", "Damion Mcneill", "Stanley Dale", "William Aikens", "Yvonne Eckman", "James Burden", "Matthew Malcom", "Kevin Ortiz", "Pearl Merrick", "Brenda Wells", "Courtney Stevenson", "Leta Castillo", "Richard Maldanado", "Anthony Simmons", "Crystal Truax", "David Shelvey", "Gary Miller", "Willie Bunal", "Virginia Keller", "Melissa Benjamin", "Margaret Smith", "Willie Kelley", "Antoinette Bell", "James Cody", "Vivian Brown", "Margaret Wood", "Brenda Durkee", "Mike Seamons", "Gabriel Gunia", "Michelle Wilson", "Jesus Kennedy", "Margie White", "Allison Leonard", "Georgiana Kelley", "James Wright", "Arthur Pruett", "Lucille Delgado", "Bonnie Pennachio", "Tona Panora", "Jessica Bowers", "Darcy Proper", "Marlene Turner", "David Stark", "Jeanette Tyler", "Jennifer Reinke", "Kathy Heaton", "Eric Trasher", "Jordan Williams", "Rebecca Vajgrt", "Brian Stanley", "Robert Villarreal", "Tyrone Avendano", "Ernest Metzner", "Yolanda Borkholder", "Eric Pugh", "Kimberly Dean", "Sherrie Smith", "Lorraine Sharrar", "Lindsey Carathers", "Stephen Wolfrum", "Milton Carter", "Darleen Chandler", "Mindy Nicholas", "Thomas Bos", "Joyce Melton", "William Kelash", "Robert Roth", "Ruthann Finzel", "Gabriel Ross", "Teresa Cabading", "Nancy Fisher", "Laurie Lang", "Joyce Cockerham", "Margaret Howard", "Helen Blake", "Virginia Lopez", "Clarence Bezio", "Rodney Maynard", "Gloria Truman", "Sallie Golden", "James Linney", "Sarah Sebald", "Steven Walker", "Julia Williams", "Douglas Mona", "David Lovig", "Joy Amador", "Jennifer Courtney", "John Cammarata", "Ernest Jones", "James Sullivan", "Anderson Feeney", "Joseph Brodersen", "Mary Chapman", "Dawn Johnson", "Charles Metoyer", "Joanne Carlock", "Stephanie Martin", "Scott Hill", "David Roman", "Brandon Sales", "Jason Stavis", "Gerri Royster", "Ronny Lentz", "Cheryl Jacobs", "William Goss", "Frances Mendibles", "Craig Woods", "Michelle Maclennan", "Adrienne Powell", "Robert Cardamone", "Ruth Leggett", "John Eddy", "Rebecca Slaughter", "Lillian Keaton", "Alicia Manlangit", "Emily Lira", "Walter Herod", "Luis Hill", "Timothy Mitchell", "Derrick Meyers", "Kelly Spaulding", "Sarah Spivey", "Evelyn Grochmal", "Michael Mcgriff", "Laura Salamy", "Kim Cowley", "James Koch", "Judith Rivera", "Daniel Meyers", "Antoinette Jennings", "Agnes Mcmath", "Luz Bouck", "John Priestley", "Jeffrey Chapman", "Eddie Sneeden", "John Smith", "David Lee", "Edward Vazquez", "Steven Brown", "Kim Kucera", "Patricia Ayers", "Ada Laster", "Jane Delgado", "Alicia Faunce", "Eugene Richard", "Lillian Hernandez", "Leo Vaccaro", "Sylvia Culbert", "Deborah Travis", "Janice Hernandez", "Charles Smith", "James Frautschi", "Donald Hall", "Juan Orton", "Dwayne Anderson", "Ashley Herrera", "Nathan Smith", "Brynn Kay", "Paul Gravina", "Christopher Denson", "Joel Gartner", "Susan Cooper", "William Motl", "Steven Shepard", "George Stomberg", "Billy Saugis", "Maurice Ortega", "Linda Romano", "Berta Amos", "Lorraine Hubler", "Juan Craddock", "Austin Mitchell", "Peter Parker", "Flora Drew", "Rebecca Schultz", "Eunice Perez", "Barbara Bacon", "Tommy Jones", "Jamie Starnes", "Edythe Scott", "Betty Morris", "George Black", "Carmen Cannon", "Barbara Wendell", "Sharon Cordero", "Peter Bunch", "William Roblez", "Audry Dus", "Bernard Doiron", "Clement Kwiecien", "Ernesto Breton", "Toi Vazquez", "Anna Detweiler", "Jason Ford", "Pearline Edmiston", "John Campbell", "Rose Velez", "Margarita Adams", "Lynn Allen", "Loria Juenemann", "Warren Landeros", "Alan Ginn", "John Lerner", "Gina Rodriguez", "Kenneth Wilcox", "Rita Torre", "Arlene Buchanan", "Lonnie Yost", "Timothy Hillebrand", "Grace Garcia", "Salvador Kenyon", "Stephen Martinez", "Rosa Richter", "Irma Sutton", "Johnny Bellamy", "Pauline Tarter", "Sergio Profit", "Keith Mccormick", "James Capone", "Peggy Baldwin", "Dana Smith", "George Hogarth", "Joseph Owings", "Harold Johnson", "Lorraine Collins", "Nancy Moreno", "Mercedes Stephens", "Betty Randolph", "Nancy Hockman", "Eva Harris", "Geraldine Horta", "Bryan Wolf", "Barry Childers", "Gary Morrison", "Isaac Moss", "Dwain Blackwelder", "Angela Lillis", "Dennis Workman", "Julia Noble", "Joyce Pierce", "Keith Hooker", "Daniel Cook", "Nathan Fawver", "Sam Maffit", "Ronald Sanchez", "Jose Linarez", "Harold Torrence", "Leroy Kemnitz", "Diana Lopez", "William Sahota", "Patrick Larsen", "Jennifer Lovato", "Christopher Griswold", "Edward Reiner", "Diana Malone", "Carol Benites", "Douglas Waldrop", "John Ellis", "Adam Blair", "Lori Priesmeyer", "Lenora Christiansen", "Manuel Boren", "Theodora Scantling", "Jack Bennett", "Charles Tucker", "Jaime Henderson", "Sara Bagley", "Dennis Beltran", "Vickie Franco", "Mary Solis", "Vita Zimmerman", "Cora Mollette", "Patrick Clevenger", "Fred Paulsen", "Patsy Burger", "Billy Brown", "George Watanabe", "Dora Raver", "Francine Moore", "Adrianne Santarpia", "Nathan Brailey", "Cassandra Emme", "Mark Williams", "Elizabeth Vaughn", "Ginger Haddock", "Richard Tanner", "Victoria Mccollum", "Cornelia Ketner", "Bill Alconcel", "Daisy Medez", "Michael Scott", "Kevin Benny", "Kathy Wooden", "Theressa Witmer", "Thelma Ray", "Jessie Harvey", "Harry Chism", "Rebecca Wright", "Erwin Clark", "Arthur Mills", "Richard Kline", "Stella Roe", "Kenneth Schlichter", "Donald Smith", "Michael Graham", "Ted Connell", "Marie Reyes", "Dorothy Towler", "Bradley Orr", "Claire Johnson", "Maria Marcantonio", "Helen Grosse", "Jesse Large", "Ebony Brink", "Frankie Pigman", "Henry Wallace", "Felix Cline", "Timothy William", "Valerie Calderon", "Susan Johnson", "William Mull", "Steven Bentley", "Brian Henry", "Melvin Smith", "Mary Rochon", "Clara Smith", "John Parker", "Carol Ferguson", "Dionne Tindall", "Helen Horton", "Luis John", "Keith Herrera", "Katina Boykin", "Mary Miller", "Leonard Pollock", "Edward Coppola", "Albert Flores", "Priscilla Jackson", "Delores Brown", "Robert Christie", "David Perza", "Randy Smith", "Alissa Obrien", "Lindsay Michel", "Joshua Gibson", "Mary Hernandez", "Kelly Estrada", "Clifton Bauman", "Sue Mcmaster", "Charles Lopez", "Kelly Dean", "Gretta Gonzales", "Tracey Pinette", "Jennifer Mazon", "Carlos Higdon", "Mary Jump", "Denise Timberlake", "Glenn Wells", "Aaron Gerken", "Harold Vaden", "Kelly Wood", "Jasmine Lofton", "Gloria Sauer", "Harvey Chase", "Mark Balmer", "Niki Montney", "August Mireles", "Barbara Norwood", "James Nickerson", "Alvin Phillips", "Janice Steffen", "William Lewis", "Alissa Rivas", "George Huffman", "Glenn Mandato", "James Gamble", "Mike Ng", "Cody Vanicek", "Vera Madewell", "Catherine Smith", "George Fossey", "Jerome Stewart", "Charlotte Hebert", "Larry Batey", "Leah Clark", "Deborah Exline", "Felix Diggs", "Ione Napier", "Tonia Wright", "Alice Prospero", "Carol Williams", "Diana Tilton", "John Rivera", "Ruby Palazzi", "Christine Mejia", "Elizabeth Staebell", "Becky Decoteau", "Lori Golka", "Jae Anderson", "Della Schoolcraft", "Gerald Robinson", "Martha Sanders", "William Larson", "Miriam Solis", "Timothy Acosta", "Raul Gilmour", "Patrick Neal", "Stephanie Harland", "Iris Murray", "Alexander Fiorello", "Raymond Valenzuela", "Kimberly Lynch", "David Maks", "Stephanie Burson", "Kevin Zahler", "Tony Hill", "Val Cormier", "Norma Fernandez", "Charlotte Wagstaff", "Flora Guerra", "Tracy Patrick", "Grady Gonzalez", "Julianne King", "Cynthia Kehres", "Paul Gaillard", "Annie Fuller", "August Obrien", "Ann Landers", "Leland Moorehouse", "Jodie Morgan", "Clara Burrow", "Rosemary Spencer", "Daniel Russell", "Emily Fernendez", "Sean Zuniga", "Alice Dubose", "Richard Shurman", "Thomas Watts", "Victor Sindelar", "Rafael Thomas", "David Panzarella", "Saul Tennon", "Elizabeth Potter", "Anne Knowlton", "Carrie Peachey", "David Smith", "Eloise Mcbride", "Ahmad Johnson", "Colin Ward", "Ruth Cauthen", "Stephen Hunter", "Justin Davis", "Carol Dibble", "Roger Demmer", "Rosetta Brasil", "Jill Bellavance", "Mireille Younts", "Marcus Shanker", "Marilyn Grimsley", "Curtis Mason", "Marie Moore", "Margaret Douglass", "David Pate", "Terry Pete", "Fatima Clark", "Raymond Crystal", "Charlene Lorenzen", "Russell Hall", "Wesley Wingard", "Anita Harless", "Mary Villarreal", "Harriet Pyles", "Don Jackson", "Eleanor Jones", "David Benge", "Richard Sokolsky", "Tennille Gambone", "Ernest Schrimsher", "Joanne Smith", "Estelle Logan", "Wilford Cordero", "Gregory Hilbert", "Maria Ainsworth", "Regina Holder", "Ruth Orozco", "Raymond Kosky", "Debbie Gallegos", "Michelle Hutchinson", "Michael Croteau", "Doris Nelson", "Kathy Martinez", "Joann Pena", "Walter Teed", "Sydney Brown", "Debra Miller", "Susan Averill", "Shirley Samson", "Mary Montes", "Linda Bowers", "Donna Delgado", "Ray Mccollom", "Susan Labriola", "Bryan Bartholomew", "Yolanda Redman", "Al Gilley", "Chantel Robinson", "Peter Hankins", "Marlene Jones", "Ronald Belden", "Thomas Richardson", "Richard Mestad", "Emmett Harrison", "Donald Pereira", "Mary Butler", "Patrick Rokusek", "Marianela Manzo", "Miranda Guerrero", "Paul Pascua", "George Dixon", "Leah Dangerfield", "Marcus Delacruz", "Helen Loftin", "Dina Arnold", "Jean Hankins", "Timothy Suiter", "Douglas Hudson", "Arthur Deare", "Shirley Bently", "Patricia Cantell", "Wanda Faucett", "Maynard Sachez", "Irene Ferguson", "Thomas Spinner", "Kendrick Swallow", "Joseph Stevens", "Eunice Culp", "Kristi White", "Antwan Nolasco", "Horace Houser", "Joe Hartmann", "Bobbie Peterson", "Tamara Mattocks", "Jennifer Davis", "Letha Caserta", "Betty Matthews", "Brian Snyder", "Kelly Hendrick", "Lisa Springer", "James Blasen", "Floyd Burr", "Alvera Wade", "Daniel Koshiol", "Denisha Schumacher", "Karen Liddle", "Jeanne Clark", "Deborah Robinson", "David Swiger", "Christopher Evans", "Blanche Blanc", "Ashley Romo", "Thomas Scott", "Toni Compton", "Robert Gheen", "Rita Mcreynolds", "Shawna Briggs", "Jerry Dollyhigh", "Jodi Bowmer", "Chuck Lane", "Lester Hubbert", "Robert Carey", "Karen Johnston", "Joshua Craft", "John Alvarez", "Dora Hoy", "Mary Staten", "Florence Maobi", "Michael Hughes", "Antonio Block", "Suzanne Linnell", "Andrea Hull", "Robert Barks", "Roberta Mcgowen", "Eric Norris", "Stanley Chee", "Renee Austin", "Francina Makinen", "Ali Brennen", "Howard Topping", "Edythe Sparks", "Mary Sisler", "Donna Vogel", "James Alonso", "Hilda Mackie", "Susie Hine", "Leon Halbrook", "Robert Dery", "Marilyn Colburn", "Noriko Hill", "Gilbert Ray", "Angel Taylor", "Jolene Fitzpatrick", "Mary Shepard", "Leif Brubaker", "Clarence Sotelo", "Mary Krueger", "Linda Johnson", "Richard Chung", "Christina Bailey", "Lindsey Taylor", "Chris Cole", "Shirley Dixon", "Jack Dennis", "Margaret Carter", "John Roden", "Sue Rawson", "Brandon Streicher", "Daniel Bennett", "Patricia Elizalde", "James Cox", "Elizabeth Friddle", "Tanya Hochmuth", "Norma Queal", "Myrtle Grube", "Morgan Parker", "Victor Brezenski", "Anthony Ferguson", "Dennis Pledger", "Antoinette Maas", "Lauren Drake", "Lonnie Woodward", "Terry Baker", "Daniel Miller", "Erika Bertolini", "John Carlson", "Sybil Peter", "Jessica Lebel", "Linda Lowery", "Nicole Kaleta", "Carl Gorman", "Ruth Burke", "Casey Buser", "Louise Box", "Charles Wilson", "Jessica Beagle", "Gerald Crowell", "Kathryn Springer", "Henry Graham", "Margaret Palmer", "Loretta Nichols", "Edward Murphy", "William Lucchese", "Zachary Sturm", "John Harmon", "James Day", "Shawn Jones", "Marguerite Harris", "Heather Mastrangelo", "Leslie Scrivner", "Darlene Nazario", "Jeffrey Allgood", "Lawrence Pfannenstiel", "Andrew Davenport", "Nick Roman", "Emma Whitling", "Bethany Williams", "Refugio Oddo", "Maria Samantha", "Keith Carlson", "John Lewis", "John Aguayo", "Willie Shaw", "Sarah Plotner", "Jessica Blackwell", "Helen Seal", "Ernest Bruggeman", "Donald Walker", "Jose Trotman", "Armando Dudley", "Cynthia Petrson", "Lorena Lee", "Luis Thompson", "Arlene Davis", "Christopher Andrew", "Dina Wiener", "Joe Silverman", "Thomas Barnett", "Tina Hayes", "Melinda Jones", "Beverley Edwards", "Travis Dodson", "Betty Smiley", "Jodi Donald", "Robert Tipka", "Rebecca Munoz", "Juan Nobles", "Rachel Ogden", "Jason Oswalt", "Constance Sheehan", "Billy Stier", "Wanda Matteson", "Alicia Lopez", "Laura Carwile", "Michael Thorpe", "Tammie Peters", "Kenneth Chalker", "Kelly Hill", "Cory Roy", "Joseph Forney", "Annabell Holmes", "Roger Elliott", "Justin Bracy", "John Pittman", "George Colley", "Lisa Yousef", "Lee Graham", "Francis Dugan", "Beatrice Joslin", "Brian Bowen", "David Stevens", "Sam Yazzie", "Amina Culver", "John Pope", "Manuel Poteete", "William Freetage", "James Hampton", "Pat Kriegel", "Carolyn Herman", "Yolanda Holloway", "Dorothy Spencer", "Stephen Unnasch", "Jerry Dalton", "Maria Goins", "Michele Green", "Eleanor Eaton", "Georgia Anderson", "Lisa Gange", "Noemi Kha", "Ernest Agosto", "Craig Mcmurray", "Gil Squires", "Tamiko Luckey", "Megan Leider", "Joseph Garcia", "Latoya Hayes", "Ruth Blackmon", "Brian Rotenberry", "Judy Mcwilliams", "Maria Knight", "Philip Taylor", "Bernadette Araiza", "Helen Milton", "Gary Cole", "Dorothy Prentice", "Kenneth Williams", "Donna Sanford", "Robert Bright", "Albert Dutchess", "Cyrus Bushaw", "Mark Harris", "William Griffith", "Kellie Flick", "Richard Hash", "Agustin Thorson", "Mildred Schlarbaum", "Bonnie Wise", "Julia Simons", "Charley Hicks", "Kathlyn Tucker", "Thomas Ray", "Clarence Weidler", "Quyen Gray", "Clifton Parson", "Greg Flores", "Christine Swan", "Laura Bearden", "Anthony Chafin", "Tracey Creger", "Debra Signs", "Mary Edwards", "Raymond Thompson", "Lauren Roberson", "Linda Emerson", "Suzanne Gilstrap", "Rickey Peters", "Helen Pohl", "Michael Ferrini", "Valorie Johnson", "Randi Tallarico", "Joshua Midden", "Jessie Petrick", "Ashley Powers", "Lonnie Cross", "Tammy Harris", "Kathryn Kappel", "Sharon Saravia", "Michelle Budds", "Cheryl Wooley", "Beatrice Knox", "Mark Neidich", "Laura Odell", "Danny Cyrus", "Jim Williams", "Joel Hodge", "Carolyn Shah", "Jose Schoonmaker", "Laura Smith", "Billye Callahan", "Cheryl Roberts", "Claire Compton", "Willie Carter", "Maria Cacioppo", "Elizabeth Lawson", "Ami Dessecker", "Kenneth Garrett", "Kaitlin Mares", "Emmett Crown", "Marshall Bergevin", "Richard Ramirez", "Marie Bennett", "Darryl Wolff", "Ethel Mckeeman", "Ronald Porter", "Karen Barber", "Brian Richardson", "Derek Crawford", "Aaron Dixion", "Ginger Adams", "Frank Lasala", "Larry Frank", "Thomas Schaich", "Meredith Morales", "Beatrice Black", "Troy Jeffers", "Christopher Morgan", "Juan Williams", "Pauline Wendell", "David Manuel", "Amy Tenorio", "John Martin", "Wayne Kuehn", "Leon Larson", "Francis Reilly", "William Camano", "Linda Schneider", "Margaret Harding", "Raymond Gary", "Larry Sloan", "Brenda Marshall", "Micheal Watson", "Dustin Lyon", "Joel Davis", "Paul Gaut", "Glenna Melvin", "Marian Vega", "Sam Lamarr", "Michael Pruitt", "Katherine Roche", "Robert Ingham", "Michael Welch", "Ronald Dollar", "Kevin Whitaker", "Wade Calzada", "Lana Dodge", "Elvia Hatcher", "Glen Lehr", "Ashley Hendley", "James Burrage", "Jason Munoz", "Robert Christensen", "Claude Livingston", "Lena Brandt", "Joseph Herrington", "Crystal Clifford", "Lucille Rivera", "Donald Mcdermond", "Kerry Young", "Heather Morataya", "Petra Pleasant", "Terrence Garcia", "Mark Garcia", "Antonio Woods", "Lizzie Bartlebaugh", "Brenda Manera", "Thomas Thompson", "Katherine Hisey", "Harry Wolsted", "Jody Place", "Cara Santiago", "John Gimbel", "Monica Beach", "Christopher Sagredo", "Jamie Fuller", "Chadwick Dobson", "Joseph Jones", "Denise Reeder", "Kathleen Wilkins", "Lester Burhans", "Anthony Fagan", "Helen Davis", "Robert Zeches", "Lisa Bequette", "Robert Smith", "Betty Capone", "Johnny Smith"};
        Integer[] ages = new Integer[] { 25, 11, 49, 31, 17, 40, 53, 77, 76, 37, 21, 47, 52, 75, 72, 44, 17, 37, 12, 38, 78, 19, 51, 53, 73, 79, 27, 50, 52, 10, 37, 40, 48, 55, 44, 71, 55, 57, 25, 16, 77, 44, 17, 51, 53, 68, 17, 58, 73, 58, 68, 56, 51, 32, 49, 37, 13, 13, 47, 60, 54, 74, 18, 44, 28, 27, 15, 41, 24, 26, 22, 40, 21, 53, 59, 42, 18, 68, 13, 56, 31, 35, 32, 19, 10, 26, 74, 14, 74, 58, 20, 40, 50, 38, 53, 38, 36, 11, 48, 26, 50, 69, 69, 33, 49, 14, 51, 14, 55, 58, 46, 62, 33, 21, 38, 72, 52, 23, 70, 67, 13, 77, 47, 26, 29, 38, 10, 41, 26, 61, 69, 71, 64, 30, 10, 55, 58, 38, 17, 35, 62, 58, 35, 50, 34, 64, 46, 26, 75, 31, 35, 63, 78, 47, 60, 74, 67, 33, 26, 61, 15, 20, 35, 53, 66, 79, 46, 74, 33, 69, 38, 47, 18, 24, 55, 65, 10, 67, 20, 55, 57, 13, 25, 12, 44, 59, 75, 66, 31, 26, 14, 75, 57, 35, 64, 10, 34, 24, 36, 73, 50, 48, 53, 45, 63, 72, 65, 79, 24, 39, 21, 13, 55, 22, 57, 77, 23, 61, 17, 27, 59, 49, 31, 63, 73, 53, 64, 24, 17, 19, 31, 70, 27, 69, 28, 22, 79, 18, 64, 66, 60, 45, 71, 32, 59, 13, 60, 34, 64, 26, 78, 79, 22, 36, 62, 45, 22, 52, 36, 64, 14, 37, 54, 69, 15, 16, 57, 75, 63, 10, 37, 10, 65, 29, 66, 64, 35, 69, 44, 42, 51, 22, 33, 65, 62, 18, 20, 77, 30, 79, 37, 78, 11, 19, 63, 61, 16, 74, 71, 66, 24, 10, 66, 72, 72, 63, 53, 75, 55, 35, 68, 49, 67, 77, 14, 30, 45, 56, 55, 13, 19, 71, 70, 38, 34, 36, 18, 71, 70, 36, 49, 77, 74, 19, 48, 19, 21, 39, 50, 51, 41, 70, 25, 77, 12, 12, 71, 79, 62, 54, 46, 74, 78, 51, 62, 19, 28, 16, 30, 12, 34, 52, 48, 11, 41, 47, 53, 74, 40, 43, 39, 75, 76, 21, 32, 16, 75, 63, 34, 29, 37, 19, 20, 26, 51, 24, 76, 34, 29, 24, 10, 27, 20, 32, 75, 23, 50, 54, 28, 42, 19, 22, 27, 17, 32, 55, 44, 40, 41, 56, 12, 58, 20, 11, 63, 78, 62, 53, 19, 72, 77, 51, 69, 52, 71, 11, 73, 65, 11, 29, 27, 60, 68, 66, 54, 44, 63, 65, 27, 76, 64, 50, 57, 39, 47, 67, 53, 55, 46, 16, 76, 11, 53, 26, 73, 69, 48, 50, 61, 15, 51, 55, 57, 33, 66, 28, 78, 39, 58, 35, 47, 49, 68, 72, 64, 17, 77, 62, 30, 66, 47, 51, 61, 75, 55, 74, 26, 42, 34, 49, 57, 58, 71, 41, 37, 46, 27, 14, 38, 31, 43, 65, 67, 65, 71, 38, 73, 62, 75, 63, 44, 54, 13, 74, 69, 25, 13, 78, 51, 51, 48, 28, 21, 34, 61, 46, 18, 42, 68, 36, 50, 31, 23, 22, 48, 70, 74, 48, 60, 27, 42, 36, 38, 15, 17, 62, 47, 53, 61, 20, 10, 37, 70, 45, 31, 62, 47, 39, 26, 62, 46, 71, 38, 58, 70, 11, 23, 24, 48, 18, 27, 55, 31, 74, 55, 44, 77, 15, 32, 41, 41, 32, 40, 76, 21, 61, 30, 27, 13, 11, 50, 51, 17, 24, 46, 21, 56, 23, 74, 34, 33, 27, 16, 70, 14, 23, 21, 36, 32, 44, 77, 31, 27, 50, 49, 13, 36, 50, 60, 78, 56, 77, 10, 36, 75, 24, 56, 72, 18, 41, 20, 70, 33, 70, 72, 24, 15, 30, 63, 64, 14, 59, 71, 27, 24, 48, 59, 12, 57, 45, 24, 44, 58, 57, 45, 58, 22, 57, 62, 10, 66, 74, 26, 20, 34, 34, 26, 76, 45, 73, 28, 37, 65, 62, 23, 72, 68, 72, 40, 21, 70, 29, 11, 68, 65, 54, 63, 17, 50, 47, 22, 62, 32, 14, 29, 31, 64, 14, 19, 55, 39, 63, 10, 39, 14, 53, 75, 36, 31, 28, 13, 59, 79, 23, 67, 17, 31, 13, 28, 16, 50, 79, 48, 61, 55, 48, 28, 26, 21, 29, 50, 18, 47, 34, 12, 28, 45, 13, 65, 65, 30, 35, 50, 40, 45, 24, 47, 73, 15, 69, 34, 57, 51, 27, 27, 14, 77, 46, 21, 62, 53, 39, 77, 28, 10, 27, 41, 52, 28, 56, 35, 48, 11, 10, 44, 74, 18, 27, 31, 26, 20, 12, 16, 21, 15, 48, 16, 13, 62, 13, 62, 60, 74, 62, 38, 39, 56, 53, 54, 65, 66, 33, 17, 63, 44, 79, 54, 46, 30, 25, 63, 76, 29, 59, 66, 25, 42, 18, 17, 33, 43, 46, 19, 79, 41, 56, 10, 16, 49, 56, 64, 35, 28, 48, 15, 49, 72, 12, 14, 38, 62, 66, 58, 69, 23, 51, 36, 22, 74, 78, 47, 23, 14, 64, 71, 57, 34, 35, 38, 22, 32, 42, 36, 57, 14, 38, 75, 20, 17, 47, 28, 27, 21, 38, 14, 21, 33, 78, 41, 24, 14, 58, 38, 27, 78, 65, 12, 46, 24, 75, 20, 44, 78, 68, 10, 38, 68, 18, 58, 21, 19, 37, 10, 51, 42, 54, 37, 53, 44, 52, 57, 18, 68, 41, 79, 27, 77, 38, 31, 42, 14, 73, 40, 63, 59, 76, 69, 34, 62, 42, 59, 19, 40, 63, 57, 30, 65, 33, 46, 67, 33, 47, 18, 30, 73, 69, 42, 72, 20, 44, 51, 37, 56, 47, 42, 40, 28, 73, 40, 51, 19, 79, 31, 78, 35, 69, 62, 58, 63, 65, 19, 59, 19, 20, 65, 72, 28, 20, 72, 39, 11, 59, 55, 12, 52, 69, 56, 55, 79, 32, 43, 67, 18, 74, 14, 76, 53, 34, 55, 31 };

        // Create Hash Map with names and ages
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            hashMap.put(names[i], ages[i]);
        }

        // Create total periods of HashTime
        long totalHash = 0;
        // Create total periods of LinkedList
        long totalLinkedList = 0;

        int[] randomIndex = getRandomIndex();

        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < 10; j++) {
                long hashBeginTime = System.nanoTime();
                AgeFromHash(names[randomIndex[j]], hashMap);
                long hashEndTime = System.nanoTime();
                long hashTime = hashEndTime - hashBeginTime;
                totalHash += hashTime;
                System.out.println(hashTime);

                // Create LinkedList with names and ages
                LinkedList linkedList = new LinkedList();
                for (int k = 0; k < names.length; k++) {
                    linkedList.push(names[k], ages[k]);
                }

                long linkedListBeginTime = System.nanoTime();
                AgeFromLinkedList(names[randomIndex[j]], linkedList);
                long linkedListEndTime = System.nanoTime();
                long linkedListTime = linkedListEndTime - linkedListBeginTime;
                totalLinkedList += linkedListTime;
                System.out.println(linkedListTime);
            }
        }
        System.out.println("Hash Average Time: " + totalHash/1000);
        System.out.println("LinkedList Average Time: " + totalLinkedList/1000);
    }
}
