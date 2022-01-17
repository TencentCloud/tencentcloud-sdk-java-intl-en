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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRequestStatusResponse extends AbstractModel{

    /**
    * Total running functions
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Details of the function running status
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private RequestStatus [] Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total running functions
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TotalCount Total running functions
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total running functions
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TotalCount Total running functions
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Details of the function running status
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Data Details of the function running status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public RequestStatus [] getData() {
        return this.Data;
    }

    /**
     * Set Details of the function running status
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Data Details of the function running status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setData(RequestStatus [] Data) {
        this.Data = Data;
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

    public GetRequestStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRequestStatusResponse(GetRequestStatusResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new RequestStatus[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new RequestStatus(source.Data[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

