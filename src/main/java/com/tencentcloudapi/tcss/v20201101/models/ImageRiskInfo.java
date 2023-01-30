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

public class ImageRiskInfo extends AbstractModel{

    /**
    * Behavior
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * Type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Details
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Solution
    */
    @SerializedName("InstructionContent")
    @Expose
    private String InstructionContent;

    /**
     * Get Behavior 
     * @return Behavior Behavior
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set Behavior
     * @param Behavior Behavior
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get Type 
     * @return Type Type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type
     * @param Type Type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Level 
     * @return Level Level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Level
     * @param Level Level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Details 
     * @return Desc Details
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Details
     * @param Desc Details
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Solution 
     * @return InstructionContent Solution
     */
    public String getInstructionContent() {
        return this.InstructionContent;
    }

    /**
     * Set Solution
     * @param InstructionContent Solution
     */
    public void setInstructionContent(String InstructionContent) {
        this.InstructionContent = InstructionContent;
    }

    public ImageRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRiskInfo(ImageRiskInfo source) {
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
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

