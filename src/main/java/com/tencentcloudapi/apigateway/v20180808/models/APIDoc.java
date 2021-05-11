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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIDoc extends AbstractModel{

    /**
    * API document ID
    */
    @SerializedName("ApiDocId")
    @Expose
    private String ApiDocId;

    /**
    * API document name
    */
    @SerializedName("ApiDocName")
    @Expose
    private String ApiDocName;

    /**
    * API document build status
    */
    @SerializedName("ApiDocStatus")
    @Expose
    private String ApiDocStatus;

    /**
     * Get API document ID 
     * @return ApiDocId API document ID
     */
    public String getApiDocId() {
        return this.ApiDocId;
    }

    /**
     * Set API document ID
     * @param ApiDocId API document ID
     */
    public void setApiDocId(String ApiDocId) {
        this.ApiDocId = ApiDocId;
    }

    /**
     * Get API document name 
     * @return ApiDocName API document name
     */
    public String getApiDocName() {
        return this.ApiDocName;
    }

    /**
     * Set API document name
     * @param ApiDocName API document name
     */
    public void setApiDocName(String ApiDocName) {
        this.ApiDocName = ApiDocName;
    }

    /**
     * Get API document build status 
     * @return ApiDocStatus API document build status
     */
    public String getApiDocStatus() {
        return this.ApiDocStatus;
    }

    /**
     * Set API document build status
     * @param ApiDocStatus API document build status
     */
    public void setApiDocStatus(String ApiDocStatus) {
        this.ApiDocStatus = ApiDocStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiDocId", this.ApiDocId);
        this.setParamSimple(map, prefix + "ApiDocName", this.ApiDocName);
        this.setParamSimple(map, prefix + "ApiDocStatus", this.ApiDocStatus);

    }
}

