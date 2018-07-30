package lk.droidlanka.sanoj.sinhalaunicodetolegacy;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.shashank.sony.fancygifdialoglib.FancyGifDialog;
import com.shashank.sony.fancygifdialoglib.FancyGifDialogListener;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    EditText unicode;
    EditText Legacy;

    SeekBar upunicode;
    SeekBar dwnlegary;

    CheckBox views;


    ClipboardManager myClipboard;
    ClipData myClip;


    private InterstitialAd mInterstitialAd;
    private InterstitialAd mInterstitialAds;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-6390328241621907~9075228292");


        mInterstitialAds = new InterstitialAd(this);
        mInterstitialAds.setAdUnitId("ca-app-pub-6390328241621907/2011126499");
        mInterstitialAds.loadAd(new AdRequest.Builder().build());

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6390328241621907/4038524034");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {

                displayInterstitial();
            }
        });


        unicode = (EditText) findViewById(R.id.unicode);
        Legacy = (EditText) findViewById(R.id.ligacy);
        /////////////////////////////////////////////////////////////////

        Typeface unicodes = Typeface.createFromAsset(getAssets(),
                "fonts/emanee.ttf");
        unicode.setTypeface(unicodes);


        upunicode = (SeekBar) findViewById(R.id.seekBar);
        upunicode.setMax(100);
        upunicode.setProgress((int) 22);


        dwnlegary = (SeekBar) findViewById(R.id.seekBar2);
        dwnlegary.setMax(100);
        dwnlegary.setProgress((int) 22);


        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {


                                String text = unicode.getText().toString();

                                text = text.replace(",", "￦");
                                text = text.replace(".", "�");
                                text = text.replace("ත්‍රෛ", "ff;%");
                                text = text.replace("ශෛ", "ffY");
                                text = text.replace("චෛ", "ffp");
                                text = text.replace("ජෛ", "ffc");
                                text = text.replace("කෛ", "ffl");
                                text = text.replace("මෛ", "ffu");
                                text = text.replace("පෛ", "ffm");
                                text = text.replace("දෛ", "ffo");
                                text = text.replace("තෛ", "ff;");
                                text = text.replace("නෛ", "ffk");
                                text = text.replace("ධෛ", "ffO");
                                text = text.replace("වෛ", "ffj");
                                text = text.replace("ප්‍රෞ", "fm%!");
                                text = text.replace("ෂ්‍යෝ", "fIHda");
                                text = text.replace("ඡ්‍යෝ", "fPHda");
                                text = text.replace("ඪ්‍යෝ", "fVHda");
                                text = text.replace("ඝ්‍යෝ", "f>Hda");
                                text = text.replace("ඛ්‍යෝ", "fLHda");
                                text = text.replace("ළ්‍යෝ", "f<Hda");
                                text = text.replace("ඵ්‍යෝ", "fMHda");
                                text = text.replace("ඨ්‍යෝ", "fGHda");
                                text = text.replace("ශ්‍යෝ", "fYHda");
                                text = text.replace("ක්‍ෂ්‍යෝ", "fÌHda");
                                text = text.replace("බ්‍යෝ", "fnHda");
                                text = text.replace("ච්‍යෝ", "fpHda");
                                text = text.replace("ඩ්‍යෝ", "fâHda");
                                text = text.replace("ෆ්‍යෝ", "f*Hda");
                                text = text.replace("ග්‍යෝ", "f.Hda");
                                text = text.replace("ජ්‍යෝ", "fcHda");
                                text = text.replace("ක්‍යෝ", "flHda");
                                text = text.replace("ල්‍යෝ", "f,Hda");
                                text = text.replace("ම්‍යෝ", "fuHda");
                                text = text.replace("න්‍යෝ", "fkHda");
                                text = text.replace("ප්‍යෝ", "fmHda");
                                text = text.replace("ද්‍යෝ", "foHda");
                                text = text.replace("ස්‍යෝ", "fiHda");
                                text = text.replace("ට්‍යෝ", "fgHda");
                                text = text.replace("ව්‍යෝ", "fjHda");
                                text = text.replace("ත්‍යෝ", "f;Hda");
                                text = text.replace("භ්‍යෝ", "fNHda");
                                text = text.replace("ධ්‍යෝ", "fOHda");
                                text = text.replace("ථ්‍යෝ", "f:Hda");
                                text = text.replace("ෂ්‍යො", "fIHd");
                                text = text.replace("ශ්‍යො", "fYHd");
                                text = text.replace("ඛ්‍යො", "fLHd");
                                text = text.replace("ක්‍ෂ්‍යො", "fÌHd");
                                text = text.replace("බ්‍යො", "fnHd");
                                text = text.replace("ව්‍යො", "fjHd");
                                text = text.replace("ඩ්‍යො", "fvHd");
                                text = text.replace("ෆ්‍යො", "f*Hd");
                                text = text.replace("ග්‍යො", "f.Hd");
                                text = text.replace("ජ්‍යො", "fcHd");
                                text = text.replace("ක්‍යො", "flHd");
                                text = text.replace("ම්‍යො", "fuHd");
                                text = text.replace("ප්‍යො", "fmHd");
                                text = text.replace("ද්‍යො", "foHd");
                                text = text.replace("ස්‍යො", "fiHd");
                                text = text.replace("ට්‍යො", "fgHd");
                                text = text.replace("ව්‍යො", "fjHd");
                                text = text.replace("ත්‍යො", "f;Hd");
                                text = text.replace("භ්‍යො", "fNHd");
                                text = text.replace("ධ්‍යො", "fOHd");
                                text = text.replace("ථ්‍යො", "f:Hd");
                                text = text.replace("ෂ්‍යෙ", "fIH");
                                text = text.replace("ඡ්‍යෙ", "fPH");
                                text = text.replace("ළ්‍යෙ", "f<H");
                                text = text.replace("ණ්‍යෙ", "fKH");
                                text = text.replace("ච්‍යෙ", "fpH");
                                text = text.replace("ල්‍යෙ", "f,H");
                                text = text.replace("න්‍යෙ", "fkH");
                                text = text.replace("ශ්‍යෙ", "fYH");
                                text = text.replace("ඛ්‍යෙ", "fLH");
                                text = text.replace("ක්‍ෂ්යෙ", "fÌH");
                                text = text.replace("බ්‍යෙ", "fnH");
                                text = text.replace("ඩ්‍යෙ", "fvH");
                                text = text.replace("ෆ්‍යෙ", "f*H");
                                text = text.replace("ග්‍යෙ", "f.H");
                                text = text.replace("ජ්‍යෙ", "fcH");
                                text = text.replace("ක්‍යෙ", "flH");
                                text = text.replace("ම්‍යෙ", "fuH");
                                text = text.replace("ප්‍යෙ", "fmH");
                                text = text.replace("ද්‍යෙ", "foH");
                                text = text.replace("ස්‍යෙ", "fiH");
                                text = text.replace("ට්‍යෙ", "fgH");
                                text = text.replace("ව්‍යෙ", "fjH");
                                text = text.replace("ත්‍යෙ", "f;H");
                                text = text.replace("භ්‍යෙ", "fNH");
                                text = text.replace("ධ්‍යෙ", "fOH");
                                text = text.replace("ථ්‍යෙ", "f:H");
                                text = text.replace("ෂ්‍රෝ", "fI%da");
                                text = text.replace("ඝ්‍රෝ", "f>%da");
                                text = text.replace("ශ්‍රෝ", "fY%da");
                                text = text.replace("ක්‍ෂ්‍රෝ", "fÌ%da");
                                text = text.replace("බ්‍රෝ", "fn%da");
                                text = text.replace("ඩ්‍රෝ", "fv%da");
                                text = text.replace("ෆ්‍රෝ", "f*%da");
                                text = text.replace("ග්‍රෝ", "f.%da");
                                text = text.replace("ක්‍රෝ", "fl%da");
                                text = text.replace("ප්‍රෝ", "fm%da");
                                text = text.replace("ද්‍රෝ", "føda");
                                text = text.replace("ස්‍රෝ", "fi%da");
                                text = text.replace("ට්‍රෝ", "fg%da");
                                text = text.replace("ත්‍රෝ", "f;%da");
                                text = text.replace("ශ්‍රො", "fY%d");
                                text = text.replace("ඩ්‍රො", "fv%d");
                                text = text.replace("ෆ්‍රො", "f*%d");
                                text = text.replace("ග්‍රො", "f.%d");
                                text = text.replace("ක්‍රො", "fl%d");
                                text = text.replace("ප්‍රො", "fm%d");
                                text = text.replace("ද්‍රො", "fød");
                                text = text.replace("ස්‍රො", "fi%d");
                                text = text.replace("ට්‍රො", "fg%d");
                                text = text.replace("ත්‍රො", "f;%d");
                                text = text.replace("ශ්‍රේ", "fYa%");
                                text = text.replace("බ්‍රේ", "fí%");
                                text = text.replace("ඩ්‍රේ", "fâ%");
                                text = text.replace("ෆ්‍රේ", "f*a%");
                                text = text.replace("ග්‍රේ", "f.a%");
                                text = text.replace("ක්‍රේ", "fla%");
                                text = text.replace("ප්‍රේ", "fma%");
                                text = text.replace("ද්‍රේ", "føa");
                                text = text.replace("ස්‍රේ", "fia%");
                                text = text.replace("ත්‍රේ", "f;a%");
                                text = text.replace("ධ්‍රේ", "fè%");
                                text = text.replace("ෂ්‍රෙ", "fI%");
                                text = text.replace("ශ්‍රෙ", "fY%");
                                text = text.replace("බ්‍රෙ", "fn%");
                                text = text.replace("ෆ්‍රෙ", "f*%");
                                text = text.replace("ග්‍රෙ", "f.%");
                                text = text.replace("ක්‍රෙ", "fl%");
                                text = text.replace("ප්‍රෙ", "fm%");
                                text = text.replace("ද්‍රෙ", "fø");
                                text = text.replace("ස්‍රෙ", "fi%");
                                text = text.replace("ත්‍රෙ", "f;%");
                                text = text.replace("භ්‍රෙ", "fN%");
                                text = text.replace("ධ්‍රෙ", "fO%");
                                text = text.replace("්‍ය", "H");
                                text = text.replace("්‍ර", "%");
                                text = text.replace("ෂෞ", "fI!");
                                text = text.replace("ඡෞ", "fP!");
                                text = text.replace("ශෞ", "fY!");
                                text = text.replace("බෞ", "fn!");
                                text = text.replace("චෞ", "fp!");
                                text = text.replace("ඩෞ", "fv!");
                                text = text.replace("ෆෞ", "f*!");
                                text = text.replace("ගෞ", "f.!");
                                text = text.replace("ජෞ", "fc!");
                                text = text.replace("කෞ", "fl!");
                                text = text.replace("ලෞ", "f,!");
                                text = text.replace("මෞ", "fu!");
                                text = text.replace("නෞ", "fk!");
                                text = text.replace("පෞ", "fm!");
                                text = text.replace("දෞ", "fo!");
                                text = text.replace("රෞ", "fr!");
                                text = text.replace("සෞ", "fi!");
                                text = text.replace("ටෞ", "fg!");
                                text = text.replace("තෞ", "f;!");
                                text = text.replace("භෞ", "fN!");
                                text = text.replace("ඤෞ", "f[!");
                                text = text.replace("ෂෝ", "fIda");
                                text = text.replace("ඹෝ", "fUda");
                                text = text.replace("ඡෝ", "fPda");
                                text = text.replace("ඪෝ", "fVda");
                                text = text.replace("ඝෝ", "f>da");
                                text = text.replace("ඛෝ", "fLda");
                                text = text.replace("ළෝ", "f<da");
                                text = text.replace("ඟෝ", "fÛda");
                                text = text.replace("ණෝ", "fKda");
                                text = text.replace("ඵෝ", "fMda");
                                text = text.replace("ඨෝ", "fGda");
                                text = text.replace("ඬෝ", "fËda");
                                text = text.replace("ශෝ", "fYda");
                                text = text.replace("ඥෝ", "f{da");
                                text = text.replace("ඳෝ", "f|da");
                                text = text.replace("ක්‍ෂෝ", "fÌda");
                                text = text.replace("බෝ", "fnda");
                                text = text.replace("චෝ", "fpda");
                                text = text.replace("ඩෝ", "fvda");
                                text = text.replace("ෆෝ", "f*da");
                                text = text.replace("ගෝ", "f.da");
                                text = text.replace("හෝ", "fyda");
                                text = text.replace("ජෝ", "fcda");
                                text = text.replace("කෝ", "flda");
                                text = text.replace("ලෝ", "f,da");
                                text = text.replace("මෝ", "fuda");
                                text = text.replace("නෝ", "fkda");
                                text = text.replace("පෝ", "fmda");
                                text = text.replace("දෝ", "foda");
                                text = text.replace("රෝ", "frda");
                                text = text.replace("සෝ", "fida");
                                text = text.replace("ටෝ", "fgda");
                                text = text.replace("වෝ", "fjda");
                                text = text.replace("තෝ", "f;da");
                                text = text.replace("භෝ", "fNda");
                                text = text.replace("යෝ", "fhda");
                                text = text.replace("ඤෝ", "f[da");
                                text = text.replace("ධෝ", "fOda");
                                text = text.replace("ථෝ", "f:da");
                                text = text.replace("ෂො", "fId");
                                text = text.replace("ඹො", "fUd");
                                text = text.replace("ඡො", "fPd");
                                text = text.replace("ඪො", "fVd");
                                text = text.replace("ඝො", "f>d");
                                text = text.replace("ඛො", "fLd");
                                text = text.replace("ළො", "f<d");
                                text = text.replace("ඟො", "fÕd");
                                text = text.replace("ණො", "fKd");
                                text = text.replace("ඵො", "fMd");
                                text = text.replace("ඨො", "fGd");
                                text = text.replace("ඬො", "fËd");
                                text = text.replace("ශො", "fYd");
                                text = text.replace("ඥො", "f{d");
                                text = text.replace("ඳො", "f|d");
                                text = text.replace("ක්‍ෂො", "fÌd");
                                text = text.replace("බො", "fnd");
                                text = text.replace("චො", "fpd");
                                text = text.replace("ඩො", "fvd");
                                text = text.replace("ෆො", "f*d");
                                text = text.replace("ගො", "f.d");
                                text = text.replace("හො", "fyd");
                                text = text.replace("ජො", "fcd");
                                text = text.replace("කො", "fld");
                                text = text.replace("ලො", "f,d");
                                text = text.replace("මො", "fud");
                                text = text.replace("නො", "fkd");
                                text = text.replace("පො", "fmd");
                                text = text.replace("දො", "fod");
                                text = text.replace("රො", "frd");
                                text = text.replace("සො", "fid");
                                text = text.replace("ටො", "fgd");
                                text = text.replace("වො", "fjd");
                                text = text.replace("තො", "f;d");
                                text = text.replace("භො", "fNd");
                                text = text.replace("යො", "fhd");
                                text = text.replace("ඤො", "f[d");
                                text = text.replace("ධො", "fOd");
                                text = text.replace("ථො", "f:d");
                                text = text.replace("ෂේ", "fIa");
                                text = text.replace("ඹේ", "fò");
                                text = text.replace("ඡේ", "fþ");
                                text = text.replace("ඝේ", "f>a");
                                text = text.replace("ඛේ", "fÄ");
                                text = text.replace("ළේ", "f<a");
                                text = text.replace("ඟේ", "fÛa");
                                text = text.replace("ණේ", "fKa");
                                text = text.replace("ඵේ", "fMa");
                                text = text.replace("ඨේ", "fGa");
                                text = text.replace("ඬේ", "få");
                                text = text.replace("ශේ", "fYa");
                                text = text.replace("ඥේ", "f{a");
                                text = text.replace("ඳේ", "f|a");
                                text = text.replace("ක්‍ෂේ", "fÌa");
                                text = text.replace("බේ", "fí");
                                text = text.replace("චේ", "fÉ");
                                text = text.replace("ඩේ", "fâ");
                                text = text.replace("ෆේ", "f*");
                                text = text.replace("ගේ", "f.a");
                                text = text.replace("හේ", "fya");
                                text = text.replace("පේ", "fma");
                                text = text.replace("කේ", "fla");
                                text = text.replace("ලේ", "f,a");
                                text = text.replace("මේ", "fï");
                                text = text.replace("නේ", "fka");
                                text = text.replace("ජේ", "f–");
                                text = text.replace("දේ", "foa");
                                text = text.replace("රේ", "f¾");
                                text = text.replace("සේ", "fia");
                                text = text.replace("ටේ", "fÜ");
                                text = text.replace("වේ", "fõ");
                                text = text.replace("තේ", "f;a");
                                text = text.replace("භේ", "fNa");
                                text = text.replace("යේ", "fha");
                                text = text.replace("ඤේ", "f[a");
                                text = text.replace("ධේ", "fè");
                                text = text.replace("ථේ", "f:a");
                                text = text.replace("ෂෙ", "fI");
                                text = text.replace("ඹෙ", "fU");
                                text = text.replace("ඓ", "ft");
                                text = text.replace("ඡෙ", "fP");
                                text = text.replace("ඪෙ", "fV");
                                text = text.replace("ඝෙ", "f>");
                                text = text.replace("ඛෙ", "fn");
                                text = text.replace("ළෙ", "f<");
                                text = text.replace("ඟෙ", "fÛ");
                                text = text.replace("ණෙ", "fK");
                                text = text.replace("ඵෙ", "fM");
                                text = text.replace("ඨෙ", "fG");
                                text = text.replace("ඬෙ", "fË");
                                text = text.replace("ශෙ", "fY");
                                text = text.replace("ඥෙ", "f{");
                                text = text.replace("ඳෙ", "fË");
                                text = text.replace("ක්‍ෂෙ", "fÌ");
                                text = text.replace("බෙ", "fn");
                                text = text.replace("චෙ", "fp");
                                text = text.replace("ඩෙ", "fv");
                                text = text.replace("ෆෙ", "f*");
                                text = text.replace("ගෙ", "f.");
                                text = text.replace("හෙ", "fy");
                                text = text.replace("ජෙ", "fc");
                                text = text.replace("කෙ", "fl");
                                text = text.replace("ලෙ", "f,");
                                text = text.replace("මෙ", "fu");
                                text = text.replace("නෙ", "fk");
                                text = text.replace("පෙ", "fm");
                                text = text.replace("දෙ", "fo");
                                text = text.replace("රෙ", "fr");
                                text = text.replace("සෙ", "fi");
                                text = text.replace("ටෙ", "fg");
                                text = text.replace("වෙ", "fj");
                                text = text.replace("තෙ", "f;");
                                text = text.replace("භෙ", "fN");
                                text = text.replace("යෙ", "fh");
                                text = text.replace("ඤෙ", "f[");
                                text = text.replace("ධෙ", "fO");
                                text = text.replace("ථෙ", "f:");
                                text = text.replace("තු", ";=");
                                text = text.replace("ගු", ".=");
                                text = text.replace("කු", "l=");
                                text = text.replace("තූ", ";+");
                                text = text.replace("ගූ", ".+");
                                text = text.replace("කූ", "l+");
                                text = text.replace("රු", "re");
                                text = text.replace("රූ", "rE");
                                text = text.replace("ආ", "wd");
                                text = text.replace("ඇ", "we");
                                text = text.replace("ඈ", "wE");
                                text = text.replace("ඌ", "W!");
                                text = text.replace("ඖ", "T!");
                                text = text.replace("ඒ", "ta");
                                text = text.replace("ඕ", "´");
                                text = text.replace("ඳි", "¢");
                                text = text.replace("ඳී", "£");
                                text = text.replace("දූ", "¥");
                                text = text.replace("දී", "§");
                                text = text.replace("ලූ", "¨");
                                text = text.replace("ර්‍ය", "©");
                                text = text.replace("ඳූ", "ª");
                                text = text.replace("ර්", "¾");
                                text = text.replace("ඨි", "À");
                                text = text.replace("ඨී", "Á");
                                text = text.replace("ඡී", "Â");
                                text = text.replace("ඛ්", "Ä");
                                text = text.replace("ඛි", "Å");
                                text = text.replace("ලු", "Æ");
                                text = text.replace("ඛී", "Ç");
                                text = text.replace("දි", "È");
                                text = text.replace("ච්", "É");
                                text = text.replace("ජ්", "Ê");
                                text = text.replace("රී", "Í");
                                text = text.replace("ඪී", "Î");
                                text = text.replace("ඪී", "Ð,");
                                text = text.replace("චි", "Ñ");
                                text = text.replace("ථී", "Ò");
                                text = text.replace("ථී", "Ó");
                                text = text.replace("ජී", "Ô");
                                text = text.replace("චී", "Ö");
                                text = text.replace("ඞ්", "Ù");
                                text = text.replace("ඵී", "Ú");
                                text = text.replace("ට්", "Ü");
                                text = text.replace("ඵි", "Ý");
                                text = text.replace("රි", "ß");
                                text = text.replace("ටී", "à");
                                text = text.replace("ටි", "á");
                                text = text.replace("ඩ්", "â");
                                text = text.replace("ඩී", "ã");
                                text = text.replace("ඩි", "ä");
                                text = text.replace("ඬ්", "å");
                                text = text.replace("ඬි", "ç");
                                text = text.replace("ධ්", "è");
                                text = text.replace("ඬී", "é");
                                text = text.replace("ධි", "ê");
                                text = text.replace("ධී", "ë");
                                text = text.replace("බි", "ì");
                                text = text.replace("බ්", "í");
                                text = text.replace("බී", "î");
                                text = text.replace("ම්", "ï");
                                text = text.replace("ජි", "ð");
                                text = text.replace("මි", "ñ");
                                text = text.replace("ඹ්", "ò");
                                text = text.replace("මී", "ó");
                                text = text.replace("ඹි", "ô");
                                text = text.replace("ව්", "õ");
                                text = text.replace("ඹී", "ö");
                                text = text.replace("ඳු", "÷");
                                text = text.replace("ද්‍ර", "ø");
                                text = text.replace("වී", "ù");
                                text = text.replace("වි", "ú");
                                text = text.replace("ඞ්", "û");
                                text = text.replace("ඞී", "ü");
                                text = text.replace("ඡි", "ý");
                                text = text.replace("ඡ්", "þ");
                                text = text.replace("දු", "ÿ");
                                text = text.replace("ජ්", "–");
                                text = text.replace("ර්‍ණ", "“");
                                text = text.replace("ණී", "”");
                                text = text.replace("ජී", "„");
                                text = text.replace("ඡි", "‰");
                                text = text.replace("ඩි", "");
                                text = text.replace("ඤු", "™");
                                text = text.replace("ග", ".");
                                text = text.replace("ළු", "¿");
                                text = text.replace("ෂ", "I");
                                text = text.replace("ං", "x");
                                text = text.replace("ඃ", "#");
                                text = text.replace("ඹ", "U");
                                text = text.replace("ඡ", "P");
                                text = text.replace("ඪ", "V");
                                text = text.replace("ඝ", ">");
                                text = text.replace("ඊ", "B");
                                text = text.replace("ඣ", "CO");
                                text = text.replace("ඛ", "L");
                                text = text.replace("ළ", "<");
                                text = text.replace("ඟ", "Û");
                                text = text.replace("ණ", "K");
                                text = text.replace("ඵ", "M");
                                text = text.replace("ඨ", "G");
                                text = text.replace("ඃ", "#");
                                text = text.replace(":", "(");
                                text = text.replace("-", ")");
                                text = text.replace("ෆ", "*");
                                text = text.replace("ල", ",");
                                text = text.replace("-", "-");
                                text = text.replace("රැ", "/");
                                text = text.replace("ථ", ":");
                                text = text.replace("ත", ";");
                                text = text.replace("ළ", "<");
                                text = text.replace("ඝ", ">");
                                text = text.replace("රෑ", "?");
                                text = text.replace("ඊ", "B");
                                text = text.replace("ක‍", "C");
                                text = text.replace("‍ෘ", "D");
                                text = text.replace("ෑ", "E");
                                text = text.replace("ත‍", "F");
                                text = text.replace("ඨ", "G");
                                text = text.replace("්‍ය", "H");
                                text = text.replace("ෂ", "I");
                                text = text.replace("න‍", "J");
                                text = text.replace("ණ", "K");
                                text = text.replace("ඛ", "L");
                                text = text.replace("ඵ", "M");
                                text = text.replace("භ", "N");
                                text = text.replace("ධ", "O");
                                text = text.replace("ඡ", "P");
                                text = text.replace("ඍ", "R");
                                text = text.replace("ඔ", "T");
                                text = text.replace("ඹ", "U");
                                text = text.replace("ඪ", "V");
                                text = text.replace("උ", "W");
                                text = text.replace("ශ", "Y");
                                text = text.replace("ඤ", "[");
                                text = text.replace("ඉ", "b");
                                text = text.replace("ජ", "c");
                                text = text.replace("ට", "g");
                                text = text.replace("ය", "h");
                                text = text.replace("ස", "i");
                                text = text.replace("ව", "j");
                                text = text.replace("න", "k");
                                text = text.replace("ක", "l");
                                text = text.replace("ප", "m");
                                text = text.replace("බ", "n");
                                text = text.replace("ද", "o");
                                text = text.replace("ච", "p");
                                text = text.replace("ර", "r");
                                text = text.replace("එ", "t");
                                text = text.replace("ම", "u");
                                text = text.replace("ඩ", "v");
                                text = text.replace("අ", "w");
                                text = text.replace("හ", "y");
                                text = text.replace("ඥ", "{");
                                text = text.replace("ඳ", "|");
                                text = text.replace("ක්‍ෂ", "Ì");
                                text = text.replace("ැ", "e");
                                text = text.replace("ෑ", "E");
                                text = text.replace("ෙ", "f");
                                text = text.replace("ු", "q");
                                text = text.replace("ි", "s");
                                text = text.replace("ූ", "Q");
                                text = text.replace("ී", "S");
                                text = text.replace("ෘ", "D");
                                text = text.replace("ෲ", "DD");
                                text = text.replace("ෟ", "!");
                                text = text.replace("ා", "d");
                                text = text.replace("්", "a");
                                text = text.replace("￦", "\"");
                                text = text.replace("�", "'");
                                text = text.replace("￫", "^");
                                text = text.replace("￩", "&");
                                text = text.replace("ￔ", ")");
                                text = text.replace("ￓ", "@");
                                text = text.replace("ￒ", "`");
                                text = text.replace("ￏ", "}");
                                text = text.replace("ￎ", "~");

                                Legacy.setText(text);


                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();


        Thread y = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(50);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                views = (CheckBox) findViewById(R.id.checkBox);
                                if (views.isChecked()) {

                                    Typeface arial = Typeface.createFromAsset(getAssets(),
                                            "fonts/arial.ttf");
                                    Legacy.setTypeface(arial);

                                } else {

                                    Typeface Legacys = Typeface.createFromAsset(getAssets(),
                                            "fonts/FMArjunnx.otf");
                                    Legacy.setTypeface(Legacys);

                                }


                                unicode.setTextSize(upunicode.getProgress());
                                Legacy.setTextSize(dwnlegary.getProgress());//arial.ttf

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        y.start();

    }

    /////////////////////////////////////////////////////////////////



    /////////////////////////////////////////////////////////////////




    public Void copy(View v) {



        String uni = unicode.getText().toString();
        String clipiniya = Legacy.getText().toString();
        ClipboardManager clipbord = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Text",clipiniya);
        clipbord.setPrimaryClip(clip);
        Toast.makeText(getApplicationContext(), "Text Copied", Toast.LENGTH_SHORT).show();

        if (mInterstitialAds.isLoaded()) {
            mInterstitialAds.show(); }

        return null;



    }

    public void displayInterstitial() {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();

        }

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_refresh:


                new FancyGifDialog.Builder(this)
                        .setTitle("මෙකක්ද මේකෙන් වෙන්නේ")
                        .setMessage("මේම මෘදුකාංගයේ මූලික බලාපොරොත්තුව වනුවේ අපි දැන්ට බාවිත කරන යුනිකෝඩ් අකුරු බාවිතාකර Legacy ෆොන්ට් වල ගැලපෙන විදිහට වෙනස් කරගැනීමයි මෙමගින් ඔබගේ ස්මර්ට් ෆෝන් එකෙන්ම ෆොටෝ එඩිට් කිරීමේදී  ඔබට කැමති ෆෝන්ට් එකක් භාවිතා කරගැනීමට හැකියාව ඇත මුහුනු පොතේ නිතර දකින අසන ප්\u200Dරෂ්න වලට පිලිතුරක් විදිහට මෙම මෘදුකාංගල නිර්මාණය කලේ වඩාත් පැහැදිලි වෙන්නට මෙය සමග ඇති වීඩියෝව නරබන්න.")
                        .setNegativeBtnText("View FB")
                        .setPositiveBtnBackground("#FF4081")
                        .setPositiveBtnText("Ok")
                        .setNegativeBtnBackground("#FFA9A7A8")
                        .setGifResource(R.drawable.gif12)   //Pass your Gif here
                        .isCancellable(true)
                        .OnPositiveClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {

                            }
                        })
                        .OnNegativeClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {
                                String url = "https://www.facebook.com/sanoj.jayathilaka1";

                                Intent i = new Intent(Intent.ACTION_VIEW);
                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        })
                        .build();
                break;

            case R.id.developer:

                new FancyGifDialog.Builder(this)
                        .setTitle("This app By SL developer")
                        .setMessage("Version 1.0 -" +
                                "Tel: 0756164586")

                        .setNegativeBtnText("View FB")
                        .setPositiveBtnBackground("#FF4081")
                        .setPositiveBtnText("Ok")
                        .setNegativeBtnBackground("#FFA9A7A8")
                        .setGifResource(R.drawable.gif12)   //Pass your Gif here
                        .isCancellable(true)
                        .OnPositiveClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {

                            }
                        })
                        .OnNegativeClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {
                                String url = "https://www.facebook.com/sanoj.jayathilaka1";

                                Intent i = new Intent(Intent.ACTION_VIEW);
                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        })
                        .build();

                break;

            case R.id.Helpers:
                new FancyGifDialog.Builder(this)
                        .setTitle("App Icon design")
                        .setMessage("ඔබේ නම අමතකයි කරුණාකර පනිවිඩයක් ලැබෙන්ට සලස්වන්න මෙය නිවර්දි කරන්න")

                        .setNegativeBtnText("View FB")
                        .setPositiveBtnBackground("#FF4081")
                        .setPositiveBtnText("Ok")
                        .setNegativeBtnBackground("#FFA9A7A8")
                        .setGifResource(R.drawable.gif12)   //Pass your Gif here
                        .isCancellable(true)
                        .OnPositiveClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {

                            }
                        })
                        .OnNegativeClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {
                                String url = "https://www.facebook.com/sanoj.jayathilaka1";

                                Intent i = new Intent(Intent.ACTION_VIEW);
                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        })
                        .build();
                break;

            default:
                break;
        }

        return true;
    }




}

