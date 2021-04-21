package com.example.calculatorintentweb

import android.Manifest.permission.CAMERA
import android.Manifest.permission_group.CAMERA
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.core.content.PermissionChecker.checkSelfPermission
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.email
import org.jetbrains.anko.internals.AnkoInternals.getContext
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share
import java.util.jar.Manifest

class IntentActivity : AppCompatActivity() {
    private val PERMISSION_CODE = 1000;
    private val IMAGE_CAPTURE_CODE = 1001
    var image_uri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        btn_Sms.setOnClickListener {

            sendSMS("07236335222","Hello Sir.........")
        }
        btn_stk.setOnClickListener {

            val simToolKitLaunchIntent = this@IntentActivity.getPackageManager().getLaunchIntentForPackage("com.android.stk");
            if (simToolKitLaunchIntent != null) {
                startActivity(simToolKitLaunchIntent);
//            val simToolKitLaunchIntent: Intent?= this@IntentActivity..getLaunchIntentForPackage("com.android.stk")
//            simToolKitLaunchIntent?.let { startActivity(it) }
            }
        }
            btn_Email.setOnClickListener {

                email("joan@gmail.com", "Job Application", "Hello sir........")
            }
            btn_Share.setOnClickListener {
                share("Hell class, Kindly visit my social mesia account")
            }
            btn_call.setOnClickListener {

                makeCall("0723633522")
            }
            btn_Camera.setOnClickListener {

            }

            }

        }




