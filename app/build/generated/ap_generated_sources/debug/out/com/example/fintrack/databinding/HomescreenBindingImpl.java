package com.example.fintrack.databinding;
import com.example.fintrack.R;
import com.example.fintrack.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomescreenBindingImpl extends HomescreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lnMenu, 2);
        sViewsWithIds.put(R.id.lnheader, 3);
        sViewsWithIds.put(R.id.imgMenu, 4);
        sViewsWithIds.put(R.id.home, 5);
        sViewsWithIds.put(R.id.totalincome, 6);
        sViewsWithIds.put(R.id.totalIncomeTextView, 7);
        sViewsWithIds.put(R.id.totalexpense, 8);
        sViewsWithIds.put(R.id.totalExpenseTextView, 9);
        sViewsWithIds.put(R.id.total, 10);
        sViewsWithIds.put(R.id.netTextView, 11);
        sViewsWithIds.put(R.id.nestedScrollView, 12);
        sViewsWithIds.put(R.id.recTransactions, 13);
        sViewsWithIds.put(R.id.imgAddTrans, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomescreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private HomescreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[14]
            , (android.widget.ImageView) bindings[4]
            , (bindings[2] != null) ? com.example.fintrack.databinding.DrawerBinding.bind((android.view.View) bindings[2]) : null
            , (android.widget.RelativeLayout) bindings[3]
            , (com.google.android.material.navigation.NavigationView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            );
        this.drawerlayout.setTag(null);
        this.navigationView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}