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
    * Digital Human Asset key
    */
    @SerializedName("AssetKey")
    @Expose
    private String AssetKey;

    /**
    * Digital Human Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Image
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get Digital Human Asset key 
     * @return AssetKey Digital Human Asset key
     */
    public String getAssetKey() {
        return this.AssetKey;
    }

    /**
     * Set Digital Human Asset key
     * @param AssetKey Digital Human Asset key
     */
    public void setAssetKey(String AssetKey) {
        this.AssetKey = AssetKey;
    }

    /**
     * Get Digital Human Name 
     * @return Name Digital Human Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Digital Human Name
     * @param Name Digital Human Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Image 
     * @return Avatar Image
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set Image
     * @param Avatar Image
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetKey", this.AssetKey);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

