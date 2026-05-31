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

public class RocketMQRoleConfig extends AbstractModel {

    /**
    * Role name, corresponding to the secret key.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * accessKey
    */
    @SerializedName("RoleToken")
    @Expose
    private String RoleToken;

    /**
    * Namespace
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Role permission
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Permission type. Permissions are granted by cluster by default. Cluster: cluster level; TopicAndGroup: topic/consumer group level.
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * Permission configuration in the topic and group dimensions.
    */
    @SerializedName("DetailedRolePerms")
    @Expose
    private DetailedRolePerm [] DetailedRolePerms;

    /**
     * Get Role name, corresponding to the secret key. 
     * @return RoleName Role name, corresponding to the secret key.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name, corresponding to the secret key.
     * @param RoleName Role name, corresponding to the secret key.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get accessKey 
     * @return RoleToken accessKey
     */
    public String getRoleToken() {
        return this.RoleToken;
    }

    /**
     * Set accessKey
     * @param RoleToken accessKey
     */
    public void setRoleToken(String RoleToken) {
        this.RoleToken = RoleToken;
    }

    /**
     * Get Namespace 
     * @return EnvironmentId Namespace
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace
     * @param EnvironmentId Namespace
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Role permission 
     * @return Permissions Role permission
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Role permission
     * @param Permissions Role permission
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
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
     * Get Permission type. Permissions are granted by cluster by default. Cluster: cluster level; TopicAndGroup: topic/consumer group level. 
     * @return PermType Permission type. Permissions are granted by cluster by default. Cluster: cluster level; TopicAndGroup: topic/consumer group level.
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set Permission type. Permissions are granted by cluster by default. Cluster: cluster level; TopicAndGroup: topic/consumer group level.
     * @param PermType Permission type. Permissions are granted by cluster by default. Cluster: cluster level; TopicAndGroup: topic/consumer group level.
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get Permission configuration in the topic and group dimensions. 
     * @return DetailedRolePerms Permission configuration in the topic and group dimensions.
     */
    public DetailedRolePerm [] getDetailedRolePerms() {
        return this.DetailedRolePerms;
    }

    /**
     * Set Permission configuration in the topic and group dimensions.
     * @param DetailedRolePerms Permission configuration in the topic and group dimensions.
     */
    public void setDetailedRolePerms(DetailedRolePerm [] DetailedRolePerms) {
        this.DetailedRolePerms = DetailedRolePerms;
    }

    public RocketMQRoleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQRoleConfig(RocketMQRoleConfig source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleToken != null) {
            this.RoleToken = new String(source.RoleToken);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.DetailedRolePerms != null) {
            this.DetailedRolePerms = new DetailedRolePerm[source.DetailedRolePerms.length];
            for (int i = 0; i < source.DetailedRolePerms.length; i++) {
                this.DetailedRolePerms[i] = new DetailedRolePerm(source.DetailedRolePerms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleToken", this.RoleToken);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamArrayObj(map, prefix + "DetailedRolePerms.", this.DetailedRolePerms);

    }
}

