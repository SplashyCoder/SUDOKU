package control;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Interfaz extends JFrame implements ActionListener{
    int contador =0;
    int restante = 60;
    boolean turno =false;
    JPanel panel;
    JButton matriz[][]= new JButton[8][8]; 
          
    public Interfaz(){
        //setLayer(null);
      
        //boton1.setBounds(300,250,100,30);
        //add(boton1);
        //boton1.addActionListener(this);
        panel=new JPanel();
        panel.setLayout(new GridLayout(8,8));

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++ ){
                matriz[i][j]= new JButton("boton"+contador);
                contador ++;
                panel.add(matriz[i][j]);
                matriz[i][j].addActionListener(this);
                matriz[i][j].setIcon(new ImageIcon("src/imagenes/blank.png"));//ruta del programa
                matriz[i][j].setText("blanco");
                
            }
            
        }
        matriz[3][3].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
        matriz [3][3].setText("rojo");
        matriz[4][4].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
        matriz [4][4].setText("rojo");
        matriz[3][4].setIcon(new ImageIcon ("src/imagenes/verde.png"));
        matriz [3][4].setText("verde");
        matriz[4][3].setIcon(new ImageIcon ("src/imagenes/verde.png"));
        matriz [4][3].setText("verde");
        add(panel);
       verificar();
        
        //while que verifica cambios de turno y casillas disponibles (booleano y contador inverso respectivamente
                    //verificar validas aqui
        
        
        
    }
    
    public void verificar(){
 
         for(int h=0;h<8;h++){
            for(int f=0;f<8;f++ ){
                if(matriz[h][f].getText() ==("valido")){
                  matriz[h][f].setIcon(new ImageIcon("src/imagenes/blank.png"));//ruta del programa
                matriz[h][f].setText("blanco"); 
            }
         }
         }
      // parar en cada casilla
//si es blanca, entrar a if
//si en cualquiera de sus lados hay una del color contrario al jugador (verde), empieza el while
//parametro de while: hasta llegar a roja o al final
 //if dentro del while: 
 //si encuentra el final, se detiene sin arrojar nada
 // si se detiene por casilla roja , marca la inicial como valida
 //repetir en cada direccion
 if (turno == true){
     int rev = 0;
     int rev2 = 0;
 for (int x =0;x<8;x++){
     for (int y=0 ; y<8;y++){
         if (matriz[x][y].getText() == ("blanco")){
             if (x<7){
             if (matriz [x+1][y].getText()== "verde"){
                 rev = x;
       do{if (matriz[rev][y].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                 
       }while (rev!=7);
                  
                     
                 
                
             }
             
         }    if (x>0){
             if (matriz [x-1][y].getText()== "verde"){
                 rev = x;
       do{if (matriz[rev][y].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                 
       }while (rev!=0);
                  
                     
                 
                
             }
             
         }
             if (y<7){
             if (matriz [x][y+1].getText()== "verde"){
                 rev = y;
       do{if (matriz[x][rev].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                 
       }while (rev!=7);
                  
                     
                 
                
             }
             
         }
                 if (y>0){
             if (matriz [x][y-1].getText()== "verde"){
                 rev = y;
       do{if (matriz[x][rev-1].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                 
       }while (rev!=0);
                  
                     
                 
                
             }
             
         }
                     if (x<7 & y <7){
             if (matriz [x+1][y+1].getText()== "verde"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                     if (rev2<7){
                         rev2 = rev2+1;
                     }
                 
       }while (rev!=7 & rev2!=7);
                  
                     
                 
                
             }
             
         }
                     if (x<7 & y >0){
             if (matriz [x+1][y-1].getText()== "verde"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                     if (rev2>0){
                         rev2 = rev2-1;
                     }
                 
       }while (rev!=7 & rev2!=0);
                  
                     
                 
                
             }
             
         }
                     if (x>0 & y >0){
             if (matriz [x-1][y-1].getText()== "verde"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                     if (rev2>0){
                         rev2 = rev2-1;
                     }
                 
       }while (rev!=0 & rev2!=0);
                  
                     
                 
                
             }
             
         }
                     if (x>0 & y <7){
             if (matriz [x-1][y+1].getText()== "verde"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "rojo"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                     if (rev2<7){
                         rev2 = rev2+1;
                     }
                 
       }while (rev!=0 & rev2!=7);
                  
                     
                 
                
             }
             
         }
         }
     }
 }

      
    }
 if (turno == false){
     int rev = 0;
     int rev2 = 0;
 for (int x =0;x<8;x++){
     for (int y=0 ; y<8;y++){
         if (matriz[x][y].getText() == ("blanco")){
             if (x<7){
             if (matriz [x+1][y].getText()== "rojo"){
                 rev = x;
       do{if (matriz[rev][y].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                 
       }while (rev!=7);
                  
                     
                 
                
             }
             
         }    if (x>0){
             if (matriz [x-1][y].getText()== "rojo"){
                 rev = x;
       do{if (matriz[rev][y].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                 
       }while (rev!=0);
                  
                     
                 
                
             }
             
         }
             if (y<7){
             if (matriz [x][y+1].getText()== "rojo"){
                 rev = y;
       do{if (matriz[x][rev].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                 
       }while (rev!=7);
                  
                     
                 
                
             }
             
         }
                 if (y>0){
             if (matriz [x][y-1].getText()== "rojo"){
                 rev = y;
       do{if (matriz[x][rev-1].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                 
       }while (rev!=0);
                  
                     
                 
                
             }
             
         }
                     if (x<7 & y <7){
             if (matriz [x+1][y+1].getText()== "rojo"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                     if (rev2<7){
                         rev2 = rev2+1;
                     }
                 
       }while (rev!=7 & rev2!=7);
                  
                     
                 
                
             }
             
         }
                     if (x<7 & y >0){
             if (matriz [x+1][y-1].getText()== "rojo"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev<7){
                  rev= rev+1;}
                     if (rev2>0){
                         rev2 = rev2-1;
                     }
                 
       }while (rev!=7 & rev2!=0);
                  
                     
                 
                
             }
             
         }
                     if (x>0 & y >0){
             if (matriz [x-1][y-1].getText()== "rojo"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                     if (rev2>0){
                         rev2 = rev2-1;
                     }
                 
       }while (rev!=0 & rev2!=0);
                  
                     
                 
                
             }
             
         }
                     if (x>0 & y <7){
             if (matriz [x-1][y+1].getText()== "rojo"){
                 rev = x;
                 rev2 = y;
       do{if (matriz[rev][rev2].getText()== "verde"){
                         matriz [x][y].setIcon(new ImageIcon ("src/imagenes/valido.png"));
                     matriz[x][y].setText("valido");
                 
                     }
                     if (rev>0){
                  rev= rev-1;}
                     if (rev2<7){
                         rev2 = rev2+1;
                     }
                 
       }while (rev!=0 & rev2!=7);
                  
                     
                 
                
             }
             
         }
         }
     }
 }
 }
    }
    
    public void actionPerformed(ActionEvent e){
    
        
        boolean bandera;
        int rev =0;
        int rev2 =0;
        for (int x =0;x<=7;x++){
            for(int y =0; y<=7;y++){
               if (matriz[x][y]==e.getSource()){
                   if (matriz [x][y].getText()== "valido"){
                           restante--;
                   if (turno == false){
                      matriz [x][y].setText("verde");
                                   matriz[x][y].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                       if (x <7 ){
                          bandera = false;
                           rev = x+1;
                           do{
                               if (matriz [rev][y].getText()== "rojo"){
                                   matriz [rev][y].setText("verde");
                                   matriz[rev][y].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [rev][y].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][y].getText()== ("verde")){
                               bandera = true;
                           }
                               rev++;
                           }while(bandera==false);
                         verificar();
                       }
                         if (x >0 ){
                               bandera = false;
                           rev = x-1;
                           do{
                               if (matriz [rev][y].getText()== "rojo"){
                                   matriz [rev][y].setText("verde");
                                   matriz[rev][y].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [rev][y].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][y].getText()== ("verde")){
                               bandera = true;
                           }
                               rev--;
                           }while(bandera==false);
                         verificar();
                       }
                           if (y <7 ){
                                 bandera = false;
                           rev = y+1;
                           do{
                               if (matriz [x][rev].getText()== "rojo"){
                                   matriz [x][rev].setText("verde");
                                   matriz[x][rev].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [x][rev].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [x][rev].getText()== ("verde")){
                               bandera = true;
                           }
                               rev++;
                           }while(bandera==false);
                         verificar();
                       }
                             if (y>0 ){
                                   bandera = false;
                           rev = y-1;
                           do{
                               if (matriz [x][rev].getText()== "rojo"){
                                   matriz [x][rev].setText("verde");
                                   matriz[x][rev].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [x][rev].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [x][rev].getText()== ("verde")){
                               bandera = true;
                           }
                               rev--;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x <7 & y <7 ){
                                     bandera = false;
                           rev = x+1;
                           rev2 = y+1;
                           do{
                               if (matriz [rev][rev2].getText()== "rojo"){
                                   matriz [rev][rev2].setText("verde");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("verde")){
                               bandera = true;
                           }
                               rev++;
                               rev2++;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x >0& y >0 ){
                                     bandera = false;
                           rev = x-1;
                           rev2 = y-1;
                           do{
                               if (matriz [rev][rev2].getText()== "rojo"){
                                   matriz [rev][rev2].setText("verde");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("verde")){
                               bandera = true;
                           }
                               rev--;
                               rev2--;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x <7 & y >0 ){
                                     bandera = false;
                           rev = x+1;
                           rev2 = y-1;
                           do{
                               if (matriz [rev][rev2].getText()== "rojo"){
                                   matriz [rev][rev2].setText("verde");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("verde")){
                               bandera = true;
                           }
                               rev++;
                               rev2--;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x >0 & y <7 ){
                                     bandera = false;
                           rev = x-1;
                           rev2 = y+1;
                           do{
                               if (matriz [rev][rev2].getText()== "rojo"){
                                   matriz [rev][rev2].setText("verde");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/verde.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("verde")){
                               bandera = true;
                           }
                               rev--;
                               rev2++;
                           }while(bandera==false);
                         verificar();
                       }
                             
                   }
                   if (turno == true){
                      matriz [x][y].setText("rojo");
                                   matriz[x][y].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                       if (x <7 ){
                             bandera = false;
                           rev = x+1;
                           do{
                               if (matriz [rev][y].getText()== "verde"){
                                   matriz [rev][y].setText("rojo");
                                   matriz[rev][y].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [rev][y].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][y].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev++;
                           }while(bandera==false);
                         verificar();
                       }
                         if (x >0 ){
                               bandera = false;
                           rev = x-1;
                           do{
                               if (matriz [rev][y].getText()== "verde"){
                                   matriz [rev][y].setText("rojo");
                                   matriz[rev][y].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [rev][y].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][y].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev--;
                           }while(bandera==false);
                         verificar();
                       }
                           if (y <7 ){
                                 bandera = false;
                           rev = y+1;
                           do{
                               if (matriz [x][rev].getText()== "verde"){
                                   matriz [x][rev].setText("rojo");
                                   matriz[x][rev].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [x][rev].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [x][rev].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev++;
                           }while(bandera==false);
                         verificar();
                       }
                             if (y>0 ){
                                   bandera = false;
                           rev = y-1;
                           do{
                               if (matriz [x][rev].getText()== "verde"){
                                   matriz [x][rev].setText("rojo");
                                   matriz[x][rev].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [x][rev].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [x][rev].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev--;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x <7 & y <7 ){
                                     bandera = false;
                           rev = x+1;
                           rev2 = y+1;
                           do{
                               if (matriz [rev][rev2].getText()== "verde"){
                                   matriz [rev][rev2].setText("rojo");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev++;
                               rev2++;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x >0& y >0 ){
                                     bandera = false;
                           rev = x-1;
                           rev2 = y-1;
                           do{
                               if (matriz [rev][rev2].getText()== "verde"){
                                   matriz [rev][rev2].setText("rojo");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev--;
                               rev2--;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x <7 & y >0 ){
                                     bandera = false;
                           rev = x+1;
                           rev2 = y-1;
                           do{
                               if (matriz [rev][rev2].getText()== "verde"){
                                   matriz [rev][rev2].setText("rojo");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev++;
                               rev2--;
                           }while(bandera==false);
                         verificar();
                       }
                               if (x >0 & y <7 ){
                                     bandera = false;
                           rev = x-1;
                           rev2 = y+1;
                           do{
                               if (matriz [rev][rev2].getText()== "verde"){
                                   matriz [rev][rev2].setText("rojo");
                                   matriz[rev][rev2].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
                                   
                               }
                               if (matriz [rev][rev2].getText()== ("blanco")){
                               bandera = true;
                           }
                               if (matriz [rev][rev2].getText()== ("rojo")){
                               bandera = true;
                           }
                               rev--;
                               rev2++;
                           }while(bandera==false);
                         verificar();
                       }
                             
                   }
                   if (turno == true){
                       turno = false; 
                       verificar();
                   }else{
                       turno = true;
                       verificar();
                   }
                   }
}
}
               }
            }
        }
    



