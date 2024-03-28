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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProtectedTelCdrResponse extends AbstractModel {

    /**
    * Total number of call records.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Call record.
    */
    @SerializedName("TelCdrs")
    @Expose
    private TelCdrInfo [] TelCdrs;

    /**
    * Call record.
    */
    @SerializedName("TelCdrList")
    @Expose
    private TelCdrInfo [] TelCdrList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of call records. 
     * @return TotalCount Total number of call records.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of call records.
     * @param TotalCount Total number of call records.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Call record. 
     * @return TelCdrs Call record.
     * @deprecated
     */
    @Deprecated
    public TelCdrInfo [] getTelCdrs() {
        return this.TelCdrs;
    }

    /**
     * Set Call record.
     * @param TelCdrs Call record.
     * @deprecated
     */
    @Deprecated
    public void setTelCdrs(TelCdrInfo [] TelCdrs) {
        this.TelCdrs = TelCdrs;
    }

    /**
     * Get Call record. 
     * @return TelCdrList Call record.
     */
    public TelCdrInfo [] getTelCdrList() {
        return this.TelCdrList;
    }

    /**
     * Set Call record.
     * @param TelCdrList Call record.
     */
    public void setTelCdrList(TelCdrInfo [] TelCdrList) {
        this.TelCdrList = TelCdrList;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeProtectedTelCdrResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProtectedTelCdrResponse(DescribeProtectedTelCdrResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TelCdrs != null) {
            this.TelCdrs = new TelCdrInfo[source.TelCdrs.length];
            for (int i = 0; i < source.TelCdrs.length; i++) {
                this.TelCdrs[i] = new TelCdrInfo(source.TelCdrs[i]);
            }
        }
        if (source.TelCdrList != null) {
            this.TelCdrList = new TelCdrInfo[source.TelCdrList.length];
            for (int i = 0; i < source.TelCdrList.length; i++) {
                this.TelCdrList[i] = new TelCdrInfo(source.TelCdrList[i]);
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
        this.setParamArrayObj(map, prefix + "TelCdrs.", this.TelCdrs);
        this.setParamArrayObj(map, prefix + "TelCdrList.", this.TelCdrList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

