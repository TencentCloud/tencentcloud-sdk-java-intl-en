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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopySnapshotCrossRegionsResponse extends AbstractModel {

    /**
    * Result of the cross-region replication task. The ID of the new snapshot replica is returned if the request succeeds. Otherwise `Error` is returned.
    */
    @SerializedName("SnapshotCopyResultSet")
    @Expose
    private SnapshotCopyResult [] SnapshotCopyResultSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Result of the cross-region replication task. The ID of the new snapshot replica is returned if the request succeeds. Otherwise `Error` is returned. 
     * @return SnapshotCopyResultSet Result of the cross-region replication task. The ID of the new snapshot replica is returned if the request succeeds. Otherwise `Error` is returned.
     */
    public SnapshotCopyResult [] getSnapshotCopyResultSet() {
        return this.SnapshotCopyResultSet;
    }

    /**
     * Set Result of the cross-region replication task. The ID of the new snapshot replica is returned if the request succeeds. Otherwise `Error` is returned.
     * @param SnapshotCopyResultSet Result of the cross-region replication task. The ID of the new snapshot replica is returned if the request succeeds. Otherwise `Error` is returned.
     */
    public void setSnapshotCopyResultSet(SnapshotCopyResult [] SnapshotCopyResultSet) {
        this.SnapshotCopyResultSet = SnapshotCopyResultSet;
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

    public CopySnapshotCrossRegionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopySnapshotCrossRegionsResponse(CopySnapshotCrossRegionsResponse source) {
        if (source.SnapshotCopyResultSet != null) {
            this.SnapshotCopyResultSet = new SnapshotCopyResult[source.SnapshotCopyResultSet.length];
            for (int i = 0; i < source.SnapshotCopyResultSet.length; i++) {
                this.SnapshotCopyResultSet[i] = new SnapshotCopyResult(source.SnapshotCopyResultSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SnapshotCopyResultSet.", this.SnapshotCopyResultSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

