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

public class GenerateApiDocumentRequest extends AbstractModel{

    /**
    * Unique service ID of the document to be created.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Environment of the service for which to create an SDK.
    */
    @SerializedName("GenEnvironment")
    @Expose
    private String GenEnvironment;

    /**
    * Programming language of the SDK to be created. Currently, only Python and JavaScript are supported.
    */
    @SerializedName("GenLanguage")
    @Expose
    private String GenLanguage;

    /**
     * Get Unique service ID of the document to be created. 
     * @return ServiceId Unique service ID of the document to be created.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID of the document to be created.
     * @param ServiceId Unique service ID of the document to be created.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Environment of the service for which to create an SDK. 
     * @return GenEnvironment Environment of the service for which to create an SDK.
     */
    public String getGenEnvironment() {
        return this.GenEnvironment;
    }

    /**
     * Set Environment of the service for which to create an SDK.
     * @param GenEnvironment Environment of the service for which to create an SDK.
     */
    public void setGenEnvironment(String GenEnvironment) {
        this.GenEnvironment = GenEnvironment;
    }

    /**
     * Get Programming language of the SDK to be created. Currently, only Python and JavaScript are supported. 
     * @return GenLanguage Programming language of the SDK to be created. Currently, only Python and JavaScript are supported.
     */
    public String getGenLanguage() {
        return this.GenLanguage;
    }

    /**
     * Set Programming language of the SDK to be created. Currently, only Python and JavaScript are supported.
     * @param GenLanguage Programming language of the SDK to be created. Currently, only Python and JavaScript are supported.
     */
    public void setGenLanguage(String GenLanguage) {
        this.GenLanguage = GenLanguage;
    }

    public GenerateApiDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateApiDocumentRequest(GenerateApiDocumentRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.GenEnvironment != null) {
            this.GenEnvironment = new String(source.GenEnvironment);
        }
        if (source.GenLanguage != null) {
            this.GenLanguage = new String(source.GenLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "GenEnvironment", this.GenEnvironment);
        this.setParamSimple(map, prefix + "GenLanguage", this.GenLanguage);

    }
}

