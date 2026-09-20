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
    * <p>Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0</p>
    */
    @SerializedName("SubtitleLayoutConfigSwitch")
    @Expose
    private Long SubtitleLayoutConfigSwitch;

    /**
    * <p>Line spacing. The value should be a positive integer. - When it represents pixel values, the range is [0, 1000]. - When it represents a percentage, the range is [0, 100]. The default value is 0 if left blank.</p>
    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * <p>LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
    */
    @SerializedName("LineSpacingUnit")
    @Expose
    private Long LineSpacingUnit;

    /**
    * <p>Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.</p>
    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
     * Get <p>Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0</p> 
     * @return SubtitleLayoutConfigSwitch <p>Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public Long getSubtitleLayoutConfigSwitch() {
        return this.SubtitleLayoutConfigSwitch;
    }

    /**
     * Set <p>Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0</p>
     * @param SubtitleLayoutConfigSwitch <p>Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public void setSubtitleLayoutConfigSwitch(Long SubtitleLayoutConfigSwitch) {
        this.SubtitleLayoutConfigSwitch = SubtitleLayoutConfigSwitch;
    }

    /**
     * Get <p>Line spacing. The value should be a positive integer. - When it represents pixel values, the range is [0, 1000]. - When it represents a percentage, the range is [0, 100]. The default value is 0 if left blank.</p> 
     * @return LineSpacing <p>Line spacing. The value should be a positive integer. - When it represents pixel values, the range is [0, 1000]. - When it represents a percentage, the range is [0, 100]. The default value is 0 if left blank.</p>
     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set <p>Line spacing. The value should be a positive integer. - When it represents pixel values, the range is [0, 1000]. - When it represents a percentage, the range is [0, 100]. The default value is 0 if left blank.</p>
     * @param LineSpacing <p>Line spacing. The value should be a positive integer. - When it represents pixel values, the range is [0, 1000]. - When it represents a percentage, the range is [0, 100]. The default value is 0 if left blank.</p>
     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get <p>LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel</p> 
     * @return LineSpacingUnit <p>LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public Long getLineSpacingUnit() {
        return this.LineSpacingUnit;
    }

    /**
     * Set <p>LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     * @param LineSpacingUnit <p>LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public void setLineSpacingUnit(Long LineSpacingUnit) {
        this.LineSpacingUnit = LineSpacingUnit;
    }

    /**
     * Get <p>Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.</p> 
     * @return Alignment <p>Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.</p>
     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set <p>Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.</p>
     * @param Alignment <p>Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.</p>
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

