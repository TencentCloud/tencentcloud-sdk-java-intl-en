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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetTranscodeCallbackRequest extends AbstractModel{

    /**
    * SdkAppId of the customer
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Callback address for the document transcoding progress. If it is specified as null, the set callback address is deleted. The callback address only supports the HTTP or HTTPS protocol, and therefore the callback address must start with http:// or https://.
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
     * Get SdkAppId of the customer 
     * @return SdkAppId SdkAppId of the customer
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the customer
     * @param SdkAppId SdkAppId of the customer
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Callback address for the document transcoding progress. If it is specified as null, the set callback address is deleted. The callback address only supports the HTTP or HTTPS protocol, and therefore the callback address must start with http:// or https://. 
     * @return Callback Callback address for the document transcoding progress. If it is specified as null, the set callback address is deleted. The callback address only supports the HTTP or HTTPS protocol, and therefore the callback address must start with http:// or https://.
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set Callback address for the document transcoding progress. If it is specified as null, the set callback address is deleted. The callback address only supports the HTTP or HTTPS protocol, and therefore the callback address must start with http:// or https://.
     * @param Callback Callback address for the document transcoding progress. If it is specified as null, the set callback address is deleted. The callback address only supports the HTTP or HTTPS protocol, and therefore the callback address must start with http:// or https://.
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callback", this.Callback);

    }
}

