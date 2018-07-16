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

    }
}


