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

public class ModifyAPIDocRequest extends AbstractModel {

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
    * Service name
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Environment name
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * List of APIs for which to generate documents
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

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
     * Get Service name 
     * @return ServiceId Service name
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service name
     * @param ServiceId Service name
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Environment name 
     * @return Environment Environment name
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment name
     * @param Environment Environment name
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get List of APIs for which to generate documents 
     * @return ApiIds List of APIs for which to generate documents
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set List of APIs for which to generate documents
     * @param ApiIds List of APIs for which to generate documents
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    public ModifyAPIDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAPIDocRequest(ModifyAPIDocRequest source) {
        if (source.ApiDocId != null) {
            this.ApiDocId = new String(source.ApiDocId);
        }
        if (source.ApiDocName != null) {
            this.ApiDocName = new String(source.ApiDocName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ApiIds != null) {
            this.ApiIds = new String[source.ApiIds.length];
            for (int i = 0; i < source.ApiIds.length; i++) {
                this.ApiIds[i] = new String(source.ApiIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiDocId", this.ApiDocId);
        this.setParamSimple(map, prefix + "ApiDocName", this.ApiDocName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);

    }
}

