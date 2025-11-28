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

public class CreateRocketMQRoleRequest extends AbstractModel {

    /**
    * Role name. Does not support Chinese characters and special characters other than hyphens (-) and underscores (_), and must be greater than 0 and less than or equal to 32 in length.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Required field, cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Remark description. Length must be greater than or equal to 0 and less than or equal to 128.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Role authorization type (cluster: Cluster; topic or consumer group: TopicAndGroup).
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
     * Get Role name. Does not support Chinese characters and special characters other than hyphens (-) and underscores (_), and must be greater than 0 and less than or equal to 32 in length. 
     * @return RoleName Role name. Does not support Chinese characters and special characters other than hyphens (-) and underscores (_), and must be greater than 0 and less than or equal to 32 in length.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name. Does not support Chinese characters and special characters other than hyphens (-) and underscores (_), and must be greater than 0 and less than or equal to 32 in length.
     * @param RoleName Role name. Does not support Chinese characters and special characters other than hyphens (-) and underscores (_), and must be greater than 0 and less than or equal to 32 in length.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Required field, cluster ID 
     * @return ClusterId Required field, cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Required field, cluster ID
     * @param ClusterId Required field, cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Remark description. Length must be greater than or equal to 0 and less than or equal to 128. 
     * @return Remark Remark description. Length must be greater than or equal to 0 and less than or equal to 128.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remark description. Length must be greater than or equal to 0 and less than or equal to 128.
     * @param Remark Remark description. Length must be greater than or equal to 0 and less than or equal to 128.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Role authorization type (cluster: Cluster; topic or consumer group: TopicAndGroup). 
     * @return PermType Role authorization type (cluster: Cluster; topic or consumer group: TopicAndGroup).
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set Role authorization type (cluster: Cluster; topic or consumer group: TopicAndGroup).
     * @param PermType Role authorization type (cluster: Cluster; topic or consumer group: TopicAndGroup).
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    public CreateRocketMQRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQRoleRequest(CreateRocketMQRoleRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PermType", this.PermType);

    }
}

