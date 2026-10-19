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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosRiskScanTaskRequest extends AbstractModel {

    /**
    * Bucket details to view
    */
    @SerializedName("BucketInfoSet")
    @Expose
    private CosBucketInfo [] BucketInfoSet;

    /**
     * Get Bucket details to view 
     * @return BucketInfoSet Bucket details to view
     */
    public CosBucketInfo [] getBucketInfoSet() {
        return this.BucketInfoSet;
    }

    /**
     * Set Bucket details to view
     * @param BucketInfoSet Bucket details to view
     */
    public void setBucketInfoSet(CosBucketInfo [] BucketInfoSet) {
        this.BucketInfoSet = BucketInfoSet;
    }

    public DescribeCosRiskScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosRiskScanTaskRequest(DescribeCosRiskScanTaskRequest source) {
        if (source.BucketInfoSet != null) {
            this.BucketInfoSet = new CosBucketInfo[source.BucketInfoSet.length];
            for (int i = 0; i < source.BucketInfoSet.length; i++) {
                this.BucketInfoSet[i] = new CosBucketInfo(source.BucketInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BucketInfoSet.", this.BucketInfoSet);

    }
}

