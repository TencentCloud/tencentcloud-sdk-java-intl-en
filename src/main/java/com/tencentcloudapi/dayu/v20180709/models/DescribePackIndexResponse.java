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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePackIndexResponse extends AbstractModel {

    /**
    * Field value as follows:
TotalPackCount: number of resources
AttackPackCount: number of resources being cleansed
BlockPackCount: number of blocked resources
ExpiredPackCount: number of expired resources
ExpireingPackCount: number of expiring resources
IsolatePackCount: number of isolated resources
    */
    @SerializedName("Data")
    @Expose
    private KeyValue [] Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Field value as follows:
TotalPackCount: number of resources
AttackPackCount: number of resources being cleansed
BlockPackCount: number of blocked resources
ExpiredPackCount: number of expired resources
ExpireingPackCount: number of expiring resources
IsolatePackCount: number of isolated resources 
     * @return Data Field value as follows:
TotalPackCount: number of resources
AttackPackCount: number of resources being cleansed
BlockPackCount: number of blocked resources
ExpiredPackCount: number of expired resources
ExpireingPackCount: number of expiring resources
IsolatePackCount: number of isolated resources
     */
    public KeyValue [] getData() {
        return this.Data;
    }

    /**
     * Set Field value as follows:
TotalPackCount: number of resources
AttackPackCount: number of resources being cleansed
BlockPackCount: number of blocked resources
ExpiredPackCount: number of expired resources
ExpireingPackCount: number of expiring resources
IsolatePackCount: number of isolated resources
     * @param Data Field value as follows:
TotalPackCount: number of resources
AttackPackCount: number of resources being cleansed
BlockPackCount: number of blocked resources
ExpiredPackCount: number of expired resources
ExpireingPackCount: number of expiring resources
IsolatePackCount: number of isolated resources
     */
    public void setData(KeyValue [] Data) {
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

    public DescribePackIndexResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePackIndexResponse(DescribePackIndexResponse source) {
        if (source.Data != null) {
            this.Data = new KeyValue[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new KeyValue(source.Data[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

