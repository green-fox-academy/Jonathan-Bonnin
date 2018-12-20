using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using WebApplication2.Context;
using WebApplication2.Models;

namespace WebApplication2.Controllers
{
    public class RedditController : Controller
    {
        MyDbContext MyNewContext;

        public RedditController(MyDbContext context)
        {
            MyNewContext = context;
        }
        // GET: Reddit
        public ActionResult Index()
        {
            List<Post> posts = MyNewContext.Post.ToList();
            return View(posts);
        }

        // GET: Reddit/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: Reddit/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Reddit/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Post post)
        {
            try
            {
                // TODO: Add insert logic here
                MyNewContext.Post.Add(post);
                MyNewContext.SaveChanges();
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: Reddit/Edit/5
        public ActionResult Edit(int id)
        {
            //find post with id of id 
            return View(MyNewContext.Find<Post>(id));
        }

        // POST: Reddit/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(Post post)
        {
            try
            {

                MyNewContext.Post.Update(post);
                MyNewContext.SaveChanges();
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: Reddit/Delete/5
        public ActionResult Delete(int id)
        {
            return View(MyNewContext.Find<Post>(id));
        }

        // POST: Reddit/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            try
            {
                // TODO: Add delete logic here
                MyNewContext.Remove(MyNewContext.Find<Post>(id));
                MyNewContext.SaveChanges();
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: Reddit/PlusOne/5
        public ActionResult PlusOne(int id)
        {
            ChangeScore(1, MyNewContext.Find<Post>(id));
            return RedirectToAction(nameof(Index));
        }

        // GET: Reddit/MinusOne/5
        public ActionResult MinusOne(int id)
        {
            ChangeScore(-1, MyNewContext.Find<Post>(id));
            return RedirectToAction(nameof(Index));
        }

        private void ChangeScore(int change, Post postToChange)
        {
            postToChange.Score = postToChange.Score + change;
            MyNewContext.Post.Update(postToChange);
            MyNewContext.SaveChanges();
        }

        // GET: Reddit/Sort
        public ActionResult Sort(int quantity, string sorting)
        {
                        MyNewContext.Post.OrderByDescending(p => p.Score);
            MyNewContext.SaveChanges();

            return RedirectToAction(nameof(Index));
        }

        //just trying getting a JSON
        public Post ShowPost()
        {
            return new Post("Michel", "https://en.wikipedia.org/wiki/Michel_(name)", -42);
        }
    }
}