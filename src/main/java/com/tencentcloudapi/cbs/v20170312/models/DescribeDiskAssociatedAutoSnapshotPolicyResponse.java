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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskAssociatedAutoSnapshotPolicyResponse extends AbstractModel {

    /**
    * The quantity of scheduled snapshots binded to cloud disk.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of scheduled snapshots bound to cloud disk.
    */
    @SerializedName("AutoSnapshotPolicySet")
    @Expose
    private AutoSnapshotPolicy [] AutoSnapshotPolicySet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The quantity of scheduled snapshots binded to cloud disk. 
     * @return TotalCount The quantity of scheduled snapshots binded to cloud disk.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The quantity of scheduled snapshots binded to cloud disk.
     * @param TotalCount The quantity of scheduled snapshots binded to cloud disk.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of scheduled snapshots bound to cloud disk. 
     * @return AutoSnapshotPolicySet List of scheduled snapshots bound to cloud disk.
     */
    public AutoSnapshotPolicy [] getAutoSnapshotPolicySet() {
        return this.AutoSnapshotPolicySet;
    }

    /**
     * Set List of scheduled snapshots bound to cloud disk.
     * @param AutoSnapshotPolicySet List of scheduled snapshots bound to cloud disk.
     */
    public void setAutoSnapshotPolicySet(AutoSnapshotPolicy [] AutoSnapshotPolicySet) {
        this.AutoSnapshotPolicySet = AutoSnapshotPolicySet;
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

    public DescribeDiskAssociatedAutoSnapshotPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskAssociatedAutoSnapshotPolicyResponse(DescribeDiskAssociatedAutoSnapshotPolicyResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AutoSnapshotPolicySet != null) {
            this.AutoSnapshotPolicySet = new AutoSnapshotPolicy[source.AutoSnapshotPolicySet.length];
            for (int i = 0; i < source.AutoSnapshotPolicySet.length; i++) {
                this.AutoSnapshotPolicySet[i] = new AutoSnapshotPolicy(source.AutoSnapshotPolicySet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AutoSnapshotPolicySet.", this.AutoSnapshotPolicySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

