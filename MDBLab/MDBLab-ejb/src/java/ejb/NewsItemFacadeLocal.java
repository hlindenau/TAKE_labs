/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author Len
 */
@Local
public interface NewsItemFacadeLocal {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List<NewsItem> getAllNewsItems();
}
