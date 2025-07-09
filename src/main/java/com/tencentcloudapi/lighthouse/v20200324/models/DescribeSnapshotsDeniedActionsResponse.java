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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotsDeniedActionsResponse extends AbstractModel {

    /**
    * List of snapshot operation limit details.
    */
    @SerializedName("SnapshotDeniedActionSet")
    @Expose
    private SnapshotDeniedActions [] SnapshotDeniedActionSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of snapshot operation limit details. 
     * @return SnapshotDeniedActionSet List of snapshot operation limit details.
     */
    public SnapshotDeniedActions [] getSnapshotDeniedActionSet() {
        return this.SnapshotDeniedActionSet;
    }

    /**
     * Set List of snapshot operation limit details.
     * @param SnapshotDeniedActionSet List of snapshot operation limit details.
     */
    public void setSnapshotDeniedActionSet(SnapshotDeniedActions [] SnapshotDeniedActionSet) {
        this.SnapshotDeniedActionSet = SnapshotDeniedActionSet;
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

    public DescribeSnapshotsDeniedActionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotsDeniedActionsResponse(DescribeSnapshotsDeniedActionsResponse source) {
        if (source.SnapshotDeniedActionSet != null) {
            this.SnapshotDeniedActionSet = new SnapshotDeniedActions[source.SnapshotDeniedActionSet.length];
            for (int i = 0; i < source.SnapshotDeniedActionSet.length; i++) {
                this.SnapshotDeniedActionSet[i] = new SnapshotDeniedActions(source.SnapshotDeniedActionSet[i]);
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
        this.setParamArrayObj(map, prefix + "SnapshotDeniedActionSet.", this.SnapshotDeniedActionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

