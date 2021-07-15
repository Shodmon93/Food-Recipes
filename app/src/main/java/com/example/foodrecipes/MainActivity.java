package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> fImage = new ArrayList<>();
    ArrayList<String> fName = new ArrayList<>();
    ArrayList<String> fInfo = new ArrayList<>();
    ArrayList<String> howCook = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getFoodInfo();
        getGalleryInfo();
    }

    private void getFoodInfo() {
        fImage.add(R.drawable.buffalo);
        fName.add("Buffalo Cauliflower Baked Mac and Cheese");
        fInfo.add("This incredible and substantial side dish has traditional Buffalo wing flavor," +
                "but without any meat. Serve with extra hot sauce on the side for your friends and" +
                "family who love heat.");

        fImage.add(R.drawable.baconegg);
        fName.add("Bacon, Egg and Cheese Breakfast Burgers");
        fInfo.add("Combine a great burger with a beloved breakfast combo" +
                "(bacon, egg and cheese)and you've got the ultimate comfort food.");

        fImage.add(R.drawable.creamyspinach);
        fName.add("Creamy Spinach and Artichoke Chicken Skillet");
        fInfo.add("When your family's favorite hot appetizer meets weeknight convenience," +
                "everyone wins. This creamy dish is quick and easy — and it even sneaks in a good serving of vegetables.");

        fImage.add(R.drawable.garliccheese);
        fName.add("Garlic Cheese Bread Sticks");
        fInfo.add("You’ll want to melt right into this cheesy flatbread — with its crispy edges, toasted top and soft, buttery center. Yum!");

        fImage.add(R.drawable.reedrummond);
        fName.add("Ree Drummond's Meatloaf");
        fInfo.add("Ree avoids the dried-out meatloaf that everyone dreads by combining her ground" +
                "beef with bread soaked in milk. Topping the loaf with layers of thin-cut bacon also ensures flavorful, decadent results");

        fImage.add(R.drawable.scallopedpotatoes);
        fName.add("Scalloped Potatoes");
        fInfo.add("For the most-comforting side dish ever, layer some sliced" +
                "potatoes, butter and half-and-half — with a hint of nutmeg for warmth — and bake until bubbling and golden brown.");

        fImage.add(R.drawable.southernfried);
        fName.add("Southern Fried Chicken Parmesan");
        fInfo.add("Crispy, indulgent Southern fried chicken meets the cheesy goodness of chicken" +
                "Parm in this recipe. Use your favorite jarred marinara sauce to save on time.");

        fImage.add(R.drawable.chickennoodle);
        fName.add("Chicken Noodle Soup");
        fInfo.add("We chose to use chicken leg quarters rather than a whole chicken to make this" +
                "well-loved soup. It shortens the cooking time without sacrificing any flavor, and" +
                "the dark meat adds extra depth. Simple, comforting and satisfying.");

        fImage.add(R.drawable.spinachandartichoke);
        fName.add("Spinach and Artichoke Stuffed Shells");
        fInfo.add("Combine your favorite spinach and artichoke dip with creamy pasta shells and" +
                "you'll forget all about the dippers; you'll be in cheesy, gooey heaven.");

        fImage.add(R.drawable.chickenandherb);
        fName.add("Chicken and Herb Dumplings");
        fInfo.add("Savory chicken and fluffy herb dumplings will keep you feeling warm, cozy and satisfied on any cold day.");

        fImage.add(R.drawable.texmexchicken);
        fName.add("Tex-Mex Chicken Parmesan");
        fInfo.add("We swapped out all the classic Italian ingredients for tortilla chips, spicy" +
                "cheese and salsa in this Tex-Mex twist. But if you truly miss the Parmesan in your" +
                "Parmesan, then add a sprinkle or two to the finished dish.");

        fImage.add(R.drawable.spaghettisquash);
        fName.add("Spaghetti Squash Carbonara");
        fInfo.add("Tell pasta you need a break. Spaghetti squash is a delicious change, and it's" +
                "perfect in this pancetta-and-egg-enriched cream sauce.");

        fImage.add(R.drawable.shrimpfettuccine);
        fName.add("Shrimp Fettuccine Alfredo");
        fInfo.add("This take on a classic Italian-American recipe is super-easy to make. Slightly" +
                "reducing the cream and adding a hefty dose of cheese means you don't have to use flour to thicken the sauce.");

        fImage.add(R.drawable.chickenenchiladas);
        fName.add("Chicken Enchiladas");
        fInfo.add("These super-convenient enchiladas are all about layering: Start by pouring your" +
                "favorite jarred salsa in the bottom of your baking dish. Line up your rolled tortillas before piling on more salsa and cheese.");

        fImage.add(R.drawable.chickenwithmustard);
        fName.add("Chicken with Mustard Mascarpone Marsala Sauce");
        fInfo.add("Top fettuccine with juicy chicken breasts and hearty cremini mushrooms cooked in" +
                "Giada's mascarpone-mustard sauce. Giada's advice: Use dry Marsala wine to add a little sweetness that's not overpowering.");

        getInfo();
    }

    private void getInfo() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        FoodAdapter adapter = new FoodAdapter(fImage, fName, fInfo,howCook,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getGalleryInfo() {

        //Buffalo Cauliflower Baked Mac and Cheese
        howCook.add("7 tablespoons unsalted butter, plus more for the dish\n" +
                "Kosher salt\n" +
                "1 medium head cauliflower, cut into florets (about 4 cups)\n" +
                "1 pound elbow macaroni\n" +
                "2 stalks celery, finely chopped\n" +
                "1 small onion, finely chopped\n" +
                "2 cloves garlic, minced\n" +
                "3/4 cup hot sauce, plus more for serving, preferably Frank's RedHot\n" +
                "2 tablespoons all-purpose flour\n" +
                "2 teaspoons dry mustard\n" +
                "2 1/2 cups half-and-half\n" +
                "1 pound sharp yellow Cheddar, cut into 1/2-inch cubes (about 3 1/2 cups)\n" +
                "8 ounces pepper jack cheese, shredded (about 2 cups)\n" +
                "2/3 cup sour cream\n" +
                "1 cup panko \n" +
                "1/2 cup crumbled blue cheese\n" +
                "2 tablespoons chopped fresh parsley\n");

        //Bacon, Egg and Cheese Breakfast Burgers
        howCook.add("1 1/2 pounds 80/20 ground beef\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "8 slices bacon\n" +
                "4 slices Cheddar or American cheese\n" +
                "4 soft hamburger buns, split\n" +
                "4 tablespoons unsalted butter, melted\n" +
                "4 large eggs\n" +
                "1/3 cup spicy ketchup\n");

        //Creamy Spinach and Artichoke Chicken Skillet
        howCook.add("1/4 cup all-purpose flour\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "Four 6-ounce boneless, skinless chicken breasts \n" +
                "4 tablespoons vegetable oil\n" +
                "1 small onion, chopped\n" +
                "2 cloves garlic, minced\n" +
                "4 ounces cream cheese, cut into chunks\n" +
                "1 cup half-and-half\n" +
                "One 5-ounce package baby spinach (about 4 cups)\n" +
                "One 14-ounce can artichoke hearts, drained and quartered\n" +
                "Steamed rice, for serving\n");

        //Garlic Cheese Bread Sticks
        howCook.add("1 stick butter\n" +
                "3 cloves garlic, minced \n" +
                "1 loaf French bread, cut in half lengthways \n" +
                "Two 6-ounce balls fresh mozzarella, sliced \n" +
                "1 tablespoon chopped fresh flat-leaf parsley\n");

        //Ree Drummond's Meatloaf
        howCook.add("1 cup milk\n" +
                "6 bread slices\n" +
                "2 pounds ground beef\n" +
                "1 cup grated Parmesan\n" +
                "1 teaspoon salt\n" +
                "Freshly ground black pepper\n" +
                "1/4 teaspoon seasoned salt, such as Lawry's\n" +
                "1/4 to 1/2 cup minced flat-leaf parsley\n" +
                "4 eggs, beaten\n" +
                "8 to 12 thin bacon slices\n" +
                "Tomato Sauce:\n" +
                "1/2 cup ketchup\n" +
                "6 tablespoons brown sugar\n" +
                "1 teaspoon dry mustard\n" +
                "Dash or 2 hot sauce (more if you like)\n" +
                "Dash or 2 Worcestershire sauce\n");

        //Scalloped Potatoes
        howCook.add("1 clove garlic, smashed\n" +
                "2 tablespoons unsalted butter\n" +
                "2 1/4 pounds Yellow Finn potatoes or other waxy-style potato\n" +
                "2 cups half-and-half\n" +
                "1 tablespoon kosher salt\n" +
                "Freshly ground black pepper\n" +
                "Pinch nutmeg\n");

        //Southern Fried Chicken Parmesan
        howCook.add("2 cups buttermilk\n" +
                "1 teaspoon crushed red pepper flakes\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "8 bone-in, skin-on chicken thighs (about 3 pounds)\n" +
                "Vegetable oil, for frying\n" +
                "3 cups all-purpose flour\n" +
                "1 teaspoon Italian seasoning\n" +
                "One 32-ounce jar marinara\n" +
                "One 8-ounce piece part-skim mozzarella, sliced into 8 thick slices\n" +
                "2 tablespoons grated Parmesan, plus more for garnish\n" +
                "8 ounces spaghetti\n" +
                "8 fresh basil leaves\n" +
                "\n");

        //Chicken Noodle Soup
        howCook.add("5 medium carrots, peeled\n" +
                "5 large stalks celery, trimmed  \n" +
                "1 large yellow onion, peeled and halved  \n" +
                "3 pounds chicken leg quarters (about 4 legs) \n" +
                "10 whole black peppercorns \n" +
                "2 sprigs rosemary \n" +
                "2 sprigs thyme \n" +
                "1 bay leaf \n" +
                "4 sprigs flat-leaf parsley \n" +
                "Kosher salt and freshly ground black pepper \n");

        //Spinach and Artichoke Stuffed Shells
        howCook.add("24 jumbo pasta shells (about 12 ounces)\n" +
                "10 ounces frozen chopped spinach, thawed, drained and squeezed dry \n" +
                "One 14-ounce can artichoke hearts, drained and roughly chopped\n" +
                "1 cup whole milk ricotta \n" +
                "8 ounces cream cheese, at room temperature\n" +
                "2/3 cup grated Parmesan\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "1 cup half-and-half\n" +
                "1 cup shredded mozzarella\n" +
                "2 tablespoons olive oil\n" +
                "1/3 cup panko \n" +
                "1/4 cup chopped fresh Italian parsley, optional\n");

        //Chicken and Herb Dumplings
        howCook.add("7 tablespoons cold unsalted butter\n" +
                "2 carrots, chopped\n" +
                "2 stalks celery, chopped\n" +
                "1 parsnip, peeled and chopped\n" +
                "1 bay leaf\n" +
                "Kosher salt and freshly ground pepper\n" +
                "1 1/2 cups plus 3 tablespoons all-purpose flour\n" +
                "4 cups low-sodium chicken broth\n" +
                "2 teaspoons baking powder\n" +
                "2/3 cup cold buttermilk\n" +
                "1 tablespoon chopped fresh dill, plus more for topping\n" +
                "1 tablespoon chopped fresh chives, plus more for topping\n" +
                "2 cups shredded rotisserie chicken, skin removed\n");

        //Tex-Mex Chicken Parmesan
        howCook.add("4 cups tortilla chips\n" +
                "Two 8-ounce boneless, skinless chicken breasts\n" +
                "1 cup all-purpose flour\n" +
                "1/4 teaspoon chili powder\n" +
                "Kosher salt\n" +
                "3 large eggs\n" +
                "1/2 cup canola oil\n" +
                "One 15-ounce jar chunky salsa \n" +
                "One 8-ounce package pepper jack cheese, cut into 1/4-inch-thick slices\n" +
                "1 jalapeno, thinly sliced (seeds removed for less heat)\n" +
                "2 tablespoons chopped fresh cilantro leaves\n");

        //Spaghetti Squash Carbonara
        howCook.add("2 large spaghetti squash (2 1/2 pounds each)\n" +
                "3/4 cup grated Parmesan, plus more for serving, optional\n" +
                "1 large egg yolk\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "4 ounces pancetta, cut into 1/4-inch cubes\n" +
                "1 small clove garlic, minced\n" +
                "1/4 teaspoon crushed red pepper flakes\n" +
                "1/3 cup heavy cream\n" +
                "1/4 cup flat-leaf parsley leaves, chopped\n");

        //Shrimp Fettuccine Alfredo
        howCook.add("Kosher salt\n" +
                "12 ounces fettuccine\n" +
                "Olive oil, for tossing\n" +
                "3/4 pound large shrimp (about 16), peeled and deveined, tails removed\n" +
                "Freshly ground black pepper\n" +
                "1 stick (8 tablespoons) unsalted butter\n" +
                "2 cups heavy cream\n" +
                "2 pinches freshly grated nutmeg\n" +
                "1 1/2 cups freshly grated Parmigiano-Reggiano cheese\n");

        //Chicken Enchiladas
        howCook.add("One 15-ounce can refried beans (about 1 cup)\n" +
                "1/2 teaspoon dried oregano\n" +
                "12 ounces (3 cups) shredded Monterey Jack cheese \n" +
                "1/2 rotisserie chicken, meat shredded (about 2 1/4 cups), bones and skin discarded \n" +
                "Freshly ground black pepper\n" +
                "One 16-ounce jar medium-spicy tomato salsa\n" +
                "Twelve 6-inch corn tortillas\n");

        //Chicken with Mustard Mascarpone Marsala Sauce
        howCook.add("1 1/2 pounds boneless skinless chicken breasts, each breast cut crosswise into 3 pieces\n" +
                "Salt and freshly ground black pepper\n" +
                "2 tablespoons olive oil\n" +
                "5 tablespoons butter, divided\n" +
                "3/4 cup chopped onion\n" +
                "1 pound cremini mushrooms, sliced\n" +
                "2 tablespoons minced garlic\n" +
                "1 cup dry Marsala wine\n" +
                "1 cup (8 ounces) mascarpone cheese\n" +
                "2 tablespoons Dijon mustard\n" +
                "2 tablespoons chopped fresh Italian parsley leaves, plus whole sprigs, for garnish\n" +
                "12 ounces dried fettuccine\n");

    }
}