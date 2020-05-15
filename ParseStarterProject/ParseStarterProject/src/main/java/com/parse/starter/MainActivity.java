/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.parse.ParseAnalytics;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

   /* ParseObject score = new ParseObject("Score");
    score.put("username","rob");
    score.put("score",86);

    score.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null){

          Log.i("Save in Background","Successful");

        }else{

          Log.i("Save in Background","Failed Error : "+ e.toString());

        }
      }
    });*//*

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.getInBackground("hRdyjMTA69", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {

        if(e == null && object != null){

          object.put("score",200);
          object.saveInBackground();

          Log.i("ObjectValue",object.getString("username"));
          Log.i("ObjectValue",Integer.toString(object.getInt("score")));

        }else{

          Log.i("Save in Background","Failed Error : "+ e.toString());

        }

      }
    });*/

    /*ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.whereGreaterThan("score",200);


    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {

       if(e == null){

         Log.i("Find in background","Retrived " + objects.size() + " Objects");
         if(objects.size()>0){
           for(ParseObject object : objects){

             object.put("score",object.getInt("score")+50);
             object.saveInBackground();

           }
         }

       }

      }
    });*/

    /*ParseUser user =new ParseUser();
    user.setUsername("deon");
    user.setPassword("password");

    user.signUpInBackground(new SignUpCallback() {
      @Override
      public void done(ParseException e) {

        if(e==null){

          Log.i("Signup","Successful");

        }else{

          Log.i("Signup","failed");

        }

      }
    });*/


    /*ParseUser.logInInBackground("deon", "fgh", new LogInCallback() {
      @Override
      public void done(ParseUser user, ParseException e) {

        if(user != null){

          Log.i("Login","Successful");

        }else{

          Log.i("Login","failed " +e.toString());

        }

      }
    });*/


   /* ParseUser.logOut();

    if(ParseUser.getCurrentUser() != null){

      Log.i("User Logged In",ParseUser.getCurrentUser().getUsername());

    }else{

      Log.i("Current user","Not Logged in");


    }*/

    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}