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

public class DescribeAutoSnapshotPoliciesResponse extends AbstractModel {

    /**
    * The quantity of valid scheduled snapshot policies.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of scheduled snapshot policies.
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
     * Get The quantity of valid scheduled snapshot policies. 
     * @return TotalCount The quantity of valid scheduled snapshot policies.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The quantity of valid scheduled snapshot policies.
     * @param TotalCount The quantity of valid scheduled snapshot policies.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of scheduled snapshot policies. 
     * @return AutoSnapshotPolicySet List of scheduled snapshot policies.
     */
    public AutoSnapshotPolicy [] getAutoSnapshotPolicySet() {
        return this.AutoSnapshotPolicySet;
    }

    /**
     * Set List of scheduled snapshot policies.
     * @param AutoSnapshotPolicySet List of scheduled snapshot policies.
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

    public DescribeAutoSnapshotPoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoSnapshotPoliciesResponse(DescribeAutoSnapshotPoliciesResponse source) {
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

