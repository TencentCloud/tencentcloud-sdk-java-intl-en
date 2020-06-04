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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSAttackIPRegionMapResponse extends AbstractModel{

    /**
    * Global region distribution data
    */
    @SerializedName("NationCount")
    @Expose
    private KeyValueRecord [] NationCount;

    /**
    * Chinese province distribution data
    */
    @SerializedName("ProvinceCount")
    @Expose
    private KeyValueRecord [] ProvinceCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Global region distribution data 
     * @return NationCount Global region distribution data
     */
    public KeyValueRecord [] getNationCount() {
        return this.NationCount;
    }

    /**
     * Set Global region distribution data
     * @param NationCount Global region distribution data
     */
    public void setNationCount(KeyValueRecord [] NationCount) {
        this.NationCount = NationCount;
    }

    /**
     * Get Chinese province distribution data 
     * @return ProvinceCount Chinese province distribution data
     */
    public KeyValueRecord [] getProvinceCount() {
        return this.ProvinceCount;
    }

    /**
     * Set Chinese province distribution data
     * @param ProvinceCount Chinese province distribution data
     */
    public void setProvinceCount(KeyValueRecord [] ProvinceCount) {
        this.ProvinceCount = ProvinceCount;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NationCount.", this.NationCount);
        this.setParamArrayObj(map, prefix + "ProvinceCount.", this.ProvinceCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

