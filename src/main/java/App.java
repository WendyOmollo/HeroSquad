import models.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

    public class App {
        public static void main(String[] args) {
            staticFileLocation("/public");
//displays the landing page
            get("/",(req,res)->{
            Map<String, Object> model = new HashMap<>();
                ArrayList<Hero> heroes = Hero.getAll();
                model.put("heroes",heroes);
                return new ModelAndView(model,"index.hbs");
            },new HandlebarsTemplateEngine());
//gets the form for adding a hero
            get("/form",(request,response) ->{
                Map<String, Object>model = new HashMap<String,Object>();
                return new ModelAndView(model,"hero-form.hbs");
            },new HandlebarsTemplateEngine());

//gets the input from the user
            get("/",(request,res)->{
                Map<String, Object> model = new HashMap<>();
                String heroName = request.queryParams("heroName");
                String heroAge = request.queryParams("heroAge");
                String heroStrength = request.queryParams("heroStrength");
                String heroWeakness = request.queryParams("heroWeakness");
                model.put("heroName",heroName);
                model.put("heroAge",heroAge);
                model.put("heroStrength",heroStrength);
                model.put("heroWeakness",heroWeakness);
                return new ModelAndView(model,"index.hbs");
            },new HandlebarsTemplateEngine());

            post("/hero-card",(req,res)->{
                Map<String, Object> model = new HashMap<>();
                ArrayList<Hero> heroes = Hero.getAll();
                model.put("heroes",heroes);
                return new ModelAndView(model,"index.hbs");
            },new HandlebarsTemplateEngine());

            get("/formSquad",(request,response) ->{
                Map<String, Object>model = new HashMap<String,Object>();
                return new ModelAndView(model,"squad-form.hbs");
            },new HandlebarsTemplateEngine());


        }
    }
