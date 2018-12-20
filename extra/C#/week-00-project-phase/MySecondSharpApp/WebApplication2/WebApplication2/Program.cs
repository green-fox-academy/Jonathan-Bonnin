using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore;
using Microsoft.AspNetCore.Hosting;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
using WebApplication2.Context;
using WebApplication2.Models;

namespace WebApplication2
{
    public class Program
    {
        public static void Main(string[] args)
        {
            InsertData();
            CreateWebHostBuilder(args).Build().Run();
        }

        public static IWebHostBuilder CreateWebHostBuilder(string[] args) =>
            WebHost.CreateDefaultBuilder(args)
                .UseStartup<Startup>();

        private static void InsertData()
        {
            using (var context = new MyDbContext())
            {
                // Creates the database if not exists
                context.Database.EnsureCreated();

                //  context.Database.ExecuteSqlCommand("delete from Post");

                // Adds some posts
                //context.Add(new Post("3 people died in France", "https://www.nytimes.com/2018/12/03/world/europe/france-yellow-vest-protests.html", 5));
                //context.Add(new Post("Look at this bear", "https://upload.wikimedia.org/wikipedia/commons/7/79/2010-brown-bear.jpg", 99));
                //context.Add(new Post("Michel", "https://en.wikipedia.org/wiki/Michel_(name)", -42));

                // Saves changes
                context.SaveChanges();
            }
        }
    }

}
