package com.cau.dsprj.dsprj;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable iconDrawable ;
    private String idStr ;
    private String nameStr ;
    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setId(String id) {
        idStr = id ;
    }
    public void setName(String name) {
        nameStr = name ;
    }
    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getId() {
        return this.idStr ;
    }
    public String getName() {
        return this.nameStr ;
    }
    public String[] getData() {
        String[] ret = new String[2];
        ret[0] = idStr;
        ret[1] = nameStr;
        return ret;
    }
}
