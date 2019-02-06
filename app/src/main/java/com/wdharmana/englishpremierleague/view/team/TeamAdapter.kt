package com.wdharmana.englishpremierleague.view.team

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wdharmana.englishpremierleague.R
import com.wdharmana.englishpremierleague.databinding.TeamItemBinding
import com.wdharmana.englishpremierleague.model.Team

class TeamAdapter(private val lists: MutableList<Team>): RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {

        val binding = DataBindingUtil.inflate<TeamItemBinding>(
                LayoutInflater.from(parent.context),
                R.layout.team_item, parent, false)

        return TeamViewHolder(binding)
    }

    override fun getItemCount(): Int = lists.size ?: 0

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.binding.team = lists[position]
    }

    class TeamViewHolder(val binding: TeamItemBinding) : RecyclerView.ViewHolder(binding.root)

}