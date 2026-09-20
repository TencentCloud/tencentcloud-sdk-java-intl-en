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

public class WatermarkInput extends AbstractModel {

    /**
    * Watermark template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Text content, up to 100 characters. Fill in only when the watermark type is text watermark.
Text watermarks do not support watermarking screenshots.
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.
SVG watermark does not support screenshot watermarking.
    */
    @SerializedName("SvgContent")
    @Expose
    private String SvgContent;

    /**
    * Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>When the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the watermark persists until n seconds before the end of the video.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Watermark template ID. 
     * @return Definition Watermark template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Watermark template ID.
     * @param Definition Watermark template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Text content, up to 100 characters. Fill in only when the watermark type is text watermark.
Text watermarks do not support watermarking screenshots. 
     * @return TextContent Text content, up to 100 characters. Fill in only when the watermark type is text watermark.
Text watermarks do not support watermarking screenshots.
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set Text content, up to 100 characters. Fill in only when the watermark type is text watermark.
Text watermarks do not support watermarking screenshots.
     * @param TextContent Text content, up to 100 characters. Fill in only when the watermark type is text watermark.
Text watermarks do not support watermarking screenshots.
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.
SVG watermark does not support screenshot watermarking. 
     * @return SvgContent SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.
SVG watermark does not support screenshot watermarking.
     */
    public String getSvgContent() {
        return this.SvgContent;
    }

    /**
     * Set SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.
SVG watermark does not support screenshot watermarking.
     * @param SvgContent SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.
SVG watermark does not support screenshot watermarking.
     */
    public void setSvgContent(String SvgContent) {
        this.SvgContent = SvgContent;
    }

    /**
     * Get Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>When the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li> 
     * @return StartTimeOffset Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>When the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>When the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>
     * @param StartTimeOffset Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.
<li>If not set or set to 0, a watermark starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a watermark will appear at second n of a video.</li>
<li>When the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the watermark persists until n seconds before the end of the video.</li> 
     * @return EndTimeOffset End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the watermark persists until n seconds before the end of the video.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the watermark persists until n seconds before the end of the video.</li>
     * @param EndTimeOffset End time offset of a watermark, in seconds.
<li>If not set or set to 0, a watermark will last until the end of a video.</li>
<li>If the value is greater than 0 (for example, n), a watermark will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the watermark persists until n seconds before the end of the video.</li>
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
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "SvgContent", this.SvgContent);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

