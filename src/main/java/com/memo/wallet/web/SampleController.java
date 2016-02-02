package com.memo.wallet.web;

import com.memo.wallet.model.Gizmo;
import com.memo.wallet.model.GizmoChild;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class SampleController {

    @RequestMapping("/")
    public String index(Model model) {
        Gizmo gizmo = new Gizmo();
        gizmo.getChildren().add(new GizmoChild());
        model.addAttribute("gizmo", gizmo);
        return "hello";
    }

    @RequestMapping("/save")
    public String save(Gizmo gizmo) {
        System.out.println(gizmo.getField1());
        System.out.println(gizmo.getField2());
        for (GizmoChild child : gizmo.getChildren()) {
            System.out.println(child.getChildField1());
            System.out.println(child.getChildField2());
        }
        return "redirect:/";
    }
}