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

public class ReplicationObject extends AbstractModel {

    /**
    * Source instance type
    */
    @SerializedName("SrcInstanceType")
    @Expose
    private String SrcInstanceType;

    /**
    * Source cluster Id
    */
    @SerializedName("SrcClusterId")
    @Expose
    private String SrcClusterId;

    /**
    * Source instance ID
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * Copy task ID
    */
    @SerializedName("ReplicationJobId")
    @Expose
    private String ReplicationJobId;

    /**
    * Synchronization object details
    */
    @SerializedName("MigrateObjects")
    @Expose
    private MigrateOpt MigrateObjects;

    /**
     * Get Source instance type 
     * @return SrcInstanceType Source instance type
     */
    public String getSrcInstanceType() {
        return this.SrcInstanceType;
    }

    /**
     * Set Source instance type
     * @param SrcInstanceType Source instance type
     */
    public void setSrcInstanceType(String SrcInstanceType) {
        this.SrcInstanceType = SrcInstanceType;
    }

    /**
     * Get Source cluster Id 
     * @return SrcClusterId Source cluster Id
     */
    public String getSrcClusterId() {
        return this.SrcClusterId;
    }

    /**
     * Set Source cluster Id
     * @param SrcClusterId Source cluster Id
     */
    public void setSrcClusterId(String SrcClusterId) {
        this.SrcClusterId = SrcClusterId;
    }

    /**
     * Get Source instance ID 
     * @return SrcInstanceId Source instance ID
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance ID
     * @param SrcInstanceId Source instance ID
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get Copy task ID 
     * @return ReplicationJobId Copy task ID
     */
    public String getReplicationJobId() {
        return this.ReplicationJobId;
    }

    /**
     * Set Copy task ID
     * @param ReplicationJobId Copy task ID
     */
    public void setReplicationJobId(String ReplicationJobId) {
        this.ReplicationJobId = ReplicationJobId;
    }

    /**
     * Get Synchronization object details 
     * @return MigrateObjects Synchronization object details
     */
    public MigrateOpt getMigrateObjects() {
        return this.MigrateObjects;
    }

    /**
     * Set Synchronization object details
     * @param MigrateObjects Synchronization object details
     */
    public void setMigrateObjects(MigrateOpt MigrateObjects) {
        this.MigrateObjects = MigrateObjects;
    }

    public ReplicationObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationObject(ReplicationObject source) {
        if (source.SrcInstanceType != null) {
            this.SrcInstanceType = new String(source.SrcInstanceType);
        }
        if (source.SrcClusterId != null) {
            this.SrcClusterId = new String(source.SrcClusterId);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.ReplicationJobId != null) {
            this.ReplicationJobId = new String(source.ReplicationJobId);
        }
        if (source.MigrateObjects != null) {
            this.MigrateObjects = new MigrateOpt(source.MigrateObjects);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceType", this.SrcInstanceType);
        this.setParamSimple(map, prefix + "SrcClusterId", this.SrcClusterId);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "ReplicationJobId", this.ReplicationJobId);
        this.setParamObj(map, prefix + "MigrateObjects.", this.MigrateObjects);

    }
}

