
package marrigebooking;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;


public class BookingRecordController implements Initializable {
    private Connection con;
    private Statement ss;
    private ResultSet rs;
    private PreparedStatement ps;
    @FXML
    private JFXCheckBox requriedCheckbox;
    @FXML
    private Button backBTN;
    @FXML
    private Button PaymentBTN;
    @FXML
    private Label priceshowlabel;
    @FXML
    private BorderPane borderpane_Decoration;
    @FXML
    private JFXComboBox<String> cmb_theme_party;
    @FXML
    private JFXCheckBox checkbox_1;
    @FXML
    private JFXCheckBox checkbox_2;
    private AnchorPane an_flo_1;
    @FXML
    private ImageView img_flo_1;
    @FXML
    private ImageView img_flo_2;
    @FXML
    private ImageView img_flo_3;
    @FXML
    private Button btn_next_flo_1;
    private AnchorPane an_flo_2;
    @FXML
    private ImageView img_flo_4;
    @FXML
    private JFXCheckBox checkbox_4;
    @FXML
    private ImageView img_flo_5;
    @FXML
    private ImageView img_flo_6;
    @FXML
    private JFXCheckBox checkbox_6;
    @FXML
    private Button btn_Back_flow_1;
    @FXML
    private JFXCheckBox checkbox_3;
    @FXML
    private JFXCheckBox checkbox_5;
    @FXML
    private ImageView img_balloon_1;
    @FXML
    private JFXCheckBox checkbox_Ballon_1;
    @FXML
    private ImageView img_balloon_2;
    @FXML
    private JFXCheckBox checkbox_Ballon_2;
    @FXML
    private ImageView img_balloon_3;
    @FXML
    private JFXCheckBox checkbox_Ballon_3;
    @FXML
    private ImageView img_balloon_4;
    @FXML
    private JFXCheckBox checkbox_Ballon_4;
    @FXML
    private ImageView img_balloon_5;
    @FXML
    private JFXCheckBox checkbox_Ballon_5;
    @FXML
    private ImageView img_balloon_6;
    @FXML
    private JFXCheckBox checkbox_Ballon_6;
    @FXML
    private Button btn_Back_Balloon;
    @FXML
    private Button btn_Next_Balloon;
    @FXML
    private ImageView img_Lighting_1;
    @FXML
    private JFXCheckBox checkbox_Lighting_1;
    @FXML
    private ImageView img_Lighting_2;
    @FXML
    private JFXCheckBox checkbox_Lighting_2;
    @FXML
    private ImageView img_Lighting_3;
    @FXML
    private JFXCheckBox checkbox_Lighting_3;
    @FXML
    private ImageView img_Lighting_4;
    @FXML
    private JFXCheckBox checkbox_Lighting_4;
    @FXML
    private ImageView img_Lighting_5;
    @FXML
    private JFXCheckBox checkbox_Lighting_5;
    @FXML
    private ImageView img_Lighting_6;
    @FXML
    private JFXCheckBox checkbox_Lighting_6;
    @FXML
    private Button btn_Next_Lighting;
    @FXML
    private Button btn_Back_Lighting_list;
    @FXML
    private JFXTextField txt_name;
    @FXML
    private JFXTextField txt_mobno;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        con=DataBase.cr();
        edi();
        combobox();
        priceshowlabel.setText(""+0);
    }    
