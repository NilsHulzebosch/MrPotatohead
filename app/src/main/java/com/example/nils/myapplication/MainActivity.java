package com.example.nils.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.view.View;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    // var for the random function
    public static boolean randomIsRunning = false;

    // all images
    private ImageView img_arms;
    private ImageView img_ears;
    private ImageView img_eyebrows;
    private ImageView img_eyes;
    private ImageView img_glasses;
    private ImageView img_hat;
    private ImageView img_mouth;
    private ImageView img_mustache;
    private ImageView img_nose;
    private ImageView img_shoes;

    // all checkboxes
    private CheckBox check_arms;
    private CheckBox check_ears;
    private CheckBox check_eyebrows;
    private CheckBox check_eyes;
    private CheckBox check_glasses;
    private CheckBox check_hat;
    private CheckBox check_mouth;
    private CheckBox check_mustache;
    private CheckBox check_nose;
    private CheckBox check_shoes;

    public void initializeImages() {
        img_arms = (ImageView) findViewById(R.id.image_arms);
        img_ears = (ImageView) findViewById(R.id.image_ears);
        img_eyebrows = (ImageView) findViewById(R.id.image_eyebrows);
        img_ears = (ImageView) findViewById(R.id.image_ears);
        img_eyebrows = (ImageView) findViewById(R.id.image_eyebrows);
        img_eyes = (ImageView) findViewById(R.id.image_eyes);
        img_glasses = (ImageView) findViewById(R.id.image_glasses);
        img_hat = (ImageView) findViewById(R.id.image_hat);
        img_mouth = (ImageView) findViewById(R.id.image_mouth);
        img_mustache = (ImageView) findViewById(R.id.image_mustache);
        img_nose = (ImageView) findViewById(R.id.image_nose);
        img_shoes = (ImageView) findViewById(R.id.image_shoes);
    }

    public void initializeCheckboxes() {
        check_arms = (CheckBox) findViewById(R.id.checkbox_arms);
        check_ears = (CheckBox) findViewById(R.id.checkbox_ears);
        check_eyebrows = (CheckBox) findViewById(R.id.checkbox_eyebrows);
        check_eyes = (CheckBox) findViewById(R.id.checkbox_eyes);
        check_glasses = (CheckBox) findViewById(R.id.checkbox_glasses);
        check_hat = (CheckBox) findViewById(R.id.checkbox_hat);
        check_mouth = (CheckBox) findViewById(R.id.checkbox_mouth);
        check_mustache = (CheckBox) findViewById(R.id.checkbox_mustache);
        check_nose = (CheckBox) findViewById(R.id.checkbox_nose);
        check_shoes = (CheckBox) findViewById(R.id.checkbox_shoes);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the variables for images and checkboxes
        initializeImages();
        initializeCheckboxes();

        /* Check whether there is a saved instance state (from rotation).
         * If this is not the case, proceed.
         * If this is the case, check all booleans and whenever a boolean is true,
         * set image to visible and checkbox to checked to recover old state.
         */
        if (savedInstanceState != null) {

            if (savedInstanceState.getBoolean("arms")) {
                img_arms.setVisibility(View.VISIBLE); // set image to visible
                check_arms.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("ears")) {
                img_ears.setVisibility(View.VISIBLE); // set image to visible
                check_ears.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("eyebrows")) {
                img_eyebrows.setVisibility(View.VISIBLE); // set image to visible
                check_eyebrows.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("eyes")) {
                img_eyes.setVisibility(View.VISIBLE); // set image to visible
                check_eyes.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("glasses")) {
                img_glasses.setVisibility(View.VISIBLE); // set image to visible
                check_glasses.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("hat")) {
                img_hat.setVisibility(View.VISIBLE); // set image to visible
                check_hat.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("mouth")) {
                img_mouth.setVisibility(View.VISIBLE); // set image to visible
                check_mouth.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("mustache")) {
                img_mustache.setVisibility(View.VISIBLE); // set image to visible
                check_mustache.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("nose")) {
                img_nose.setVisibility(View.VISIBLE); // set image to visible
                check_nose.setChecked(true); // set checkbox to checked
            }

            if (savedInstanceState.getBoolean("shoes")) {
                img_shoes.setVisibility(View.VISIBLE); // set image to visible
                check_shoes.setChecked(true); // set checkbox to checked
            }
        }
    }

    @Override
    // this method saves the state of the checkboxes (& thus images) using booleans
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean("arms", check_arms.isChecked());
        outState.putBoolean("ears", check_ears.isChecked());
        outState.putBoolean("eyebrows", check_eyebrows.isChecked());
        outState.putBoolean("eyes", check_eyes.isChecked());
        outState.putBoolean("glasses", check_glasses.isChecked());
        outState.putBoolean("hat", check_hat.isChecked());
        outState.putBoolean("mouth", check_mouth.isChecked());
        outState.putBoolean("mustache", check_mustache.isChecked());
        outState.putBoolean("nose", check_nose.isChecked());
        outState.putBoolean("shoes", check_shoes.isChecked());

        super.onSaveInstanceState(outState); // save the outState Bundle
    }

    // This method toggles the images whenever a checkbox is (un)checked.
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        ImageView image = (ImageView) findViewById(R.id.image_body);
        int id = view.getId();

        // Check which checkbox was clicked
        if (id == R.id.checkbox_arms) {
            image = img_arms;
        } else if (id == R.id.checkbox_ears) {
            image = img_ears;
        } else if (id == R.id.checkbox_eyebrows) {
            image = img_eyebrows;
        } else if (id == R.id.checkbox_glasses) {
            image = img_glasses;
        } else if (id == R.id.checkbox_hat) {
            image = img_hat;
        } else if (id == R.id.checkbox_mouth) {
            image = img_mouth;
        } else if (id == R.id.checkbox_mustache) {
            image = img_mustache;
        } else if (id == R.id.checkbox_nose) {
            image = img_nose;
        } else if (id == R.id.checkbox_eyes) {
            image = img_eyes;
        } else if (id == R.id.checkbox_shoes) {
            image = img_shoes;
        }

        if (checked) {
            image.setVisibility(View.VISIBLE); // set image to visible
        } else {
            image.setVisibility(View.INVISIBLE); // set image to invisible
        }
    }

    // when the user clicks "clear", this method resets all checkboxes and images
    public void onClearButtonClicked(View view) {
        if(!randomIsRunning) {
            resetImages(); // make invisible
            resetCheckboxes(); // make unchecked
        }
    }

    /* This method shows a random animation and then chooses a random outfit configuration.
     * Only works if the random process is done (you can't click while it's still busy,
     * but you can after a configuration has been chosen).
     * */
    public void onRandomButtonClicked(View view) {
        if(!randomIsRunning) {
            randomIsRunning = true;

            resetImages(); // set the current images to invisible
            resetCheckboxes(); // set the current checkboxes to unchecked

            int random = (int) (Math.random() * 6); // take random variable between 0 and 6

            // this chooses the final configuration, after 2901 milliseconds
            Handler h = new Handler();
            h.postDelayed(image_for_final_config, 2901);

            randomAnimation(); // this makes the animation, during 2850 milliseconds
        }
    }

    // sets the current images to invisible
    Runnable reset_images = new Runnable() {
        @Override
        public void run(){
            resetImages();
        }
    };

    // calls randomImageForAnimation() at least 3 and with a maximum of 8 times
    Runnable image_for_animation = new Runnable() {
        @Override
        public void run(){
            int random = (int) (Math.random() * 6);
            for (int i = 0; i < 3 + random; i++) {
                randomImageForAnimation();
            }
        }
    };

    // calls randomImage() at least 3 and with a maximum of 6 times
    Runnable image_for_final_config = new Runnable() {
        @Override
        public void run(){
            int random = (int) (Math.random() * 6);
            for (int i = 0; i < 3 + random; i++) {
                randomImage();
            }

            randomIsRunning = false; // set to false to you can press again
        }
    };

    /* This method creates the random animation. A Handler is used for the delay.
     * Periodically, an few random images are made visible and later invisible.
     * The time of visibility increases to get the effect of 'slowing down the process'
     * so final choice will be made.
     */
    public void randomAnimation() {
        Handler h = new Handler();
        h.postDelayed(image_for_animation, 0);
        h.postDelayed(reset_images, 100);
        h.postDelayed(image_for_animation, 101);
        h.postDelayed(reset_images, 200);
        h.postDelayed(image_for_animation, 201);
        h.postDelayed(reset_images, 400);
        h.postDelayed(image_for_animation, 401);
        h.postDelayed(reset_images, 700);
        h.postDelayed(image_for_animation, 701);
        h.postDelayed(reset_images, 1100);
        h.postDelayed(image_for_animation, 1101);
        h.postDelayed(reset_images, 1600);
        h.postDelayed(image_for_animation, 1601);
        h.postDelayed(reset_images, 2200);
        h.postDelayed(image_for_animation, 2201);
        h.postDelayed(reset_images, 2850);
    }

    /* This method is used for the animation during the random event.
     * A random image is shown. Note that the checkboxes are not selected.
     * During the animation we only want to show images periodically.
     * Each body part has roughly the same chance of being picked.
     */
    public void randomImageForAnimation() {
        ImageView image = (ImageView) findViewById(R.id.image_mustache); // backup

        int random = (int) (Math.random() * 10); // take random var between 0 and 10

        if (random == 0) { image = (ImageView) findViewById(R.id.image_eyes);
        } else if (random == 1) { image = (ImageView) findViewById(R.id.image_shoes);
        } else if (random == 2) { image = (ImageView) findViewById(R.id.image_arms);
        } else if (random == 3) { image = (ImageView) findViewById(R.id.image_ears);
        } else if (random == 4) { image = (ImageView) findViewById(R.id.image_eyebrows);
        } else if (random == 5) { image = (ImageView) findViewById(R.id.image_glasses);
        } else if (random == 6) { image = (ImageView) findViewById(R.id.image_hat);
        } else if (random == 7) { image = (ImageView) findViewById(R.id.image_mouth);
        } else if (random == 8) { image = (ImageView) findViewById(R.id.image_mustache);
        } else if (random == 9) { image = (ImageView) findViewById(R.id.image_nose);
        }

        image.setVisibility(View.VISIBLE); // set image to visible
    }

    /* This method is used for choosing the final configuration after an animation.
     * Note that the checkboxes are being selected.
     * Each body part has roughly the same chance of being picked.
     */
    public void randomImage() {
        ImageView image = (ImageView) findViewById(R.id.image_mustache); // backup
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkbox_mustache); // backup

        int random = (int) (Math.random() * 10); // take random var between 0 and 10

        if (random == 0) { image = img_eyes; checkbox = check_eyes;
        } else if (random == 1) { image = img_shoes; checkbox = check_shoes;
        } else if (random == 2) { image = img_arms; checkbox = check_arms;
        } else if (random == 3) { image = img_ears; checkbox = check_ears;
        } else if (random == 4) { image = img_eyebrows; checkbox = check_eyebrows;
        } else if (random == 5) { image = img_glasses; checkbox = check_glasses;
        } else if (random == 6) { image = img_hat; checkbox = check_hat;
        } else if (random == 7) { image = img_mouth; checkbox = check_mouth;
        } else if (random == 8) { image = img_mustache; checkbox = check_mustache;
        } else if (random == 9) { image = img_nose; checkbox = check_nose;
        }

        image.setVisibility(View.VISIBLE); // set image to visible
        checkbox.setChecked(true); // set checkbox to checked
    }

    // this method set all checkboxes to unchecked
    public void resetCheckboxes() {
        if (check_arms.isChecked()) { check_arms.setChecked(false); }
        if (check_ears.isChecked()) { check_ears.setChecked(false); }
        if (check_eyebrows.isChecked()) { check_eyebrows.setChecked(false); }
        if (check_eyes.isChecked()) { check_eyes.setChecked(false); }
        if (check_glasses.isChecked()) { check_glasses.setChecked(false); }
        if (check_hat.isChecked()) { check_hat.setChecked(false); }
        if (check_mouth.isChecked()) { check_mouth.setChecked(false); }
        if (check_mustache.isChecked()) { check_mustache.setChecked(false); }
        if (check_nose.isChecked()) { check_nose.setChecked(false); }
        if (check_shoes.isChecked()) { check_shoes.setChecked(false); }
    }

    // this method sets all images to invisible
    public void resetImages() {
        img_arms.setVisibility(View.INVISIBLE);
        img_ears.setVisibility(View.INVISIBLE);
        img_eyebrows.setVisibility(View.INVISIBLE);
        img_eyes.setVisibility(View.INVISIBLE);
        img_glasses.setVisibility(View.INVISIBLE);
        img_hat.setVisibility(View.INVISIBLE);
        img_mouth.setVisibility(View.INVISIBLE);
        img_mustache.setVisibility(View.INVISIBLE);
        img_nose.setVisibility(View.INVISIBLE);
        img_shoes.setVisibility(View.INVISIBLE);
    }
}
