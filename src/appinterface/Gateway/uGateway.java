/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appinterface.Gateway;

/**
 *
 * @author elisha
 */
public class uGateway {
    /**
     * Gateway Id
     */
    private Integer xId;
    
    /**
     * Data
     */
    private String sData;

    /**
     * Gateway Id
     * @return the xId
     */
    public Integer getxId() {
        return xId;
    }

    /**
     * Data
     * @return the sData
     */
    public String getsData() {
        return sData;
    }

    /**
     * Gateway Id
     * @param xId the xId to set
     */
    public void setxId(Integer xId) {
        this.xId = xId;
    }

    /**
     * Data
     * @param sData the sData to set
     */
    public void setsData(String sData) {
        this.sData = sData;
    }
    
}
