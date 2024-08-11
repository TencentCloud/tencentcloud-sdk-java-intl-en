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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSensitiveAPIReq extends AbstractModel {

    /**
    * API name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * API type 1-System API 2-Custom API
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiType")
    @Expose
    private Long ApiType;

    /**
     * Get API name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiName API name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiName API name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get API type 1-System API 2-Custom API
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiType API type 1-System API 2-Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type 1-System API 2-Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiType API type 1-System API 2-Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiType(Long ApiType) {
        this.ApiType = ApiType;
    }

    public CreateSensitiveAPIReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSensitiveAPIReq(CreateSensitiveAPIReq source) {
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.ApiType != null) {
            this.ApiType = new Long(source.ApiType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);

    }
}

