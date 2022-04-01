/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Len
 */
@Named(value = "lineChartBean")
@ViewScoped
public class LineChartBean implements Serializable {
    private LineChartModel lineModel;
    /**
     * Creates a new instance of LineChartBean
     */
    public LineChartBean() {
      lineModel = new LineChartModel();
      LineChartSeries s = new LineChartSeries();

      
      for (int i = 0; i < 360; i+=10)
      {
          s.set(i, Math.cos(Math.PI*i/360));
      }
      s.setLabel("Cosine wave");

      lineModel.addSeries(s);
      lineModel.setLegendPosition("e");
      Axis y = lineModel.getAxis(AxisType.Y);
      y.setMin(-1.25);
      y.setMax(1.25);
      y.setLabel("Cos(x)");

      Axis x = lineModel.getAxis(AxisType.X);
      x.setMin(0);
      x.setMax(360);
      x.setTickInterval("10");
      x.setLabel("x");
    }

    /**
     * @return the lineModel
     */
    public LineChartModel getLineModel() {
        return lineModel;
    }

    /**
     * @param lineModel the lineModel to set
     */
    public void setLineModel(LineChartModel lineModel) {
        this.lineModel = lineModel;
    }
    
}
