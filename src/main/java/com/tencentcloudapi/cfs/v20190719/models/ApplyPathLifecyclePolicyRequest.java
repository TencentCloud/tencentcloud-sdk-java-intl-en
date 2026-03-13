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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyPathLifecyclePolicyRequest extends AbstractModel {

    /**
    * Lifecycle management policy ID.
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
    * List of absolute paths for directories associated with the lifecycle management policy.
    */
    @SerializedName("Paths")
    @Expose
    private PathInfo [] Paths;

    /**
     * Get Lifecycle management policy ID. 
     * @return LifecyclePolicyID Lifecycle management policy ID.
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set Lifecycle management policy ID.
     * @param LifecyclePolicyID Lifecycle management policy ID.
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    /**
     * Get List of absolute paths for directories associated with the lifecycle management policy. 
     * @return Paths List of absolute paths for directories associated with the lifecycle management policy.
     */
    public PathInfo [] getPaths() {
        return this.Paths;
    }

    /**
     * Set List of absolute paths for directories associated with the lifecycle management policy.
     * @param Paths List of absolute paths for directories associated with the lifecycle management policy.
     */
    public void setPaths(PathInfo [] Paths) {
        this.Paths = Paths;
    }

    public ApplyPathLifecyclePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyPathLifecyclePolicyRequest(ApplyPathLifecyclePolicyRequest source) {
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
        if (source.Paths != null) {
            this.Paths = new PathInfo[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new PathInfo(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

