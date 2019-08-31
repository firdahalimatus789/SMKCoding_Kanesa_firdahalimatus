package id.kanesacoding.biodata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class  fragmentHome : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, sa
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.home, container, false)
}