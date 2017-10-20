/*
 **
 *** BAR STYLE.
 **** @author Caio Souza
 *****/

package graphgenerator;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class BarGraphGenerator extends ApplicationFrame
{
    public BarGraphGenerator(String applicationTitle , String chartTitle)
   {
    super(applicationTitle);        
     
    //Create the Graphic Base.
    JFreeChart barGraph = ChartFactory.createBarChart(chartTitle, null,            
     "TITLE 0 ", createGraphDataset(), PlotOrientation.VERTICAL, true, true, false);
         
      ChartPanel GraphPanel = new ChartPanel(barGraph);        
     
     //Set the size of Window.
      GraphPanel.setPreferredSize(new java.awt.Dimension(560 , 367));        
      setContentPane(GraphPanel); //Necessary to show the graphic.
    }

    private CategoryDataset createGraphDataset()
   {   
       
       // Must be dinamic!
       String subtitle0 = "0";
       String subtitle1 =  "1";   
       String subtitle2 =  "2";
       String subtitle3 =  "3";
       String subtitle_color0 = "0";
       String subtitle_color1= "1";
       String subtitle_color2 = "2";
       String subtitle_color3 = "3";
       
    
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
     
       
       dataset.addValue(1.0, subtitle_color0, subtitle0);        
       dataset.addValue(2.0, subtitle_color1, subtitle1); 
       dataset.addValue(3.0, subtitle_color2, subtitle2); 
       dataset.addValue(4.0, subtitle_color3, subtitle3); 
      
      return dataset; 
    }
     
    
    public static void main(String[] args)
    {
      BarGraphGenerator chart = new BarGraphGenerator(null, "TITLE 1");
      chart.pack();        
      RefineryUtilities.centerFrameOnScreen(chart); 
      chart.setVisible(true); //Call graphic.
    
    }
}


