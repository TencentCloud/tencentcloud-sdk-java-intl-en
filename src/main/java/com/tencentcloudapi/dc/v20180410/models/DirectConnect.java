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

public class DirectConnect extends AbstractModel {

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
    * Access point ID of a connection.
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * Connection status.
PENDING: Applying. 
REJECTED: Application rejected.   
TOPAY: Payment pending. 
PAID: Paid. 
ALLOCATED: Constructing.   
AVAILABLE: Available.  
DELETING: Deleting.
DELETED: Deleted.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Connection creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Connection activation time.
    */
    @SerializedName("EnabledTime")
    @Expose
    private String EnabledTime;

    /**
    * ISP that provides connections. Valid values: ChinaTelecom (China Telecom), ChinaMobile (China Mobile), ChinaUnicom (China Unicom), In-houseWiring (in-house wiring), ChinaOther (other Chinese ISPs), InternationalOperator (international ISPs).
    */
    @SerializedName("LineOperator")
    @Expose
    private String LineOperator;

    /**
    * Location of a local IDC.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Connection port bandwidth in Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * User-side port type of a connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface; it is the default value), 1000Base-LX (1-Gigabit single-mode optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-mode optical Ethernet interface; 10 KM).
    */
    @SerializedName("PortType")
    @Expose
    private String PortType;

    /**
    * Circuit code of a connection, which is provided by the ISP or service provider.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CircuitCode")
    @Expose
    private String CircuitCode;

    /**
    * ID of a redundant connection.
    */
    @SerializedName("RedundantDirectConnectId")
    @Expose
    private String RedundantDirectConnectId;

    /**
    * VLAN for connection debugging, which is enabled and automatically assigned by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * Tencent-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * User-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * Name of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * Email address of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomerContactMail")
    @Expose
    private String CustomerContactMail;

    /**
    * Contact number of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomerContactNumber")
    @Expose
    private String CustomerContactNumber;

    /**
    * Connection expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Connection billing mode. NON_RECURRING_CHARGE: One-time charge for accessing service
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Fault reporting contact person.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaultReportContactPerson")
    @Expose
    private String FaultReportContactPerson;

    /**
    * Fault reporting contact number.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaultReportContactNumber")
    @Expose
    private String FaultReportContactNumber;

    /**
    * Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Access point type of a connection.
    */
    @SerializedName("AccessPointType")
    @Expose
    private String AccessPointType;

    /**
    * IDC city.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdcCity")
    @Expose
    private String IdcCity;

    /**
    * Billing status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeState")
    @Expose
    private String ChargeState;

    /**
    * Connection activation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Whether the connection has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

    /**
    * Whether the connection is an edge zone.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * Number of dedicated tunnels with disabled VLAN in the connection
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("VlanZeroDirectConnectTunnelCount")
    @Expose
    private Long VlanZeroDirectConnectTunnelCount;

    /**
    * Number of dedicated tunnels with enabled VLAN in the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OtherVlanDirectConnectTunnelCount")
    @Expose
    private Long OtherVlanDirectConnectTunnelCount;

    /**
    * Minimum bandwidth of the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MinBandwidth")
    @Expose
    private Long MinBandwidth;

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
     * Get Access point ID of a connection. 
     * @return AccessPointId Access point ID of a connection.
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set Access point ID of a connection.
     * @param AccessPointId Access point ID of a connection.
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get Connection status.
PENDING: Applying. 
REJECTED: Application rejected.   
TOPAY: Payment pending. 
PAID: Paid. 
ALLOCATED: Constructing.   
AVAILABLE: Available.  
DELETING: Deleting.
DELETED: Deleted. 
     * @return State Connection status.
PENDING: Applying. 
REJECTED: Application rejected.   
TOPAY: Payment pending. 
PAID: Paid. 
ALLOCATED: Constructing.   
AVAILABLE: Available.  
DELETING: Deleting.
DELETED: Deleted.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Connection status.
PENDING: Applying. 
REJECTED: Application rejected.   
TOPAY: Payment pending. 
PAID: Paid. 
ALLOCATED: Constructing.   
AVAILABLE: Available.  
DELETING: Deleting.
DELETED: Deleted.
     * @param State Connection status.
PENDING: Applying. 
REJECTED: Application rejected.   
TOPAY: Payment pending. 
PAID: Paid. 
ALLOCATED: Constructing.   
AVAILABLE: Available.  
DELETING: Deleting.
DELETED: Deleted.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Connection creation time. 
     * @return CreatedTime Connection creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Connection creation time.
     * @param CreatedTime Connection creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Connection activation time. 
     * @return EnabledTime Connection activation time.
     */
    public String getEnabledTime() {
        return this.EnabledTime;
    }

