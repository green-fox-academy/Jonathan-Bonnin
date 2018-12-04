using System;
using System.Speech.Synthesis;
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
            SpeechSynthesizer synth = new SpeechSynthesizer();

            synth.Speak("Sur le Pont d'Avignon L'on y danse, l'on y danse Sur le Pont d'Avignon L'on y danse tous en rond");

            GradeBook book = new GradeBook();
            book.AddGrade(91);
            book.AddGrade(75.9f);
            book.AddGrade(84);

            GradeStatistics stats = book.ComputeStatistics();
            Console.WriteLine(stats.AverageGrade);
            Console.WriteLine(stats.LowestGrade);
            Console.WriteLine(stats.HighestGrade);
            Console.ReadLine();
        }
    }
}
