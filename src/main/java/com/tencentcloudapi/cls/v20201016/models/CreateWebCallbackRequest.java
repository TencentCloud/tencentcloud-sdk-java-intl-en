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

public class CreateWebCallbackRequest extends AbstractModel {

    /**
    * Notification content name. Supports a maximum of 255 bytes.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Channel type.

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Webhook URL.
    */
    @SerializedName("Webhook")
    @Expose
    private String Webhook;

    /**
    * Request method. Support POST, PUT.

Required when Type is Http.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Secret key. Supports a maximum of 1024 bytes.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get Notification content name. Supports a maximum of 255 bytes. 
     * @return Name Notification content name. Supports a maximum of 255 bytes.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Notification content name. Supports a maximum of 255 bytes.
     * @param Name Notification content name. Supports a maximum of 255 bytes.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Channel type.

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback. 
     * @return Type Channel type.

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Channel type.

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback.
     * @param Type Channel type.

WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Webhook URL. 
     * @return Webhook Webhook URL.
     */
    public String getWebhook() {
        return this.Webhook;
    }

    /**
     * Set Webhook URL.
     * @param Webhook Webhook URL.
     */
    public void setWebhook(String Webhook) {
        this.Webhook = Webhook;
    }

    /**
     * Get Request method. Support POST, PUT.

Required when Type is Http. 
     * @return Method Request method. Support POST, PUT.

Required when Type is Http.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method. Support POST, PUT.

Required when Type is Http.
     * @param Method Request method. Support POST, PUT.

Required when Type is Http.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Secret key. Supports a maximum of 1024 bytes. 
     * @return Key Secret key. Supports a maximum of 1024 bytes.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Secret key. Supports a maximum of 1024 bytes.
     * @param Key Secret key. Supports a maximum of 1024 bytes.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public CreateWebCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWebCallbackRequest(CreateWebCallbackRequest source) {
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Webhook", this.Webhook);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

