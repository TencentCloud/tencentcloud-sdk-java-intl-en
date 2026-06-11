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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebCallbackRequest extends AbstractModel {

    /**
    * Alarm channel callback configuration ID. Obtain the alarm channel callback configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1).
    */
    @SerializedName("WebCallbackId")
    @Expose
    private String WebCallbackId;

    /**
    * Alarm channel callback configuration name. Supports a maximum of 255 bytes.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Channel type

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback;
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Callback URL.
    */
    @SerializedName("Webhook")
    @Expose
    private String Webhook;

    /**
    * Request method.

Support POST, PUT.

Note: This parameter is required when Type is set to Http.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Secret key information. Supports a maximum of 1024 bytes.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get Alarm channel callback configuration ID. Obtain the alarm channel callback configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1). 
     * @return WebCallbackId Alarm channel callback configuration ID. Obtain the alarm channel callback configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1).
     */
    public String getWebCallbackId() {
        return this.WebCallbackId;
    }

    /**
     * Set Alarm channel callback configuration ID. Obtain the alarm channel callback configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1).
     * @param WebCallbackId Alarm channel callback configuration ID. Obtain the alarm channel callback configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1).
     */
    public void setWebCallbackId(String WebCallbackId) {
        this.WebCallbackId = WebCallbackId;
    }

    /**
     * Get Alarm channel callback configuration name. Supports a maximum of 255 bytes. 
     * @return Name Alarm channel callback configuration name. Supports a maximum of 255 bytes.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm channel callback configuration name. Supports a maximum of 255 bytes.
     * @param Name Alarm channel callback configuration name. Supports a maximum of 255 bytes.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Channel type

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback; 
     * @return Type Channel type

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback;
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Channel type

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback;
     * @param Type Channel type

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback;
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Callback URL. 
     * @return Webhook Callback URL.
     */
    public String getWebhook() {
        return this.Webhook;
    }

    /**
     * Set Callback URL.
     * @param Webhook Callback URL.
     */
    public void setWebhook(String Webhook) {
        this.Webhook = Webhook;
    }

    /**
     * Get Request method.

Support POST, PUT.

Note: This parameter is required when Type is set to Http. 
     * @return Method Request method.

Support POST, PUT.

Note: This parameter is required when Type is set to Http.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method.

Support POST, PUT.

Note: This parameter is required when Type is set to Http.
     * @param Method Request method.

Support POST, PUT.

Note: This parameter is required when Type is set to Http.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Secret key information. Supports a maximum of 1024 bytes. 
     * @return Key Secret key information. Supports a maximum of 1024 bytes.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Secret key information. Supports a maximum of 1024 bytes.
     * @param Key Secret key information. Supports a maximum of 1024 bytes.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public ModifyWebCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebCallbackRequest(ModifyWebCallbackRequest source) {
        if (source.WebCallbackId != null) {
            this.WebCallbackId = new String(source.WebCallbackId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Webhook != null) {
            this.Webhook = new String(source.Webhook);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebCallbackId", this.WebCallbackId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Webhook", this.Webhook);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

