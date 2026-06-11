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

public class WebCallbackInfo extends AbstractModel {

    /**
    * Alarm channel callback configuration ID.
    */
    @SerializedName("WebCallbackId")
    @Expose
    private String WebCallbackId;

    /**
    * Alarm channel callback configuration name.
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
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Key information.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Root account.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-account.
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * Creation time. A timestamp in seconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update time. A timestamp in seconds.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Alarm channel callback configuration ID. 
     * @return WebCallbackId Alarm channel callback configuration ID.
     */
    public String getWebCallbackId() {
        return this.WebCallbackId;
    }

    /**
     * Set Alarm channel callback configuration ID.
     * @param WebCallbackId Alarm channel callback configuration ID.
     */
    public void setWebCallbackId(String WebCallbackId) {
        this.WebCallbackId = WebCallbackId;
    }

    /**
     * Get Alarm channel callback configuration name. 
     * @return Name Alarm channel callback configuration name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm channel callback configuration name.
     * @param Name Alarm channel callback configuration name.
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
     * @return Method Request method.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method.
     * @param Method Request method.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Key information. 
     * @return Key Key information.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key information.
     * @param Key Key information.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Root account. 
     * @return Uin Root account.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Root account.
     * @param Uin Root account.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-account. 
     * @return SubUin Sub-account.
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-account.
     * @param SubUin Sub-account.
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Creation time. A timestamp in seconds. 
     * @return CreateTime Creation time. A timestamp in seconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. A timestamp in seconds.
     * @param CreateTime Creation time. A timestamp in seconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. A timestamp in seconds. 
     * @return UpdateTime Update time. A timestamp in seconds.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. A timestamp in seconds.
     * @param UpdateTime Update time. A timestamp in seconds.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public WebCallbackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebCallbackInfo(WebCallbackInfo source) {
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
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

