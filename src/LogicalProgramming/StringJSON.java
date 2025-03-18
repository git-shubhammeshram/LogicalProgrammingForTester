package LogicalProgramming;

public class StringJSON {

    public static void userDetails(String name, String age, String email){
        String userDetails = """
                {
                    "name": "%s",
                    "age": %d,
                    "email": "%s"
                }
                
                """.formatted(name, Integer.parseInt(age), email);

        System.out.println(userDetails);

    }


    public static void main(String[] args) {
        String airlinesDetails = """
                {
                    "airlines": [
                        {
                            "name": "Air Canada",
                            "country": "Canada",
                            "rating": 4.8
                        },
                        {
                            "name": "Delta Air Lines",
                            "country": "USA",
                            "rating": 4.7
                        }
                    ]
                }
                
                """;
        System.out.println(airlinesDetails);
        userDetails("John Doe", "25", "johndoe@example.com");




    }
}
