package com.github.rdv0011.invaderskotlin

import android.app.Activity
import android.os.Bundle
import android.graphics.Bitmap
import android.graphics.Point

/*
    Main activity of the app
 */
class KotlinInvadersActivity: Activity() {
    /// Main view of the game. Implements logic of the game. Handles touch events.
    private var kotlinInvadersView: KotlinInvadersView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Get a Display object to access screen details
        val display = windowManager.defaultDisplay
        // Load the resolution into a Point object
        val size = Point()
        display.getSize(size)

        // Initialize gameView and set it as the view
        kotlinInvadersView = KotlinInvadersView(this, size)
        setContentView(kotlinInvadersView)
    }

    // This method executes when the player starts the game
    override fun onResume() {
        super.onResume()

        // Tell the gameView resume method to execute
        kotlinInvadersView?.resume()
    }

    override fun onPause() {
        super.onPause()

        // Tell the gameView pause method to execute
        kotlinInvadersView?.pause()
    }
}