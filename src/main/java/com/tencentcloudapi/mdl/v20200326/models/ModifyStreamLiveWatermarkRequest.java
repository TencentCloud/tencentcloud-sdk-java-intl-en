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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLiveWatermarkRequest extends AbstractModel {

    /**
    * Watermark ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Watermark name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
    */
    @SerializedName("ImageSettings")
    @Expose
    private CreateImageSettings ImageSettings;

    /**
    * Watermark text settings. This parameter is valid if `Type` is `TEXT`.
    */
    @SerializedName("TextSettings")
    @Expose
    private CreateTextSettings TextSettings;

    /**
     * Get Watermark ID 
     * @return Id Watermark ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Watermark ID
     * @param Id Watermark ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Watermark name 
     * @return Name Watermark name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Watermark name
     * @param Name Watermark name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`. 
     * @return ImageSettings Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
     */
    public CreateImageSettings getImageSettings() {
        return this.ImageSettings;
    }

    /**
     * Set Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
     * @param ImageSettings Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
     */
    public void setImageSettings(CreateImageSettings ImageSettings) {
        this.ImageSettings = ImageSettings;
    }

    /**
     * Get Watermark text settings. This parameter is valid if `Type` is `TEXT`. 
     * @return TextSettings Watermark text settings. This parameter is valid if `Type` is `TEXT`.
     */
    public CreateTextSettings getTextSettings() {
        return this.TextSettings;
    }

    /**
     * Set Watermark text settings. This parameter is valid if `Type` is `TEXT`.
     * @param TextSettings Watermark text settings. This parameter is valid if `Type` is `TEXT`.
     */
    public void setTextSettings(CreateTextSettings TextSettings) {
        this.TextSettings = TextSettings;
    }

    public ModifyStreamLiveWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLiveWatermarkRequest(ModifyStreamLiveWatermarkRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageSettings != null) {
            this.ImageSettings = new CreateImageSettings(source.ImageSettings);
        }
        if (source.TextSettings != null) {
            this.TextSettings = new CreateTextSettings(source.TextSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "ImageSettings.", this.ImageSettings);
        this.setParamObj(map, prefix + "TextSettings.", this.TextSettings);

    }
}

