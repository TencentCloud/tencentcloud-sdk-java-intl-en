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
package com.tencentcloudapi.dms.v20200819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendTemplatedEmailRequest extends AbstractModel{

    /**
    * Sender address.
    */
    @SerializedName("FromAddress")
    @Expose
    private String FromAddress;

    /**
    * Recipient address. Up to 100 recipient addresses are supported. Multiple addresses should be separated by semicolons (;).
    */
    @SerializedName("ToAddress")
    @Expose
    private String ToAddress;

    /**
    * The name of the template created in advance.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template variable value, which is a JSON string.
    */
    @SerializedName("TemplateValue")
    @Expose
    private String TemplateValue;

    /**
    * Sender name.
    */
    @SerializedName("FromName")
    @Expose
    private String FromName;

    /**
    * Reply-to address.
    */
    @SerializedName("ReplyAddress")
    @Expose
    private String ReplyAddress;

    /**
     * Get Sender address. 
     * @return FromAddress Sender address.
     */
    public String getFromAddress() {
        return this.FromAddress;
    }

    /**
     * Set Sender address.
     * @param FromAddress Sender address.
     */
    public void setFromAddress(String FromAddress) {
        this.FromAddress = FromAddress;
    }

    /**
     * Get Recipient address. Up to 100 recipient addresses are supported. Multiple addresses should be separated by semicolons (;). 
     * @return ToAddress Recipient address. Up to 100 recipient addresses are supported. Multiple addresses should be separated by semicolons (;).
     */
    public String getToAddress() {
        return this.ToAddress;
    }

    /**
     * Set Recipient address. Up to 100 recipient addresses are supported. Multiple addresses should be separated by semicolons (;).
     * @param ToAddress Recipient address. Up to 100 recipient addresses are supported. Multiple addresses should be separated by semicolons (;).
     */
    public void setToAddress(String ToAddress) {
        this.ToAddress = ToAddress;
    }

    /**
     * Get The name of the template created in advance. 
     * @return TemplateName The name of the template created in advance.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set The name of the template created in advance.
     * @param TemplateName The name of the template created in advance.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Template variable value, which is a JSON string. 
     * @return TemplateValue Template variable value, which is a JSON string.
     */
    public String getTemplateValue() {
        return this.TemplateValue;
    }

    /**
     * Set Template variable value, which is a JSON string.
     * @param TemplateValue Template variable value, which is a JSON string.
     */
    public void setTemplateValue(String TemplateValue) {
        this.TemplateValue = TemplateValue;
    }

    /**
     * Get Sender name. 
     * @return FromName Sender name.
     */
    public String getFromName() {
        return this.FromName;
    }

    /**
     * Set Sender name.
     * @param FromName Sender name.
     */
    public void setFromName(String FromName) {
        this.FromName = FromName;
    }

    /**
     * Get Reply-to address. 
     * @return ReplyAddress Reply-to address.
     */
    public String getReplyAddress() {
        return this.ReplyAddress;
    }

    /**
     * Set Reply-to address.
     * @param ReplyAddress Reply-to address.
     */
    public void setReplyAddress(String ReplyAddress) {
        this.ReplyAddress = ReplyAddress;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromAddress", this.FromAddress);
        this.setParamSimple(map, prefix + "ToAddress", this.ToAddress);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateValue", this.TemplateValue);
        this.setParamSimple(map, prefix + "FromName", this.FromName);
        this.setParamSimple(map, prefix + "ReplyAddress", this.ReplyAddress);

    }
}

