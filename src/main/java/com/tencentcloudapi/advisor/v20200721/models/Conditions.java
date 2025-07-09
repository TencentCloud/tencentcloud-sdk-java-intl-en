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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Conditions extends AbstractModel {

    /**
    * Warning condition ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConditionId")
    @Expose
    private Long ConditionId;

    /**
    * Warning level. 2: medium risk; 3: high risk.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Warning level description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LevelDesc")
    @Expose
    private String LevelDesc;

    /**
    * Warning condition description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Warning condition ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConditionId Warning condition ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConditionId() {
        return this.ConditionId;
    }

    /**
     * Set Warning condition ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConditionId Warning condition ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditionId(Long ConditionId) {
        this.ConditionId = ConditionId;
    }

    /**
     * Get Warning level. 2: medium risk; 3: high risk.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Warning level. 2: medium risk; 3: high risk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Warning level. 2: medium risk; 3: high risk.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Warning level. 2: medium risk; 3: high risk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Warning level description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LevelDesc Warning level description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevelDesc() {
        return this.LevelDesc;
    }

    /**
     * Set Warning level description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LevelDesc Warning level description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevelDesc(String LevelDesc) {
        this.LevelDesc = LevelDesc;
    }

    /**
     * Get Warning condition description 
     * @return Desc Warning condition description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Warning condition description
     * @param Desc Warning condition description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Conditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Conditions(Conditions source) {
        if (source.ConditionId != null) {
            this.ConditionId = new Long(source.ConditionId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.LevelDesc != null) {
            this.LevelDesc = new String(source.LevelDesc);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConditionId", this.ConditionId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "LevelDesc", this.LevelDesc);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

