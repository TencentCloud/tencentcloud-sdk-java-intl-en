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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scene extends AbstractModel {

    /**
    * Scene ID.
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * Scenario name.
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * Scene creator.

- TAT: public scenario.
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Update time. the format is YYYY-MM-DDThh:MM:ssZ.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get Scene ID. 
     * @return SceneId Scene ID.
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set Scene ID.
     * @param SceneId Scene ID.
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get Scenario name. 
     * @return SceneName Scenario name.
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set Scenario name.
     * @param SceneName Scenario name.
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get Scene creator.

- TAT: public scenario. 
     * @return CreatedBy Scene creator.

- TAT: public scenario.
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set Scene creator.

- TAT: public scenario.
     * @param CreatedBy Scene creator.

- TAT: public scenario.
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get Creation time. the format is YYYY-MM-DDThh:MM:ssZ. 
     * @return CreatedTime Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     * @param CreatedTime Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Update time. the format is YYYY-MM-DDThh:MM:ssZ. 
     * @return UpdatedTime Update time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Update time. the format is YYYY-MM-DDThh:MM:ssZ.
     * @param UpdatedTime Update time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public Scene() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Scene(Scene source) {
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

