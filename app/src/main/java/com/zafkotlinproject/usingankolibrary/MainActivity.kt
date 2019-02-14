package com.zafkotlinproject.usingankolibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.sdk25.coroutines.onClick


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//TODO mengoprasikan button hello
        btnHello.onClick {
            toast("Hello,${edtnama.text}")
        }
        btnALert.onClick {
            alert("Happy training","Hai,${edtnama.text}"){
                yesButton { toast("semangat yaa") }
                noButton {  }
            }.show()
        }

        btnSelector.onClick {
            val training = listOf("Augmented Reality","App Inventor","Kotlin","IOT")
            //p, parameter dari Augmented Reality","App Inventor","Kotlin","IOT

            selector("Hi,${edtnama.text} apa maeteri trining yang kamu sukai?", training ){
            p,i-> toast("jadi kamu menyukai ${training[i]}")
        }
            btnsnackbar.onClick {
                snackbar(edtnama, "Hai , ${edtnama.text}")}
            }
        btnprogresbar.onClick {
            indeterminateProgressDialog ("Tungguin loadingnya selesai")

            btnsecondactivity.onClick {
                startActivity<Activitydua>("name" to "${edtnama.text}")
            }

        }

        }


        }


