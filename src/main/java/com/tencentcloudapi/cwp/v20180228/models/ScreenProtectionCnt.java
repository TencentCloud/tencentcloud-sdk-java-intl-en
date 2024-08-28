/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenProtectionCnt extends AbstractModel {

    /**
    * cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Total number
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine 
     * @return Type cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
     * @param Type cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine 
     * @return Name cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
     * @param Name cloud: Cloud Security Engine; detect: detection engine; defend: attack defense; threat: threat intelligence; analysis: abnormal analysis; ai: AI engine
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Total number 
     * @return Count Total number
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total number
     * @param Count Total number
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ScreenProtectionCnt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenProtectionCnt(ScreenProtectionCnt source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

