package com.memo.wallet.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tin_hanc on 9/11/2015 AD.
 */
public class Gizmo {

    private String field1;
    private String field2;
    private List<GizmoChild> children;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public List<GizmoChild> getChildren() {
        if (children == null) {
            children = new ArrayList<GizmoChild>();
        }
        return children;
    }

    public void setChildren(List<GizmoChild> children) {
        this.children = children;
    }
}
