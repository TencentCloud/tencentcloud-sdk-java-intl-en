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
    * Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the clusterId.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the instanceId.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the designated vpc ID. please use the "query vpc list" to obtain the vpc ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Specified subnet ID. if vpc ID is set, SubnetId is required. please use query subnet list (https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * User-Defined port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Security group ID. use [view security group](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) to obtain the SecurityGroupId.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the clusterId. 
     * @return ClusterId Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the clusterId.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the clusterId.
     * @param ClusterId Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the clusterId.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the instanceId. 
     * @return InstanceId Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the instanceId.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the instanceId.
     * @param InstanceId Please use the cluster information description (https://intl.cloud.tencent.com/document/api/1003/48086?from_cn_redirect=1) to obtain the instanceId.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the designated vpc ID. please use the "query vpc list" to obtain the vpc ID. 
     * @return VpcId Specifies the designated vpc ID. please use the "query vpc list" to obtain the vpc ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the designated vpc ID. please use the "query vpc list" to obtain the vpc ID.
     * @param VpcId Specifies the designated vpc ID. please use the "query vpc list" to obtain the vpc ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Specified subnet ID. if vpc ID is set, SubnetId is required. please use query subnet list (https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId. 
     * @return SubnetId Specified subnet ID. if vpc ID is set, SubnetId is required. please use query subnet list (https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Specified subnet ID. if vpc ID is set, SubnetId is required. please use query subnet list (https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
     * @param SubnetId Specified subnet ID. if vpc ID is set, SubnetId is required. please use query subnet list (https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) to get SubnetId.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get User-Defined port. 
     * @return Port User-Defined port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set User-Defined port.
     * @param Port User-Defined port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Security group ID. use [view security group](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) to obtain the SecurityGroupId. 
     * @return SecurityGroupIds Security group ID. use [view security group](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) to obtain the SecurityGroupId.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID. use [view security group](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) to obtain the SecurityGroupId.
     * @param SecurityGroupIds Security group ID. use [view security group](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) to obtain the SecurityGroupId.
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

