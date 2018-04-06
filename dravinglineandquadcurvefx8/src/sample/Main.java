package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root=new Group();
        Scene scene=new Scene(root,600,600);

        //First line
        Line line1=new Line(200,20,300,20);
      /*  line1.setStartX(200);
          line1.setStartY(20);
          line1.setEndX(300);
          line1.setEndY(20);
      */
        line1.setStroke(Color.BLACK);//SET COLOR OF THE LINE
        root.getChildren().add(line1);

        //Second line
        Line line2=new Line(200,20,180,100);
        line2.setStroke(Color.BLACK);
        root.getChildren().add(line2);

        //Third line
        Line line3=new Line(300,20,320,100);
        line3.setStroke(Color.BLACK);
        root.getChildren().add(line3);

        //QuadCurve
        QuadCurve quadCurve=new QuadCurve(180,100,245,50,320,100);
        quadCurve.setStroke(Color.BLACK);
        quadCurve.setFill(Color.FLORALWHITE);
       /* quadCurve.setStartX(180);
        quadCurve.setStartY(100);
        quadCurve.setControlX(245);
        quadCurve.setControlY(50);
        quadCurve.setEndX(320);
        quadCurve.setEndY(100);  */
        root.getChildren().add(quadCurve);

        //Ellipse Face
        Ellipse face=new Ellipse(250,115,55,45);
        face.setStroke(Color.BLACK);
        face.setFill(Color.YELLOW);
      /*  face.setCenterX(250);
        face.setCenterY(115);
        face.setRadiusX(55);
        face.setRadiusY(45);  */
        root.getChildren().add(face);

        //Eyes
        Ellipse eye1=new Ellipse(230,105,8,4);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.FLORALWHITE);
        root.getChildren().add(eye1);
        Ellipse eye2=new Ellipse(270,105,8,4);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.FLORALWHITE);
        root.getChildren().add(eye2);

        //Smile
        QuadCurve smile=new QuadCurve(230,140,250,150,270,140);
        smile.setStroke(Color.BLACK);
        smile.setFill(Color.FLORALWHITE);
        root.getChildren().add(smile);

        //Hands
        Rectangle hand1=new Rectangle(20,150);
        hand1.setStroke(Color.BLACK);
        hand1.setFill(Color.FLORALWHITE);
       /* hand1.setWidth(20);
        hand1.setHeight(150); */
        hand1.setX(100);
        hand1.setY(220);
        hand1.setRotate(40);
        hand1.setArcHeight(30);
        hand1.setArcWidth(20);
        root.getChildren().add(hand1);

        Rectangle hand2=new Rectangle(20,150);
        hand2.setStroke(Color.BLACK);
        hand2.setFill(Color.FLORALWHITE);
        hand2.setX(380);
        hand2.setY(220);
        hand2.setRotate(-40);
        hand2.setArcHeight(30);
        hand2.setArcWidth(20);
        root.getChildren().add(hand2);

        //Legs
        Rectangle leg1=new Rectangle(25,200);
        leg1.setStroke(Color.BLACK);
        leg1.setFill(Color.FLORALWHITE);
        leg1.setX(200);
        leg1.setY(380);
        leg1.setRotate(180);
        leg1.setArcHeight(30);
        leg1.setArcWidth(20);
        root.getChildren().add(leg1);

        Rectangle leg2=new Rectangle(25,200);
        leg2.setStroke(Color.BLACK);
        leg2.setFill(Color.FLORALWHITE);
        leg2.setX(280);
        leg2.setY(380);
        leg2.setRotate(180);
        leg2.setArcHeight(30);
        leg2.setArcWidth(20);
        root.getChildren().add(leg2);


        //Body
        Ellipse body=new Ellipse(250,282,120,120);
        body.setStroke(Color.BLACK);


        //Linear gradient property
        LinearGradient color=new LinearGradient(
                250,282,120,120,
                false,//proportion
                CycleMethod.REFLECT,
                new Stop(0,Color.rgb(120,55,80,0.97)),
                new Stop(1,Color.rgb(90,150,60,0.97))
        );
        body.setFill(color);
        root.getChildren().add(body);

        //Tie
        Rectangle tie=new Rectangle(20,235);
        tie.setStroke(Color.BLACK);
        tie.setFill(Color.RED);
        tie.setX(240);
        tie.setY(163);
        tie.setRotate(180);
        tie.setArcHeight(30);
        tie.setArcWidth(20);
        root.getChildren().add(tie);

        //TEXT
        Text text=new Text(380,50,"Hacı Doğan \nİlbars");
        Font font=new Font("Serif",20);
        text.setFont(font);
        text.setFill(Color.RED);
        //Shadow
       DropShadow shadow=new DropShadow();
       shadow.setOffsetX(10);
       shadow.setOffsetY(10);
       shadow.setColor(Color.rgb(50,50,50,0.6));
       text.setEffect(shadow);
      // root.getChildren().add(text);

        //Reflection
        Text text1=new Text(380,180,"Created on 27/10/2017");
        text1.setFont(font);
        text1.setFill(Color.MAROON);
        Reflection reflection=new Reflection();
        reflection.setFraction(8);
        reflection.setTopOffset(5);
        text1.setEffect(reflection);
        root.getChildren().addAll(text,text1);



        primaryStage.setTitle("Fx8");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
