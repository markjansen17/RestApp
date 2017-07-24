package jru.restaurantapp.ui.reservations;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import jru.restaurantapp.R;
import jru.restaurantapp.databinding.ItemReservationBinding;
import jru.restaurantapp.model.data.Reservation;


/**
 * Created by Mark Jansen Calderon on 1/12/2017.
 */

public class ReservationListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private ReservationsView view;
    private List<Reservation> list;
    private static final int VIEW_TYPE_MORE = 1;
    private static final int VIEW_TYPE_DEFAULT = 0;
    private boolean loading;

    public ReservationListAdapter(ReservationsView view) {
        this.view = view;
        list = new ArrayList<>();

    }


    @Override
    public int getItemViewType(int position) {
        return VIEW_TYPE_DEFAULT;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemReservationBinding itemReservationBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.item_reservation, parent, false);
        return new ReservationListAdapter.ViewHolder(itemReservationBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ReservationListAdapter.ViewHolder viewHolder = (ReservationListAdapter.ViewHolder) holder;
        viewHolder.itemReservationBinding.setReservation(list.get(position));
        viewHolder.itemReservationBinding.setView(view);

    }

    public void setList(List<Reservation> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void clear() {
        list.clear();
        notifyDataSetChanged();
    }


    private class ViewHolder extends RecyclerView.ViewHolder {
        private ItemReservationBinding itemReservationBinding;

        ViewHolder(ItemReservationBinding itemReservationBinding) {
            super(itemReservationBinding.getRoot());
            this.itemReservationBinding = itemReservationBinding;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
