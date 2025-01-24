

        fun main(args : Array<String>)
        {
            var stud = Student()
            println("Student is passed : " + stud.isPassed(45))

            println("Student is scholar : " + stud.isScholar(96))
        }

        fun Student.isScholar(marks: Int) : Boolean //extension function add in Student class using .(dot)
        {
            return marks> 95
        }

        class Student
        {
            fun isPassed(marks : Int) : Boolean
            {
                return marks > 50
            }
        }