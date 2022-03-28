/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesinPencarian;

import javax.swing.Icon;


public class ImgsNText {
public String name;
private Icon img;

    public ImgsNText(String text, Icon icon) {
        this.name = text;
        this.img = icon;
        //to change body of generated methods, choose tools |templates.
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Icon getImg(){
        return img;
    }
    public void setImg(Icon img){
        this.img = img;
    }
    
    @Override
        public String toString(){
            return name;
        }
    
}
