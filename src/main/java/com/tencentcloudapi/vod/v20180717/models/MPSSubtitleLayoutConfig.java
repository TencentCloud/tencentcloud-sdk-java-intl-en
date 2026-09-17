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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSSubtitleLayoutConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubtitleLayoutConfigSwitch")
    @Expose
    private Long SubtitleLayoutConfigSwitch;

    /**
    * 
    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * 
    */
    @SerializedName("LineSpacingUnit")
    @Expose
    private Long LineSpacingUnit;

    /**
    * 
    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
     * Get  
     * @return SubtitleLayoutConfigSwitch 
     */
    public Long getSubtitleLayoutConfigSwitch() {
        return this.SubtitleLayoutConfigSwitch;
    }

    /**
     * Set 
     * @param SubtitleLayoutConfigSwitch 
     */
    public void setSubtitleLayoutConfigSwitch(Long SubtitleLayoutConfigSwitch) {
        this.SubtitleLayoutConfigSwitch = SubtitleLayoutConfigSwitch;
    }

    /**
     * Get  
     * @return LineSpacing 
     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set 
     * @param LineSpacing 
     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get  
     * @return LineSpacingUnit 
     */
    public Long getLineSpacingUnit() {
        return this.LineSpacingUnit;
    }

    /**
     * Set 
     * @param LineSpacingUnit 
     */
    public void setLineSpacingUnit(Long LineSpacingUnit) {
        this.LineSpacingUnit = LineSpacingUnit;
    }

    /**
     * Get  
     * @return Alignment 
     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set 
     * @param Alignment 
     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    public MPSSubtitleLayoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleLayoutConfig(MPSSubtitleLayoutConfig source) {
        if (source.SubtitleLayoutConfigSwitch != null) {
            this.SubtitleLayoutConfigSwitch = new Long(source.SubtitleLayoutConfigSwitch);
        }
        if (source.LineSpacing != null) {
            this.LineSpacing = new Long(source.LineSpacing);
        }
        if (source.LineSpacingUnit != null) {
            this.LineSpacingUnit = new Long(source.LineSpacingUnit);
        }
        if (source.Alignment != null) {
            this.Alignment = new String(source.Alignment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleLayoutConfigSwitch", this.SubtitleLayoutConfigSwitch);
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);
        this.setParamSimple(map, prefix + "LineSpacingUnit", this.LineSpacingUnit);
        this.setParamSimple(map, prefix + "Alignment", this.Alignment);

    }
}

