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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMonthPeakNetworkResponse extends AbstractModel {

    /**
    * None
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MonthNetWorkData")
    @Expose
    private MonthNetwork [] MonthNetWorkData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get None
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MonthNetWorkData None
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MonthNetwork [] getMonthNetWorkData() {
        return this.MonthNetWorkData;
    }

    /**
     * Set None
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MonthNetWorkData None
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMonthNetWorkData(MonthNetwork [] MonthNetWorkData) {
        this.MonthNetWorkData = MonthNetWorkData;
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

    public DescribeMonthPeakNetworkResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonthPeakNetworkResponse(DescribeMonthPeakNetworkResponse source) {
        if (source.MonthNetWorkData != null) {
            this.MonthNetWorkData = new MonthNetwork[source.MonthNetWorkData.length];
            for (int i = 0; i < source.MonthNetWorkData.length; i++) {
                this.MonthNetWorkData[i] = new MonthNetwork(source.MonthNetWorkData[i]);
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
        this.setParamArrayObj(map, prefix + "MonthNetWorkData.", this.MonthNetWorkData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

