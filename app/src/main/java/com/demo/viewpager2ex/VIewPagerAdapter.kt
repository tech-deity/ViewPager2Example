package com.demo.viewpager2ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class VIewPagerAdapter (  val images :List<Int>):RecyclerView.Adapter<ViewPagerViewHolder>()
        {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {

                val view= LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
                return ViewPagerViewHolder(view)

            }

            override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {

                val curImage= images[position]
                    holder.itemView.iv_img.setImageResource(curImage)
            }

            override fun getItemCount(): Int {
               return  images.size
            }

        }

class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)