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

public class WatermarkInput extends AbstractModel {

    /**
    * ID of a watermarking template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Custom watermark parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the watermark parameter preferably.
Custom watermark parameter is not available for screenshot.
    */
    @SerializedName("RawParameter")
    @Expose
    private RawWatermarkParameter RawParameter;

    /**
    * Text content of up to 100 characters. This field is required only when the watermark type is text.
Text watermark is not available for screenshot.
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * SVG content of up to 2,000,000 characters. This field is required only when the watermark type is `SVG`.
SVG watermark is not available for screenshot.
    */
    @SerializedName("SvgContent")
    @Expose
    private String SvgContent;

    /**
    * Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>If the value is less than 0 (for example, -n), a watermark will appear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>If the value is less than 0 (for example, -n), a watermark will disappear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get ID of a watermarking template. 
     * @return Definition ID of a watermarking template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set ID of a watermarking template.
     * @param Definition ID of a watermarking template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Custom watermark parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the watermark parameter preferably.
Custom watermark parameter is not available for screenshot. 
     * @return RawParameter Custom watermark parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the watermark parameter preferably.
Custom watermark parameter is not available for screenshot.
     */
    public RawWatermarkParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set Custom watermark parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the watermark parameter preferably.
Custom watermark parameter is not available for screenshot.
     * @param RawParameter Custom watermark parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the watermark parameter preferably.
Custom watermark parameter is not available for screenshot.
     */
    public void setRawParameter(RawWatermarkParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get Text content of up to 100 characters. This field is required only when the watermark type is text.
Text watermark is not available for screenshot. 
     * @return TextContent Text content of up to 100 characters. This field is required only when the watermark type is text.
Text watermark is not available for screenshot.
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set Text content of up to 100 characters. This field is required only when the watermark type is text.
Text watermark is not available for screenshot.
     * @param TextContent Text content of up to 100 characters. This field is required only when the watermark type is text.
Text watermark is not available for screenshot.
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get SVG content of up to 2,000,000 characters. This field is required only when the watermark type is `SVG`.
SVG watermark is not available for screenshot. 
     * @return SvgContent SVG content of up to 2,000,000 characters. This field is required only when the watermark type is `SVG`.
SVG watermark is not available for screenshot.
     */
    public String getSvgContent() {
        return this.SvgContent;
    }

    /**
     * Set SVG content of up to 2,000,000 characters. This field is required only when the watermark type is `SVG`.
SVG watermark is not available for screenshot.
     * @param SvgContent SVG content of up to 2,000,000 characters. This field is required only when the watermark type is `SVG`.
SVG watermark is not available for screenshot.
     */
    public void setSvgContent(String SvgContent) {
        this.SvgContent = SvgContent;
    }

    /**
     * Get Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>If the value is less than 0 (for example, -n), a watermark will appear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported. 
     * @return StartTimeOffset Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>If the value is less than 0 (for example, -n), a watermark will appear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>If the value is less than 0 (for example, -n), a watermark will appear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
     * @param StartTimeOffset Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>If the value is less than 0 (for example, -n), a watermark will appear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>If the value is less than 0 (for example, -n), a watermark will disappear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported. 
     * @return EndTimeOffset End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>If the value is less than 0 (for example, -n), a watermark will disappear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>If the value is less than 0 (for example, -n), a watermark will disappear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
     * @param EndTimeOffset End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>If the value is less than 0 (for example, -n), a watermark will disappear n seconds before the end of a video.</li>

Note: It is only used for video scenarios. Screenshots are not supported.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public WatermarkInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkInput(WatermarkInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawWatermarkParameter(source.RawParameter);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
        if (source.SvgContent != null) {
            this.SvgContent = new String(source.SvgContent);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "SvgContent", this.SvgContent);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

