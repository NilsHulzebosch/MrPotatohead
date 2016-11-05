package com.example.nils.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.os.SystemClock;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            // then the application is being reloaded
            // recover the old state of images / checkboxes

            ImageView image;
            CheckBox checkbox;

            Boolean arms = savedInstanceState.getBoolean("arms");
            if (arms) {
                image = (ImageView) findViewById(R.id.image_arms);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_arms);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean ears = savedInstanceState.getBoolean("ears");
            if (ears) {
                image = (ImageView) findViewById(R.id.image_ears);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_ears);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean eyebrows = savedInstanceState.getBoolean("eyebrows");
            if (eyebrows) {
                image = (ImageView) findViewById(R.id.image_eyebrows);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_eyebrows);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean eyes = savedInstanceState.getBoolean("eyes");
            if (eyes) {
                image = (ImageView) findViewById(R.id.image_eyes);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_eyes);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean glasses = savedInstanceState.getBoolean("glasses");
            if (glasses) {
                image = (ImageView) findViewById(R.id.image_glasses);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_glasses);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean hat = savedInstanceState.getBoolean("hat");
            if (hat) {
                image = (ImageView) findViewById(R.id.image_hat);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_hat);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean mouth = savedInstanceState.getBoolean("mouth");
            if (mouth) {
                image = (ImageView) findViewById(R.id.image_mouth);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_mouth);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean mustache = savedInstanceState.getBoolean("mustache");
            if (mustache) {
                image = (ImageView) findViewById(R.id.image_mustache);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_mustache);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean nose = savedInstanceState.getBoolean("nose");
            if (nose) {
                image = (ImageView) findViewById(R.id.image_nose);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_nose);
                checkbox.setChecked(true); // set checkbox to checked
            }

            Boolean shoes = savedInstanceState.getBoolean("shoes");
            if (shoes) {
                image = (ImageView) findViewById(R.id.image_shoes);
                image.setVisibility(View.VISIBLE); // set image to visible
                checkbox = (CheckBox) findViewById(R.id.checkbox_shoes);
                checkbox.setChecked(true); // set checkbox to checked
            }
        }
    }

    @Override
    // this method saves the state of the checkboxes (& thus images)
    public void onSaveInstanceState(Bundle outState) {

        // add all booleans to the outState
        CheckBox arms = (CheckBox) findViewById(R.id.checkbox_arms);
        outState.putBoolean("arms", arms.isChecked());
        CheckBox ears = (CheckBox) findViewById(R.id.checkbox_ears);
        outState.putBoolean("ears", ears.isChecked());
        CheckBox eyebrows = (CheckBox) findViewById(R.id.checkbox_eyebrows);
        outState.putBoolean("eyebrows", eyebrows.isChecked());
        CheckBox eyes = (CheckBox) findViewById(R.id.checkbox_eyes);
        outState.putBoolean("eyes", eyes.isChecked());
        CheckBox glasses = (CheckBox) findViewById(R.id.checkbox_glasses);
        outState.putBoolean("glasses", glasses.isChecked());
        CheckBox hat = (CheckBox) findViewById(R.id.checkbox_hat);
        outState.putBoolean("hat", hat.isChecked());
        CheckBox mouth = (CheckBox) findViewById(R.id.checkbox_mouth);
        outState.putBoolean("mouth", mouth.isChecked());
        CheckBox mustache = (CheckBox) findViewById(R.id.checkbox_mustache);
        outState.putBoolean("mustache", mustache.isChecked());
        CheckBox nose = (CheckBox) findViewById(R.id.checkbox_nose);
        outState.putBoolean("nose", nose.isChecked());
        CheckBox shoes = (CheckBox) findViewById(R.id.checkbox_shoes);
        outState.putBoolean("shoes", shoes.isChecked());

        super.onSaveInstanceState(outState); // save the outstate bundle
    }

    // This method toggles the images whenever a checkbox is (un)checked.
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        ImageView image = (ImageView) findViewById(R.id.image_body);

        // Check which checkbox was clicked
        if (((CheckBox) view).getId() == R.id.checkbox_shoes) {
            image = (ImageView) findViewById(R.id.image_shoes);
        } else if (((CheckBox) view).getId() == R.id.checkbox_arms) {
            image = (ImageView) findViewById(R.id.image_arms);
        } else if (((CheckBox) view).getId() == R.id.checkbox_ears) {
            image = (ImageView) findViewById(R.id.image_ears);
        } else if (((CheckBox) view).getId() == R.id.checkbox_eyebrows) {
            image = (ImageView) findViewById(R.id.image_eyebrows);
        } else if (((CheckBox) view).getId() == R.id.checkbox_glasses) {
            image = (ImageView) findViewById(R.id.image_glasses);
        } else if (((CheckBox) view).getId() == R.id.checkbox_hat) {
            image = (ImageView) findViewById(R.id.image_hat);
        } else if (((CheckBox) view).getId() == R.id.checkbox_mouth) {
            image = (ImageView) findViewById(R.id.image_mouth);
        } else if (((CheckBox) view).getId() == R.id.checkbox_mustache) {
            image = (ImageView) findViewById(R.id.image_mustache);
        } else if (((CheckBox) view).getId() == R.id.checkbox_nose) {
            image = (ImageView) findViewById(R.id.image_nose);
        } else if (((CheckBox) view).getId() == R.id.checkbox_eyes) {
            image = (ImageView) findViewById(R.id.image_eyes);
        }

        if (checked) {
            image.setVisibility(View.VISIBLE); // set image to visible
        } else {
            image.setVisibility(View.INVISIBLE); // set image to invisible
        }
    }

    // this method toggles random images when pressing the random button
    public void onButtonClicked(View view) {
        resetImages(); // reset the current images to invisible
        resetCheckboxes(); // reset the current checkboxes to unchecked

        int random = (int) (Math.random() * 6); // take random variable between 0 and 6

        // delay
        Handler h = new Handler();
        h.postDelayed(image_for_final_config, 2901);
        h.postDelayed(eyes_final_config, 4000);

        randomAnimation(); // animation during the 3 seconds
    }

    Runnable reset_images = new Runnable() {
        @Override
        public void run(){
            resetImages(); // reset the current images to invisible
            //resetCheckboxes(); // reset the current checkboxes to unchecked
        }
    };

    Runnable image_for_animation = new Runnable() {
        @Override
        public void run(){
            int random = (int) (Math.random() * 6);
            for (int i = 0; i < 3 + random; i++) {
                randomImageForAnimation();
            }
        }
    };

    Runnable image_for_final_config = new Runnable() {
        @Override
        public void run(){
            int random = (int) (Math.random() * 6);
            for (int i = 0; i < 3 + random; i++) {
                randomImage();
            }
        }
    };

    Runnable eyes_final_config = new Runnable() {
        @Override
        public void run(){
            ImageView image = (ImageView) findViewById(R.id.image_eyes);
            image.setVisibility(View.VISIBLE); // set image to visible
            CheckBox checkbox = (CheckBox) findViewById(R.id.checkbox_eyes);
            checkbox.setChecked(true); // set checkbox to checked
        }
    };

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

    public void randomImageForAnimation() {
        ImageView image = (ImageView) findViewById(R.id.image_mustache); // backup

        int random = (int) (Math.random() * 9); // take random var between 0 and 10

        // each body part has roughly the same chance of being picked
        //if (random == 0) {
        //    image = (ImageView) findViewById(R.id.image_eyes);
        if (random == 1) {
            image = (ImageView) findViewById(R.id.image_shoes);
        } else if (random == 2) {
            image = (ImageView) findViewById(R.id.image_arms);
        } else if (random == 3) {
            image = (ImageView) findViewById(R.id.image_ears);
        } else if (random == 4) {
            image = (ImageView) findViewById(R.id.image_eyebrows);
        } else if (random == 5) {
            image = (ImageView) findViewById(R.id.image_glasses);
        } else if (random == 6) {
            image = (ImageView) findViewById(R.id.image_hat);
        } else if (random == 7) {
            image = (ImageView) findViewById(R.id.image_mouth);
        } else if (random == 8) {
            image = (ImageView) findViewById(R.id.image_mustache);
        } else if (random == 9) {
            image = (ImageView) findViewById(R.id.image_nose);
        }

        image.setVisibility(View.VISIBLE); // set image to visible
    }

    public void randomImage() {
        ImageView image = (ImageView) findViewById(R.id.image_mustache); // backup
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkbox_mustache); // backup

        int random = (int) (Math.random() * 10); // take random var between 0 and 10

        // each body part has roughly the same chance of being picked
        if (random == 0) {
            image = (ImageView) findViewById(R.id.image_eyes);
            checkbox = (CheckBox) findViewById(R.id.checkbox_eyes);
        } else if (random == 1) {
            image = (ImageView) findViewById(R.id.image_shoes);
            checkbox = (CheckBox) findViewById(R.id.checkbox_shoes);
        } else if (random == 2) {
            image = (ImageView) findViewById(R.id.image_arms);
            checkbox = (CheckBox) findViewById(R.id.checkbox_arms);
        } else if (random == 3) {
            image = (ImageView) findViewById(R.id.image_ears);
            checkbox = (CheckBox) findViewById(R.id.checkbox_ears);
        } else if (random == 4) {
            image = (ImageView) findViewById(R.id.image_eyebrows);
            checkbox = (CheckBox) findViewById(R.id.checkbox_eyebrows);
        } else if (random == 5) {
            image = (ImageView) findViewById(R.id.image_glasses);
            checkbox = (CheckBox) findViewById(R.id.checkbox_glasses);
        } else if (random == 6) {
            image = (ImageView) findViewById(R.id.image_hat);
            checkbox = (CheckBox) findViewById(R.id.checkbox_hat);
        } else if (random == 7) {
            image = (ImageView) findViewById(R.id.image_mouth);
            checkbox = (CheckBox) findViewById(R.id.checkbox_mouth);
        } else if (random == 8) {
            image = (ImageView) findViewById(R.id.image_mustache);
            checkbox = (CheckBox) findViewById(R.id.checkbox_mustache);
        } else if (random == 9) {
            image = (ImageView) findViewById(R.id.image_nose);
            checkbox = (CheckBox) findViewById(R.id.checkbox_nose);
        }

        image.setVisibility(View.VISIBLE); // set image to visible
        checkbox.setChecked(true); // set checkbox to checked
    }

    // this method resets all checkboxes to unchecked
    public void resetCheckboxes() {

        // get checkboxes for all body parts
        CheckBox arms = (CheckBox) findViewById(R.id.checkbox_arms);
        CheckBox ears = (CheckBox) findViewById(R.id.checkbox_ears);
        CheckBox eyebrows = (CheckBox) findViewById(R.id.checkbox_eyebrows);
        CheckBox eyes = (CheckBox) findViewById(R.id.checkbox_eyes);
        CheckBox glasses = (CheckBox) findViewById(R.id.checkbox_glasses);
        CheckBox hat = (CheckBox) findViewById(R.id.checkbox_hat);
        CheckBox mouth = (CheckBox) findViewById(R.id.checkbox_mouth);
        CheckBox mustache = (CheckBox) findViewById(R.id.checkbox_mustache);
        CheckBox nose = (CheckBox) findViewById(R.id.checkbox_nose);
        CheckBox shoes = (CheckBox) findViewById(R.id.checkbox_shoes);

        // set them to unchecked whenever necessary
        if (arms.isChecked()) { arms.setChecked(false); }
        if (ears.isChecked()) { ears.setChecked(false); }
        if (eyebrows.isChecked()) { eyebrows.setChecked(false); }
        if (eyes.isChecked()) { eyes.setChecked(false); }
        if (glasses.isChecked()) { glasses.setChecked(false); }
        if (hat.isChecked()) { hat.setChecked(false); }
        if (mouth.isChecked()) { mouth.setChecked(false); }
        if (mustache.isChecked()) { mustache.setChecked(false); }
        if (nose.isChecked()) { nose.setChecked(false); }
        if (shoes.isChecked()) { shoes.setChecked(false); }
    }

    // this method resets all the images to invisible
    public void resetImages() {
        ImageView image;
        image = (ImageView) findViewById(R.id.image_arms);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_ears);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_eyebrows);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_eyes);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_glasses);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_hat);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_mouth);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_mustache);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_nose);
        image.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.image_shoes);
        image.setVisibility(View.INVISIBLE);
    }
}
