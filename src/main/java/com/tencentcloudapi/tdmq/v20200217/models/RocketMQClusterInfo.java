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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterInfo extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Creation time in milliseconds
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Public network access address
    */
    @SerializedName("PublicEndPoint")
    @Expose
    private String PublicEndPoint;

    /**
    * VPC access address
    */
    @SerializedName("VpcEndPoint")
    @Expose
    private String VpcEndPoint;

    /**
    * Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportNamespaceEndpoint")
    @Expose
    private Boolean SupportNamespaceEndpoint;

    /**
    * VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcConfig [] Vpcs;

    /**
    * Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RocketMQFlag")
    @Expose
    private Boolean RocketMQFlag;

    /**
    * Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateTime")
    @Expose
    private Long IsolateTime;

    /**
    * HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpPublicEndpoint")
    @Expose
    private String HttpPublicEndpoint;

    /**
    * HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpVpcEndpoint")
    @Expose
    private String HttpVpcEndpoint;

    /**
    * Internal TCP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternalEndpoint")
    @Expose
    private String InternalEndpoint;

    /**
    * Internal HTTP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpInternalEndpoint")
    @Expose
    private String HttpInternalEndpoint;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Creation time in milliseconds 
     * @return CreateTime Creation time in milliseconds
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in milliseconds
     * @param CreateTime Creation time in milliseconds
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Public network access address 
     * @return PublicEndPoint Public network access address
     */
    public String getPublicEndPoint() {
        return this.PublicEndPoint;
    }

    /**
     * Set Public network access address
     * @param PublicEndPoint Public network access address
     */
    public void setPublicEndPoint(String PublicEndPoint) {
        this.PublicEndPoint = PublicEndPoint;
    }

    /**
     * Get VPC access address 
     * @return VpcEndPoint VPC access address
     */
    public String getVpcEndPoint() {
        return this.VpcEndPoint;
    }

    /**
     * Set VPC access address
     * @param VpcEndPoint VPC access address
     */
    public void setVpcEndPoint(String VpcEndPoint) {
        this.VpcEndPoint = VpcEndPoint;
    }

    /**
     * Get Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SupportNamespaceEndpoint Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getSupportNamespaceEndpoint() {
        return this.SupportNamespaceEndpoint;
    }

    /**
     * Set Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SupportNamespaceEndpoint Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSupportNamespaceEndpoint(Boolean SupportNamespaceEndpoint) {
        this.SupportNamespaceEndpoint = SupportNamespaceEndpoint;
    }

    /**
     * Get VPC Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vpcs VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VpcConfig [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vpcs VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcs(VpcConfig [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsVip Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsVip Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RocketMQFlag TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRocketMQFlag() {
        return this.RocketMQFlag;
    }

    /**
     * Set TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RocketMQFlag TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRocketMQFlag(Boolean RocketMQFlag) {
        this.RocketMQFlag = RocketMQFlag;
    }

    /**
     * Get Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolateTime Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolateTime Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateTime(Long IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpPublicEndpoint HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpPublicEndpoint() {
        return this.HttpPublicEndpoint;
    }

    /**
     * Set HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpPublicEndpoint HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpPublicEndpoint(String HttpPublicEndpoint) {
        this.HttpPublicEndpoint = HttpPublicEndpoint;
    }

    /**
     * Get HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpVpcEndpoint HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpVpcEndpoint() {
        return this.HttpVpcEndpoint;
    }

    /**
     * Set HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpVpcEndpoint HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpVpcEndpoint(String HttpVpcEndpoint) {
        this.HttpVpcEndpoint = HttpVpcEndpoint;
    }

    /**
     * Get Internal TCP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return InternalEndpoint Internal TCP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getInternalEndpoint() {
        return this.InternalEndpoint;
    }

    /**
     * Set Internal TCP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param InternalEndpoint Internal TCP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setInternalEndpoint(String InternalEndpoint) {
        this.InternalEndpoint = InternalEndpoint;
    }

    /**
     * Get Internal HTTP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return HttpInternalEndpoint Internal HTTP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpInternalEndpoint() {
        return this.HttpInternalEndpoint;
    }

    /**
     * Set Internal HTTP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param HttpInternalEndpoint Internal HTTP access address
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpInternalEndpoint(String HttpInternalEndpoint) {
        this.HttpInternalEndpoint = HttpInternalEndpoint;
    }

    public RocketMQClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterInfo(RocketMQClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicEndPoint != null) {
            this.PublicEndPoint = new String(source.PublicEndPoint);
        }
        if (source.VpcEndPoint != null) {
            this.VpcEndPoint = new String(source.VpcEndPoint);
        }
        if (source.SupportNamespaceEndpoint != null) {
            this.SupportNamespaceEndpoint = new Boolean(source.SupportNamespaceEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcConfig[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcConfig(source.Vpcs[i]);
            }
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.RocketMQFlag != null) {
            this.RocketMQFlag = new Boolean(source.RocketMQFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new Long(source.IsolateTime);
        }
        if (source.HttpPublicEndpoint != null) {
            this.HttpPublicEndpoint = new String(source.HttpPublicEndpoint);
        }
        if (source.HttpVpcEndpoint != null) {
            this.HttpVpcEndpoint = new String(source.HttpVpcEndpoint);
        }
        if (source.InternalEndpoint != null) {
            this.InternalEndpoint = new String(source.InternalEndpoint);
        }
        if (source.HttpInternalEndpoint != null) {
            this.HttpInternalEndpoint = new String(source.HttpInternalEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicEndPoint", this.PublicEndPoint);
        this.setParamSimple(map, prefix + "VpcEndPoint", this.VpcEndPoint);
        this.setParamSimple(map, prefix + "SupportNamespaceEndpoint", this.SupportNamespaceEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "RocketMQFlag", this.RocketMQFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "HttpPublicEndpoint", this.HttpPublicEndpoint);
        this.setParamSimple(map, prefix + "HttpVpcEndpoint", this.HttpVpcEndpoint);
        this.setParamSimple(map, prefix + "InternalEndpoint", this.InternalEndpoint);
        this.setParamSimple(map, prefix + "HttpInternalEndpoint", this.HttpInternalEndpoint);

    }
}

