

        fun main(args : Array<String>){  //main function
             var obj = Data()   //obj of Data class
             obj.name = "Shubham"   //initialization
             obj.designation = "Fresher"
             obj.display(obj.name,obj.designation)  //call display fun

        }

         class Data{
             var name : String = " "  //variable declaration
             var designation : String = ""

             fun display(name: String, desi : String){  //function definition
                 println("My name is $name and designation is $desi")
             }
         }