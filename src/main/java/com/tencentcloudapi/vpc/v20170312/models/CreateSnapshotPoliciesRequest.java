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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotPoliciesRequest extends AbstractModel {

    /**
    * Details of a snapshot policy
    */
    @SerializedName("SnapshotPolicies")
    @Expose
    private SnapshotPolicy [] SnapshotPolicies;

    /**
     * Get Details of a snapshot policy 
     * @return SnapshotPolicies Details of a snapshot policy
     */
    public SnapshotPolicy [] getSnapshotPolicies() {
        return this.SnapshotPolicies;
    }

    /**
     * Set Details of a snapshot policy
     * @param SnapshotPolicies Details of a snapshot policy
     */
    public void setSnapshotPolicies(SnapshotPolicy [] SnapshotPolicies) {
        this.SnapshotPolicies = SnapshotPolicies;
    }

    public CreateSnapshotPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotPoliciesRequest(CreateSnapshotPoliciesRequest source) {
        if (source.SnapshotPolicies != null) {
            this.SnapshotPolicies = new SnapshotPolicy[source.SnapshotPolicies.length];
            for (int i = 0; i < source.SnapshotPolicies.length; i++) {
                this.SnapshotPolicies[i] = new SnapshotPolicy(source.SnapshotPolicies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SnapshotPolicies.", this.SnapshotPolicies);

    }
}

