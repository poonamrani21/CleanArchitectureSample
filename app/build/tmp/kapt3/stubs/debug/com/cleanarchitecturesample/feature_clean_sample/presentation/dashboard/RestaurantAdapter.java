package com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/presentation/dashboard/RestaurantAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/Restaurant;", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/dashboard/RestaurantAdapter$RestaurantViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RestaurantComparator", "RestaurantViewHolder", "app_debug"})
public final class RestaurantAdapter extends androidx.recyclerview.widget.ListAdapter<com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant, com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard.RestaurantAdapter.RestaurantViewHolder> {
    
    public RestaurantAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard.RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard.RestaurantAdapter.RestaurantViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/presentation/dashboard/RestaurantAdapter$RestaurantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/cleanarchitecturesample/databinding/ItemRowLayoutBinding;", "(Lcom/cleanarchitecturesample/databinding/ItemRowLayoutBinding;)V", "bind", "", "item", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/Restaurant;", "app_debug"})
    public static final class RestaurantViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.cleanarchitecturesample.databinding.ItemRowLayoutBinding binding = null;
        
        public RestaurantViewHolder(@org.jetbrains.annotations.NotNull()
        com.cleanarchitecturesample.databinding.ItemRowLayoutBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/presentation/dashboard/RestaurantAdapter$RestaurantComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/Restaurant;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class RestaurantComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant> {
        
        public RestaurantComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant oldItem, @org.jetbrains.annotations.NotNull()
        com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant oldItem, @org.jetbrains.annotations.NotNull()
        com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant newItem) {
            return false;
        }
    }
}