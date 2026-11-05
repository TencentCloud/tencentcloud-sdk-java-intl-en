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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DigitalHumanConfig extends AbstractModel {

    /**
    * Digital human avatar asset id
    */
    @SerializedName("AssetKey")
    @Expose
    private String AssetKey;

    /**
    * Digital human image
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * Digital human avatar name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Preview address of the digital human
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
     * Get Digital human avatar asset id 
     * @return AssetKey Digital human avatar asset id
     */
    public String getAssetKey() {
        return this.AssetKey;
    }

    /**
     * Set Digital human avatar asset id
     * @param AssetKey Digital human avatar asset id
     */
    public void setAssetKey(String AssetKey) {
        this.AssetKey = AssetKey;
    }

    /**
     * Get Digital human image 
     * @return Avatar Digital human image
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set Digital human image
     * @param Avatar Digital human image
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get Digital human avatar name 
     * @return Name Digital human avatar name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Digital human avatar name
     * @param Name Digital human avatar name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Preview address of the digital human 
     * @return PreviewUrl Preview address of the digital human
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set Preview address of the digital human
     * @param PreviewUrl Preview address of the digital human
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    public DigitalHumanConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DigitalHumanConfig(DigitalHumanConfig source) {
        if (source.AssetKey != null) {
            this.AssetKey = new String(source.AssetKey);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetKey", this.AssetKey);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);

    }
}

