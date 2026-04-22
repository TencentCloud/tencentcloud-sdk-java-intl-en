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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationSensitiveAPIReq extends AbstractModel {

    /**
    * <p>API name</p>
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * <p>API description</p>
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
    * <p>API type. Valid values: 1: System; 2: Custom</p>
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Universal</p>
    */
    @SerializedName("UseScope")
    @Expose
    private Long UseScope;

    /**
     * Get <p>API name</p> 
     * @return APIName <p>API name</p>
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set <p>API name</p>
     * @param APIName <p>API name</p>
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get <p>API description</p> 
     * @return APIDesc <p>API description</p>
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set <p>API description</p>
     * @param APIDesc <p>API description</p>
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    /**
     * Get <p>API type. Valid values: 1: System; 2: Custom</p> 
     * @return APIType <p>API type. Valid values: 1: System; 2: Custom</p>
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set <p>API type. Valid values: 1: System; 2: Custom</p>
     * @param APIType <p>API type. Valid values: 1: System; 2: Custom</p>
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Universal</p> 
     * @return UseScope <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Universal</p>
     */
    public Long getUseScope() {
        return this.UseScope;
    }

    /**
     * Set <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Universal</p>
     * @param UseScope <p>Applicable scope: Valid values: 0: Mini program; 1: Mini game; 100: Universal</p>
     */
    public void setUseScope(Long UseScope) {
        this.UseScope = UseScope;
    }

    public CreateApplicationSensitiveAPIReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationSensitiveAPIReq(CreateApplicationSensitiveAPIReq source) {
        if (source.APIName != null) {
            this.APIName = new String(source.APIName);
        }
        if (source.APIDesc != null) {
            this.APIDesc = new String(source.APIDesc);
        }
        if (source.APIType != null) {
            this.APIType = new Long(source.APIType);
        }
        if (source.UseScope != null) {
            this.UseScope = new Long(source.UseScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "APIName", this.APIName);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);
        this.setParamSimple(map, prefix + "APIType", this.APIType);
        this.setParamSimple(map, prefix + "UseScope", this.UseScope);

    }
}

