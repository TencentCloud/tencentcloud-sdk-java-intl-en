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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRisk extends AbstractModel{

    /**
    * High-risk behavior
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * Type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Risk level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstructionContent")
    @Expose
    private String InstructionContent;

    /**
     * Get High-risk behavior
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Behavior High-risk behavior
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set High-risk behavior
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Behavior High-risk behavior
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get Type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Risk level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Desc Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Desc Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstructionContent Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstructionContent() {
        return this.InstructionContent;
    }

    /**
     * Set Solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstructionContent Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstructionContent(String InstructionContent) {
        this.InstructionContent = InstructionContent;
    }

    public ImageRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRisk(ImageRisk source) {
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.InstructionContent != null) {
            this.InstructionContent = new String(source.InstructionContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "InstructionContent", this.InstructionContent);

    }
}

