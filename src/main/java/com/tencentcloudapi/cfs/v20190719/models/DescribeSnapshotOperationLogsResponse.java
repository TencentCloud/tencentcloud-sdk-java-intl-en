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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotOperationLogsResponse extends AbstractModel{

    /**
    * Snapshot ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Operation log
    */
    @SerializedName("SnapshotOperates")
    @Expose
    private SnapshotOperateLog [] SnapshotOperates;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Snapshot ID 
     * @return SnapshotId Snapshot ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID
     * @param SnapshotId Snapshot ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Operation log 
     * @return SnapshotOperates Operation log
     */
    public SnapshotOperateLog [] getSnapshotOperates() {
        return this.SnapshotOperates;
    }

    /**
     * Set Operation log
     * @param SnapshotOperates Operation log
     */
    public void setSnapshotOperates(SnapshotOperateLog [] SnapshotOperates) {
        this.SnapshotOperates = SnapshotOperates;
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

    public DescribeSnapshotOperationLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotOperationLogsResponse(DescribeSnapshotOperationLogsResponse source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotOperates != null) {
            this.SnapshotOperates = new SnapshotOperateLog[source.SnapshotOperates.length];
            for (int i = 0; i < source.SnapshotOperates.length; i++) {
                this.SnapshotOperates[i] = new SnapshotOperateLog(source.SnapshotOperates[i]);
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
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamArrayObj(map, prefix + "SnapshotOperates.", this.SnapshotOperates);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

