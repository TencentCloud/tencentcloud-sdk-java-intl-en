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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShippersResponse extends AbstractModel {

    /**
    * Shipping rule list
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Shippers")
    @Expose
    private ShipperInfo [] Shippers;

    /**
    * Total number of results obtained in this query
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Shipping rule list
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Shippers Shipping rule list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ShipperInfo [] getShippers() {
        return this.Shippers;
    }

    /**
     * Set Shipping rule list
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Shippers Shipping rule list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setShippers(ShipperInfo [] Shippers) {
        this.Shippers = Shippers;
    }

    /**
     * Get Total number of results obtained in this query 
     * @return TotalCount Total number of results obtained in this query
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of results obtained in this query
     * @param TotalCount Total number of results obtained in this query
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeShippersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShippersResponse(DescribeShippersResponse source) {
        if (source.Shippers != null) {
            this.Shippers = new ShipperInfo[source.Shippers.length];
            for (int i = 0; i < source.Shippers.length; i++) {
                this.Shippers[i] = new ShipperInfo(source.Shippers[i]);
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
        this.setParamArrayObj(map, prefix + "Shippers.", this.Shippers);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

