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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DigitalHumanConfig extends AbstractModel {

    /**
    * Digital human asset key
    */
    @SerializedName("AssetKey")
    @Expose
    private String AssetKey;

    /**
    * Digital human name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * image
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * Preview image
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
     * Get Digital human asset key 
     * @return AssetKey Digital human asset key
     */
    public String getAssetKey() {
        return this.AssetKey;
    }

    /**
     * Set Digital human asset key
     * @param AssetKey Digital human asset key
     */
    public void setAssetKey(String AssetKey) {
        this.AssetKey = AssetKey;
    }

    /**
     * Get Digital human name 
     * @return Name Digital human name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Digital human name
     * @param Name Digital human name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get image 
     * @return Avatar image
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set image
     * @param Avatar image
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get Preview image 
     * @return PreviewUrl Preview image
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set Preview image
     * @param PreviewUrl Preview image
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);

    }
}

