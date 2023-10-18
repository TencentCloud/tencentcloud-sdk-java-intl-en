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

public class CreateApiAppRequest extends AbstractModel {

    /**
    * Custom application name.
    */
    @SerializedName("ApiAppName")
    @Expose
    private String ApiAppName;

    /**
    * Application description
    */
    @SerializedName("ApiAppDesc")
    @Expose
    private String ApiAppDesc;

    /**
     * Get Custom application name. 
     * @return ApiAppName Custom application name.
     */
    public String getApiAppName() {
        return this.ApiAppName;
    }

    /**
     * Set Custom application name.
     * @param ApiAppName Custom application name.
     */
    public void setApiAppName(String ApiAppName) {
        this.ApiAppName = ApiAppName;
    }

    /**
     * Get Application description 
     * @return ApiAppDesc Application description
     */
    public String getApiAppDesc() {
        return this.ApiAppDesc;
    }

    /**
     * Set Application description
     * @param ApiAppDesc Application description
     */
    public void setApiAppDesc(String ApiAppDesc) {
        this.ApiAppDesc = ApiAppDesc;
    }

    public CreateApiAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiAppRequest(CreateApiAppRequest source) {
        if (source.ApiAppName != null) {
            this.ApiAppName = new String(source.ApiAppName);
        }
        if (source.ApiAppDesc != null) {
            this.ApiAppDesc = new String(source.ApiAppDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppName", this.ApiAppName);
        this.setParamSimple(map, prefix + "ApiAppDesc", this.ApiAppDesc);

    }
}

