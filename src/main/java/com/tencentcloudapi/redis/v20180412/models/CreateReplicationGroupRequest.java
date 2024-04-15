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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReplicationGroupRequest extends AbstractModel {

    /**
    * Specifies the ID of the primary instance in the replication group.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Replication group name. It supports only Chinese characters, letters, digits, underscores (_), and hyphens (-), with a length of 2-64 characters.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Remark information.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Specifies the ID of the primary instance in the replication group. 
     * @return InstanceId Specifies the ID of the primary instance in the replication group.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the ID of the primary instance in the replication group.
     * @param InstanceId Specifies the ID of the primary instance in the replication group.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Replication group name. It supports only Chinese characters, letters, digits, underscores (_), and hyphens (-), with a length of 2-64 characters. 
     * @return GroupName Replication group name. It supports only Chinese characters, letters, digits, underscores (_), and hyphens (-), with a length of 2-64 characters.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Replication group name. It supports only Chinese characters, letters, digits, underscores (_), and hyphens (-), with a length of 2-64 characters.
     * @param GroupName Replication group name. It supports only Chinese characters, letters, digits, underscores (_), and hyphens (-), with a length of 2-64 characters.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Remark information. 
     * @return Remark Remark information.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remark information.
     * @param Remark Remark information.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateReplicationGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReplicationGroupRequest(CreateReplicationGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

