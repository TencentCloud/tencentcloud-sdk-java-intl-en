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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppRequest extends AbstractModel {

    /**
    * LCIC SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Callback URL. Currently, only port 80 and port 443 are supported.
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * The callback key.
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
     * Get LCIC SdkAppId 
     * @return SdkAppId LCIC SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set LCIC SdkAppId
     * @param SdkAppId LCIC SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Callback URL. Currently, only port 80 and port 443 are supported. 
     * @return Callback Callback URL. Currently, only port 80 and port 443 are supported.
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set Callback URL. Currently, only port 80 and port 443 are supported.
     * @param Callback Callback URL. Currently, only port 80 and port 443 are supported.
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get The callback key. 
     * @return CallbackKey The callback key.
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set The callback key.
     * @param CallbackKey The callback key.
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    public ModifyAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppRequest(ModifyAppRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);

    }
}

