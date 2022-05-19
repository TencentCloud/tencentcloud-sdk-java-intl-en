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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseUsageDataResponse extends AbstractModel{

    /**
    * The license request statistics (the number of license requests in the time period specified)
    */
    @SerializedName("LicenseUsageDataSet")
    @Expose
    private LicenseUsageDataItem [] LicenseUsageDataSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The license request statistics (the number of license requests in the time period specified) 
     * @return LicenseUsageDataSet The license request statistics (the number of license requests in the time period specified)
     */
    public LicenseUsageDataItem [] getLicenseUsageDataSet() {
        return this.LicenseUsageDataSet;
    }

    /**
     * Set The license request statistics (the number of license requests in the time period specified)
     * @param LicenseUsageDataSet The license request statistics (the number of license requests in the time period specified)
     */
    public void setLicenseUsageDataSet(LicenseUsageDataItem [] LicenseUsageDataSet) {
        this.LicenseUsageDataSet = LicenseUsageDataSet;
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

    public DescribeLicenseUsageDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseUsageDataResponse(DescribeLicenseUsageDataResponse source) {
        if (source.LicenseUsageDataSet != null) {
            this.LicenseUsageDataSet = new LicenseUsageDataItem[source.LicenseUsageDataSet.length];
            for (int i = 0; i < source.LicenseUsageDataSet.length; i++) {
                this.LicenseUsageDataSet[i] = new LicenseUsageDataItem(source.LicenseUsageDataSet[i]);
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
        this.setParamArrayObj(map, prefix + "LicenseUsageDataSet.", this.LicenseUsageDataSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

