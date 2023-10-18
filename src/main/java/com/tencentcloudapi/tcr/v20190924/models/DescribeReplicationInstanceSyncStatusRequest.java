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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationInstanceSyncStatusRequest extends AbstractModel {

    /**
    * Master instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Replication instance ID
    */
    @SerializedName("ReplicationRegistryId")
    @Expose
    private String ReplicationRegistryId;

    /**
    * Region ID of the replication instance
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
    * Whether to show the synchronization log
    */
    @SerializedName("ShowReplicationLog")
    @Expose
    private Boolean ShowReplicationLog;

    /**
    * Page offset for log display. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of output entries. Default value: 5, maximum value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Master instance ID 
     * @return RegistryId Master instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Master instance ID
     * @param RegistryId Master instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Replication instance ID 
     * @return ReplicationRegistryId Replication instance ID
     */
    public String getReplicationRegistryId() {
        return this.ReplicationRegistryId;
    }

    /**
     * Set Replication instance ID
     * @param ReplicationRegistryId Replication instance ID
     */
    public void setReplicationRegistryId(String ReplicationRegistryId) {
        this.ReplicationRegistryId = ReplicationRegistryId;
    }

    /**
     * Get Region ID of the replication instance 
     * @return ReplicationRegionId Region ID of the replication instance
     */
    public Long getReplicationRegionId() {
        return this.ReplicationRegionId;
    }

    /**
     * Set Region ID of the replication instance
     * @param ReplicationRegionId Region ID of the replication instance
     */
    public void setReplicationRegionId(Long ReplicationRegionId) {
        this.ReplicationRegionId = ReplicationRegionId;
    }

    /**
     * Get Whether to show the synchronization log 
     * @return ShowReplicationLog Whether to show the synchronization log
     */
    public Boolean getShowReplicationLog() {
        return this.ShowReplicationLog;
    }

    /**
     * Set Whether to show the synchronization log
     * @param ShowReplicationLog Whether to show the synchronization log
     */
    public void setShowReplicationLog(Boolean ShowReplicationLog) {
        this.ShowReplicationLog = ShowReplicationLog;
    }

    /**
     * Get Page offset for log display. Default value: 0 
     * @return Offset Page offset for log display. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset for log display. Default value: 0
     * @param Offset Page offset for log display. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of output entries. Default value: 5, maximum value: 20. 
     * @return Limit Maximum number of output entries. Default value: 5, maximum value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of output entries. Default value: 5, maximum value: 20.
     * @param Limit Maximum number of output entries. Default value: 5, maximum value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeReplicationInstanceSyncStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationInstanceSyncStatusRequest(DescribeReplicationInstanceSyncStatusRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.ReplicationRegistryId != null) {
            this.ReplicationRegistryId = new String(source.ReplicationRegistryId);
        }
        if (source.ReplicationRegionId != null) {
            this.ReplicationRegionId = new Long(source.ReplicationRegionId);
        }
        if (source.ShowReplicationLog != null) {
            this.ShowReplicationLog = new Boolean(source.ShowReplicationLog);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegistryId", this.ReplicationRegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);
        this.setParamSimple(map, prefix + "ShowReplicationLog", this.ShowReplicationLog);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

