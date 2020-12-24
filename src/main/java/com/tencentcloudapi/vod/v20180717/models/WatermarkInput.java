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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkInput extends AbstractModel{

    /**
    * Watermarking template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Text content, which contains up to 100 characters. Set this parameter only when the watermark type is text.
VOD does not support adding text watermarks on screenshots.
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * SVG content, which contains up to 2,000,000 characters. Set this parameter only when the watermark type is SVG.
VOD does not support adding SVG watermarks on screenshots.
    */
    @SerializedName("SvgContent")
    @Expose
    private String SvgContent;

    /**
    * Start time offset of a watermark in seconds. If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame.
<li>If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will appear at second n after the first video frame;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will appear at second n before the last video frame.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a watermark in seconds.
<li>If this parameter is left blank or 0 is entered, the watermark will exist till the last video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will exist till second n;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will exist till second n before the last video frame.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Watermarking template ID. 
     * @return Definition Watermarking template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Watermarking template ID.
     * @param Definition Watermarking template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Text content, which contains up to 100 characters. Set this parameter only when the watermark type is text.
VOD does not support adding text watermarks on screenshots. 
     * @return TextContent Text content, which contains up to 100 characters. Set this parameter only when the watermark type is text.
VOD does not support adding text watermarks on screenshots.
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set Text content, which contains up to 100 characters. Set this parameter only when the watermark type is text.
VOD does not support adding text watermarks on screenshots.
     * @param TextContent Text content, which contains up to 100 characters. Set this parameter only when the watermark type is text.
VOD does not support adding text watermarks on screenshots.
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get SVG content, which contains up to 2,000,000 characters. Set this parameter only when the watermark type is SVG.
VOD does not support adding SVG watermarks on screenshots. 
     * @return SvgContent SVG content, which contains up to 2,000,000 characters. Set this parameter only when the watermark type is SVG.
VOD does not support adding SVG watermarks on screenshots.
     */
    public String getSvgContent() {
        return this.SvgContent;
    }

    /**
     * Set SVG content, which contains up to 2,000,000 characters. Set this parameter only when the watermark type is SVG.
VOD does not support adding SVG watermarks on screenshots.
     * @param SvgContent SVG content, which contains up to 2,000,000 characters. Set this parameter only when the watermark type is SVG.
VOD does not support adding SVG watermarks on screenshots.
     */
    public void setSvgContent(String SvgContent) {
        this.SvgContent = SvgContent;
    }

    /**
     * Get Start time offset of a watermark in seconds. If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame.
<li>If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will appear at second n after the first video frame;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will appear at second n before the last video frame.</li> 
     * @return StartTimeOffset Start time offset of a watermark in seconds. If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame.
<li>If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will appear at second n after the first video frame;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will appear at second n before the last video frame.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a watermark in seconds. If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame.
<li>If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will appear at second n after the first video frame;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will appear at second n before the last video frame.</li>
     * @param StartTimeOffset Start time offset of a watermark in seconds. If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame.
<li>If this parameter is left blank or 0 is entered, the watermark will appear upon the first video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will appear at second n after the first video frame;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will appear at second n before the last video frame.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a watermark in seconds.
<li>If this parameter is left blank or 0 is entered, the watermark will exist till the last video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will exist till second n;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will exist till second n before the last video frame.</li> 
     * @return EndTimeOffset End time offset of a watermark in seconds.
<li>If this parameter is left blank or 0 is entered, the watermark will exist till the last video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will exist till second n;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will exist till second n before the last video frame.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a watermark in seconds.
<li>If this parameter is left blank or 0 is entered, the watermark will exist till the last video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will exist till second n;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will exist till second n before the last video frame.</li>
     * @param EndTimeOffset End time offset of a watermark in seconds.
<li>If this parameter is left blank or 0 is entered, the watermark will exist till the last video frame;</li>
<li>If this value is greater than 0 (e.g., n), the watermark will exist till second n;</li>
<li>If this value is smaller than 0 (e.g., -n), the watermark will exist till second n before the last video frame.</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
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

