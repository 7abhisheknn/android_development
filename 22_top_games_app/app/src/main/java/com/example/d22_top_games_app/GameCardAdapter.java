package com.example.d22_top_games_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GameCardAdapter extends RecyclerView.Adapter<GameCardAdapter.CardHolder> {
    private Context context;
    private ArrayList<GameModel> gameList;

    public GameCardAdapter(Context context, ArrayList<GameModel> gamesList) {
        this.context = context;
        this.gameList = gamesList;
    }

    @NonNull
    @Override
    public GameCardAdapter.CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_item, parent, false);
        return new CardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameCardAdapter.CardHolder holder, int position) {
        GameModel game = gameList.get(position);
        holder.gameTitle.setText(game.getName());
        holder.gameImg.setImageResource(game.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, game.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }
    public static class CardHolder extends RecyclerView.ViewHolder{
        private ImageView gameImg;
        private TextView gameTitle;
        public CardHolder(@NonNull View itemView) {
            super(itemView);
            gameImg = itemView.findViewById(R.id.imageView);
            gameTitle = itemView.findViewById(R.id.textView);
        }
    }
}
