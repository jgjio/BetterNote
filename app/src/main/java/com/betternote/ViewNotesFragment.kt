package com.betternote

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_view_notes.view.*

class ViewNotesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_view_notes, container, false)
        val nextAction = ViewNotesFragmentDirections.nextAction()
        view.fab.setOnClickListener {view ->
            Navigation.findNavController(view).navigate(nextAction)
        }
        return view
    }
}