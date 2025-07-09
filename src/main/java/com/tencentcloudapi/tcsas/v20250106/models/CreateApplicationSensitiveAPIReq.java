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
    * API name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * API description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
    * API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
     * Get API name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIName API name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set API name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIName API name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get API description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set API description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    /**
     * Get API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "APIName", this.APIName);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);
        this.setParamSimple(map, prefix + "APIType", this.APIType);

    }
}

