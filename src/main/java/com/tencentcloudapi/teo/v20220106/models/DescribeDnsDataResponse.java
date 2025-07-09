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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnsDataResponse extends AbstractModel {

    /**
    * DNS request data
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private DataItem [] Data;

    /**
    * Interval
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DNS request data
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Data DNS request data
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DataItem [] getData() {
        return this.Data;
    }

    /**
     * Set DNS request data
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Data DNS request data
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setData(DataItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get Interval
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Interval Interval
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Interval
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Interval Interval
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
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

    public DescribeDnsDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnsDataResponse(DescribeDnsDataResponse source) {
        if (source.Data != null) {
            this.Data = new DataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DataItem(source.Data[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