    /**
     * Set Connection activation time.
     * @param EnabledTime Connection activation time.
     */
    public void setEnabledTime(String EnabledTime) {
        this.EnabledTime = EnabledTime;
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
     * Get Location of a local IDC. 
     * @return Location Location of a local IDC.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Location of a local IDC.
     * @param Location Location of a local IDC.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Connection port bandwidth in Mbps. 
     * @return Bandwidth Connection port bandwidth in Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Connection port bandwidth in Mbps.
     * @param Bandwidth Connection port bandwidth in Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get User-side port type of a connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface; it is the default value), 1000Base-LX (1-Gigabit single-mode optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-mode optical Ethernet interface; 10 KM). 
     * @return PortType User-side port type of a connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface; it is the default value), 1000Base-LX (1-Gigabit single-mode optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-mode optical Ethernet interface; 10 KM).
     */
    public String getPortType() {
        return this.PortType;
    }

    /**
     * Set User-side port type of a connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface; it is the default value), 1000Base-LX (1-Gigabit single-mode optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-mode optical Ethernet interface; 10 KM).
     * @param PortType User-side port type of a connection. Valid values: 100Base-T (100-Megabit electrical Ethernet interface), 1000Base-T (1-Gigabit electrical Ethernet interface; it is the default value), 1000Base-LX (1-Gigabit single-mode optical Ethernet interface; 10 KM), 10GBase-T (10-Gigabit electrical Ethernet interface), 10GBase-LR (10-Gigabit single-mode optical Ethernet interface; 10 KM).
     */
    public void setPortType(String PortType) {
        this.PortType = PortType;
    }

    /**
     * Get Circuit code of a connection, which is provided by the ISP or service provider.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CircuitCode Circuit code of a connection, which is provided by the ISP or service provider.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCircuitCode() {
        return this.CircuitCode;
    }

    /**
     * Set Circuit code of a connection, which is provided by the ISP or service provider.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CircuitCode Circuit code of a connection, which is provided by the ISP or service provider.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCircuitCode(String CircuitCode) {
        this.CircuitCode = CircuitCode;
    }

    /**
     * Get ID of a redundant connection. 
     * @return RedundantDirectConnectId ID of a redundant connection.
     */
    public String getRedundantDirectConnectId() {
        return this.RedundantDirectConnectId;
    }

    /**
     * Set ID of a redundant connection.
     * @param RedundantDirectConnectId ID of a redundant connection.
     */
    public void setRedundantDirectConnectId(String RedundantDirectConnectId) {
        this.RedundantDirectConnectId = RedundantDirectConnectId;
    }

    /**
     * Get VLAN for connection debugging, which is enabled and automatically assigned by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Vlan VLAN for connection debugging, which is enabled and automatically assigned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set VLAN for connection debugging, which is enabled and automatically assigned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Vlan VLAN for connection debugging, which is enabled and automatically assigned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get Tencent-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TencentAddress Tencent-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set Tencent-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TencentAddress Tencent-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get User-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CustomerAddress User-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set User-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CustomerAddress User-side IP address for connection debugging.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get Name of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CustomerName Name of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set Name of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CustomerName Name of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get Email address of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CustomerContactMail Email address of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomerContactMail() {
        return this.CustomerContactMail;
    }

    /**
     * Set Email address of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CustomerContactMail Email address of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomerContactMail(String CustomerContactMail) {
        this.CustomerContactMail = CustomerContactMail;
    }

    /**
     * Get Contact number of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CustomerContactNumber Contact number of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomerContactNumber() {
        return this.CustomerContactNumber;
    }

    /**
     * Set Contact number of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CustomerContactNumber Contact number of the connection applicant, which is obtained from the account system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomerContactNumber(String CustomerContactNumber) {
        this.CustomerContactNumber = CustomerContactNumber;
    }

    /**
     * Get Connection expiration time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredTime Connection expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Connection expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpiredTime Connection expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Connection billing mode. NON_RECURRING_CHARGE: One-time charge for accessing service
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Connection billing mode. NON_RECURRING_CHARGE: One-time charge for accessing service
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Connection billing mode. NON_RECURRING_CHARGE: One-time charge for accessing service
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Connection billing mode. NON_RECURRING_CHARGE: One-time charge for accessing service
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Fault reporting contact person.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaultReportContactPerson Fault reporting contact person.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFaultReportContactPerson() {
        return this.FaultReportContactPerson;
    }

    /**
     * Set Fault reporting contact person.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaultReportContactPerson Fault reporting contact person.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaultReportContactPerson(String FaultReportContactPerson) {
        this.FaultReportContactPerson = FaultReportContactPerson;
    }

    /**
     * Get Fault reporting contact number.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaultReportContactNumber Fault reporting contact number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFaultReportContactNumber() {
        return this.FaultReportContactNumber;
    }

    /**
     * Set Fault reporting contact number.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaultReportContactNumber Fault reporting contact number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaultReportContactNumber(String FaultReportContactNumber) {
        this.FaultReportContactNumber = FaultReportContactNumber;
    }

    /**
     * Get Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Access point type of a connection. 
     * @return AccessPointType Access point type of a connection.
     */
    public String getAccessPointType() {
        return this.AccessPointType;
    }

    /**
     * Set Access point type of a connection.
     * @param AccessPointType Access point type of a connection.
     */
    public void setAccessPointType(String AccessPointType) {
        this.AccessPointType = AccessPointType;
    }

    /**
     * Get IDC city.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IdcCity IDC city.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIdcCity() {
        return this.IdcCity;
    }

    /**
     * Set IDC city.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IdcCity IDC city.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIdcCity(String IdcCity) {
        this.IdcCity = IdcCity;
    }

    /**
     * Get Billing status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ChargeState Billing status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeState() {
        return this.ChargeState;
    }

    /**
     * Set Billing status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ChargeState Billing status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeState(String ChargeState) {
        this.ChargeState = ChargeState;
    }

    /**
     * Get Connection activation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Connection activation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Connection activation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StartTime Connection activation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Whether the connection has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return SignLaw Whether the connection has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set Whether the connection has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param SignLaw Whether the connection has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Get Whether the connection is an edge zone.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LocalZone Whether the connection is an edge zone.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set Whether the connection is an edge zone.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LocalZone Whether the connection is an edge zone.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get Number of dedicated tunnels with disabled VLAN in the connection
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return VlanZeroDirectConnectTunnelCount Number of dedicated tunnels with disabled VLAN in the connection
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getVlanZeroDirectConnectTunnelCount() {
        return this.VlanZeroDirectConnectTunnelCount;
    }

    /**
     * Set Number of dedicated tunnels with disabled VLAN in the connection
Note: this field may return `null`, indicating that no valid value can be found.
     * @param VlanZeroDirectConnectTunnelCount Number of dedicated tunnels with disabled VLAN in the connection
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setVlanZeroDirectConnectTunnelCount(Long VlanZeroDirectConnectTunnelCount) {
        this.VlanZeroDirectConnectTunnelCount = VlanZeroDirectConnectTunnelCount;
    }

    /**
     * Get Number of dedicated tunnels with enabled VLAN in the connection
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OtherVlanDirectConnectTunnelCount Number of dedicated tunnels with enabled VLAN in the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getOtherVlanDirectConnectTunnelCount() {
        return this.OtherVlanDirectConnectTunnelCount;
    }

    /**
     * Set Number of dedicated tunnels with enabled VLAN in the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OtherVlanDirectConnectTunnelCount Number of dedicated tunnels with enabled VLAN in the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOtherVlanDirectConnectTunnelCount(Long OtherVlanDirectConnectTunnelCount) {
        this.OtherVlanDirectConnectTunnelCount = OtherVlanDirectConnectTunnelCount;
    }

    /**
     * Get Minimum bandwidth of the connection
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MinBandwidth Minimum bandwidth of the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMinBandwidth() {
        return this.MinBandwidth;
    }

    /**
     * Set Minimum bandwidth of the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MinBandwidth Minimum bandwidth of the connection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMinBandwidth(Long MinBandwidth) {
        this.MinBandwidth = MinBandwidth;
    }

    public DirectConnect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnect(DirectConnect source) {
        if (source.DirectConnectId != null) {
            this.DirectConnectId = new String(source.DirectConnectId);
        }
        if (source.DirectConnectName != null) {
            this.DirectConnectName = new String(source.DirectConnectName);
        }
        if (source.AccessPointId != null) {
            this.AccessPointId = new String(source.AccessPointId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.EnabledTime != null) {
            this.EnabledTime = new String(source.EnabledTime);
        }
        if (source.LineOperator != null) {
            this.LineOperator = new String(source.LineOperator);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.PortType != null) {
            this.PortType = new String(source.PortType);
        }
        if (source.CircuitCode != null) {
            this.CircuitCode = new String(source.CircuitCode);
        }
        if (source.RedundantDirectConnectId != null) {
            this.RedundantDirectConnectId = new String(source.RedundantDirectConnectId);
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
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.FaultReportContactPerson != null) {
            this.FaultReportContactPerson = new String(source.FaultReportContactPerson);
        }
        if (source.FaultReportContactNumber != null) {
            this.FaultReportContactNumber = new String(source.FaultReportContactNumber);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.AccessPointType != null) {
            this.AccessPointType = new String(source.AccessPointType);
        }
        if (source.IdcCity != null) {
            this.IdcCity = new String(source.IdcCity);
        }
        if (source.ChargeState != null) {
            this.ChargeState = new String(source.ChargeState);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.SignLaw != null) {
            this.SignLaw = new Boolean(source.SignLaw);
        }
        if (source.LocalZone != null) {
            this.LocalZone = new Boolean(source.LocalZone);
        }
        if (source.VlanZeroDirectConnectTunnelCount != null) {
            this.VlanZeroDirectConnectTunnelCount = new Long(source.VlanZeroDirectConnectTunnelCount);
        }
        if (source.OtherVlanDirectConnectTunnelCount != null) {
            this.OtherVlanDirectConnectTunnelCount = new Long(source.OtherVlanDirectConnectTunnelCount);
        }
        if (source.MinBandwidth != null) {
            this.MinBandwidth = new Long(source.MinBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "DirectConnectName", this.DirectConnectName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "EnabledTime", this.EnabledTime);
        this.setParamSimple(map, prefix + "LineOperator", this.LineOperator);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "PortType", this.PortType);
        this.setParamSimple(map, prefix + "CircuitCode", this.CircuitCode);
        this.setParamSimple(map, prefix + "RedundantDirectConnectId", this.RedundantDirectConnectId);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "CustomerContactMail", this.CustomerContactMail);
        this.setParamSimple(map, prefix + "CustomerContactNumber", this.CustomerContactNumber);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "FaultReportContactPerson", this.FaultReportContactPerson);
        this.setParamSimple(map, prefix + "FaultReportContactNumber", this.FaultReportContactNumber);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "AccessPointType", this.AccessPointType);
        this.setParamSimple(map, prefix + "IdcCity", this.IdcCity);
        this.setParamSimple(map, prefix + "ChargeState", this.ChargeState);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);
        this.setParamSimple(map, prefix + "LocalZone", this.LocalZone);
        this.setParamSimple(map, prefix + "VlanZeroDirectConnectTunnelCount", this.VlanZeroDirectConnectTunnelCount);
        this.setParamSimple(map, prefix + "OtherVlanDirectConnectTunnelCount", this.OtherVlanDirectConnectTunnelCount);
        this.setParamSimple(map, prefix + "MinBandwidth", this.MinBandwidth);

    }
}

