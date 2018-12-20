using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MyFirstSharpApp.Controllers
{
    [Route("/")]
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            ViewBag.Title = "Robert";

            return View();
        }
        [Route("123")]
        public ActionResult Michel()
        {
            return View();
        }
    }

}
