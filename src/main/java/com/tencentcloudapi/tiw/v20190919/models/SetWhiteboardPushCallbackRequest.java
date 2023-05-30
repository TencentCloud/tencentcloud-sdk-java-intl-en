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

public class SetWhiteboardPushCallbackRequest extends AbstractModel{

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Callback URL of the whiteboard push task result. If an empty string is passed in, the existing callback URL is deleted. The callback URL only supports the HTTP or HTTPS protocol, and therefore the callback URL must start with `http://` or `https://`. For the callback format, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Callback URL of the whiteboard push task result. If an empty string is passed in, the existing callback URL is deleted. The callback URL only supports the HTTP or HTTPS protocol, and therefore the callback URL must start with `http://` or `https://`. For the callback format, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1). 
     * @return Callback Callback URL of the whiteboard push task result. If an empty string is passed in, the existing callback URL is deleted. The callback URL only supports the HTTP or HTTPS protocol, and therefore the callback URL must start with `http://` or `https://`. For the callback format, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set Callback URL of the whiteboard push task result. If an empty string is passed in, the existing callback URL is deleted. The callback URL only supports the HTTP or HTTPS protocol, and therefore the callback URL must start with `http://` or `https://`. For the callback format, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
     * @param Callback Callback URL of the whiteboard push task result. If an empty string is passed in, the existing callback URL is deleted. The callback URL only supports the HTTP or HTTPS protocol, and therefore the callback URL must start with `http://` or `https://`. For the callback format, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    public SetWhiteboardPushCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetWhiteboardPushCallbackRequest(SetWhiteboardPushCallbackRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callback", this.Callback);

    }
}

