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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCCaptchaOption extends AbstractModel {

    /**
    * CaptchaAppId information.
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private String CaptchaAppId;

    /**
    * AppSecretKey information.
    */
    @SerializedName("AppSecretKey")
    @Expose
    private String AppSecretKey;

    /**
     * Get CaptchaAppId information. 
     * @return CaptchaAppId CaptchaAppId information.
     */
    public String getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set CaptchaAppId information.
     * @param CaptchaAppId CaptchaAppId information.
     */
    public void setCaptchaAppId(String CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get AppSecretKey information. 
     * @return AppSecretKey AppSecretKey information.
     */
    public String getAppSecretKey() {
        return this.AppSecretKey;
    }

    /**
     * Set AppSecretKey information.
     * @param AppSecretKey AppSecretKey information.
     */
    public void setAppSecretKey(String AppSecretKey) {
        this.AppSecretKey = AppSecretKey;
    }

    public TCCaptchaOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCCaptchaOption(TCCaptchaOption source) {
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new String(source.CaptchaAppId);
        }
        if (source.AppSecretKey != null) {
            this.AppSecretKey = new String(source.AppSecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "AppSecretKey", this.AppSecretKey);

    }
}

