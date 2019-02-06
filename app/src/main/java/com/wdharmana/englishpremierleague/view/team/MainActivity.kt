package com.wdharmana.englishpremierleague.view.team

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import com.wdharmana.englishpremierleague.R
import com.wdharmana.englishpremierleague.databinding.ActivityMainBinding
import com.wdharmana.englishpremierleague.model.Team
import com.wdharmana.englishpremierleague.viewmodel.TeamViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var adapter: TeamAdapter? = null
    private var lists = mutableListOf<Team>()

    @Nullable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        adapter = TeamAdapter(lists)

        binding?.list?.adapter = adapter
        binding?.isLoading = true

        list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))


        val viewModel = ViewModelProviders.of(this).get(TeamViewModel::class.java)
        observeViewModel(viewModel)

    }

    private fun observeViewModel(viewModel: TeamViewModel) {
        // Update list when data updated
        viewModel.getTeamListObservable().observe(this, Observer { teams ->
            teams?.let {
                binding?.isLoading = false
                lists.clear()
                lists.addAll(teams.toMutableList())
                adapter?.notifyDataSetChanged()

            }
        })
    }

}
