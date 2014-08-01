package com.fss.commons.demo.sampleModules;


import android.os.Bundle;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.fss.commons.ui.HomeasUpActionbarActivity;
import com.fss.commons.uiModule.facecropper.FaceCropper;
import com.fss.commons.demo.R;

public class FaceCropActivity extends HomeasUpActionbarActivity {
    @InjectView(R.id.faceCropImageView)
    ImageView faceCropImageView;
    @InjectView(R.id.faceCropImageViewCroped)
    ImageView faceCropImageViewCroped;
    private FaceCropper mFaceCropper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face_crop_activity);
        ButterKnife.inject(this);
        mFaceCropper = new FaceCropper(1f);
        mFaceCropper.setFaceMinSize(0);
        faceCropImageView.setImageResource(R.drawable.test_back);
        faceCropImageViewCroped.setImageBitmap(mFaceCropper.cropFace(this, R.drawable.test_back));

    }


}