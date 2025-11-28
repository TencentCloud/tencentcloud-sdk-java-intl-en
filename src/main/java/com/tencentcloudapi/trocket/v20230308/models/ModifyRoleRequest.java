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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoleRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Role name. It can be obtained from [RoleItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.comom/document/api/1493/98862?from_cn_redirect=1) or from the console.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Whether to enable consumption.
    */
    @SerializedName("PermRead")
    @Expose
    private Boolean PermRead;

    /**
    * Whether to enable production
    */
    @SerializedName("PermWrite")
    @Expose
    private Boolean PermWrite;

    /**
    * Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group dimension).
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Permission configuration in the topic/group dimension. It is required when the permission type parameter is set to TopicAndGroup.
    */
    @SerializedName("DetailedPerms")
    @Expose
    private DetailedRolePerm [] DetailedPerms;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Role name. It can be obtained from [RoleItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.comom/document/api/1493/98862?from_cn_redirect=1) or from the console. 
     * @return Role Role name. It can be obtained from [RoleItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.comom/document/api/1493/98862?from_cn_redirect=1) or from the console.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role name. It can be obtained from [RoleItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.comom/document/api/1493/98862?from_cn_redirect=1) or from the console.
     * @param Role Role name. It can be obtained from [RoleItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.comom/document/api/1493/98862?from_cn_redirect=1) or from the console.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Whether to enable consumption. 
     * @return PermRead Whether to enable consumption.
     */
    public Boolean getPermRead() {
        return this.PermRead;
    }

    /**
     * Set Whether to enable consumption.
     * @param PermRead Whether to enable consumption.
     */
    public void setPermRead(Boolean PermRead) {
        this.PermRead = PermRead;
    }

    /**
     * Get Whether to enable production 
     * @return PermWrite Whether to enable production
     */
    public Boolean getPermWrite() {
        return this.PermWrite;
    }

    /**
     * Set Whether to enable production
     * @param PermWrite Whether to enable production
     */
    public void setPermWrite(Boolean PermWrite) {
        this.PermWrite = PermWrite;
    }

    /**
     * Get Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group dimension). 
     * @return PermType Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group dimension).
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group dimension).
     * @param PermType Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group dimension).
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
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
     * Get Permission configuration in the topic/group dimension. It is required when the permission type parameter is set to TopicAndGroup. 
     * @return DetailedPerms Permission configuration in the topic/group dimension. It is required when the permission type parameter is set to TopicAndGroup.
     */
    public DetailedRolePerm [] getDetailedPerms() {
        return this.DetailedPerms;
    }

    /**
     * Set Permission configuration in the topic/group dimension. It is required when the permission type parameter is set to TopicAndGroup.
     * @param DetailedPerms Permission configuration in the topic/group dimension. It is required when the permission type parameter is set to TopicAndGroup.
     */
    public void setDetailedPerms(DetailedRolePerm [] DetailedPerms) {
        this.DetailedPerms = DetailedPerms;
    }

    public ModifyRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoleRequest(ModifyRoleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.PermRead != null) {
            this.PermRead = new Boolean(source.PermRead);
        }
        if (source.PermWrite != null) {
            this.PermWrite = new Boolean(source.PermWrite);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DetailedPerms != null) {
            this.DetailedPerms = new DetailedRolePerm[source.DetailedPerms.length];
            for (int i = 0; i < source.DetailedPerms.length; i++) {
                this.DetailedPerms[i] = new DetailedRolePerm(source.DetailedPerms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "PermRead", this.PermRead);
        this.setParamSimple(map, prefix + "PermWrite", this.PermWrite);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "DetailedPerms.", this.DetailedPerms);

    }
}

