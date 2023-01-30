package com.cleanarchitecturesample.databinding;
import com.cleanarchitecturesample.R;
import com.cleanarchitecturesample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRowLayoutBindingImpl extends ItemRowLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRowLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemRowLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.imageViewLogo.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewAddress.setTag(null);
        this.textViewName.setTag(null);
        this.textViewType.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.restaurant == variableId) {
            setRestaurant((com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRestaurant(@Nullable com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant Restaurant) {
        this.mRestaurant = Restaurant;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.restaurant);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String restaurantAddress = null;
        java.lang.String restaurantName = null;
        java.lang.String restaurantType = null;
        java.lang.String restaurantLogo = null;
        com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant restaurant = mRestaurant;

        if ((dirtyFlags & 0x3L) != 0) {



                if (restaurant != null) {
                    // read restaurant.address
                    restaurantAddress = restaurant.getAddress();
                    // read restaurant.name
                    restaurantName = restaurant.getName();
                    // read restaurant.type
                    restaurantType = restaurant.getType();
                    // read restaurant.logo
                    restaurantLogo = restaurant.getLogo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.cleanarchitecturesample.feature_clean_sample.presentation.util.BindingAdapterKt.banner(this.imageViewLogo, restaurantLogo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewAddress, restaurantAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewName, restaurantName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewType, restaurantType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): restaurant
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}