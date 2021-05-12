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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoReplicationDelayRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Replication delay in seconds. Value range: 1 to 259200.
    */
    @SerializedName("ReplicationDelay")
    @Expose
    private Long ReplicationDelay;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Replication delay in seconds. Value range: 1 to 259200. 
     * @return ReplicationDelay Replication delay in seconds. Value range: 1 to 259200.
     */
    public Long getReplicationDelay() {
        return this.ReplicationDelay;
    }

    /**
     * Set Replication delay in seconds. Value range: 1 to 259200.
     * @param ReplicationDelay Replication delay in seconds. Value range: 1 to 259200.
     */
    public void setReplicationDelay(Long ReplicationDelay) {
        this.ReplicationDelay = ReplicationDelay;
    }

    public ModifyRoReplicationDelayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoReplicationDelayRequest(ModifyRoReplicationDelayRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReplicationDelay != null) {
            this.ReplicationDelay = new Long(source.ReplicationDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReplicationDelay", this.ReplicationDelay);

    }
}

