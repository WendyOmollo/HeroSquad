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

            get("/",(req,res)->{
            Map<String, Object> model = new HashMap<>();
                ArrayList<Hero> heroes = Hero.getAll();
                model.put("heroes",heroes);
                return new ModelAndView(model,"index.hbs");
            },new HandlebarsTemplateEngine());
        }
    }
