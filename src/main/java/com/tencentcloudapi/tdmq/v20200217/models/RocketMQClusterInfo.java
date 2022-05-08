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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterInfo extends AbstractModel{

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

    }
}

