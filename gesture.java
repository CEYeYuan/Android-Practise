//check if this touch is a special gesture
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gD.onTouchEvent(event);
        return super.onTouchEvent(event);
    }




public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {
  private TextView text;
    private GestureDetectorCompat gD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.text = (TextView)findViewById(R.id.my_text);
        this.gD = new GestureDetectorCompat(this,this);
        gD.setOnDoubleTapListener(this);

    }
/*
"True if the listener has consumed the event, false otherwise."

If you return true, the event is processed. If false, it will go to the next layer down.
* */

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        text.setText("onSingleTapConfirmed");
        return true;
    }
}