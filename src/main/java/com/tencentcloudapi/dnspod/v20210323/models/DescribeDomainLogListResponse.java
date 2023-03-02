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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainLogListResponse extends AbstractModel{

    /**
    * Domain information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogList")
    @Expose
    private String [] LogList;

    /**
    * Number of results per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of logs
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
     * Get Domain information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogList Domain information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getLogList() {
        return this.LogList;
    }

    /**
     * Set Domain information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogList Domain information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogList(String [] LogList) {
        this.LogList = LogList;
    }

    /**
     * Get Number of results per page 
     * @return PageSize Number of results per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of results per page
     * @param PageSize Number of results per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of logs 
     * @return TotalCount Total number of logs
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of logs
     * @param TotalCount Total number of logs
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

    public DescribeDomainLogListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainLogListResponse(DescribeDomainLogListResponse source) {
        if (source.LogList != null) {
            this.LogList = new String[source.LogList.length];
            for (int i = 0; i < source.LogList.length; i++) {
                this.LogList[i] = new String(source.LogList[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamArraySimple(map, prefix + "LogList.", this.LogList);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

