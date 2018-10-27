package com.viasverdes.viasverdesespana.ui.fragment

import android.os.Bundle
import com.underlegendz.corelegendz.vm.VMFragment
import com.viasverdes.viasverdesespana.R


class InfoLegalTextFragment : VMFragment() {

  companion object {

    fun newInstance(): InfoLegalTextFragment {
      val args: Bundle = Bundle()
//            args.putSerializable(ARG_CAUGHT, caught)
      val fragment = InfoLegalTextFragment()
      fragment.arguments = args
      return fragment
    }
  }


  override fun initializeView() {
  }

  override fun getLayoutResource(): Int {
    return R.layout.fragment__more_info__legal_text
  }

}