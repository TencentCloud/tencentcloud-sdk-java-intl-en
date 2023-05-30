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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordSearchResponse extends AbstractModel{

    /**
    * The set of queried recording tasks.
    */
    @SerializedName("RecordTaskSet")
    @Expose
    private RecordTaskSearchResult [] RecordTaskSet;

    /**
    * Number of recording tasks.
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
     * Get The set of queried recording tasks. 
     * @return RecordTaskSet The set of queried recording tasks.
     */
    public RecordTaskSearchResult [] getRecordTaskSet() {
        return this.RecordTaskSet;
    }

    /**
     * Set The set of queried recording tasks.
     * @param RecordTaskSet The set of queried recording tasks.
     */
    public void setRecordTaskSet(RecordTaskSearchResult [] RecordTaskSet) {
        this.RecordTaskSet = RecordTaskSet;
    }

    /**
     * Get Number of recording tasks. 
     * @return TotalCount Number of recording tasks.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of recording tasks.
     * @param TotalCount Number of recording tasks.
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

    public DescribeRecordSearchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordSearchResponse(DescribeRecordSearchResponse source) {
        if (source.RecordTaskSet != null) {
            this.RecordTaskSet = new RecordTaskSearchResult[source.RecordTaskSet.length];
            for (int i = 0; i < source.RecordTaskSet.length; i++) {
                this.RecordTaskSet[i] = new RecordTaskSearchResult(source.RecordTaskSet[i]);
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
        this.setParamArrayObj(map, prefix + "RecordTaskSet.", this.RecordTaskSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

