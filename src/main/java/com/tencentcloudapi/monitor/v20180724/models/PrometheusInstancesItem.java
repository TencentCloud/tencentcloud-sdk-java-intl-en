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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstancesItem extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance billing mode. Valid values:
<ul>
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
</ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Storage period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * Instance status. Valid values:
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Whether Grafana is enabled
<li>0: Disabled</li>
<li>1: Enabled</li>
    */
    @SerializedName("EnableGrafana")
    @Expose
    private Long EnableGrafana;

    /**
    * Instance IPv4 address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPv4Address")
    @Expose
    private String IPv4Address;

    /**
    * List of tags associated with the instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Billing status
<ul>
<li>1: Normal</li>
<li>2: Expired</li>
<li>3: Terminated</li>
<li>4: Assigning</li>
<li>5: Assignment failed</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * Specification name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Auto-renewal flag
<ul>
<li>0: Auto-renewal not enabled</li>
<li>1: Auto-renewal enabled</li>
<li>2: Auto-renewal prohibited</li>
<li>-1: Invalid</ii>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Expiring soon
<ul>
<li>0: No</li>
<li>1: Yes</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNearExpire")
    @Expose
    private Long IsNearExpire;

    /**
    * The token required for data writing
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthToken")
    @Expose
    private String AuthToken;

    /**
    * Prometheus remote write address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoteWrite")
    @Expose
    private String RemoteWrite;

    /**
    * Prometheus HTTP API root address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiRootPath")
    @Expose
    private String ApiRootPath;

    /**
    * Proxy address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyAddress")
    @Expose
    private String ProxyAddress;

    /**
    * Grafana status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Restarting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>7: Deleted</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrafanaStatus")
    @Expose
    private Long GrafanaStatus;

    /**
    * Grafana IP allowlist, where IPs are separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrafanaIpWhiteList")
    @Expose
    private String GrafanaIpWhiteList;

    /**
    * Instance authorization information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Grant")
    @Expose
    private PrometheusInstanceGrantInfo Grant;

    /**
    * ID of the bound Grafana instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrafanaInstanceId")
    @Expose
    private String GrafanaInstanceId;

    /**
    * The alert rule limit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlertRuleLimit")
    @Expose
    private Long AlertRuleLimit;

    /**
    * The recording rule limit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordingRuleLimit")
    @Expose
    private Long RecordingRuleLimit;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance billing mode. Valid values:
<ul>
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
</ul> 
     * @return InstanceChargeType Instance billing mode. Valid values:
<ul>
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
</ul>
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values:
<ul>
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
</ul>
     * @param InstanceChargeType Instance billing mode. Valid values:
<ul>
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
</ul>
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Storage period
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataRetentionTime Storage period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set Storage period
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataRetentionTime Storage period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get Instance status. Valid values:
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul> 
     * @return InstanceStatus Instance status. Valid values:
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status. Valid values:
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
     * @param InstanceStatus Instance status. Valid values:
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GrafanaURL Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GrafanaURL Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Whether Grafana is enabled
<li>0: Disabled</li>
<li>1: Enabled</li> 
     * @return EnableGrafana Whether Grafana is enabled
<li>0: Disabled</li>
<li>1: Enabled</li>
     */
    public Long getEnableGrafana() {
        return this.EnableGrafana;
    }

    /**
     * Set Whether Grafana is enabled
<li>0: Disabled</li>
<li>1: Enabled</li>
     * @param EnableGrafana Whether Grafana is enabled
<li>0: Disabled</li>
<li>1: Enabled</li>
     */
    public void setEnableGrafana(Long EnableGrafana) {
        this.EnableGrafana = EnableGrafana;
    }

    /**
     * Get Instance IPv4 address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IPv4Address Instance IPv4 address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIPv4Address() {
        return this.IPv4Address;
    }

    /**
     * Set Instance IPv4 address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IPv4Address Instance IPv4 address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    /**
     * Get List of tags associated with the instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagSpecification List of tags associated with the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set List of tags associated with the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagSpecification List of tags associated with the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Billing status
<ul>
<li>1: Normal</li>
<li>2: Expired</li>
<li>3: Terminated</li>
<li>4: Assigning</li>
<li>5: Assignment failed</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeStatus Billing status
<ul>
<li>1: Normal</li>
<li>2: Expired</li>
<li>3: Terminated</li>
<li>4: Assigning</li>
<li>5: Assignment failed</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set Billing status
<ul>
<li>1: Normal</li>
<li>2: Expired</li>
<li>3: Terminated</li>
<li>4: Assigning</li>
<li>5: Assignment failed</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeStatus Billing status
<ul>
<li>1: Normal</li>
<li>2: Expired</li>
<li>3: Terminated</li>
<li>4: Assigning</li>
<li>5: Assignment failed</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get Specification name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Specification name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Specification name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecName Specification name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Auto-renewal flag
<ul>
<li>0: Auto-renewal not enabled</li>
<li>1: Auto-renewal enabled</li>
<li>2: Auto-renewal prohibited</li>
<li>-1: Invalid</ii>
</ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoRenewFlag Auto-renewal flag
<ul>
<li>0: Auto-renewal not enabled</li>
<li>1: Auto-renewal enabled</li>
<li>2: Auto-renewal prohibited</li>
<li>-1: Invalid</ii>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag
<ul>
<li>0: Auto-renewal not enabled</li>
<li>1: Auto-renewal enabled</li>
<li>2: Auto-renewal prohibited</li>
<li>-1: Invalid</ii>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoRenewFlag Auto-renewal flag
<ul>
<li>0: Auto-renewal not enabled</li>
<li>1: Auto-renewal enabled</li>
<li>2: Auto-renewal prohibited</li>
<li>-1: Invalid</ii>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Expiring soon
<ul>
<li>0: No</li>
<li>1: Yes</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsNearExpire Expiring soon
<ul>
<li>0: No</li>
<li>1: Yes</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsNearExpire() {
        return this.IsNearExpire;
    }

    /**
     * Set Expiring soon
<ul>
<li>0: No</li>
<li>1: Yes</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsNearExpire Expiring soon
<ul>
<li>0: No</li>
<li>1: Yes</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsNearExpire(Long IsNearExpire) {
        this.IsNearExpire = IsNearExpire;
    }

    /**
     * Get The token required for data writing
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthToken The token required for data writing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set The token required for data writing
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthToken The token required for data writing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthToken(String AuthToken) {
        this.AuthToken = AuthToken;
    }

    /**
     * Get Prometheus remote write address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemoteWrite Prometheus remote write address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemoteWrite() {
        return this.RemoteWrite;
    }

    /**
     * Set Prometheus remote write address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemoteWrite Prometheus remote write address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemoteWrite(String RemoteWrite) {
        this.RemoteWrite = RemoteWrite;
    }

    /**
     * Get Prometheus HTTP API root address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiRootPath Prometheus HTTP API root address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiRootPath() {
        return this.ApiRootPath;
    }

    /**
     * Set Prometheus HTTP API root address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiRootPath Prometheus HTTP API root address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiRootPath(String ApiRootPath) {
        this.ApiRootPath = ApiRootPath;
    }

    /**
     * Get Proxy address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyAddress Proxy address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set Proxy address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyAddress Proxy address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyAddress(String ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get Grafana status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Restarting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>7: Deleted</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GrafanaStatus Grafana status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Restarting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>7: Deleted</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGrafanaStatus() {
        return this.GrafanaStatus;
    }

    /**
     * Set Grafana status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Restarting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>7: Deleted</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GrafanaStatus Grafana status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Restarting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>7: Deleted</li>
</ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrafanaStatus(Long GrafanaStatus) {
        this.GrafanaStatus = GrafanaStatus;
    }

    /**
     * Get Grafana IP allowlist, where IPs are separated by comma.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GrafanaIpWhiteList Grafana IP allowlist, where IPs are separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrafanaIpWhiteList() {
        return this.GrafanaIpWhiteList;
    }

    /**
     * Set Grafana IP allowlist, where IPs are separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GrafanaIpWhiteList Grafana IP allowlist, where IPs are separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrafanaIpWhiteList(String GrafanaIpWhiteList) {
        this.GrafanaIpWhiteList = GrafanaIpWhiteList;
    }

    /**
     * Get Instance authorization information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Grant Instance authorization information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusInstanceGrantInfo getGrant() {
        return this.Grant;
    }

    /**
     * Set Instance authorization information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Grant Instance authorization information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrant(PrometheusInstanceGrantInfo Grant) {
        this.Grant = Grant;
    }

    /**
     * Get ID of the bound Grafana instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GrafanaInstanceId ID of the bound Grafana instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrafanaInstanceId() {
        return this.GrafanaInstanceId;
    }

    /**
     * Set ID of the bound Grafana instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GrafanaInstanceId ID of the bound Grafana instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrafanaInstanceId(String GrafanaInstanceId) {
        this.GrafanaInstanceId = GrafanaInstanceId;
    }

    /**
     * Get The alert rule limit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlertRuleLimit The alert rule limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAlertRuleLimit() {
        return this.AlertRuleLimit;
    }

    /**
     * Set The alert rule limit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlertRuleLimit The alert rule limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlertRuleLimit(Long AlertRuleLimit) {
        this.AlertRuleLimit = AlertRuleLimit;
    }

    /**
     * Get The recording rule limit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordingRuleLimit The recording rule limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRecordingRuleLimit() {
        return this.RecordingRuleLimit;
    }

    /**
     * Set The recording rule limit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordingRuleLimit The recording rule limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordingRuleLimit(Long RecordingRuleLimit) {
        this.RecordingRuleLimit = RecordingRuleLimit;
    }

    public PrometheusInstancesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstancesItem(PrometheusInstancesItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.EnableGrafana != null) {
            this.EnableGrafana = new Long(source.EnableGrafana);
        }
        if (source.IPv4Address != null) {
            this.IPv4Address = new String(source.IPv4Address);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new Long(source.ChargeStatus);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.IsNearExpire != null) {
            this.IsNearExpire = new Long(source.IsNearExpire);
        }
        if (source.AuthToken != null) {
            this.AuthToken = new String(source.AuthToken);
        }
        if (source.RemoteWrite != null) {
            this.RemoteWrite = new String(source.RemoteWrite);
        }
        if (source.ApiRootPath != null) {
            this.ApiRootPath = new String(source.ApiRootPath);
        }
        if (source.ProxyAddress != null) {
            this.ProxyAddress = new String(source.ProxyAddress);
        }
        if (source.GrafanaStatus != null) {
            this.GrafanaStatus = new Long(source.GrafanaStatus);
        }
        if (source.GrafanaIpWhiteList != null) {
            this.GrafanaIpWhiteList = new String(source.GrafanaIpWhiteList);
        }
        if (source.Grant != null) {
            this.Grant = new PrometheusInstanceGrantInfo(source.Grant);
        }
        if (source.GrafanaInstanceId != null) {
            this.GrafanaInstanceId = new String(source.GrafanaInstanceId);
        }
        if (source.AlertRuleLimit != null) {
            this.AlertRuleLimit = new Long(source.AlertRuleLimit);
        }
        if (source.RecordingRuleLimit != null) {
            this.RecordingRuleLimit = new Long(source.RecordingRuleLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "EnableGrafana", this.EnableGrafana);
        this.setParamSimple(map, prefix + "IPv4Address", this.IPv4Address);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "IsNearExpire", this.IsNearExpire);
        this.setParamSimple(map, prefix + "AuthToken", this.AuthToken);
        this.setParamSimple(map, prefix + "RemoteWrite", this.RemoteWrite);
        this.setParamSimple(map, prefix + "ApiRootPath", this.ApiRootPath);
        this.setParamSimple(map, prefix + "ProxyAddress", this.ProxyAddress);
        this.setParamSimple(map, prefix + "GrafanaStatus", this.GrafanaStatus);
        this.setParamSimple(map, prefix + "GrafanaIpWhiteList", this.GrafanaIpWhiteList);
        this.setParamObj(map, prefix + "Grant.", this.Grant);
        this.setParamSimple(map, prefix + "GrafanaInstanceId", this.GrafanaInstanceId);
        this.setParamSimple(map, prefix + "AlertRuleLimit", this.AlertRuleLimit);
        this.setParamSimple(map, prefix + "RecordingRuleLimit", this.RecordingRuleLimit);

    }
}

