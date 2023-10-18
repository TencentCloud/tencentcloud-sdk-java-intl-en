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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationRequest extends AbstractModel {

    /**
    * Application ID, which is globally unique. You must specify at least this parameter or `ClientId`.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Client ID. You must specify at least this parameter or `ApplicationId`.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
     * Get Application ID, which is globally unique. You must specify at least this parameter or `ClientId`. 
     * @return ApplicationId Application ID, which is globally unique. You must specify at least this parameter or `ClientId`.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID, which is globally unique. You must specify at least this parameter or `ClientId`.
     * @param ApplicationId Application ID, which is globally unique. You must specify at least this parameter or `ClientId`.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Client ID. You must specify at least this parameter or `ApplicationId`. 
     * @return ClientId Client ID. You must specify at least this parameter or `ApplicationId`.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID. You must specify at least this parameter or `ApplicationId`.
     * @param ClientId Client ID. You must specify at least this parameter or `ApplicationId`.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public DescribeApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationRequest(DescribeApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);

    }
}

