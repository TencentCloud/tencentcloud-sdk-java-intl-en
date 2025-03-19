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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel {

    /**
    * `EIP` `ID`, the unique ID of the `EIP`.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * The `EIP` name.
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * Possible `EIP` states are 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', and 'BIND_ENI'.
    */
    @SerializedName("AddressStatus")
    @Expose
    private String AddressStatus;

    /**
    * The public IP address
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * The ID of the bound resource instance. This can be a `CVM` or `NAT`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The ID of the bound ENI
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * The private IP of the bound resources
    */
    @SerializedName("PrivateAddressIp")
    @Expose
    private String PrivateAddressIp;

    /**
    * The isolation status of the resource. `True` indicates the EIP is isolated. `False` indicates that the resource is not isolated.
    */
    @SerializedName("IsArrears")
    @Expose
    private Boolean IsArrears;

    /**
    * The block status of the resource. `True` indicates the EIP is blocked. `False` indicates that the EIP is not blocked.
    */
    @SerializedName("IsBlocked")
    @Expose
    private Boolean IsBlocked;

    /**
    * Whether the EIP supports direct connection mode. `True` indicates the EIP supports direct connection. `False` indicates that the resource does not support direct connection.
    */
    @SerializedName("IsEipDirectConnection")
    @Expose
    private Boolean IsEipDirectConnection;

    /**
    * EIP resource type. Valid values: `CalcIP` (device IP), `WanIP` (public IP), `EIP` (elastic IP), `AnycastEIP` (accelerated EIP), and `AntiDDoSEIP` (anti-DDoS EIP).
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Whether the EIP is automatically released after being unbound. `True` indicates the EIP will be automatically released after being unbound. `False` indicates the EIP will not be automatically released after being unbound.
    */
    @SerializedName("CascadeRelease")
    @Expose
    private Boolean CascadeRelease;

    /**
    * Type of the protocol used in EIP ALG
    */
    @SerializedName("EipAlgType")
    @Expose
    private AlgType EipAlgType;

    /**
    * The ISP of an EIP/Elastic IP, with possible return values currently including "CMCC", "CTCC", "CUCC" and "BGP"
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * Whether the EIP is in a local BGP.
    */
    @SerializedName("LocalBgp")
    @Expose
    private Boolean LocalBgp;

    /**
    * Bandwidth value of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Network billing mode of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
Including:
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">Prepaid by monthly-subscribed bandwidth.</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly traffic.</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly bandwidth.</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">Bandwidth package.</p>
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * List of tags associated with the EIP
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * The expiration time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadlineDate")
    @Expose
    private String DeadlineDate;

    /**
    * The type of instance bound with the EIP
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Static single-line IP network egress
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * ID of the Anti-DDoS service package. It is returned if the EIP is an Anti-DDoS EIP. 
    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
    * Indicates whether the current EIP is auto-renewed. This field is displayed only for EIPs with monthly prepaid bandwidth. Valid values are as follows:
<li>NOTIFY_AND_MANUAL_RENEW: Normal renewal</li><li>NOTIFY_AND_AUTO_RENEW: Automatic renewal</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: No renewal upon expiration</li>

    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Indicates the ID of the Bandwidth Package associated with the current public IP. If the public IP is not billed by Bandwidth Package, this field is empty.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Indicates the unique ID of the VPC to which the traditional EIPv6 belongs.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnVpcId")
    @Expose
    private String UnVpcId;

    /**
    * Indicates the unique ID of the CDC.
Note: This field may return 'null', indicating that no valid value was found.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get `EIP` `ID`, the unique ID of the `EIP`. 
     * @return AddressId `EIP` `ID`, the unique ID of the `EIP`.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set `EIP` `ID`, the unique ID of the `EIP`.
     * @param AddressId `EIP` `ID`, the unique ID of the `EIP`.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get The `EIP` name. 
     * @return AddressName The `EIP` name.
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set The `EIP` name.
     * @param AddressName The `EIP` name.
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get Possible `EIP` states are 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', and 'BIND_ENI'. 
     * @return AddressStatus Possible `EIP` states are 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', and 'BIND_ENI'.
     */
    public String getAddressStatus() {
        return this.AddressStatus;
    }

    /**
     * Set Possible `EIP` states are 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', and 'BIND_ENI'.
     * @param AddressStatus Possible `EIP` states are 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', and 'BIND_ENI'.
     */
    public void setAddressStatus(String AddressStatus) {
        this.AddressStatus = AddressStatus;
    }

    /**
     * Get The public IP address 
     * @return AddressIp The public IP address
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set The public IP address
     * @param AddressIp The public IP address
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get The ID of the bound resource instance. This can be a `CVM` or `NAT`. 
     * @return InstanceId The ID of the bound resource instance. This can be a `CVM` or `NAT`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ID of the bound resource instance. This can be a `CVM` or `NAT`.
     * @param InstanceId The ID of the bound resource instance. This can be a `CVM` or `NAT`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`. 
     * @return CreatedTime The creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     * @param CreatedTime The creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The ID of the bound ENI 
     * @return NetworkInterfaceId The ID of the bound ENI
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set The ID of the bound ENI
     * @param NetworkInterfaceId The ID of the bound ENI
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get The private IP of the bound resources 
     * @return PrivateAddressIp The private IP of the bound resources
     */
    public String getPrivateAddressIp() {
        return this.PrivateAddressIp;
    }

    /**
     * Set The private IP of the bound resources
     * @param PrivateAddressIp The private IP of the bound resources
     */
    public void setPrivateAddressIp(String PrivateAddressIp) {
        this.PrivateAddressIp = PrivateAddressIp;
    }

    /**
     * Get The isolation status of the resource. `True` indicates the EIP is isolated. `False` indicates that the resource is not isolated. 
     * @return IsArrears The isolation status of the resource. `True` indicates the EIP is isolated. `False` indicates that the resource is not isolated.
     */
    public Boolean getIsArrears() {
        return this.IsArrears;
    }

    /**
     * Set The isolation status of the resource. `True` indicates the EIP is isolated. `False` indicates that the resource is not isolated.
     * @param IsArrears The isolation status of the resource. `True` indicates the EIP is isolated. `False` indicates that the resource is not isolated.
     */
    public void setIsArrears(Boolean IsArrears) {
        this.IsArrears = IsArrears;
    }

    /**
     * Get The block status of the resource. `True` indicates the EIP is blocked. `False` indicates that the EIP is not blocked. 
     * @return IsBlocked The block status of the resource. `True` indicates the EIP is blocked. `False` indicates that the EIP is not blocked.
     */
    public Boolean getIsBlocked() {
        return this.IsBlocked;
    }

    /**
     * Set The block status of the resource. `True` indicates the EIP is blocked. `False` indicates that the EIP is not blocked.
     * @param IsBlocked The block status of the resource. `True` indicates the EIP is blocked. `False` indicates that the EIP is not blocked.
     */
    public void setIsBlocked(Boolean IsBlocked) {
        this.IsBlocked = IsBlocked;
    }

    /**
     * Get Whether the EIP supports direct connection mode. `True` indicates the EIP supports direct connection. `False` indicates that the resource does not support direct connection. 
     * @return IsEipDirectConnection Whether the EIP supports direct connection mode. `True` indicates the EIP supports direct connection. `False` indicates that the resource does not support direct connection.
     */
    public Boolean getIsEipDirectConnection() {
        return this.IsEipDirectConnection;
    }

    /**
     * Set Whether the EIP supports direct connection mode. `True` indicates the EIP supports direct connection. `False` indicates that the resource does not support direct connection.
     * @param IsEipDirectConnection Whether the EIP supports direct connection mode. `True` indicates the EIP supports direct connection. `False` indicates that the resource does not support direct connection.
     */
    public void setIsEipDirectConnection(Boolean IsEipDirectConnection) {
        this.IsEipDirectConnection = IsEipDirectConnection;
    }

    /**
     * Get EIP resource type. Valid values: `CalcIP` (device IP), `WanIP` (public IP), `EIP` (elastic IP), `AnycastEIP` (accelerated EIP), and `AntiDDoSEIP` (anti-DDoS EIP). 
     * @return AddressType EIP resource type. Valid values: `CalcIP` (device IP), `WanIP` (public IP), `EIP` (elastic IP), `AnycastEIP` (accelerated EIP), and `AntiDDoSEIP` (anti-DDoS EIP).
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set EIP resource type. Valid values: `CalcIP` (device IP), `WanIP` (public IP), `EIP` (elastic IP), `AnycastEIP` (accelerated EIP), and `AntiDDoSEIP` (anti-DDoS EIP).
     * @param AddressType EIP resource type. Valid values: `CalcIP` (device IP), `WanIP` (public IP), `EIP` (elastic IP), `AnycastEIP` (accelerated EIP), and `AntiDDoSEIP` (anti-DDoS EIP).
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get Whether the EIP is automatically released after being unbound. `True` indicates the EIP will be automatically released after being unbound. `False` indicates the EIP will not be automatically released after being unbound. 
     * @return CascadeRelease Whether the EIP is automatically released after being unbound. `True` indicates the EIP will be automatically released after being unbound. `False` indicates the EIP will not be automatically released after being unbound.
     */
    public Boolean getCascadeRelease() {
        return this.CascadeRelease;
    }

    /**
     * Set Whether the EIP is automatically released after being unbound. `True` indicates the EIP will be automatically released after being unbound. `False` indicates the EIP will not be automatically released after being unbound.
     * @param CascadeRelease Whether the EIP is automatically released after being unbound. `True` indicates the EIP will be automatically released after being unbound. `False` indicates the EIP will not be automatically released after being unbound.
     */
    public void setCascadeRelease(Boolean CascadeRelease) {
        this.CascadeRelease = CascadeRelease;
    }

    /**
     * Get Type of the protocol used in EIP ALG 
     * @return EipAlgType Type of the protocol used in EIP ALG
     */
    public AlgType getEipAlgType() {
        return this.EipAlgType;
    }

    /**
     * Set Type of the protocol used in EIP ALG
     * @param EipAlgType Type of the protocol used in EIP ALG
     */
    public void setEipAlgType(AlgType EipAlgType) {
        this.EipAlgType = EipAlgType;
    }

    /**
     * Get The ISP of an EIP/Elastic IP, with possible return values currently including "CMCC", "CTCC", "CUCC" and "BGP" 
     * @return InternetServiceProvider The ISP of an EIP/Elastic IP, with possible return values currently including "CMCC", "CTCC", "CUCC" and "BGP"
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set The ISP of an EIP/Elastic IP, with possible return values currently including "CMCC", "CTCC", "CUCC" and "BGP"
     * @param InternetServiceProvider The ISP of an EIP/Elastic IP, with possible return values currently including "CMCC", "CTCC", "CUCC" and "BGP"
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get Whether the EIP is in a local BGP. 
     * @return LocalBgp Whether the EIP is in a local BGP.
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set Whether the EIP is in a local BGP.
     * @param LocalBgp Whether the EIP is in a local BGP.
     */
    public void setLocalBgp(Boolean LocalBgp) {
        this.LocalBgp = LocalBgp;
    }

    /**
     * Get Bandwidth value of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return Bandwidth Bandwidth value of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth value of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
     * @param Bandwidth Bandwidth value of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Network billing mode of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
Including:
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">Prepaid by monthly-subscribed bandwidth.</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly traffic.</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly bandwidth.</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">Bandwidth package.</p>
Note: this field may return `null`, indicating that no valid value was found. 
     * @return InternetChargeType Network billing mode of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
Including:
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">Prepaid by monthly-subscribed bandwidth.</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly traffic.</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly bandwidth.</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">Bandwidth package.</p>
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network billing mode of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
Including:
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">Prepaid by monthly-subscribed bandwidth.</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly traffic.</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly bandwidth.</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">Bandwidth package.</p>
Note: this field may return `null`, indicating that no valid value was found.
     * @param InternetChargeType Network billing mode of EIP. The EIP for the bill-by-CVM account will return `null`.
Note: this field may return `null`, indicating that no valid value was found.
Including:
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">Prepaid by monthly-subscribed bandwidth.</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly traffic.</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">Pay-as-you-go billing by hourly bandwidth.</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">Bandwidth package.</p>
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get List of tags associated with the EIP
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TagSet List of tags associated with the EIP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set List of tags associated with the EIP
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TagSet List of tags associated with the EIP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get The expiration time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeadlineDate The expiration time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeadlineDate() {
        return this.DeadlineDate;
    }

    /**
     * Set The expiration time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeadlineDate The expiration time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeadlineDate(String DeadlineDate) {
        this.DeadlineDate = DeadlineDate;
    }

    /**
     * Get The type of instance bound with the EIP
Note: this field may return `null`, indicating that no valid value was found. 
     * @return InstanceType The type of instance bound with the EIP
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The type of instance bound with the EIP
Note: this field may return `null`, indicating that no valid value was found.
     * @param InstanceType The type of instance bound with the EIP
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Static single-line IP network egress
Note: This field may return null, indicating that no valid value was found. 
     * @return Egress Static single-line IP network egress
Note: This field may return null, indicating that no valid value was found.
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set Static single-line IP network egress
Note: This field may return null, indicating that no valid value was found.
     * @param Egress Static single-line IP network egress
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get ID of the Anti-DDoS service package. It is returned if the EIP is an Anti-DDoS EIP.  
     * @return AntiDDoSPackageId ID of the Anti-DDoS service package. It is returned if the EIP is an Anti-DDoS EIP. 
     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set ID of the Anti-DDoS service package. It is returned if the EIP is an Anti-DDoS EIP. 
     * @param AntiDDoSPackageId ID of the Anti-DDoS service package. It is returned if the EIP is an Anti-DDoS EIP. 
     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
    }

    /**
     * Get Indicates whether the current EIP is auto-renewed. This field is displayed only for EIPs with monthly prepaid bandwidth. Valid values are as follows:
<li>NOTIFY_AND_MANUAL_RENEW: Normal renewal</li><li>NOTIFY_AND_AUTO_RENEW: Automatic renewal</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: No renewal upon expiration</li>
 
     * @return RenewFlag Indicates whether the current EIP is auto-renewed. This field is displayed only for EIPs with monthly prepaid bandwidth. Valid values are as follows:
<li>NOTIFY_AND_MANUAL_RENEW: Normal renewal</li><li>NOTIFY_AND_AUTO_RENEW: Automatic renewal</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: No renewal upon expiration</li>

     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Indicates whether the current EIP is auto-renewed. This field is displayed only for EIPs with monthly prepaid bandwidth. Valid values are as follows:
<li>NOTIFY_AND_MANUAL_RENEW: Normal renewal</li><li>NOTIFY_AND_AUTO_RENEW: Automatic renewal</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: No renewal upon expiration</li>

     * @param RenewFlag Indicates whether the current EIP is auto-renewed. This field is displayed only for EIPs with monthly prepaid bandwidth. Valid values are as follows:
<li>NOTIFY_AND_MANUAL_RENEW: Normal renewal</li><li>NOTIFY_AND_AUTO_RENEW: Automatic renewal</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: No renewal upon expiration</li>

     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Indicates the ID of the Bandwidth Package associated with the current public IP. If the public IP is not billed by Bandwidth Package, this field is empty.
Note: This field may return null, indicating that no valid value was found. 
     * @return BandwidthPackageId Indicates the ID of the Bandwidth Package associated with the current public IP. If the public IP is not billed by Bandwidth Package, this field is empty.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Indicates the ID of the Bandwidth Package associated with the current public IP. If the public IP is not billed by Bandwidth Package, this field is empty.
Note: This field may return null, indicating that no valid value was found.
     * @param BandwidthPackageId Indicates the ID of the Bandwidth Package associated with the current public IP. If the public IP is not billed by Bandwidth Package, this field is empty.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Indicates the unique ID of the VPC to which the traditional EIPv6 belongs.
Note: This field may return null, indicating that no valid value was found. 
     * @return UnVpcId Indicates the unique ID of the VPC to which the traditional EIPv6 belongs.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getUnVpcId() {
        return this.UnVpcId;
    }

    /**
     * Set Indicates the unique ID of the VPC to which the traditional EIPv6 belongs.
Note: This field may return null, indicating that no valid value was found.
     * @param UnVpcId Indicates the unique ID of the VPC to which the traditional EIPv6 belongs.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUnVpcId(String UnVpcId) {
        this.UnVpcId = UnVpcId;
    }

    /**
     * Get Indicates the unique ID of the CDC.
Note: This field may return 'null', indicating that no valid value was found. 
     * @return DedicatedClusterId Indicates the unique ID of the CDC.
Note: This field may return 'null', indicating that no valid value was found.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set Indicates the unique ID of the CDC.
Note: This field may return 'null', indicating that no valid value was found.
     * @param DedicatedClusterId Indicates the unique ID of the CDC.
Note: This field may return 'null', indicating that no valid value was found.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.AddressStatus != null) {
            this.AddressStatus = new String(source.AddressStatus);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateAddressIp != null) {
            this.PrivateAddressIp = new String(source.PrivateAddressIp);
        }
        if (source.IsArrears != null) {
            this.IsArrears = new Boolean(source.IsArrears);
        }
        if (source.IsBlocked != null) {
            this.IsBlocked = new Boolean(source.IsBlocked);
        }
        if (source.IsEipDirectConnection != null) {
            this.IsEipDirectConnection = new Boolean(source.IsEipDirectConnection);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.CascadeRelease != null) {
            this.CascadeRelease = new Boolean(source.CascadeRelease);
        }
        if (source.EipAlgType != null) {
            this.EipAlgType = new AlgType(source.EipAlgType);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.LocalBgp != null) {
            this.LocalBgp = new Boolean(source.LocalBgp);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.DeadlineDate != null) {
            this.DeadlineDate = new String(source.DeadlineDate);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.AntiDDoSPackageId != null) {
            this.AntiDDoSPackageId = new String(source.AntiDDoSPackageId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.UnVpcId != null) {
            this.UnVpcId = new String(source.UnVpcId);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "AddressStatus", this.AddressStatus);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateAddressIp", this.PrivateAddressIp);
        this.setParamSimple(map, prefix + "IsArrears", this.IsArrears);
        this.setParamSimple(map, prefix + "IsBlocked", this.IsBlocked);
        this.setParamSimple(map, prefix + "IsEipDirectConnection", this.IsEipDirectConnection);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "CascadeRelease", this.CascadeRelease);
        this.setParamObj(map, prefix + "EipAlgType.", this.EipAlgType);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "LocalBgp", this.LocalBgp);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "DeadlineDate", this.DeadlineDate);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamSimple(map, prefix + "AntiDDoSPackageId", this.AntiDDoSPackageId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "UnVpcId", this.UnVpcId);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

