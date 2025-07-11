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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLivePadTemplateRequest extends AbstractModel {

    /**
    * Template name. Maximum length: 255 bytes. Only Chinese, English, numbers, _, and - are supported.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Gasket content.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Description information. Maximum length: 1024 bytes. Only Chinese, English, numbers, _, and - are supported.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The waiting time for disconnection. Value range: 0-30000. Unit: ms.
    */
    @SerializedName("WaitDuration")
    @Expose
    private Long WaitDuration;

    /**
    * Maximum shim duration. Value range: 0 - positive infinity. Unit: ms.
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * Shim content type: 1: image, 2: video. Default value: 1.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Template name. Maximum length: 255 bytes. Only Chinese, English, numbers, _, and - are supported. 
     * @return TemplateName Template name. Maximum length: 255 bytes. Only Chinese, English, numbers, _, and - are supported.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name. Maximum length: 255 bytes. Only Chinese, English, numbers, _, and - are supported.
     * @param TemplateName Template name. Maximum length: 255 bytes. Only Chinese, English, numbers, _, and - are supported.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Gasket content. 
     * @return Url Gasket content.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Gasket content.
     * @param Url Gasket content.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Description information. Maximum length: 1024 bytes. Only Chinese, English, numbers, _, and - are supported. 
     * @return Description Description information. Maximum length: 1024 bytes. Only Chinese, English, numbers, _, and - are supported.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information. Maximum length: 1024 bytes. Only Chinese, English, numbers, _, and - are supported.
     * @param Description Description information. Maximum length: 1024 bytes. Only Chinese, English, numbers, _, and - are supported.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The waiting time for disconnection. Value range: 0-30000. Unit: ms. 
     * @return WaitDuration The waiting time for disconnection. Value range: 0-30000. Unit: ms.
     */
    public Long getWaitDuration() {
        return this.WaitDuration;
    }

    /**
     * Set The waiting time for disconnection. Value range: 0-30000. Unit: ms.
     * @param WaitDuration The waiting time for disconnection. Value range: 0-30000. Unit: ms.
     */
    public void setWaitDuration(Long WaitDuration) {
        this.WaitDuration = WaitDuration;
    }

    /**
     * Get Maximum shim duration. Value range: 0 - positive infinity. Unit: ms. 
     * @return MaxDuration Maximum shim duration. Value range: 0 - positive infinity. Unit: ms.
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set Maximum shim duration. Value range: 0 - positive infinity. Unit: ms.
     * @param MaxDuration Maximum shim duration. Value range: 0 - positive infinity. Unit: ms.
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get Shim content type: 1: image, 2: video. Default value: 1. 
     * @return Type Shim content type: 1: image, 2: video. Default value: 1.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Shim content type: 1: image, 2: video. Default value: 1.
     * @param Type Shim content type: 1: image, 2: video. Default value: 1.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public CreateLivePadTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLivePadTemplateRequest(CreateLivePadTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WaitDuration != null) {
            this.WaitDuration = new Long(source.WaitDuration);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WaitDuration", this.WaitDuration);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

