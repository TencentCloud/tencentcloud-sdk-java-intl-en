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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingDataResponse extends AbstractModel{

    /**
    * Data of the sampling point
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private DnsData [] Data;

    /**
    * Time granularity of sampling
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Data of the sampling point
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Data of the sampling point
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DnsData [] getData() {
        return this.Data;
    }

    /**
     * Set Data of the sampling point
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Data of the sampling point
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(DnsData [] Data) {
        this.Data = Data;
    }

    /**
     * Get Time granularity of sampling
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Interval Time granularity of sampling
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of sampling
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Interval Time granularity of sampling
Note: This field may return null, indicating that no valid values can be obtained.
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

    public DescribeBillingDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingDataResponse(DescribeBillingDataResponse source) {
        if (source.Data != null) {
            this.Data = new DnsData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DnsData(source.Data[i]);
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

