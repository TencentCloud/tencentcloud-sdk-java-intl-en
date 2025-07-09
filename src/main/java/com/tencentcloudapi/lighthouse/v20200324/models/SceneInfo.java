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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneInfo extends AbstractModel {

    /**
    * Scene ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * Display name of the scene
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Scene description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Scene ID 
     * @return SceneId Scene ID
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set Scene ID
     * @param SceneId Scene ID
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get Display name of the scene 
     * @return DisplayName Display name of the scene
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Display name of the scene
     * @param DisplayName Display name of the scene
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Scene description 
     * @return Description Scene description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Scene description
     * @param Description Scene description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public SceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneInfo(SceneInfo source) {
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

