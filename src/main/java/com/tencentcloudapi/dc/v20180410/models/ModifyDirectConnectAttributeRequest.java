/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDirectConnectAttributeRequest extends AbstractModel {

    /**
    * Connection ID.
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * Connection name.
    */
    @SerializedName("DirectConnectName")
    @Expose
    private String DirectConnectName;

    /**
    * Circuit code of a connection, which is provided by the ISP or connection provider.
    */
    @SerializedName("CircuitCode")
    @Expose
    private String CircuitCode;

    /**
    * VLAN for connection debugging.
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * Tencent-side IP address for connection debugging.
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * User-side IP address for connection debugging.
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * Name of connection applicant, which is obtained from the account system by default.
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * Email address of connection applicant, which is obtained from the account system by default.
    */
    @SerializedName("CustomerContactMail")
    @Expose
    private String CustomerContactMail;

    /**
    * Contact number of connection applicant, which is obtained from the account system by default.
    */
    @SerializedName("CustomerContactNumber")
    @Expose
    private String CustomerContactNumber;

    /**
    * Fault reporting contact person.
    */
    @SerializedName("FaultReportContactPerson")
    @Expose
    private String FaultReportContactPerson;

    /**
    * Fault reporting contact number.
    */
    @SerializedName("FaultReportContactNumber")
    @Expose
    private String FaultReportContactNumber;

    /**
    * Whether the connection applicant has signed the service agreement.
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

    /**
    * Connection’s bandwidth
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get Connection ID. 
     * @return DirectConnectId Connection ID.
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set Connection ID.
     * @param DirectConnectId Connection ID.
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get Connection name. 
     * @return DirectConnectName Connection name.
     */
    public String getDirectConnectName() {
        return this.DirectConnectName;
    }

    /**
     * Set Connection name.
     * @param DirectConnectName Connection name.
     */
    public void setDirectConnectName(String DirectConnectName) {
        this.DirectConnectName = DirectConnectName;
    }

    /**
     * Get Circuit code of a connection, which is provided by the ISP or connection provider. 
     * @return CircuitCode Circuit code of a connection, which is provided by the ISP or connection provider.
     */
    public String getCircuitCode() {
        return this.CircuitCode;
    }

    /**
     * Set Circuit code of a connection, which is provided by the ISP or connection provider.
     * @param CircuitCode Circuit code of a connection, which is provided by the ISP or connection provider.
     */
    public void setCircuitCode(String CircuitCode) {
        this.CircuitCode = CircuitCode;
    }

    /**
     * Get VLAN for connection debugging. 
     * @return Vlan VLAN for connection debugging.
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set VLAN for connection debugging.
     * @param Vlan VLAN for connection debugging.
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get Tencent-side IP address for connection debugging. 
     * @return TencentAddress Tencent-side IP address for connection debugging.
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set Tencent-side IP address for connection debugging.
     * @param TencentAddress Tencent-side IP address for connection debugging.
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get User-side IP address for connection debugging. 
     * @return CustomerAddress User-side IP address for connection debugging.
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set User-side IP address for connection debugging.
     * @param CustomerAddress User-side IP address for connection debugging.
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get Name of connection applicant, which is obtained from the account system by default. 
     * @return CustomerName Name of connection applicant, which is obtained from the account system by default.
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set Name of connection applicant, which is obtained from the account system by default.
     * @param CustomerName Name of connection applicant, which is obtained from the account system by default.
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get Email address of connection applicant, which is obtained from the account system by default. 
     * @return CustomerContactMail Email address of connection applicant, which is obtained from the account system by default.
     */
    public String getCustomerContactMail() {
        return this.CustomerContactMail;
    }

    /**
     * Set Email address of connection applicant, which is obtained from the account system by default.
     * @param CustomerContactMail Email address of connection applicant, which is obtained from the account system by default.
     */
    public void setCustomerContactMail(String CustomerContactMail) {
        this.CustomerContactMail = CustomerContactMail;
    }

    /**
     * Get Contact number of connection applicant, which is obtained from the account system by default. 
     * @return CustomerContactNumber Contact number of connection applicant, which is obtained from the account system by default.
     */
    public String getCustomerContactNumber() {
        return this.CustomerContactNumber;
    }

    /**
     * Set Contact number of connection applicant, which is obtained from the account system by default.
     * @param CustomerContactNumber Contact number of connection applicant, which is obtained from the account system by default.
     */
    public void setCustomerContactNumber(String CustomerContactNumber) {
        this.CustomerContactNumber = CustomerContactNumber;
    }

    /**
     * Get Fault reporting contact person. 
     * @return FaultReportContactPerson Fault reporting contact person.
     */
    public String getFaultReportContactPerson() {
        return this.FaultReportContactPerson;
    }

    /**
     * Set Fault reporting contact person.
     * @param FaultReportContactPerson Fault reporting contact person.
     */
    public void setFaultReportContactPerson(String FaultReportContactPerson) {
        this.FaultReportContactPerson = FaultReportContactPerson;
    }

    /**
     * Get Fault reporting contact number. 
     * @return FaultReportContactNumber Fault reporting contact number.
     */
    public String getFaultReportContactNumber() {
        return this.FaultReportContactNumber;
    }

    /**
     * Set Fault reporting contact number.
     * @param FaultReportContactNumber Fault reporting contact number.
     */
    public void setFaultReportContactNumber(String FaultReportContactNumber) {
        this.FaultReportContactNumber = FaultReportContactNumber;
    }

    /**
     * Get Whether the connection applicant has signed the service agreement. 
     * @return SignLaw Whether the connection applicant has signed the service agreement.
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set Whether the connection applicant has signed the service agreement.
     * @param SignLaw Whether the connection applicant has signed the service agreement.
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Get Connection’s bandwidth 
     * @return Bandwidth Connection’s bandwidth
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Connection’s bandwidth
     * @param Bandwidth Connection’s bandwidth
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public ModifyDirectConnectAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDirectConnectAttributeRequest(ModifyDirectConnectAttributeRequest source) {
        if (source.DirectConnectId != null) {
            this.DirectConnectId = new String(source.DirectConnectId);
        }
        if (source.DirectConnectName != null) {
            this.DirectConnectName = new String(source.DirectConnectName);
        }
        if (source.CircuitCode != null) {
            this.CircuitCode = new String(source.CircuitCode);
        }
        if (source.Vlan != null) {
            this.Vlan = new Long(source.Vlan);
        }
        if (source.TencentAddress != null) {
            this.TencentAddress = new String(source.TencentAddress);
        }
        if (source.CustomerAddress != null) {
            this.CustomerAddress = new String(source.CustomerAddress);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.CustomerContactMail != null) {
            this.CustomerContactMail = new String(source.CustomerContactMail);
        }
        if (source.CustomerContactNumber != null) {
            this.CustomerContactNumber = new String(source.CustomerContactNumber);
        }
        if (source.FaultReportContactPerson != null) {
            this.FaultReportContactPerson = new String(source.FaultReportContactPerson);
        }
        if (source.FaultReportContactNumber != null) {
            this.FaultReportContactNumber = new String(source.FaultReportContactNumber);
        }
        if (source.SignLaw != null) {
            this.SignLaw = new Boolean(source.SignLaw);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "DirectConnectName", this.DirectConnectName);
        this.setParamSimple(map, prefix + "CircuitCode", this.CircuitCode);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "CustomerContactMail", this.CustomerContactMail);
        this.setParamSimple(map, prefix + "CustomerContactNumber", this.CustomerContactNumber);
        this.setParamSimple(map, prefix + "FaultReportContactPerson", this.FaultReportContactPerson);
        this.setParamSimple(map, prefix + "FaultReportContactNumber", this.FaultReportContactNumber);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

