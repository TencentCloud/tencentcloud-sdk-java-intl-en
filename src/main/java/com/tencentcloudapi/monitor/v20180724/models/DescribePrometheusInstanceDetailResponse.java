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

public class DescribePrometheusInstanceDetailResponse extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

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
    * Instance status. Valid values:

`1`: Creating
`2`: Running
`3`: Abnormal
`4`: Rebooting
`5`: Terminating
`6`: Service suspended
`8`: Suspending service for overdue payment
`9`: Service suspended for overdue payment
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Billing status

`1`: Normal
`2`: Expired
`3`: Terminated
`4`: Assigning
`5`: Failed to assign
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * Whether Grafana is enabled
`0`: Disabled
`1`: Enabled
    */
    @SerializedName("EnableGrafana")
    @Expose
    private Long EnableGrafana;

    /**
    * Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
    * Instance billing mode. Valid values:

`2`: Monthly subscription
`3`: Pay-as-you-go
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * Specification name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Storage period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Auto-renewal flag

`0`: Auto-renewal not enabled
`1`: Auto-renewal enabled
`2`: Auto-renewal prohibited
`-1`: Invalid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get Instance status. Valid values:

`1`: Creating
`2`: Running
`3`: Abnormal
`4`: Rebooting
`5`: Terminating
`6`: Service suspended
`8`: Suspending service for overdue payment
`9`: Service suspended for overdue payment 
     * @return InstanceStatus Instance status. Valid values:

`1`: Creating
`2`: Running
`3`: Abnormal
`4`: Rebooting
`5`: Terminating
`6`: Service suspended
`8`: Suspending service for overdue payment
`9`: Service suspended for overdue payment
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status. Valid values:

`1`: Creating
`2`: Running
`3`: Abnormal
`4`: Rebooting
`5`: Terminating
`6`: Service suspended
`8`: Suspending service for overdue payment
`9`: Service suspended for overdue payment
     * @param InstanceStatus Instance status. Valid values:

`1`: Creating
`2`: Running
`3`: Abnormal
`4`: Rebooting
`5`: Terminating
`6`: Service suspended
`8`: Suspending service for overdue payment
`9`: Service suspended for overdue payment
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Billing status

`1`: Normal
`2`: Expired
`3`: Terminated
`4`: Assigning
`5`: Failed to assign
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeStatus Billing status

`1`: Normal
`2`: Expired
`3`: Terminated
`4`: Assigning
`5`: Failed to assign
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set Billing status

`1`: Normal
`2`: Expired
`3`: Terminated
`4`: Assigning
`5`: Failed to assign
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeStatus Billing status

`1`: Normal
`2`: Expired
`3`: Terminated
`4`: Assigning
`5`: Failed to assign
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get Whether Grafana is enabled
`0`: Disabled
`1`: Enabled 
     * @return EnableGrafana Whether Grafana is enabled
`0`: Disabled
`1`: Enabled
     */
    public Long getEnableGrafana() {
        return this.EnableGrafana;
    }

    /**
     * Set Whether Grafana is enabled
`0`: Disabled
`1`: Enabled
     * @param EnableGrafana Whether Grafana is enabled
`0`: Disabled
`1`: Enabled
     */
    public void setEnableGrafana(Long EnableGrafana) {
        this.EnableGrafana = EnableGrafana;
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
     * Get Instance billing mode. Valid values:

`2`: Monthly subscription
`3`: Pay-as-you-go 
     * @return InstanceChargeType Instance billing mode. Valid values:

`2`: Monthly subscription
`3`: Pay-as-you-go
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values:

`2`: Monthly subscription
`3`: Pay-as-you-go
     * @param InstanceChargeType Instance billing mode. Valid values:

`2`: Monthly subscription
`3`: Pay-as-you-go
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
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
     * Get Auto-renewal flag

`0`: Auto-renewal not enabled
`1`: Auto-renewal enabled
`2`: Auto-renewal prohibited
`-1`: Invalid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoRenewFlag Auto-renewal flag

`0`: Auto-renewal not enabled
`1`: Auto-renewal enabled
`2`: Auto-renewal prohibited
`-1`: Invalid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag

`0`: Auto-renewal not enabled
`1`: Auto-renewal enabled
`2`: Auto-renewal prohibited
`-1`: Invalid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoRenewFlag Auto-renewal flag

`0`: Auto-renewal not enabled
`1`: Auto-renewal enabled
`2`: Auto-renewal prohibited
`-1`: Invalid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePrometheusInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstanceDetailResponse(DescribePrometheusInstanceDetailResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new Long(source.ChargeStatus);
        }
        if (source.EnableGrafana != null) {
            this.EnableGrafana = new Long(source.EnableGrafana);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "EnableGrafana", this.EnableGrafana);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

