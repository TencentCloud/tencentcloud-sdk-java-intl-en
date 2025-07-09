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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoCallback extends AbstractModel {

    /**
    * URL of the user callback API.
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * Status of the user callback API. The value 0 indicates that the API is not verified. The value 1 indicates that the API is verified. The value 2 indicates that a URL exists but the API fails to be verified.
    */
    @SerializedName("ValidFlag")
    @Expose
    private Long ValidFlag;

    /**
    * Verification code of the user callback API.
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
     * Get URL of the user callback API. 
     * @return CallbackUrl URL of the user callback API.
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set URL of the user callback API.
     * @param CallbackUrl URL of the user callback API.
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get Status of the user callback API. The value 0 indicates that the API is not verified. The value 1 indicates that the API is verified. The value 2 indicates that a URL exists but the API fails to be verified. 
     * @return ValidFlag Status of the user callback API. The value 0 indicates that the API is not verified. The value 1 indicates that the API is verified. The value 2 indicates that a URL exists but the API fails to be verified.
     */
    public Long getValidFlag() {
        return this.ValidFlag;
    }

    /**
     * Set Status of the user callback API. The value 0 indicates that the API is not verified. The value 1 indicates that the API is verified. The value 2 indicates that a URL exists but the API fails to be verified.
     * @param ValidFlag Status of the user callback API. The value 0 indicates that the API is not verified. The value 1 indicates that the API is verified. The value 2 indicates that a URL exists but the API fails to be verified.
     */
    public void setValidFlag(Long ValidFlag) {
        this.ValidFlag = ValidFlag;
    }

    /**
     * Get Verification code of the user callback API. 
     * @return VerifyCode Verification code of the user callback API.
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set Verification code of the user callback API.
     * @param VerifyCode Verification code of the user callback API.
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    public DescribePolicyGroupInfoCallback() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoCallback(DescribePolicyGroupInfoCallback source) {
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ValidFlag != null) {
            this.ValidFlag = new Long(source.ValidFlag);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ValidFlag", this.ValidFlag);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);

    }
}

