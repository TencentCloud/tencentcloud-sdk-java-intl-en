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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class URLNotice extends AbstractModel{

    /**
    * Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsValid")
    @Expose
    private Long IsValid;

    /**
    * Verification code
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidationCode")
    @Expose
    private String ValidationCode;

    /**
     * Get Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return URL Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
     * @param URL Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsValid Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsValid() {
        return this.IsValid;
    }

    /**
     * Set Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsValid Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsValid(Long IsValid) {
        this.IsValid = IsValid;
    }

    /**
     * Get Verification code
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ValidationCode Verification code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValidationCode() {
        return this.ValidationCode;
    }

    /**
     * Set Verification code
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ValidationCode Verification code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValidationCode(String ValidationCode) {
        this.ValidationCode = ValidationCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "IsValid", this.IsValid);
        this.setParamSimple(map, prefix + "ValidationCode", this.ValidationCode);

    }
}

