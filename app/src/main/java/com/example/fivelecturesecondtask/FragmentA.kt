package com.example.fivelecturesecondtask

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {
    override fun onAttach(context: Context) {
        Log.i("LifecycleCallbacks", "FragmentA: onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifecycleCallbacks", "FragmentA: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LifecycleCallbacks", "FragmentA: onCreateView")
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LifecycleCallbacks", "FragmentA: onViewCreated")
        view.findViewById<Button>(R.id.button).setOnClickListener {
            addFragment()
//            replaceFragment()
//            addAndStackFragment()
//            replaceAndStackFragment()
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    private fun addFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, FragmentB()).commit()
    }
    private fun replaceFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentB()).commit()
    }
    private fun addAndStackFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentB()).addToBackStack(null).commit()
    }
    private fun replaceAndStackFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentB()).addToBackStack(null).commit()
    }

    override fun onStart() {
        Log.i("LifecycleCallbacks", "FragmentA: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("LifecycleCallbacks", "FragmentA: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("LifecycleCallbacks", "FragmentA: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("LifecycleCallbacks", "FragmentA: onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("LifecycleCallbacks", "FragmentA: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.i("LifecycleCallbacks", "FragmentA: onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("LifecycleCallbacks", "FragmentA: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("LifecycleCallbacks", "FragmentA: onDetach")
        super.onDetach()
    }

}