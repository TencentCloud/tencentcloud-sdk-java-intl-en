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

public class AddReplicationInstanceRequest extends AbstractModel {

    /**
    * Replication group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Assigns roles to instances added to the replication group. <ul><li>rw: read-write;</li> <li>r: read-only.</li></ul>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
     * Get Replication group ID. 
     * @return GroupId Replication group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Replication group ID.
     * @param GroupId Replication group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Assigns roles to instances added to the replication group. <ul><li>rw: read-write;</li> <li>r: read-only.</li></ul> 
     * @return InstanceRole Assigns roles to instances added to the replication group. <ul><li>rw: read-write;</li> <li>r: read-only.</li></ul>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Assigns roles to instances added to the replication group. <ul><li>rw: read-write;</li> <li>r: read-only.</li></ul>
     * @param InstanceRole Assigns roles to instances added to the replication group. <ul><li>rw: read-write;</li> <li>r: read-only.</li></ul>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    public AddReplicationInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddReplicationInstanceRequest(AddReplicationInstanceRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);

    }
}

