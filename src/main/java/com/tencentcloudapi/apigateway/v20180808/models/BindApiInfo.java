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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindApiInfo extends AbstractModel {

    /**
    * Unique API ID.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * Unique ID of the service
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * Service name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Bound At
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
     * Get Unique API ID. 
     * @return ApiId Unique API ID.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique API ID.
     * @param ApiId Unique API ID.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get Unique ID of the service 
     * @return ServiceId Unique ID of the service
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service
     * @param ServiceId Unique ID of the service
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ApiName API name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name
Note: This field may return `null`, indicating that no valid value was found.
     * @param ApiName API name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get Service name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ServiceName Service name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
Note: This field may return `null`, indicating that no valid value was found.
     * @param ServiceName Service name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Bound At 
     * @return BindTime Bound At
     */
    public String getBindTime() {
        return this.BindTime;
    }

    /**
     * Set Bound At
     * @param BindTime Bound At
     */
    public void setBindTime(String BindTime) {
        this.BindTime = BindTime;
    }

    public BindApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindApiInfo(BindApiInfo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);

    }
}

