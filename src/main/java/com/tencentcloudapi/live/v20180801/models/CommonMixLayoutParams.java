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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixLayoutParams extends AbstractModel{

    /**
    * Input layer. Value range: [1,16]
(1) For the background stream, i.e., the room owner’s image or the canvas, set this parameter to `1`.
(2) This parameter is required for audio-only stream mixing as well.
Note that two inputs cannot have the same `ImageLayer` value.
    */
    @SerializedName("ImageLayer")
    @Expose
    private Long ImageLayer;

    /**
    * Input type. Value range: [0,5].
If this parameter is left empty, 0 will be used by default.
0: the input stream is audio/video.
2: the input stream is image.
3: the input stream is canvas. 
4: the input stream is audio.
5: the input stream is pure video.
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * Output height of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream height will be used by default.
If percentage is used, the expected output is (percentage * background height).
    */
    @SerializedName("ImageHeight")
    @Expose
    private Float ImageHeight;

    /**
    * Output width of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream width will be used by default.
If percentage is used, the expected output is (percentage * background width).
    */
    @SerializedName("ImageWidth")
    @Expose
    private Float ImageWidth;

    /**
    * X-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Horizontal offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width).
    */
    @SerializedName("LocationX")
    @Expose
    private Float LocationX;

    /**
    * Y-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Vertical offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width)
    */
    @SerializedName("LocationY")
    @Expose
    private Float LocationY;

    /**
    * When `InputType` is 3 (canvas), this value indicates the canvas color.
Commonly used colors include:
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * When `InputType` is 2 (image), this value is the watermark ID.
    */
    @SerializedName("WatermarkId")
    @Expose
    private Long WatermarkId;

    /**
     * Get Input layer. Value range: [1,16]
(1) For the background stream, i.e., the room owner’s image or the canvas, set this parameter to `1`.
(2) This parameter is required for audio-only stream mixing as well.
Note that two inputs cannot have the same `ImageLayer` value. 
     * @return ImageLayer Input layer. Value range: [1,16]
(1) For the background stream, i.e., the room owner’s image or the canvas, set this parameter to `1`.
(2) This parameter is required for audio-only stream mixing as well.
Note that two inputs cannot have the same `ImageLayer` value.
     */
    public Long getImageLayer() {
        return this.ImageLayer;
    }

    /**
     * Set Input layer. Value range: [1,16]
(1) For the background stream, i.e., the room owner’s image or the canvas, set this parameter to `1`.
(2) This parameter is required for audio-only stream mixing as well.
Note that two inputs cannot have the same `ImageLayer` value.
     * @param ImageLayer Input layer. Value range: [1,16]
(1) For the background stream, i.e., the room owner’s image or the canvas, set this parameter to `1`.
(2) This parameter is required for audio-only stream mixing as well.
Note that two inputs cannot have the same `ImageLayer` value.
     */
    public void setImageLayer(Long ImageLayer) {
        this.ImageLayer = ImageLayer;
    }

    /**
     * Get Input type. Value range: [0,5].
If this parameter is left empty, 0 will be used by default.
0: the input stream is audio/video.
2: the input stream is image.
3: the input stream is canvas. 
4: the input stream is audio.
5: the input stream is pure video. 
     * @return InputType Input type. Value range: [0,5].
If this parameter is left empty, 0 will be used by default.
0: the input stream is audio/video.
2: the input stream is image.
3: the input stream is canvas. 
4: the input stream is audio.
5: the input stream is pure video.
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set Input type. Value range: [0,5].
If this parameter is left empty, 0 will be used by default.
0: the input stream is audio/video.
2: the input stream is image.
3: the input stream is canvas. 
4: the input stream is audio.
5: the input stream is pure video.
     * @param InputType Input type. Value range: [0,5].
If this parameter is left empty, 0 will be used by default.
0: the input stream is audio/video.
2: the input stream is image.
3: the input stream is canvas. 
4: the input stream is audio.
5: the input stream is pure video.
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get Output height of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream height will be used by default.
If percentage is used, the expected output is (percentage * background height). 
     * @return ImageHeight Output height of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream height will be used by default.
If percentage is used, the expected output is (percentage * background height).
     */
    public Float getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set Output height of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream height will be used by default.
If percentage is used, the expected output is (percentage * background height).
     * @param ImageHeight Output height of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream height will be used by default.
If percentage is used, the expected output is (percentage * background height).
     */
    public void setImageHeight(Float ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get Output width of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream width will be used by default.
If percentage is used, the expected output is (percentage * background width). 
     * @return ImageWidth Output width of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream width will be used by default.
If percentage is used, the expected output is (percentage * background width).
     */
    public Float getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set Output width of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream width will be used by default.
If percentage is used, the expected output is (percentage * background width).
     * @param ImageWidth Output width of input video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, the input stream width will be used by default.
If percentage is used, the expected output is (percentage * background width).
     */
    public void setImageWidth(Float ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get X-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Horizontal offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width). 
     * @return LocationX X-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Horizontal offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width).
     */
    public Float getLocationX() {
        return this.LocationX;
    }

    /**
     * Set X-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Horizontal offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width).
     * @param LocationX X-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Horizontal offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width).
     */
    public void setLocationX(Float LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get Y-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Vertical offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width) 
     * @return LocationY Y-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Vertical offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width)
     */
    public Float getLocationY() {
        return this.LocationY;
    }

    /**
     * Set Y-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Vertical offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width)
     * @param LocationY Y-axis offset of input in output video image. Value range:
Pixel: [0,2000]
Percentage: [0.01,0.99]
If this parameter is left empty, 0 will be used by default.
Vertical offset from the top-left corner of main host background video image. 
If percentage is used, the expected output is (percentage * background width)
     */
    public void setLocationY(Float LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get When `InputType` is 3 (canvas), this value indicates the canvas color.
Commonly used colors include:
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999 
     * @return Color When `InputType` is 3 (canvas), this value indicates the canvas color.
Commonly used colors include:
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set When `InputType` is 3 (canvas), this value indicates the canvas color.
Commonly used colors include:
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999
     * @param Color When `InputType` is 3 (canvas), this value indicates the canvas color.
Commonly used colors include:
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get When `InputType` is 2 (image), this value is the watermark ID. 
     * @return WatermarkId When `InputType` is 2 (image), this value is the watermark ID.
     */
    public Long getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set When `InputType` is 2 (image), this value is the watermark ID.
     * @param WatermarkId When `InputType` is 2 (image), this value is the watermark ID.
     */
    public void setWatermarkId(Long WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    public CommonMixLayoutParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMixLayoutParams(CommonMixLayoutParams source) {
        if (source.ImageLayer != null) {
            this.ImageLayer = new Long(source.ImageLayer);
        }
        if (source.InputType != null) {
            this.InputType = new Long(source.InputType);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Float(source.ImageHeight);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Float(source.ImageWidth);
        }
        if (source.LocationX != null) {
            this.LocationX = new Float(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Float(source.LocationY);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.WatermarkId != null) {
            this.WatermarkId = new Long(source.WatermarkId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageLayer", this.ImageLayer);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);

    }
}

