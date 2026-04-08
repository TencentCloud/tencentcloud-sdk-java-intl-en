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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleLayoutConfig extends AbstractModel {

    /**
    * Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0
    */
    @SerializedName("SubtitleLayoutConfigSwitch")
    @Expose
    private Long SubtitleLayoutConfigSwitch;

    /**
    * Line spacing. The value should be a positive integer.
-Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel

    */
    @SerializedName("LineSpacingUnit")
    @Expose
    private Long LineSpacingUnit;

    /**
    * Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the line count. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the line count. If this is not specified, bottom alignment is used by default.

    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
     * Get Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0 
     * @return SubtitleLayoutConfigSwitch Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0
     */
    public Long getSubtitleLayoutConfigSwitch() {
        return this.SubtitleLayoutConfigSwitch;
    }

    /**
     * Set Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0
     * @param SubtitleLayoutConfigSwitch Subtitle arrangement configuration switch, 0 for off, 1 for on, default 0
     */
    public void setSubtitleLayoutConfigSwitch(Long SubtitleLayoutConfigSwitch) {
        this.SubtitleLayoutConfigSwitch = SubtitleLayoutConfigSwitch;
    }

    /**
     * Get Line spacing. The value should be a positive integer.
-Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.
 
     * @return LineSpacing Line spacing. The value should be a positive integer.
-Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set Line spacing. The value should be a positive integer.
-Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     * @param LineSpacing Line spacing. The value should be a positive integer.
-Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel
 
     * @return LineSpacingUnit LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel

     */
    public Long getLineSpacingUnit() {
        return this.LineSpacingUnit;
    }

    /**
     * Set LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel

     * @param LineSpacingUnit LineSpacing unit, 0 pixel, 1 percentage, defaults to 0, pixel

     */
    public void setLineSpacingUnit(Long LineSpacingUnit) {
        this.LineSpacingUnit = LineSpacingUnit;
    }

    /**
     * Get Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the line count. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the line count. If this is not specified, bottom alignment is used by default.
 
     * @return Alignment Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the line count. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the line count. If this is not specified, bottom alignment is used by default.

     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the line count. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the line count. If this is not specified, bottom alignment is used by default.

     * @param Alignment Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the line count. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the line count. If this is not specified, bottom alignment is used by default.

     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    public SubtitleLayoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleLayoutConfig(SubtitleLayoutConfig source) {
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

