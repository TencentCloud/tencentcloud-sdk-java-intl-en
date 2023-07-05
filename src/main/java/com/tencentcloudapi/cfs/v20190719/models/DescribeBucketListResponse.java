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

public class DescribeBucketListResponse extends AbstractModel{

    /**
    * Number of buckets
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Bucket list
    */
    @SerializedName("BucketList")
    @Expose
    private BucketInfo [] BucketList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of buckets 
     * @return TotalCount Number of buckets
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of buckets
     * @param TotalCount Number of buckets
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Bucket list 
     * @return BucketList Bucket list
     */
    public BucketInfo [] getBucketList() {
        return this.BucketList;
    }

    /**
     * Set Bucket list
     * @param BucketList Bucket list
     */
    public void setBucketList(BucketInfo [] BucketList) {
        this.BucketList = BucketList;
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

    public DescribeBucketListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBucketListResponse(DescribeBucketListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BucketList != null) {
            this.BucketList = new BucketInfo[source.BucketList.length];
            for (int i = 0; i < source.BucketList.length; i++) {
                this.BucketList[i] = new BucketInfo(source.BucketList[i]);
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
        this.setParamArrayObj(map, prefix + "BucketList.", this.BucketList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

