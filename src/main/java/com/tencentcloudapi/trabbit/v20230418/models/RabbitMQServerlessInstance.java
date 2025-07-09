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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQServerlessInstance extends AbstractModel {

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
    * Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * MaxTPS
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * MaxBandwidth
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Expiration time of the cluster.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 0: Postpaid, 1: Prepaid
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
    * Cluster specifications
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Exception information.
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * Public network access point.
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * The virtual private cloud (vpc) network access point.
    */
    @SerializedName("Vpcs")
    @Expose
    private RabbitMQServerlessEndpoint [] Vpcs;

    /**
    * Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.

    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * Specifies the cluster type: 1.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Expiration time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * For compatibility with the managed version, the fixed value is 0.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * For compatibility with the managed version, the fixed value is 0.
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Isolation time
    */
    @SerializedName("IsolatedTime")
    @Expose
    private Long IsolatedTime;

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
     * Get Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed. 
     * @return Status Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
     * @param Status Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get MaxTPS 
     * @return MaxTps MaxTPS
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set MaxTPS
     * @param MaxTps MaxTPS
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get MaxBandwidth 
     * @return MaxBandWidth MaxBandwidth
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set MaxBandwidth
     * @param MaxBandWidth MaxBandwidth
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Expiration time of the cluster. 
     * @return ExpireTime Expiration time of the cluster.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of the cluster.
     * @param ExpireTime Expiration time of the cluster.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user). 
     * @return AutoRenewFlag Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
     * @param AutoRenewFlag Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 0: Postpaid, 1: Prepaid 
     * @return PayMode 0: Postpaid, 1: Prepaid
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 0: Postpaid, 1: Prepaid
     * @param PayMode 0: Postpaid, 1: Prepaid
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
     * Get Cluster specifications 
     * @return SpecName Cluster specifications
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Cluster specifications
     * @param SpecName Cluster specifications
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Exception information. 
     * @return ExceptionInformation Exception information.
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set Exception information.
     * @param ExceptionInformation Exception information.
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get Public network access point. 
     * @return PublicAccessEndpoint Public network access point.
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set Public network access point.
     * @param PublicAccessEndpoint Public network access point.
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get The virtual private cloud (vpc) network access point. 
     * @return Vpcs The virtual private cloud (vpc) network access point.
     */
    public RabbitMQServerlessEndpoint [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set The virtual private cloud (vpc) network access point.
     * @param Vpcs The virtual private cloud (vpc) network access point.
     */
    public void setVpcs(RabbitMQServerlessEndpoint [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
 
     * @return ClusterStatus Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.

     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.

     * @param ClusterStatus Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.

     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Specifies the cluster type: 1. 
     * @return InstanceType Specifies the cluster type: 1.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifies the cluster type: 1.
     * @param InstanceType Specifies the cluster type: 1.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Expiration time 
     * @return CreateTime Expiration time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Expiration time
     * @param CreateTime Expiration time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get For compatibility with the managed version, the fixed value is 0. 
     * @return NodeCount For compatibility with the managed version, the fixed value is 0.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set For compatibility with the managed version, the fixed value is 0.
     * @param NodeCount For compatibility with the managed version, the fixed value is 0.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get For compatibility with the managed version, the fixed value is 0. 
     * @return MaxStorage For compatibility with the managed version, the fixed value is 0.
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set For compatibility with the managed version, the fixed value is 0.
     * @param MaxStorage For compatibility with the managed version, the fixed value is 0.
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Isolation time 
     * @return IsolatedTime Isolation time
     */
    public Long getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Isolation time
     * @param IsolatedTime Isolation time
     */
    public void setIsolatedTime(Long IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    public RabbitMQServerlessInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQServerlessInstance(RabbitMQServerlessInstance source) {
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
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
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
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new RabbitMQServerlessEndpoint[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new RabbitMQServerlessEndpoint(source.Vpcs[i]);
            }
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new Long(source.IsolatedTime);
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
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ExceptionInformation", this.ExceptionInformation);
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);

    }
}

