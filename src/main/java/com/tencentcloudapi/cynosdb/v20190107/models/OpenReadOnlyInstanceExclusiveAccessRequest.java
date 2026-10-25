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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenReadOnlyInstanceExclusiveAccessRequest extends AbstractModel {

    /**
    * Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the clusterId.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the instanceId.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Designated vpc ID. Please use [query the vpc list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) to get the vpc ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Designated subnet ID. If vpc ID is set up, SubnetId is required. Please use query subnet list (https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * User-defined port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Security group ID. Please use [View Security Group](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1) to get the SecurityGroupId.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the clusterId. 
     * @return ClusterId Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the clusterId.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the clusterId.
     * @param ClusterId Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the clusterId.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the instanceId. 
     * @return InstanceId Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the instanceId.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the instanceId.
     * @param InstanceId Please use [Cluster information description](https://www.tencentcloud.com/document/api/1003/48086?from_cn_redirect=1) to get the instanceId.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Designated vpc ID. Please use [query the vpc list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) to get the vpc ID. 
     * @return VpcId Designated vpc ID. Please use [query the vpc list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) to get the vpc ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Designated vpc ID. Please use [query the vpc list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) to get the vpc ID.
     * @param VpcId Designated vpc ID. Please use [query the vpc list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) to get the vpc ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Designated subnet ID. If vpc ID is set up, SubnetId is required. Please use query subnet list (https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId. 
     * @return SubnetId Designated subnet ID. If vpc ID is set up, SubnetId is required. Please use query subnet list (https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Designated subnet ID. If vpc ID is set up, SubnetId is required. Please use query subnet list (https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
     * @param SubnetId Designated subnet ID. If vpc ID is set up, SubnetId is required. Please use query subnet list (https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get User-defined port. 
     * @return Port User-defined port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set User-defined port.
     * @param Port User-defined port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Security group ID. Please use [View Security Group](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1) to get the SecurityGroupId. 
     * @return SecurityGroupIds Security group ID. Please use [View Security Group](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1) to get the SecurityGroupId.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID. Please use [View Security Group](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1) to get the SecurityGroupId.
     * @param SecurityGroupIds Security group ID. Please use [View Security Group](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1) to get the SecurityGroupId.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public OpenReadOnlyInstanceExclusiveAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenReadOnlyInstanceExclusiveAccessRequest(OpenReadOnlyInstanceExclusiveAccessRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

