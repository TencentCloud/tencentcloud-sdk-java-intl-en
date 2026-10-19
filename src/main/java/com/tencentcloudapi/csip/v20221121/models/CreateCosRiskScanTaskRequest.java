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

public class CreateCosRiskScanTaskRequest extends AbstractModel {

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Bucket list to scan
    */
    @SerializedName("BucketNameSet")
    @Expose
    private CosBucketInfo [] BucketNameSet;

    /**
    * Whether to scan all buckets
    */
    @SerializedName("IsScanAllBucket")
    @Expose
    private Boolean IsScanAllBucket;

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Bucket list to scan 
     * @return BucketNameSet Bucket list to scan
     */
    public CosBucketInfo [] getBucketNameSet() {
        return this.BucketNameSet;
    }

    /**
     * Set Bucket list to scan
     * @param BucketNameSet Bucket list to scan
     */
    public void setBucketNameSet(CosBucketInfo [] BucketNameSet) {
        this.BucketNameSet = BucketNameSet;
    }

    /**
     * Get Whether to scan all buckets 
     * @return IsScanAllBucket Whether to scan all buckets
     */
    public Boolean getIsScanAllBucket() {
        return this.IsScanAllBucket;
    }

    /**
     * Set Whether to scan all buckets
     * @param IsScanAllBucket Whether to scan all buckets
     */
    public void setIsScanAllBucket(Boolean IsScanAllBucket) {
        this.IsScanAllBucket = IsScanAllBucket;
    }

    public CreateCosRiskScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosRiskScanTaskRequest(CreateCosRiskScanTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.BucketNameSet != null) {
            this.BucketNameSet = new CosBucketInfo[source.BucketNameSet.length];
            for (int i = 0; i < source.BucketNameSet.length; i++) {
                this.BucketNameSet[i] = new CosBucketInfo(source.BucketNameSet[i]);
            }
        }
        if (source.IsScanAllBucket != null) {
            this.IsScanAllBucket = new Boolean(source.IsScanAllBucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "BucketNameSet.", this.BucketNameSet);
        this.setParamSimple(map, prefix + "IsScanAllBucket", this.IsScanAllBucket);

    }
}

