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
    * <p>Watermark template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Watermark custom parameter, valid when Definition is set to 0.<br>This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify watermark parameters.<br>Watermark custom parameters are not supported for screenshot watermarking.</p>
    */
    @SerializedName("RawParameter")
    @Expose
    private RawWatermarkParameter RawParameter;

    /**
    * <p>Text content, length not exceeding 100 characters. Fill in only when the watermark type is text watermark.<br>Text watermark does not support screenshot watermarking.</p>
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * <p>SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.<br>SVG watermark does not support screenshot watermarking.</p>
    */
    @SerializedName("SvgContent")
    @Expose
    private String SvgContent;

    /**
    * <p>Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.</p><li>If not set or set to 0, a watermark starts appearing when a video starts;</li><li>If the value is greater than 0 (assuming n), the watermark appears at second n after the video starts;</li><li>If the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshots do not support it.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>End time offset of a watermark, in seconds.</p><li>Leave empty or set to 0: the watermark lasts until the end of the video.</li><li>Value greater than 0 (assuming n): the watermark disappears at second n.</li><li>Value smaller than 0 (assuming -n): the watermark disappears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshot is not supported.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get <p>Watermark template ID.</p> 
     * @return Definition <p>Watermark template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Watermark template ID.</p>
     * @param Definition <p>Watermark template ID.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Watermark custom parameter, valid when Definition is set to 0.<br>This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify watermark parameters.<br>Watermark custom parameters are not supported for screenshot watermarking.</p> 
     * @return RawParameter <p>Watermark custom parameter, valid when Definition is set to 0.<br>This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify watermark parameters.<br>Watermark custom parameters are not supported for screenshot watermarking.</p>
     */
    public RawWatermarkParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set <p>Watermark custom parameter, valid when Definition is set to 0.<br>This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify watermark parameters.<br>Watermark custom parameters are not supported for screenshot watermarking.</p>
     * @param RawParameter <p>Watermark custom parameter, valid when Definition is set to 0.<br>This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify watermark parameters.<br>Watermark custom parameters are not supported for screenshot watermarking.</p>
     */
    public void setRawParameter(RawWatermarkParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get <p>Text content, length not exceeding 100 characters. Fill in only when the watermark type is text watermark.<br>Text watermark does not support screenshot watermarking.</p> 
     * @return TextContent <p>Text content, length not exceeding 100 characters. Fill in only when the watermark type is text watermark.<br>Text watermark does not support screenshot watermarking.</p>
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set <p>Text content, length not exceeding 100 characters. Fill in only when the watermark type is text watermark.<br>Text watermark does not support screenshot watermarking.</p>
     * @param TextContent <p>Text content, length not exceeding 100 characters. Fill in only when the watermark type is text watermark.<br>Text watermark does not support screenshot watermarking.</p>
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get <p>SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.<br>SVG watermark does not support screenshot watermarking.</p> 
     * @return SvgContent <p>SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.<br>SVG watermark does not support screenshot watermarking.</p>
     */
    public String getSvgContent() {
        return this.SvgContent;
    }

    /**
     * Set <p>SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.<br>SVG watermark does not support screenshot watermarking.</p>
     * @param SvgContent <p>SVG content. Length not exceeding 2000000 characters. Fill in only when the watermark type is SVG watermark.<br>SVG watermark does not support screenshot watermarking.</p>
     */
    public void setSvgContent(String SvgContent) {
        this.SvgContent = SvgContent;
    }

    /**
     * Get <p>Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.</p><li>If not set or set to 0, a watermark starts appearing when a video starts;</li><li>If the value is greater than 0 (assuming n), the watermark appears at second n after the video starts;</li><li>If the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshots do not support it. 
     * @return StartTimeOffset <p>Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.</p><li>If not set or set to 0, a watermark starts appearing when a video starts;</li><li>If the value is greater than 0 (assuming n), the watermark appears at second n after the video starts;</li><li>If the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshots do not support it.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.</p><li>If not set or set to 0, a watermark starts appearing when a video starts;</li><li>If the value is greater than 0 (assuming n), the watermark appears at second n after the video starts;</li><li>If the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshots do not support it.
     * @param StartTimeOffset <p>Start time offset of a watermark, in seconds. If not set or set to 0, a watermark starts appearing when a video starts.</p><li>If not set or set to 0, a watermark starts appearing when a video starts;</li><li>If the value is greater than 0 (assuming n), the watermark appears at second n after the video starts;</li><li>If the value is less than 0 (assuming -n), the watermark appears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshots do not support it.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>End time offset of a watermark, in seconds.</p><li>Leave empty or set to 0: the watermark lasts until the end of the video.</li><li>Value greater than 0 (assuming n): the watermark disappears at second n.</li><li>Value smaller than 0 (assuming -n): the watermark disappears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshot is not supported. 
     * @return EndTimeOffset <p>End time offset of a watermark, in seconds.</p><li>Leave empty or set to 0: the watermark lasts until the end of the video.</li><li>Value greater than 0 (assuming n): the watermark disappears at second n.</li><li>Value smaller than 0 (assuming -n): the watermark disappears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshot is not supported.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>End time offset of a watermark, in seconds.</p><li>Leave empty or set to 0: the watermark lasts until the end of the video.</li><li>Value greater than 0 (assuming n): the watermark disappears at second n.</li><li>Value smaller than 0 (assuming -n): the watermark disappears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshot is not supported.
     * @param EndTimeOffset <p>End time offset of a watermark, in seconds.</p><li>Leave empty or set to 0: the watermark lasts until the end of the video.</li><li>Value greater than 0 (assuming n): the watermark disappears at second n.</li><li>Value smaller than 0 (assuming -n): the watermark disappears n seconds before the end of the video.</li>Note: Only used for video scenes. Screenshot is not supported.
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

