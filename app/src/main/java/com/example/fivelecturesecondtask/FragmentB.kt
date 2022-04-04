package com.example.fivelecturesecondtask

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentB : Fragment() {

    override fun onAttach(context: Context) {
        Log.i("LifecycleCallbacks", "FragmentB: onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifecycleCallbacks", "FragmentB: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LifecycleCallbacks", "FragmentB: onCreateView")
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("LifecycleCallbacks", "FragmentB: onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onStart() {
        Log.i("LifecycleCallbacks", "FragmentB: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("LifecycleCallbacks", "FragmentB: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("LifecycleCallbacks", "FragmentB: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("LifecycleCallbacks", "FragmentB: onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("LifecycleCallbacks", "FragmentB: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.i("LifecycleCallbacks", "FragmentB: onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("LifecycleCallbacks", "FragmentB: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("LifecycleCallbacks", "FragmentB: onDetach")
        super.onDetach()
    }


}