//    public void set(String n,String p){
//        this.txt_name.setText(n);
//        this.txt_mobno.setText(p);
//    }
    public void combobox(){
        cmb_theme_party.getItems().add("Flowers Decoration");
        cmb_theme_party.getItems().add("Balloon Decotation");
        cmb_theme_party.getItems().add("Lighting Special Decoration");
    }
    public void edi(){
        cmb_theme_party.setVisible(false);
        txt_mobno.setVisible(false);
        //txt_name.setVisible(false);
        
        img_flo_1.setVisible(false);
        img_flo_2.setVisible(false);
        img_flo_3.setVisible(false);
        btn_next_flo_1.setVisible(false);
        img_flo_4.setVisible(false);
        img_flo_5.setVisible(false);
        img_flo_6.setVisible(false);
        btn_Back_flow_1.setVisible(false);
        checkbox_1.setVisible(false);
        checkbox_2.setVisible(false);
        checkbox_3.setVisible(false);
        checkbox_4.setVisible(false);
        checkbox_5.setVisible(false);
        checkbox_6.setVisible(false);
        
        img_balloon_1.setVisible(false);
        img_balloon_2.setVisible(false);
        img_balloon_3.setVisible(false);
        img_balloon_4.setVisible(false);
        img_balloon_5.setVisible(false);
        img_balloon_6.setVisible(false);
        checkbox_Ballon_1.setVisible(false);
        checkbox_Ballon_2.setVisible(false);
        checkbox_Ballon_3.setVisible(false);
        checkbox_Ballon_4.setVisible(false);
        checkbox_Ballon_5.setVisible(false);
        checkbox_Ballon_6.setVisible(false);
        btn_Back_Balloon.setVisible(false);
        btn_Next_Balloon.setVisible(false);
        
        img_Lighting_1.setVisible(false);
        img_Lighting_2.setVisible(false);
        img_Lighting_3.setVisible(false);
        img_Lighting_4.setVisible(false);
        img_Lighting_5.setVisible(false);
        img_Lighting_6.setVisible(false);
        checkbox_Lighting_1.setVisible(false);
        checkbox_Lighting_2.setVisible(false);
        checkbox_Lighting_3.setVisible(false);
        checkbox_Lighting_4.setVisible(false);
        checkbox_Lighting_5.setVisible(false);
        checkbox_Lighting_6.setVisible(false);
        btn_Back_Lighting_list.setVisible(false);
        btn_Next_Lighting.setVisible(false);
    }
    public void flow2(){
        img_flo_1.setVisible(false);
        checkbox_1.setVisible(false);
        img_flo_2.setVisible(false);
        checkbox_2.setVisible(false);
        img_flo_3.setVisible(false);
        checkbox_3.setVisible(false);
        btn_next_flo_1.setVisible(false);
        img_flo_4.setVisible(true);
        img_flo_5.setVisible(true);
        img_flo_6.setVisible(true);
        checkbox_4.setVisible(true);
        checkbox_5.setVisible(true);
        checkbox_6.setVisible(true);
        btn_Back_flow_1.setVisible(true);
        img_balloon_1.setVisible(false);
        img_balloon_2.setVisible(false);
        img_balloon_3.setVisible(false);
        img_balloon_4.setVisible(false);
        img_balloon_5.setVisible(false);
        img_balloon_6.setVisible(false);
        checkbox_Ballon_1.setVisible(false);
        checkbox_Ballon_2.setVisible(false);
        checkbox_Ballon_3.setVisible(false);
        checkbox_Ballon_4.setVisible(false);
        checkbox_Ballon_5.setVisible(false);
        checkbox_Ballon_6.setVisible(false);
        btn_Back_Balloon.setVisible(false);
        btn_Next_Balloon.setVisible(false);
        img_Lighting_1.setVisible(false);
        img_Lighting_2.setVisible(false);
        img_Lighting_3.setVisible(false);
        img_Lighting_4.setVisible(false);
        img_Lighting_5.setVisible(false);
        img_Lighting_6.setVisible(false);
        checkbox_Lighting_1.setVisible(false);
        checkbox_Lighting_2.setVisible(false);
        checkbox_Lighting_3.setVisible(false);
        checkbox_Lighting_4.setVisible(false);
        checkbox_Lighting_5.setVisible(false);
        checkbox_Lighting_6.setVisible(false);
        btn_Back_Lighting_list.setVisible(false);
        btn_Next_Lighting.setVisible(false);
        
    }
    public void flow1(){
        img_flo_1.setVisible(true);
        checkbox_1.setVisible(true);
        img_flo_2.setVisible(true);
        checkbox_2.setVisible(true);
        img_flo_3.setVisible(true);
        checkbox_3.setVisible(true);
        btn_next_flo_1.setVisible(true);
        img_flo_4.setVisible(false);
        img_flo_5.setVisible(false);
        img_flo_6.setVisible(false);
        checkbox_4.setVisible(false);
        checkbox_5.setVisible(false);
        checkbox_6.setVisible(false);
        btn_Back_flow_1.setVisible(false);
        
        img_balloon_1.setVisible(false);
        img_balloon_2.setVisible(false);
        img_balloon_3.setVisible(false);
        img_balloon_4.setVisible(false);
        img_balloon_5.setVisible(false);
        img_balloon_6.setVisible(false);
        checkbox_Ballon_1.setVisible(false);
        checkbox_Ballon_2.setVisible(false);
        checkbox_Ballon_3.setVisible(false);
        checkbox_Ballon_4.setVisible(false);
        checkbox_Ballon_5.setVisible(false);
        checkbox_Ballon_6.setVisible(false);
        btn_Back_Balloon.setVisible(false);
        btn_Next_Balloon.setVisible(false);
        img_Lighting_1.setVisible(false);
        img_Lighting_2.setVisible(false);
        img_Lighting_3.setVisible(false);
        img_Lighting_4.setVisible(false);
        img_Lighting_5.setVisible(false);
        img_Lighting_6.setVisible(false);
        checkbox_Lighting_1.setVisible(false);
        checkbox_Lighting_2.setVisible(false);
        checkbox_Lighting_3.setVisible(false);
        checkbox_Lighting_4.setVisible(false);
        checkbox_Lighting_5.setVisible(false);
        checkbox_Lighting_6.setVisible(false);
        btn_Back_Lighting_list.setVisible(false);
        btn_Next_Lighting.setVisible(false);
    }
    public void balloon2(){
         img_balloon_1.setVisible(false);
        img_balloon_2.setVisible(false);
        img_balloon_3.setVisible(false);
        img_balloon_4.setVisible(true);
        img_balloon_5.setVisible(true);
        img_balloon_6.setVisible(true);
        checkbox_Ballon_1.setVisible(false);
        checkbox_Ballon_2.setVisible(false);
        checkbox_Ballon_3.setVisible(false);
        checkbox_Ballon_4.setVisible(true);
        checkbox_Ballon_5.setVisible(true);
        checkbox_Ballon_6.setVisible(true);
        btn_Next_Balloon.setVisible(true);
        btn_Back_Balloon.setVisible(false);
        
        img_flo_1.setVisible(false);
        checkbox_1.setVisible(false);
        img_flo_2.setVisible(false);
        checkbox_2.setVisible(false);
        img_flo_3.setVisible(false);
        checkbox_3.setVisible(false);
        btn_next_flo_1.setVisible(false);
        img_flo_4.setVisible(false);
        img_flo_5.setVisible(false);
        img_flo_6.setVisible(false);
        checkbox_4.setVisible(false);
        checkbox_5.setVisible(false);
        checkbox_6.setVisible(false);
        btn_Back_flow_1.setVisible(false);
        img_Lighting_1.setVisible(false);
        img_Lighting_2.setVisible(false);
        img_Lighting_3.setVisible(false);
        img_Lighting_4.setVisible(false);
        img_Lighting_5.setVisible(false);
        img_Lighting_6.setVisible(false);
        checkbox_Lighting_1.setVisible(false);
        checkbox_Lighting_2.setVisible(false);
        checkbox_Lighting_3.setVisible(false);
        checkbox_Lighting_4.setVisible(false);
        checkbox_Lighting_5.setVisible(false);
        checkbox_Lighting_6.setVisible(false);
        btn_Back_Lighting_list.setVisible(false);
        btn_Next_Lighting.setVisible(false);
    }
    public void balloon1(){
        img_balloon_1.setVisible(true);
        img_balloon_2.setVisible(true);
        img_balloon_3.setVisible(true);
        img_balloon_4.setVisible(false);
        img_balloon_5.setVisible(false);
        img_balloon_6.setVisible(false);
        checkbox_Ballon_1.setVisible(true);
        checkbox_Ballon_2.setVisible(true);
        checkbox_Ballon_3.setVisible(true);
        checkbox_Ballon_4.setVisible(false);
        checkbox_Ballon_5.setVisible(false);
        checkbox_Ballon_6.setVisible(false);
        btn_Back_Balloon.setVisible(true);
        btn_Next_Balloon.setVisible(false);
        
        img_flo_1.setVisible(false);
        checkbox_1.setVisible(false);
        img_flo_2.setVisible(false);
        checkbox_2.setVisible(false);
        img_flo_3.setVisible(false);
        checkbox_3.setVisible(false);
        btn_next_flo_1.setVisible(false);
        img_flo_4.setVisible(false);
        img_flo_5.setVisible(false);
        img_flo_6.setVisible(false);
        checkbox_4.setVisible(false);
        checkbox_5.setVisible(false);
        checkbox_6.setVisible(false);
        btn_Back_flow_1.setVisible(false);
        img_Lighting_1.setVisible(false);
        img_Lighting_2.setVisible(false);
        img_Lighting_3.setVisible(false);
        img_Lighting_4.setVisible(false);
        img_Lighting_5.setVisible(false);
        img_Lighting_6.setVisible(false);
        checkbox_Lighting_1.setVisible(false);
        checkbox_Lighting_2.setVisible(false);
        checkbox_Lighting_3.setVisible(false);
        checkbox_Lighting_4.setVisible(false);
        checkbox_Lighting_5.setVisible(false);
        checkbox_Lighting_6.setVisible(false);
        btn_Back_Lighting_list.setVisible(false);
        btn_Next_Lighting.setVisible(false);
    }
    public void light1(){
        img_Lighting_1.setVisible(true);
        img_Lighting_2.setVisible(true);
        img_Lighting_3.setVisible(true);
        img_Lighting_4.setVisible(false);
        img_Lighting_5.setVisible(false);
        img_Lighting_6.setVisible(false);
        checkbox_Lighting_1.setVisible(true);
        checkbox_Lighting_2.setVisible(true);
        checkbox_Lighting_3.setVisible(true);
        checkbox_Lighting_4.setVisible(false);
        checkbox_Lighting_5.setVisible(false);
        checkbox_Lighting_6.setVisible(false);
        btn_Back_Lighting_list.setVisible(false);
        btn_Next_Lighting.setVisible(true);
        
        img_flo_1.setVisible(false);
        img_flo_2.setVisible(false);
        img_flo_3.setVisible(false);
        btn_next_flo_1.setVisible(false);
        img_flo_4.setVisible(false);
        img_flo_5.setVisible(false);
        img_flo_6.setVisible(false);
        btn_Back_flow_1.setVisible(false);
        checkbox_1.setVisible(false);
        checkbox_2.setVisible(false);
        checkbox_3.setVisible(false);
        checkbox_4.setVisible(false);
        checkbox_5.setVisible(false);
        checkbox_6.setVisible(false);
        
        img_balloon_1.setVisible(false);
        img_balloon_2.setVisible(false);
        img_balloon_3.setVisible(false);
        img_balloon_4.setVisible(false);
        img_balloon_5.setVisible(false);
        img_balloon_6.setVisible(false);
        checkbox_Ballon_1.setVisible(false);
        checkbox_Ballon_2.setVisible(false);
        checkbox_Ballon_3.setVisible(false);
        checkbox_Ballon_4.setVisible(false);
        checkbox_Ballon_5.setVisible(false);
        checkbox_Ballon_6.setVisible(false);
        btn_Back_Balloon.setVisible(false);
        btn_Next_Balloon.setVisible(false);
 }
    public void light2(){
        img_Lighting_1.setVisible(false);
        img_Lighting_2.setVisible(false);
        img_Lighting_3.setVisible(false);
        img_Lighting_4.setVisible(true);
        img_Lighting_5.setVisible(true);
        img_Lighting_6.setVisible(true);
        checkbox_Lighting_1.setVisible(false);
        checkbox_Lighting_2.setVisible(false);
        checkbox_Lighting_3.setVisible(false);
        checkbox_Lighting_4.setVisible(true);
        checkbox_Lighting_5.setVisible(true);
        checkbox_Lighting_6.setVisible(true);
        btn_Back_Lighting_list.setVisible(true);
        btn_Next_Lighting.setVisible(false);
        
        img_flo_1.setVisible(false);
        img_flo_2.setVisible(false);
        img_flo_3.setVisible(false);
        btn_next_flo_1.setVisible(false);
        img_flo_4.setVisible(false);
        img_flo_5.setVisible(false);
        img_flo_6.setVisible(false);
        btn_Back_flow_1.setVisible(false);
        checkbox_1.setVisible(false);
        checkbox_2.setVisible(false);
        checkbox_3.setVisible(false);
        checkbox_4.setVisible(false);
        checkbox_5.setVisible(false);
        checkbox_6.setVisible(false);
        
        img_balloon_1.setVisible(false);
        img_balloon_2.setVisible(false);
        img_balloon_3.setVisible(false);
        img_balloon_4.setVisible(false);
        img_balloon_5.setVisible(false);
        img_balloon_6.setVisible(false);
        checkbox_Ballon_1.setVisible(false);
        checkbox_Ballon_2.setVisible(false);
        checkbox_Ballon_3.setVisible(false);
        checkbox_Ballon_4.setVisible(false);
        checkbox_Ballon_5.setVisible(false);
        checkbox_Ballon_6.setVisible(false);
        btn_Back_Balloon.setVisible(false);
        btn_Next_Balloon.setVisible(false);

        
    }
    public void load(String fxml){
        Parent root=null;
        
        try {
            root= FXMLLoader.load(getClass().getResource(fxml));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderpane_Decoration.setCenter(root);
   }
    @FXML
    private void BTN_back_decoration(ActionEvent event) {
        load("Caterer.fxml");
    }

    @FXML
    private void BTN_next_payment(ActionEvent event) {
        if(requriedCheckbox.isSelected()){
            if(txt_name.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Enter Name");
            }else{
            try{
            ps = con.prepareStatement("UPDATE Booking SET Fullname =?,Decoration_paty_theme=?,Decoration_bill_total=?,Decoration_req=? where Fullname=?");
            ps.setString(1, txt_name.getText());
            ps.setString(2, cmb_theme_party.getValue().toString());
            ps.setString(3, priceshowlabel.getText());
            ps.setBoolean(4,requriedCheckbox.isSelected());
            ps.setString(5, txt_name.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Save success");
            load("Payment.fxml"); 
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        }else{
            if(txt_name.getText().equals("")){
            JOptionPane.showMessageDialog(null, "plzz Enter Name");
        }else{
        try{
            ps = con.prepareStatement("UPDATE Booking SET Fullname =?,Decoration_bill_total=? where Fullname=?");
            ps.setString(1, txt_name.getText());
            ps.setString(2, priceshowlabel.getText());
            ps.setString(3, txt_name.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Save success");
            load("Payment.fxml");  
        }
            catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
              
        }
    }

    @FXML
    private void cmb_party_Action(ActionEvent event) {
         
        if(cmb_theme_party.getSelectionModel().getSelectedItem().equals("Flowers Decoration")){
           flow1();}
      else if(cmb_theme_party.getSelectionModel().getSelectedItem().equals("Balloon Decotation")){
            balloon2();}
      else if(cmb_theme_party.getSelectionModel().getSelectedItem().equals("Lighting Special Decoration")){
           light1();}
      else{
            JOptionPane.showMessageDialog(null, "Select Any One ... !!!");
      }
        }

    @FXML
    private void check_Action(ActionEvent event) {
        if(checkbox_1.isSelected()){priceshowlabel.setText("20000");checkbox_2.setVisible(false);checkbox_3.setVisible(false); }else{checkbox_2.setVisible(true);checkbox_3.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void call_next_anc_flo_1(ActionEvent event) { flow2();}

    @FXML
    private void call_Back_anc_flo_1(ActionEvent event) { flow1();}

    @FXML
    private void check_ac_2(ActionEvent event) {
         if(checkbox_2.isSelected()){ priceshowlabel.setText("25000");checkbox_1.setVisible(false);checkbox_3.setVisible(false); }else{checkbox_1.setVisible(true);checkbox_3.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_ac_3(ActionEvent event) {
         if(checkbox_3.isSelected()){ priceshowlabel.setText("18000");checkbox_2.setVisible(false);checkbox_1.setVisible(false); }else{checkbox_2.setVisible(true);checkbox_1.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_ac_4(ActionEvent event) {
         if(checkbox_4.isSelected()){ priceshowlabel.setText("23000");checkbox_5.setVisible(false);checkbox_6.setVisible(false); }else{checkbox_5.setVisible(true);checkbox_6.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_ac_5(ActionEvent event) {
         if(checkbox_5.isSelected()){ priceshowlabel.setText("15000");checkbox_4.setVisible(false);checkbox_6.setVisible(false); }else{checkbox_4.setVisible(true);checkbox_6.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_ac_6(ActionEvent event) {
         if(checkbox_6.isSelected()){ priceshowlabel.setText("20000");checkbox_4.setVisible(false);checkbox_5.setVisible(false); }else{checkbox_4.setVisible(true);checkbox_5.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void Action_Redquried(ActionEvent event) {
        if(requriedCheckbox.isSelected()){cmb_theme_party.setVisible(true); txt_name.setVisible(true);txt_mobno.setVisible(true);}else{ cmb_theme_party.setVisible(false);txt_mobno.setVisible(false);txt_name.setVisible(false);edi();}
    }

    @FXML
    private void call_privious_balloon_list(ActionEvent event) { balloon2();}

    @FXML
    private void call_next_balloon_list(ActionEvent event) { balloon1();}

    @FXML
    private void check_balloon_1(ActionEvent event) {
        if(checkbox_Ballon_1.isSelected()){ priceshowlabel.setText("12000");checkbox_Ballon_2.setVisible(false);checkbox_Ballon_3.setVisible(false); }else{checkbox_Ballon_2.setVisible(true);checkbox_Ballon_3.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_balloon_2(ActionEvent event) {
        if(checkbox_Ballon_2.isSelected()){ priceshowlabel.setText("10000");checkbox_Ballon_1.setVisible(false);checkbox_Ballon_3.setVisible(false); }else{checkbox_Ballon_1.setVisible(true);checkbox_Ballon_3.setVisible(true); priceshowlabel.setText("");} 
    }

    @FXML
    private void check_balloon_4(ActionEvent event) {
        if(checkbox_Ballon_4.isSelected()){ priceshowlabel.setText("10000");checkbox_Ballon_5.setVisible(false);checkbox_Ballon_6.setVisible(false); }else{checkbox_Ballon_6.setVisible(true);checkbox_Ballon_5.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_balloon_5(ActionEvent event) {
            if(checkbox_Ballon_5.isSelected()){ priceshowlabel.setText("12000");checkbox_Ballon_4.setVisible(false);checkbox_Ballon_6.setVisible(false); }else{checkbox_Ballon_6.setVisible(true);checkbox_Ballon_4.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_balloon_6(ActionEvent event) {
            if(checkbox_Ballon_6.isSelected()){ priceshowlabel.setText("12000");checkbox_Ballon_5.setVisible(false);checkbox_Ballon_4.setVisible(false); }else{checkbox_Ballon_4.setVisible(true);checkbox_Ballon_5.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_balloon_3_3(ActionEvent event) {
       if(checkbox_Ballon_3.isSelected()){ priceshowlabel.setText("11000");checkbox_Ballon_2.setVisible(false);checkbox_Ballon_1.setVisible(false); }else{checkbox_Ballon_1.setVisible(true);checkbox_Ballon_2.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_Lighting_action_1(ActionEvent event) {
       if(checkbox_Lighting_1.isSelected()){ priceshowlabel.setText("30000");checkbox_Lighting_2.setVisible(false);checkbox_Lighting_3.setVisible(false); }else{checkbox_Lighting_2.setVisible(true);checkbox_Lighting_3.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_Lighting_action_2(ActionEvent event) {
        if(checkbox_Lighting_2.isSelected()){ priceshowlabel.setText("35000");checkbox_Lighting_1.setVisible(false);checkbox_Lighting_3.setVisible(false); }else{checkbox_Lighting_1.setVisible(true);checkbox_Lighting_3.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_Lighting_action_3(ActionEvent event) {
        if(checkbox_Lighting_3.isSelected()){ priceshowlabel.setText("28000");checkbox_Lighting_2.setVisible(false);checkbox_Lighting_1.setVisible(false); }else{checkbox_Lighting_2.setVisible(true);checkbox_Lighting_1.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_Lighting_action_4(ActionEvent event) {
        if(checkbox_Lighting_4.isSelected()){ priceshowlabel.setText("32000");checkbox_Lighting_5.setVisible(false);checkbox_Lighting_6.setVisible(false); }else{checkbox_Lighting_5.setVisible(true);checkbox_Lighting_6.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_Lighting_action_5(ActionEvent event) {
        if(checkbox_Lighting_5.isSelected()){ priceshowlabel.setText("30000");checkbox_Lighting_4.setVisible(false);checkbox_Lighting_6.setVisible(false); }else{checkbox_Lighting_4.setVisible(true);checkbox_Lighting_6.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void check_Lighting_action_6(ActionEvent event) {
        if(checkbox_Lighting_6.isSelected()){ priceshowlabel.setText("32000");checkbox_Lighting_4.setVisible(false);checkbox_Lighting_5.setVisible(false); }else{checkbox_Lighting_5.setVisible(true);checkbox_Lighting_4.setVisible(true); priceshowlabel.setText("");}
    }

    @FXML
    private void call_next_Lighting_list(ActionEvent event) {
        light2();
    }

    @FXML
    private void call_Back_Lighting_list(ActionEvent event) {
        light1();
    }

    @FXML
    private void Auto_serach(KeyEvent event) {
        try{
               ss = con.createStatement();
               rs = ss.executeQuery("Select * from Booking where Fullname = '"+txt_name.getText()+"'");
              if(rs.next())
               {
                   txt_name.setText(rs.getString("Fullname"));
                   txt_mobno.setText(rs.getString("Contactno"));
                  // JOptionPane.showMessageDialog(null, "Save Successfully...!!");
                }
//              else   JOptionPane.showMessageDialog(null, "Fail...!!");
                       }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}     
    
    

