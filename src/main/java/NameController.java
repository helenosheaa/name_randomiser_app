import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class NameController {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

//        staticFileLocation("/public");

        get("/one", (req, res) -> {

            Name name = new Name();
            String result = name.randomName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", result);
            return new ModelAndView(model, "name.vtl");
        }, velocityTemplateEngine);


        get("/two", (req, res) -> {

            Name name = new Name();
            ArrayList<String> result = name.twoRandomNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", result);
            return new ModelAndView(model, "twonames.vtl");
        }, velocityTemplateEngine);

        get("/three", (req, res) -> {

            Name name = new Name();
            ArrayList<String> result = name.threeRandomNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", result);
            return new ModelAndView(model, "threenames.vtl");
        }, velocityTemplateEngine);

        get("/four", (req, res) -> {

            Name name = new Name();
            ArrayList<String> result = name.fourRandomNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", result);
            return new ModelAndView(model, "fournames.vtl");
        }, velocityTemplateEngine);

    }
}


