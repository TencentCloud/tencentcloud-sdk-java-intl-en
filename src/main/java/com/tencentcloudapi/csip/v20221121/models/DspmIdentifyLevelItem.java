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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyLevelItem extends AbstractModel {

    /**
    * <p>Level name</p>
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * <p>Risk level (ranging from low to high)</p><p>Value range: [1, 10]</p><p>Measurement unit: level</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

    /**
    * <p>Level id</p>
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
     * Get <p>Level name</p> 
     * @return LevelName <p>Level name</p>
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set <p>Level name</p>
     * @param LevelName <p>Level name</p>
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get <p>Risk level (ranging from low to high)</p><p>Value range: [1, 10]</p><p>Measurement unit: level</p> 
     * @return LevelScore <p>Risk level (ranging from low to high)</p><p>Value range: [1, 10]</p><p>Measurement unit: level</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>Risk level (ranging from low to high)</p><p>Value range: [1, 10]</p><p>Measurement unit: level</p>
     * @param LevelScore <p>Risk level (ranging from low to high)</p><p>Value range: [1, 10]</p><p>Measurement unit: level</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    /**
     * Get <p>Level id</p> 
     * @return LevelId <p>Level id</p>
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set <p>Level id</p>
     * @param LevelId <p>Level id</p>
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    public DspmIdentifyLevelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyLevelItem(DspmIdentifyLevelItem source) {
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);

    }
}

