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

public class DescribeBoardSDKLogResponse extends AbstractModel{

    /**
    * Number of logs queried.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Log details.
    */
    @SerializedName("Sources")
    @Expose
    private String [] Sources;

    /**
    * Number of logs queried within each time range after aggregation based on the time range.
    */
    @SerializedName("Buckets")
    @Expose
    private String [] Buckets;

    /**
    * Context key used for recursive extraction. This parameter can be used in the next request.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of logs queried. 
     * @return Total Number of logs queried.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of logs queried.
     * @param Total Number of logs queried.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Log details. 
     * @return Sources Log details.
     */
    public String [] getSources() {
        return this.Sources;
    }

    /**
     * Set Log details.
     * @param Sources Log details.
     */
    public void setSources(String [] Sources) {
        this.Sources = Sources;
    }

    /**
     * Get Number of logs queried within each time range after aggregation based on the time range. 
     * @return Buckets Number of logs queried within each time range after aggregation based on the time range.
     */
    public String [] getBuckets() {
        return this.Buckets;
    }

    /**
     * Set Number of logs queried within each time range after aggregation based on the time range.
     * @param Buckets Number of logs queried within each time range after aggregation based on the time range.
     */
    public void setBuckets(String [] Buckets) {
        this.Buckets = Buckets;
    }

    /**
     * Get Context key used for recursive extraction. This parameter can be used in the next request. 
     * @return Context Context key used for recursive extraction. This parameter can be used in the next request.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context key used for recursive extraction. This parameter can be used in the next request.
     * @param Context Context key used for recursive extraction. This parameter can be used in the next request.
     */
    public void setContext(String Context) {
        this.Context = Context;
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

    public DescribeBoardSDKLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBoardSDKLogResponse(DescribeBoardSDKLogResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Sources != null) {
            this.Sources = new String[source.Sources.length];
            for (int i = 0; i < source.Sources.length; i++) {
                this.Sources[i] = new String(source.Sources[i]);
            }
        }
        if (source.Buckets != null) {
            this.Buckets = new String[source.Buckets.length];
            for (int i = 0; i < source.Buckets.length; i++) {
                this.Buckets[i] = new String(source.Buckets[i]);
            }
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArraySimple(map, prefix + "Sources.", this.Sources);
        this.setParamArraySimple(map, prefix + "Buckets.", this.Buckets);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

