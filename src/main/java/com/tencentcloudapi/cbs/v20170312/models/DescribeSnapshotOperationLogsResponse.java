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

public class DescribeSnapshotOperationLogsResponse extends AbstractModel {

    /**
    * List of snapshot operation logs.
    */
    @SerializedName("SnapshotOperationLogSet")
    @Expose
    private SnapshotOperationLog [] SnapshotOperationLogSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of snapshot operation logs. 
     * @return SnapshotOperationLogSet List of snapshot operation logs.
     */
    public SnapshotOperationLog [] getSnapshotOperationLogSet() {
        return this.SnapshotOperationLogSet;
    }

    /**
     * Set List of snapshot operation logs.
     * @param SnapshotOperationLogSet List of snapshot operation logs.
     */
    public void setSnapshotOperationLogSet(SnapshotOperationLog [] SnapshotOperationLogSet) {
        this.SnapshotOperationLogSet = SnapshotOperationLogSet;
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
        if (source.SnapshotOperationLogSet != null) {
            this.SnapshotOperationLogSet = new SnapshotOperationLog[source.SnapshotOperationLogSet.length];
            for (int i = 0; i < source.SnapshotOperationLogSet.length; i++) {
                this.SnapshotOperationLogSet[i] = new SnapshotOperationLog(source.SnapshotOperationLogSet[i]);
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
        this.setParamArrayObj(map, prefix + "SnapshotOperationLogSet.", this.SnapshotOperationLogSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

