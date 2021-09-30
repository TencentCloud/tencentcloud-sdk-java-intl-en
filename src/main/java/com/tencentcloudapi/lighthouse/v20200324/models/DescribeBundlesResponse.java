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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBundlesResponse extends AbstractModel{

    /**
    * List of package details.
    */
    @SerializedName("BundleSet")
    @Expose
    private Bundle [] BundleSet;

    /**
    * Total number of eligible packages, which is used for pagination.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of package details. 
     * @return BundleSet List of package details.
     */
    public Bundle [] getBundleSet() {
        return this.BundleSet;
    }

    /**
     * Set List of package details.
     * @param BundleSet List of package details.
     */
    public void setBundleSet(Bundle [] BundleSet) {
        this.BundleSet = BundleSet;
    }

    /**
     * Get Total number of eligible packages, which is used for pagination. 
     * @return TotalCount Total number of eligible packages, which is used for pagination.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of eligible packages, which is used for pagination.
     * @param TotalCount Total number of eligible packages, which is used for pagination.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeBundlesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBundlesResponse(DescribeBundlesResponse source) {
        if (source.BundleSet != null) {
            this.BundleSet = new Bundle[source.BundleSet.length];
            for (int i = 0; i < source.BundleSet.length; i++) {
                this.BundleSet[i] = new Bundle(source.BundleSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BundleSet.", this.BundleSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

