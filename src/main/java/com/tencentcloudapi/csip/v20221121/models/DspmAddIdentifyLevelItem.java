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

public class DspmAddIdentifyLevelItem extends AbstractModel {

    /**
    * <p>Level name</p>
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * <p>Level sensitivity</p><p>Unit: points</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

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
     * Get <p>Level sensitivity</p><p>Unit: points</p> 
     * @return LevelScore <p>Level sensitivity</p><p>Unit: points</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>Level sensitivity</p><p>Unit: points</p>
     * @param LevelScore <p>Level sensitivity</p><p>Unit: points</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    public DspmAddIdentifyLevelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAddIdentifyLevelItem(DspmAddIdentifyLevelItem source) {
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);

    }
}

