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

public class DescribeReplicationInstanceSyncStatusResponse extends AbstractModel {

    /**
    * Synchronization status
    */
    @SerializedName("ReplicationStatus")
    @Expose
    private String ReplicationStatus;

    /**
    * Synchronization completion time
    */
    @SerializedName("ReplicationTime")
    @Expose
    private String ReplicationTime;

    /**
    * Synchronization log
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplicationLog")
    @Expose
    private ReplicationLog ReplicationLog;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Synchronization status 
     * @return ReplicationStatus Synchronization status
     */
    public String getReplicationStatus() {
        return this.ReplicationStatus;
    }

    /**
     * Set Synchronization status
     * @param ReplicationStatus Synchronization status
     */
    public void setReplicationStatus(String ReplicationStatus) {
        this.ReplicationStatus = ReplicationStatus;
    }

    /**
     * Get Synchronization completion time 
     * @return ReplicationTime Synchronization completion time
     */
    public String getReplicationTime() {
        return this.ReplicationTime;
    }

    /**
     * Set Synchronization completion time
     * @param ReplicationTime Synchronization completion time
     */
    public void setReplicationTime(String ReplicationTime) {
        this.ReplicationTime = ReplicationTime;
    }

    /**
     * Get Synchronization log
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ReplicationLog Synchronization log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ReplicationLog getReplicationLog() {
        return this.ReplicationLog;
    }

    /**
     * Set Synchronization log
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ReplicationLog Synchronization log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReplicationLog(ReplicationLog ReplicationLog) {
        this.ReplicationLog = ReplicationLog;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeReplicationInstanceSyncStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationInstanceSyncStatusResponse(DescribeReplicationInstanceSyncStatusResponse source) {
        if (source.ReplicationStatus != null) {
            this.ReplicationStatus = new String(source.ReplicationStatus);
        }
        if (source.ReplicationTime != null) {
            this.ReplicationTime = new String(source.ReplicationTime);
        }
        if (source.ReplicationLog != null) {
            this.ReplicationLog = new ReplicationLog(source.ReplicationLog);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationStatus", this.ReplicationStatus);
        this.setParamSimple(map, prefix + "ReplicationTime", this.ReplicationTime);
        this.setParamObj(map, prefix + "ReplicationLog.", this.ReplicationLog);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

