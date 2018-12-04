using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Grades
{
    class Program
    {
        static void Main(string[] args)
        {
            GradeBook book = new GradeBook();
            book.AddGrade(91);
            book.AddGrade(75.9f);
            //this is to illustrate that a new instance of GradeBook 
            //called book overwrites the previous one
            GradeBook book2 = new GradeBook();
            book2.AddGrade(80);
        }
    }
}
