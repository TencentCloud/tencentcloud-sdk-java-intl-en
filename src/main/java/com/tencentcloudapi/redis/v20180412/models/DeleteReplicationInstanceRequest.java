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

public class DeleteReplicationInstanceRequest extends AbstractModel {

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
    * Data synchronization type. Valid values: true (Strong synchronization is required.) and false (Strong synchronization is not required. This value applies only to primary instance deletion.)
    */
    @SerializedName("SyncType")
    @Expose
    private Boolean SyncType;

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
     * Get Data synchronization type. Valid values: true (Strong synchronization is required.) and false (Strong synchronization is not required. This value applies only to primary instance deletion.) 
     * @return SyncType Data synchronization type. Valid values: true (Strong synchronization is required.) and false (Strong synchronization is not required. This value applies only to primary instance deletion.)
     */
    public Boolean getSyncType() {
        return this.SyncType;
    }

    /**
     * Set Data synchronization type. Valid values: true (Strong synchronization is required.) and false (Strong synchronization is not required. This value applies only to primary instance deletion.)
     * @param SyncType Data synchronization type. Valid values: true (Strong synchronization is required.) and false (Strong synchronization is not required. This value applies only to primary instance deletion.)
     */
    public void setSyncType(Boolean SyncType) {
        this.SyncType = SyncType;
    }

    public DeleteReplicationInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteReplicationInstanceRequest(DeleteReplicationInstanceRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SyncType != null) {
            this.SyncType = new Boolean(source.SyncType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);

    }
}

