using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication2.Models
{
    
    public class Post
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public string Url { get; set; }
        public int Score { get; set; }

        public Post()
        {

        }

        public Post(string title, string url, int score)
        {
            Title = title;
            Url = url;
            Score = score;
        }
    }
}
