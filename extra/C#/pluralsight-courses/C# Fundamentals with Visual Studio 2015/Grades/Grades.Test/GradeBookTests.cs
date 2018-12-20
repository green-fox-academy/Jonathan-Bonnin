using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Grades.Test
{
    [TestClass]
    public class GradeBookTests
    {
        [TestMethod]
        public void ComputesHighestGrade()
        {
            GradeBook book = new GradeBook();
            book.AddGrade(25);
            book.AddGrade(75);

            GradeStatistics stats = book.ComputeStatistics();

            Assert.AreEqual(75, stats.HighestGrade);
        }

        [TestMethod]
        public void ComputesLowestGrade()
        {
            GradeBook book = new GradeBook();
            book.AddGrade(25);
            book.AddGrade(75);

            GradeStatistics stats = book.ComputeStatistics();

            Assert.AreEqual(25, stats.LowestGrade);
        }

        [TestMethod]
        public void ComputesAverageGrade()
        {
            GradeBook book = new GradeBook();
            book.AddGrade(91);
            book.AddGrade(75);
            book.AddGrade(89.5f);

            GradeStatistics stats = book.ComputeStatistics();

            Assert.AreEqual(85.17, stats.AverageGrade, 0.01);
        }
    }
}
