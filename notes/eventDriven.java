/*   event driven  */
Button button =(Button)findViewById(R.id.my_button);
button.setOnClickListener(
    new Button.OnClickListener() {
        public void onClick(View v){
            TextView text = (TextView) findViewById(R.id.my_text);
            text.setText("Good Job");
        }
    }
);

/*create a view from java file */
  RelativeLayout main_layout= new RelativeLayout(this);
        main_layout.setBackgroundColor(Color.GREEN);


        //button
        Button redButton = new Button(this);
        redButton.setId(1);
        redButton.setText("Log In");
        redButton.setBackgroundColor(Color.RED);
        //make a container; the same size of the input
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r =getResources();
        //DIP device independent pixels
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics());


        //username
        EditText username = new EditText(this);
        username.setWidth(px);
        username.setId(2);
        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        //give rules to position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE,1);//1 is the id for the red button
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);


        //add widgets using the rules to the view
        main_layout.addView(redButton,buttonDetails);
        main_layout.addView(username,usernameDetails);
        setContentView(main_layout);