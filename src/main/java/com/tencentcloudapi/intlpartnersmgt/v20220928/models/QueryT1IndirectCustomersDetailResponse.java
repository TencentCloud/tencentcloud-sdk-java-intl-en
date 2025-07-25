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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryT1IndirectCustomersDetailResponse extends AbstractModel {

    /**
    * The number of indirect sub-customers of a distributor.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Second-level reseller UIN.
    */
    @SerializedName("SubAgentUin")
    @Expose
    private Long SubAgentUin;

    /**
    * Second-Level reseller name.
    */
    @SerializedName("SubAgentName")
    @Expose
    private String SubAgentName;

    /**
    * Indirect sub-customer information.
    */
    @SerializedName("Data")
    @Expose
    private QueryT1IndirectCustomersDetailResponseData [] Data;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of indirect sub-customers of a distributor. 
     * @return Total The number of indirect sub-customers of a distributor.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The number of indirect sub-customers of a distributor.
     * @param Total The number of indirect sub-customers of a distributor.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Second-level reseller UIN. 
     * @return SubAgentUin Second-level reseller UIN.
     */
    public Long getSubAgentUin() {
        return this.SubAgentUin;
    }

    /**
     * Set Second-level reseller UIN.
     * @param SubAgentUin Second-level reseller UIN.
     */
    public void setSubAgentUin(Long SubAgentUin) {
        this.SubAgentUin = SubAgentUin;
    }

    /**
     * Get Second-Level reseller name. 
     * @return SubAgentName Second-Level reseller name.
     */
    public String getSubAgentName() {
        return this.SubAgentName;
    }

    /**
     * Set Second-Level reseller name.
     * @param SubAgentName Second-Level reseller name.
     */
    public void setSubAgentName(String SubAgentName) {
        this.SubAgentName = SubAgentName;
    }

    /**
     * Get Indirect sub-customer information. 
     * @return Data Indirect sub-customer information.
     */
    public QueryT1IndirectCustomersDetailResponseData [] getData() {
        return this.Data;
    }

    /**
     * Set Indirect sub-customer information.
     * @param Data Indirect sub-customer information.
     */
    public void setData(QueryT1IndirectCustomersDetailResponseData [] Data) {
        this.Data = Data;
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

    public QueryT1IndirectCustomersDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryT1IndirectCustomersDetailResponse(QueryT1IndirectCustomersDetailResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SubAgentUin != null) {
            this.SubAgentUin = new Long(source.SubAgentUin);
        }
        if (source.SubAgentName != null) {
            this.SubAgentName = new String(source.SubAgentName);
        }
        if (source.Data != null) {
            this.Data = new QueryT1IndirectCustomersDetailResponseData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new QueryT1IndirectCustomersDetailResponseData(source.Data[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SubAgentUin", this.SubAgentUin);
        this.setParamSimple(map, prefix + "SubAgentName", this.SubAgentName);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

