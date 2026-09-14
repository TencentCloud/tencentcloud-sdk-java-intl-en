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

public class MosaicInput extends AbstractModel {

    /**
    * <p>Origin position. Currently, only the following is supported:</p><li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>Default value: TopLeft.
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * <p>Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width;</li><li>If a string ends with px, the mosaic XPos is a specified pixel. For example, 100px means XPos is 100 pixels.</li>Default value: 0px.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * <p>Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.</li><li>If a string ends with px, the mosaic YPos is the specified pixel. For example, 100px means YPos is 100 pixels.</li>Default value: 0px.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * <p>Mosaic width. Supports two formats: % and px:</p><li>If a string ends with %, it indicates that the mosaic `Width` is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li><li>If a string ends with px, it indicates that the mosaic `Width` is in pixels. For example, `100px` means that `Width` is 100 pixels.</li>Default value: 10%.
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * <p>Height of a mosaic. Two formats are supported: % and px.</p><li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li><li>If a string ends with px, it indicates that the `Height` of a mosaic is in pixels. For example, `100px` means that `Height` is 100 pixels.</li>Default value: 10%.
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * <p>Start time offset of mosaic, in seconds. If not specified or set to 0, the mosaic appears when the frame appears.</p><li>If not specified or set to 0, the mosaic appears from the start of the frame;</li><li>If the value is greater than 0 (assuming n), the mosaic appears at the nth second from the start of the frame;</li><li>If the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of the frame.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>End time offset of mosaic, in seconds.</p><li>If not specified or set to 0, the mosaic lasts until the end of a video;</li><li>If the value is greater than 0 (assuming n), the mosaic disappears at second n;</li><li>If the value is less than 0 (assuming -n), the mosaic disappears n seconds before the end of a video.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get <p>Origin position. Currently, only the following is supported:</p><li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>Default value: TopLeft. 
     * @return CoordinateOrigin <p>Origin position. Currently, only the following is supported:</p><li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>Default value: TopLeft.
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set <p>Origin position. Currently, only the following is supported:</p><li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>Default value: TopLeft.
     * @param CoordinateOrigin <p>Origin position. Currently, only the following is supported:</p><li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the mosaic origin is at the top left corner of the image or text.</li>Default value: TopLeft.
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get <p>Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width;</li><li>If a string ends with px, the mosaic XPos is a specified pixel. For example, 100px means XPos is 100 pixels.</li>Default value: 0px. 
     * @return XPos <p>Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width;</li><li>If a string ends with px, the mosaic XPos is a specified pixel. For example, 100px means XPos is 100 pixels.</li>Default value: 0px.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set <p>Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width;</li><li>If a string ends with px, the mosaic XPos is a specified pixel. For example, 100px means XPos is 100 pixels.</li>Default value: 0px.
     * @param XPos <p>Horizontal position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width;</li><li>If a string ends with px, the mosaic XPos is a specified pixel. For example, 100px means XPos is 100 pixels.</li>Default value: 0px.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get <p>Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.</li><li>If a string ends with px, the mosaic YPos is the specified pixel. For example, 100px means YPos is 100 pixels.</li>Default value: 0px. 
     * @return YPos <p>Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.</li><li>If a string ends with px, the mosaic YPos is the specified pixel. For example, 100px means YPos is 100 pixels.</li>Default value: 0px.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set <p>Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.</li><li>If a string ends with px, the mosaic YPos is the specified pixel. For example, 100px means YPos is 100 pixels.</li>Default value: 0px.
     * @param YPos <p>Vertical position of the mosaic origin relative to the origin of coordinates of the video image. Supports two formats: % and px:</p><li>If a string ends with %, the mosaic YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.</li><li>If a string ends with px, the mosaic YPos is the specified pixel. For example, 100px means YPos is 100 pixels.</li>Default value: 0px.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get <p>Mosaic width. Supports two formats: % and px:</p><li>If a string ends with %, it indicates that the mosaic `Width` is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li><li>If a string ends with px, it indicates that the mosaic `Width` is in pixels. For example, `100px` means that `Width` is 100 pixels.</li>Default value: 10%. 
     * @return Width <p>Mosaic width. Supports two formats: % and px:</p><li>If a string ends with %, it indicates that the mosaic `Width` is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li><li>If a string ends with px, it indicates that the mosaic `Width` is in pixels. For example, `100px` means that `Width` is 100 pixels.</li>Default value: 10%.
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Mosaic width. Supports two formats: % and px:</p><li>If a string ends with %, it indicates that the mosaic `Width` is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li><li>If a string ends with px, it indicates that the mosaic `Width` is in pixels. For example, `100px` means that `Width` is 100 pixels.</li>Default value: 10%.
     * @param Width <p>Mosaic width. Supports two formats: % and px:</p><li>If a string ends with %, it indicates that the mosaic `Width` is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li><li>If a string ends with px, it indicates that the mosaic `Width` is in pixels. For example, `100px` means that `Width` is 100 pixels.</li>Default value: 10%.
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get <p>Height of a mosaic. Two formats are supported: % and px.</p><li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li><li>If a string ends with px, it indicates that the `Height` of a mosaic is in pixels. For example, `100px` means that `Height` is 100 pixels.</li>Default value: 10%. 
     * @return Height <p>Height of a mosaic. Two formats are supported: % and px.</p><li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li><li>If a string ends with px, it indicates that the `Height` of a mosaic is in pixels. For example, `100px` means that `Height` is 100 pixels.</li>Default value: 10%.
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Height of a mosaic. Two formats are supported: % and px.</p><li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li><li>If a string ends with px, it indicates that the `Height` of a mosaic is in pixels. For example, `100px` means that `Height` is 100 pixels.</li>Default value: 10%.
     * @param Height <p>Height of a mosaic. Two formats are supported: % and px.</p><li>If a string ends with %, it indicates that the `Height` of a mosaic is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li><li>If a string ends with px, it indicates that the `Height` of a mosaic is in pixels. For example, `100px` means that `Height` is 100 pixels.</li>Default value: 10%.
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Start time offset of mosaic, in seconds. If not specified or set to 0, the mosaic appears when the frame appears.</p><li>If not specified or set to 0, the mosaic appears from the start of the frame;</li><li>If the value is greater than 0 (assuming n), the mosaic appears at the nth second from the start of the frame;</li><li>If the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of the frame.</li> 
     * @return StartTimeOffset <p>Start time offset of mosaic, in seconds. If not specified or set to 0, the mosaic appears when the frame appears.</p><li>If not specified or set to 0, the mosaic appears from the start of the frame;</li><li>If the value is greater than 0 (assuming n), the mosaic appears at the nth second from the start of the frame;</li><li>If the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of the frame.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>Start time offset of mosaic, in seconds. If not specified or set to 0, the mosaic appears when the frame appears.</p><li>If not specified or set to 0, the mosaic appears from the start of the frame;</li><li>If the value is greater than 0 (assuming n), the mosaic appears at the nth second from the start of the frame;</li><li>If the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of the frame.</li>
     * @param StartTimeOffset <p>Start time offset of mosaic, in seconds. If not specified or set to 0, the mosaic appears when the frame appears.</p><li>If not specified or set to 0, the mosaic appears from the start of the frame;</li><li>If the value is greater than 0 (assuming n), the mosaic appears at the nth second from the start of the frame;</li><li>If the value is less than 0 (assuming -n), the mosaic appears n seconds before the end of the frame.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>End time offset of mosaic, in seconds.</p><li>If not specified or set to 0, the mosaic lasts until the end of a video;</li><li>If the value is greater than 0 (assuming n), the mosaic disappears at second n;</li><li>If the value is less than 0 (assuming -n), the mosaic disappears n seconds before the end of a video.</li> 
     * @return EndTimeOffset <p>End time offset of mosaic, in seconds.</p><li>If not specified or set to 0, the mosaic lasts until the end of a video;</li><li>If the value is greater than 0 (assuming n), the mosaic disappears at second n;</li><li>If the value is less than 0 (assuming -n), the mosaic disappears n seconds before the end of a video.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>End time offset of mosaic, in seconds.</p><li>If not specified or set to 0, the mosaic lasts until the end of a video;</li><li>If the value is greater than 0 (assuming n), the mosaic disappears at second n;</li><li>If the value is less than 0 (assuming -n), the mosaic disappears n seconds before the end of a video.</li>
     * @param EndTimeOffset <p>End time offset of mosaic, in seconds.</p><li>If not specified or set to 0, the mosaic lasts until the end of a video;</li><li>If the value is greater than 0 (assuming n), the mosaic disappears at second n;</li><li>If the value is less than 0 (assuming -n), the mosaic disappears n seconds before the end of a video.</li>
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

