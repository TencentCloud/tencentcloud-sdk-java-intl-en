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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCountryAreaMappingResponse extends AbstractModel{

    /**
    * Country/region code mapping table
    */
    @SerializedName("CountryAreaMappingList")
    @Expose
    private CountryAreaMap [] CountryAreaMappingList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Country/region code mapping table 
     * @return CountryAreaMappingList Country/region code mapping table
     */
    public CountryAreaMap [] getCountryAreaMappingList() {
        return this.CountryAreaMappingList;
    }

    /**
     * Set Country/region code mapping table
     * @param CountryAreaMappingList Country/region code mapping table
     */
    public void setCountryAreaMappingList(CountryAreaMap [] CountryAreaMappingList) {
        this.CountryAreaMappingList = CountryAreaMappingList;
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

    public DescribeCountryAreaMappingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCountryAreaMappingResponse(DescribeCountryAreaMappingResponse source) {
        if (source.CountryAreaMappingList != null) {
            this.CountryAreaMappingList = new CountryAreaMap[source.CountryAreaMappingList.length];
            for (int i = 0; i < source.CountryAreaMappingList.length; i++) {
                this.CountryAreaMappingList[i] = new CountryAreaMap(source.CountryAreaMappingList[i]);
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
        this.setParamArrayObj(map, prefix + "CountryAreaMappingList.", this.CountryAreaMappingList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

