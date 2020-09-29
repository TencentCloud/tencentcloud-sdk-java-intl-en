/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDirectConnectRequest extends AbstractModel{

    /**
    * Connection name.
    */
    @SerializedName("DirectConnectName")
    @Expose
    private String DirectConnectName;

    /**
    * Access point of connection.
You can call `DescribeAccessPoints` to get the region ID. The selected access point must exist and be available.
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * ISP that provides connections. Valid values: ChinaTelecom (China Telecom), ChinaMobile (China Mobile), ChinaUnicom (China Unicom), In-houseWiring (in-house wiring), ChinaOther (other Chinese ISPs), InternationalOperator (international ISPs).
    */
    @SerializedName("LineOperator")
    @Expose
    private String LineOperator;

    /**
    * Port type of connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface), 1000Base-LX (1-Gigabit single-module optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-module optical Ethernet interface; 10 KM). Default value: 1000Base-LX.
    */
    @SerializedName("PortType")
    @Expose
    private String PortType;

    /**
    * Circuit code of a connection, which is provided by the ISP or connection provider.
    */
    @SerializedName("CircuitCode")
    @Expose
    private String CircuitCode;

    /**
    * Local IDC location.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Connection port bandwidth in Mbps. Value range: [2,10240]. Default value: 1000.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * ID of redundant connection.
    */
    @SerializedName("RedundantDirectConnectId")
    @Expose
    private String RedundantDirectConnectId;

    /**
    * VLAN for connection debugging, which is enabled and automatically assigned by default.
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * Tencent-side IP address for connection debugging, which is automatically assigned by default.
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * User-side IP address for connection debugging, which is automatically assigned by default.
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
    * Whether the connection applicant has signed the service agreement. Default value: true.
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

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
     * Get Access point of connection.
You can call `DescribeAccessPoints` to get the region ID. The selected access point must exist and be available. 
     * @return AccessPointId Access point of connection.
You can call `DescribeAccessPoints` to get the region ID. The selected access point must exist and be available.
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set Access point of connection.
You can call `DescribeAccessPoints` to get the region ID. The selected access point must exist and be available.
     * @param AccessPointId Access point of connection.
You can call `DescribeAccessPoints` to get the region ID. The selected access point must exist and be available.
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get ISP that provides connections. Valid values: ChinaTelecom (China Telecom), ChinaMobile (China Mobile), ChinaUnicom (China Unicom), In-houseWiring (in-house wiring), ChinaOther (other Chinese ISPs), InternationalOperator (international ISPs). 
     * @return LineOperator ISP that provides connections. Valid values: ChinaTelecom (China Telecom), ChinaMobile (China Mobile), ChinaUnicom (China Unicom), In-houseWiring (in-house wiring), ChinaOther (other Chinese ISPs), InternationalOperator (international ISPs).
     */
    public String getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set ISP that provides connections. Valid values: ChinaTelecom (China Telecom), ChinaMobile (China Mobile), ChinaUnicom (China Unicom), In-houseWiring (in-house wiring), ChinaOther (other Chinese ISPs), InternationalOperator (international ISPs).
     * @param LineOperator ISP that provides connections. Valid values: ChinaTelecom (China Telecom), ChinaMobile (China Mobile), ChinaUnicom (China Unicom), In-houseWiring (in-house wiring), ChinaOther (other Chinese ISPs), InternationalOperator (international ISPs).
     */
    public void setLineOperator(String LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get Port type of connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface), 1000Base-LX (1-Gigabit single-module optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-module optical Ethernet interface; 10 KM). Default value: 1000Base-LX. 
     * @return PortType Port type of connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface), 1000Base-LX (1-Gigabit single-module optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-module optical Ethernet interface; 10 KM). Default value: 1000Base-LX.
     */
    public String getPortType() {
        return this.PortType;
    }

    /**
     * Set Port type of connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface), 1000Base-LX (1-Gigabit single-module optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-module optical Ethernet interface; 10 KM). Default value: 1000Base-LX.
     * @param PortType Port type of connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface), 1000Base-LX (1-Gigabit single-module optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-module optical Ethernet interface; 10 KM). Default value: 1000Base-LX.
     */
    public void setPortType(String PortType) {
        this.PortType = PortType;
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
     * Get Local IDC location. 
     * @return Location Local IDC location.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Local IDC location.
     * @param Location Local IDC location.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Connection port bandwidth in Mbps. Value range: [2,10240]. Default value: 1000. 
     * @return Bandwidth Connection port bandwidth in Mbps. Value range: [2,10240]. Default value: 1000.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Connection port bandwidth in Mbps. Value range: [2,10240]. Default value: 1000.
     * @param Bandwidth Connection port bandwidth in Mbps. Value range: [2,10240]. Default value: 1000.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get ID of redundant connection. 
     * @return RedundantDirectConnectId ID of redundant connection.
     */
    public String getRedundantDirectConnectId() {
        return this.RedundantDirectConnectId;
    }

    /**
     * Set ID of redundant connection.
     * @param RedundantDirectConnectId ID of redundant connection.
     */
    public void setRedundantDirectConnectId(String RedundantDirectConnectId) {
        this.RedundantDirectConnectId = RedundantDirectConnectId;
    }

    /**
     * Get VLAN for connection debugging, which is enabled and automatically assigned by default. 
     * @return Vlan VLAN for connection debugging, which is enabled and automatically assigned by default.
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set VLAN for connection debugging, which is enabled and automatically assigned by default.
     * @param Vlan VLAN for connection debugging, which is enabled and automatically assigned by default.
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get Tencent-side IP address for connection debugging, which is automatically assigned by default. 
     * @return TencentAddress Tencent-side IP address for connection debugging, which is automatically assigned by default.
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set Tencent-side IP address for connection debugging, which is automatically assigned by default.
     * @param TencentAddress Tencent-side IP address for connection debugging, which is automatically assigned by default.
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get User-side IP address for connection debugging, which is automatically assigned by default. 
     * @return CustomerAddress User-side IP address for connection debugging, which is automatically assigned by default.
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set User-side IP address for connection debugging, which is automatically assigned by default.
     * @param CustomerAddress User-side IP address for connection debugging, which is automatically assigned by default.
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
     * Get Whether the connection applicant has signed the service agreement. Default value: true. 
     * @return SignLaw Whether the connection applicant has signed the service agreement. Default value: true.
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set Whether the connection applicant has signed the service agreement. Default value: true.
     * @param SignLaw Whether the connection applicant has signed the service agreement. Default value: true.
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectName", this.DirectConnectName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "LineOperator", this.LineOperator);
        this.setParamSimple(map, prefix + "PortType", this.PortType);
        this.setParamSimple(map, prefix + "CircuitCode", this.CircuitCode);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "RedundantDirectConnectId", this.RedundantDirectConnectId);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "CustomerContactMail", this.CustomerContactMail);
        this.setParamSimple(map, prefix + "CustomerContactNumber", this.CustomerContactNumber);
        this.setParamSimple(map, prefix + "FaultReportContactPerson", this.FaultReportContactPerson);
        this.setParamSimple(map, prefix + "FaultReportContactNumber", this.FaultReportContactNumber);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);

    }
}

