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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVipInstance extends AbstractModel {

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
    * Instance version.
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of nodes
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Instance specification name
    */
    @SerializedName("ConfigDisplay")
    @Expose
    private String ConfigDisplay;

    /**
    * Peak TPS
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * Peak bandwidth in Mbps
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Storage capacity in GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 1 indicates prepaid mode, 0 indicates postpaid.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Node specification of the cluster. specifies the corresponding flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
This parameter is used to display the instance status additionally and distinguish from the `Status` parameter.
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * Public network access point.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * VPC access point list.
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * Creation time in milliseconds. unix timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Instance type. valid values: 0 (managed), 1 (Serverless).
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Isolation time, in milliseconds. unix timestamp.
    */
    @SerializedName("IsolatedTime")
    @Expose
    private Long IsolatedTime;

    /**
    * Whether deletion protection is enabled.
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get Instance version. 
     * @return InstanceVersion Instance version.
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Instance version.
     * @param InstanceVersion Instance version.
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed). 
     * @return Status Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
     * @param Status Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of nodes 
     * @return NodeCount Number of nodes
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes
     * @param NodeCount Number of nodes
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Instance specification name 
     * @return ConfigDisplay Instance specification name
     */
    public String getConfigDisplay() {
        return this.ConfigDisplay;
    }

    /**
     * Set Instance specification name
     * @param ConfigDisplay Instance specification name
     */
    public void setConfigDisplay(String ConfigDisplay) {
        this.ConfigDisplay = ConfigDisplay;
    }

    /**
     * Get Peak TPS 
     * @return MaxTps Peak TPS
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set Peak TPS
     * @param MaxTps Peak TPS
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get Peak bandwidth in Mbps 
     * @return MaxBandWidth Peak bandwidth in Mbps
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Peak bandwidth in Mbps
     * @param MaxBandWidth Peak bandwidth in Mbps
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Storage capacity in GB 
     * @return MaxStorage Storage capacity in GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Storage capacity in GB
     * @param MaxStorage Storage capacity in GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources. 
     * @return ExpireTime Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
     * @param ExpireTime Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users). 
     * @return AutoRenewFlag Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
     * @param AutoRenewFlag Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 1 indicates prepaid mode, 0 indicates postpaid. 
     * @return PayMode 1 indicates prepaid mode, 0 indicates postpaid.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 1 indicates prepaid mode, 0 indicates postpaid.
     * @param PayMode 1 indicates prepaid mode, 0 indicates postpaid.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Node specification of the cluster. specifies the corresponding flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1. 
     * @return SpecName Node specification of the cluster. specifies the corresponding flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Node specification of the cluster. specifies the corresponding flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
     * @param SpecName Node specification of the cluster. specifies the corresponding flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptionInformation Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptionInformation Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
This parameter is used to display the instance status additionally and distinguish from the `Status` parameter. 
     * @return ClusterStatus Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
This parameter is used to display the instance status additionally and distinguish from the `Status` parameter.
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
This parameter is used to display the instance status additionally and distinguish from the `Status` parameter.
     * @param ClusterStatus Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
This parameter is used to display the instance status additionally and distinguish from the `Status` parameter.
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Public network access point.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicAccessEndpoint Public network access point.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set Public network access point.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicAccessEndpoint Public network access point.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get VPC access point list. 
     * @return Vpcs VPC access point list.
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set VPC access point list.
     * @param Vpcs VPC access point list.
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get Creation time in milliseconds. unix timestamp. 
     * @return CreateTime Creation time in milliseconds. unix timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in milliseconds. unix timestamp.
     * @param CreateTime Creation time in milliseconds. unix timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance type. valid values: 0 (managed), 1 (Serverless). 
     * @return InstanceType Instance type. valid values: 0 (managed), 1 (Serverless).
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. valid values: 0 (managed), 1 (Serverless).
     * @param InstanceType Instance type. valid values: 0 (managed), 1 (Serverless).
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Isolation time, in milliseconds. unix timestamp. 
     * @return IsolatedTime Isolation time, in milliseconds. unix timestamp.
     */
    public Long getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Isolation time, in milliseconds. unix timestamp.
     * @param IsolatedTime Isolation time, in milliseconds. unix timestamp.
     */
    public void setIsolatedTime(Long IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get Whether deletion protection is enabled. 
     * @return EnableDeletionProtection Whether deletion protection is enabled.
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set Whether deletion protection is enabled.
     * @param EnableDeletionProtection Whether deletion protection is enabled.
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public RabbitMQVipInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVipInstance(RabbitMQVipInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.ConfigDisplay != null) {
            this.ConfigDisplay = new String(source.ConfigDisplay);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.ExceptionInformation != null) {
            this.ExceptionInformation = new String(source.ExceptionInformation);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcEndpointInfo[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcEndpointInfo(source.Vpcs[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new Long(source.IsolatedTime);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "ConfigDisplay", this.ConfigDisplay);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ExceptionInformation", this.ExceptionInformation);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

