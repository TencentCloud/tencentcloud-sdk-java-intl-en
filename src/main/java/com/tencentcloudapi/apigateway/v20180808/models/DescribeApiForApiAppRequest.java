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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiForApiAppRequest extends AbstractModel {

    /**
    * Unique service ID of the API
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API region
    */
    @SerializedName("ApiRegion")
    @Expose
    private String ApiRegion;

    /**
     * Get Unique service ID of the API 
     * @return ServiceId Unique service ID of the API
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID of the API
     * @param ServiceId Unique service ID of the API
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique API ID 
     * @return ApiId Unique API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique API ID
     * @param ApiId Unique API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API region 
     * @return ApiRegion API region
     */
    public String getApiRegion() {
        return this.ApiRegion;
    }

    /**
     * Set API region
     * @param ApiRegion API region
     */
    public void setApiRegion(String ApiRegion) {
        this.ApiRegion = ApiRegion;
    }

    public DescribeApiForApiAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiForApiAppRequest(DescribeApiForApiAppRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiRegion != null) {
            this.ApiRegion = new String(source.ApiRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiRegion", this.ApiRegion);

    }
}

