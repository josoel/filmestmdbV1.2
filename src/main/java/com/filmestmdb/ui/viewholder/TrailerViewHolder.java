package com.filmestmdb.ui.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.filmestmdb.R;
import com.filmestmdb.model.MovieTrailer;
import com.filmestmdb.ui.utils.TrailerClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TrailerViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.tv_movie_trailer_name)
    TextView mMovieTrailerName;
    @BindView(R.id.cv_movie_trailer_card)
    CardView mMovieCard;

    public TrailerViewHolder(final View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final MovieTrailer mMovieTrailer, final TrailerClickListener mTrailerClickListener) {
        mMovieTrailerName.setText(mMovieTrailer.getName());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTrailerClickListener.onMovieTrailerClick(mMovieTrailer);
            }
        });
    }
}
