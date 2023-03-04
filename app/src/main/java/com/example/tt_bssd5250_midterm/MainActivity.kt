package com.example.tt_bssd5250_midterm

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.TimeAnimator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import android.animation.ObjectAnimator as ObjectAnimator1

class MainActivity : AppCompatActivity() {

    var anim1: AnimationDrawable? = null
    var anim2: AnimationDrawable? = null
    var anim3: AnimationDrawable? = null
    var anim4: AnimationDrawable? = null
    var anim5: AnimationDrawable? = null
    var anim6: AnimationDrawable? = null
    var anim7: AnimationDrawable? = null
    var anim8: AnimationDrawable? = null

    private lateinit var imgView1: ImageView
    private lateinit var imgView2: ImageView
    private lateinit var imgView3: ImageView
    private lateinit var imgView4: ImageView
    private lateinit var imgView5: ImageView
    private lateinit var imgView6: ImageView
    private lateinit var imgView7: ImageView
    private lateinit var imgView8: ImageView
    private lateinit var timer: TextView
    private lateinit var smokeMover1: ObjectAnimator1
    private lateinit var smokeMover2: ObjectAnimator1
    private lateinit var smokeMover3: ObjectAnimator1
    private lateinit var smokeMover4: ObjectAnimator1
    private lateinit var smokeMover5: ObjectAnimator1
    private lateinit var smokeMover6: ObjectAnimator1
    private lateinit var smokeMover7: ObjectAnimator1
    private lateinit var smokeMover8: ObjectAnimator1
    private lateinit var lastValue: String
    private var stop: String = ""

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vg = findViewById<ViewGroup>(android.R.id.content).getChildAt(0) as ConstraintLayout

        imgView1 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim1!!.isRunning) {
                            stop += "1"
                            anim1?.stop()
                            smokeMover1.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }
        imgView2 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim2!!.isRunning) {
                            stop += "2"
                            anim2?.stop()
                            smokeMover2.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }
        imgView3 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim3!!.isRunning) {
                            stop += "3"
                            anim3?.stop()
                            smokeMover3.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }
        imgView4 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim4!!.isRunning) {
                            stop += "4"
                            anim4?.stop()
                            smokeMover4.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }
        imgView5 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim5!!.isRunning) {
                            stop += "5"
                            anim5?.stop()
                            smokeMover5.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }
        imgView6 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim6!!.isRunning) {
                            stop += "6"
                            anim6?.stop()
                            smokeMover6.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }
        imgView7 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim7!!.isRunning) {
                            stop += "7"
                            anim7?.stop()
                            smokeMover7.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }
        imgView8 = ImageView(this).apply {
            setImageResource(R.drawable.animation)
            setOnTouchListener { _, motionEvent ->
                val act = motionEvent?.action
                when (motionEvent?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (anim8!!.isRunning) {
                            stop += "8"
                            anim8?.stop()
                            smokeMover8.pause()
                            true
                        } else {
                            false
                        }
                    }
                    else -> {
                        false
                    }
                }
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                0,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                0.1f
            )
        }

        anim1 = imgView1.drawable as AnimationDrawable
        anim2 = imgView2.drawable as AnimationDrawable
        anim3 = imgView3.drawable as AnimationDrawable
        anim4 = imgView4.drawable as AnimationDrawable
        anim5 = imgView5.drawable as AnimationDrawable
        anim6 = imgView6.drawable as AnimationDrawable
        anim7 = imgView7.drawable as AnimationDrawable
        anim8 = imgView8.drawable as AnimationDrawable

        var startButton = Button(this).apply {
            text = "start"
            setOnClickListener {
                val timerAnimator = ValueAnimator.ofInt(0, 30)
                timer.text = 0.toString()
                stop = ""
                timerAnimator.duration = 30000
                timerAnimator.addUpdateListener {
                    timer.text = it.animatedValue.toString()
                }

                timerAnimator.addListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator) {
                        val lastNum = timerAnimator.animatedValue as Int
                        lastValue = lastNum.toString()
                        if (lastValue == "30" && stop.length == 8) {
                            this@MainActivity.runOnUiThread(java.lang.Runnable {
                                Toast.makeText(applicationContext, "You Win", Toast.LENGTH_LONG)
                                    .show()
                            })
                            Log.d("last", lastValue.toString())
                        } else {
                            this@MainActivity.runOnUiThread(java.lang.Runnable {
                                Toast.makeText(applicationContext, "You Lose", Toast.LENGTH_LONG)
                                    .show()
                            })
                        }
                    }
                })

                timerAnimator.start()

                val h = baseContext.resources.displayMetrics.heightPixels

                smokeMover1 =
                    ObjectAnimator1.ofFloat(imgView1, "translationY", 0.toFloat(), h.toFloat())
                smokeMover1.setDuration(3000)
                smokeMover1.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover1.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover1.start()
                anim1?.start()

                smokeMover2 =
                    ObjectAnimator1.ofFloat(imgView2, "translationY", 0.toFloat(), h.toFloat())
                smokeMover2.setDuration(3000)
                smokeMover2.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover2.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover2.start()
                anim2?.start()

                smokeMover3 =
                    ObjectAnimator1.ofFloat(imgView3, "translationY", 0.toFloat(), h.toFloat())
                smokeMover3.setDuration(3000)
                smokeMover3.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover3.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover3.start()
                anim3?.start()

                smokeMover4 =
                    ObjectAnimator1.ofFloat(imgView4, "translationY", 0.toFloat(), h.toFloat())
                smokeMover4.setDuration(3000)
                smokeMover4.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover4.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover4.start()
                anim4?.start()

                smokeMover5 =
                    ObjectAnimator1.ofFloat(imgView5, "translationY", 0.toFloat(), h.toFloat())
                smokeMover5.setDuration(3000)
                smokeMover5.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover5.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover5.start()
                anim5?.start()

                smokeMover6 =
                    ObjectAnimator1.ofFloat(imgView6, "translationY", 0.toFloat(), h.toFloat())
                smokeMover6.setDuration(3000)
                smokeMover6.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover6.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover6.start()
                anim6?.start()

                smokeMover7 =
                    ObjectAnimator1.ofFloat(imgView7, "translationY", 0.toFloat(), h.toFloat())
                smokeMover7.setDuration(3000)
                smokeMover7.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover7.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover7.start()
                anim7?.start()

                smokeMover8 =
                    ObjectAnimator1.ofFloat(imgView8, "translationY", 0.toFloat(), h.toFloat())
                smokeMover8.setDuration(3000)
                smokeMover8.setRepeatCount(ObjectAnimator1.INFINITE)
                smokeMover8.setRepeatMode(ObjectAnimator1.REVERSE)
                smokeMover8.start()
                anim8?.start()
            }
        }

        timer = TextView(this).apply {
            text = "0"
            textSize = 20f
            layoutParams = LinearLayoutCompat.LayoutParams(
                100,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT
            )
        }
        Log.d("timer", timer.text.toString())

        var linearLayoutCompat = LinearLayoutCompat(this).apply {
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT
            )
            addView(timer)
            addView(startButton)
        }

        var animContainer = LinearLayoutCompat(this).apply {
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LinearLayoutCompat.LayoutParams.MATCH_PARENT
            )
            weightSum = 0.8f
            addView(imgView1)
            addView(imgView2)
            addView(imgView3)
            addView(imgView4)
            addView(imgView5)
            addView(imgView6)
            addView(imgView7)
            addView(imgView8)
        }

        vg.addView(linearLayoutCompat)
        vg.addView(animContainer)
    }
}