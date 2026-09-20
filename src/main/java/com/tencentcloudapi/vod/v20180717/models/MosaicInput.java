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

public class MosaicInput extends AbstractModel {

    /**
    * Origin position. Currently only support:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>
Default value: TopLeft.
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a mosaic is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic XPos is specified in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a mosaic is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the mosaic YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Width of the mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a mosaic is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * Height of a mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the unit for the mosaic Height is pixel. For example, 100px means the Height is 100 pixels.</li>
Default value: 10%.
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Start time offset of a mosaic, in seconds. If not set or set to 0, a mosaic starts appearing when a video starts.
<li>If not set or set to 0, a mosaic starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a mosaic will appear at second n of a frame.</li>
<li>When the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of a video.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a mosaic, in seconds.
<li>If not set or set to 0, a mosaic will last until the end of a frame.</li>
<li>If the value is greater than 0 (for example, n), the mosaic will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the mosaic lasts until n seconds before the end of a video.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Origin position. Currently only support:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>
Default value: TopLeft. 
     * @return CoordinateOrigin Origin position. Currently only support:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>
Default value: TopLeft.
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set Origin position. Currently only support:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>
Default value: TopLeft.
     * @param CoordinateOrigin Origin position. Currently only support:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>
Default value: TopLeft.
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a mosaic is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic XPos is specified in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px. 
     * @return XPos Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a mosaic is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic XPos is specified in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a mosaic is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic XPos is specified in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
     * @param XPos Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a mosaic is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic XPos is specified in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a mosaic is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the mosaic YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px. 
     * @return YPos Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a mosaic is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the mosaic YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a mosaic is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the mosaic YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     * @param YPos Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a mosaic is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the mosaic YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Width of the mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a mosaic is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%. 
     * @return Width Width of the mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a mosaic is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set Width of the mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a mosaic is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
     * @param Width Width of the mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a mosaic is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the mosaic Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get Height of a mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the unit for the mosaic Height is pixel. For example, 100px means the Height is 100 pixels.</li>
Default value: 10%. 
     * @return Height Height of a mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the unit for the mosaic Height is pixel. For example, 100px means the Height is 100 pixels.</li>
Default value: 10%.
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the unit for the mosaic Height is pixel. For example, 100px means the Height is 100 pixels.</li>
Default value: 10%.
     * @param Height Height of a mosaic, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the unit for the mosaic Height is pixel. For example, 100px means the Height is 100 pixels.</li>
Default value: 10%.
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Start time offset of a mosaic, in seconds. If not set or set to 0, a mosaic starts appearing when a video starts.
<li>If not set or set to 0, a mosaic starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a mosaic will appear at second n of a frame.</li>
<li>When the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of a video.</li> 
     * @return StartTimeOffset Start time offset of a mosaic, in seconds. If not set or set to 0, a mosaic starts appearing when a video starts.
<li>If not set or set to 0, a mosaic starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a mosaic will appear at second n of a frame.</li>
<li>When the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of a video.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a mosaic, in seconds. If not set or set to 0, a mosaic starts appearing when a video starts.
<li>If not set or set to 0, a mosaic starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a mosaic will appear at second n of a frame.</li>
<li>When the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of a video.</li>
     * @param StartTimeOffset Start time offset of a mosaic, in seconds. If not set or set to 0, a mosaic starts appearing when a video starts.
<li>If not set or set to 0, a mosaic starts appearing when a video starts.</li>
<li>If the value is greater than 0 (for example, n), a mosaic will appear at second n of a frame.</li>
<li>When the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of a video.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a mosaic, in seconds.
<li>If not set or set to 0, a mosaic will last until the end of a frame.</li>
<li>If the value is greater than 0 (for example, n), the mosaic will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the mosaic lasts until n seconds before the end of a video.</li> 
     * @return EndTimeOffset End time offset of a mosaic, in seconds.
<li>If not set or set to 0, a mosaic will last until the end of a frame.</li>
<li>If the value is greater than 0 (for example, n), the mosaic will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the mosaic lasts until n seconds before the end of a video.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a mosaic, in seconds.
<li>If not set or set to 0, a mosaic will last until the end of a frame.</li>
<li>If the value is greater than 0 (for example, n), the mosaic will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the mosaic lasts until n seconds before the end of a video.</li>
     * @param EndTimeOffset End time offset of a mosaic, in seconds.
<li>If not set or set to 0, a mosaic will last until the end of a frame.</li>
<li>If the value is greater than 0 (for example, n), the mosaic will disappear at second n.</li>
<li>When the value is less than 0 (assuming -n), the mosaic lasts until n seconds before the end of a video.</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public MosaicInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MosaicInput(MosaicInput source) {
        if (source.CoordinateOrigin != null) {
            this.CoordinateOrigin = new String(source.CoordinateOrigin);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
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
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

