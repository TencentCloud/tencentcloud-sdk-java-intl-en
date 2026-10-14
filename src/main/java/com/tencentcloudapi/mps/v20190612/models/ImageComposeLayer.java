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

public class ImageComposeLayer extends AbstractModel {

    /**
    * <p>Layer stacking sequence, required. It cannot be repeated in the same request. The larger the value, the higher the layer (it is recommended to start consecutive numbering from 0).</p>
    */
    @SerializedName("ZIndex")
    @Expose
    private Long ZIndex;

    /**
    * <p>Layer source, required. Supports URL / COS / AWS-S3 / VOD.</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>The position and size of the layer in the canvas. Required. An array of length 4 [X1, Y1, X2, Y2]: coordinates of the top-left and bottom-right corners. X2 > X1 and Y2 > Y1 are required.</p><p>Two semantics (aligned with the BoundingBox of the image removal capability):</p><ul><li>Pixel: coordinate values in the range of [-10240, 10240]. Negative values or values beyond the canvas are allowed (the excess part is cropped).</li><li>Ratio: each value ∈ [-1, 1], converted based on the canvas width and height (x multiplied by canvas width, y multiplied by canvas height).</li></ul><p>The layer is scaled to fill this rectangle. Any part beyond the canvas is cropped, and the output size is always equal to the canvas size.</p>
    */
    @SerializedName("BoundingBox")
    @Expose
    private Float [] BoundingBox;

    /**
    * <p>Coordinate unit, aligned with the image removal capacity. Values:</p><ul><li>0: automatic judgment (default value if not passed);</li><li>1: ratio;</li><li>2: pixel.</li></ul><p>Automatic judgment rules: if all four values are greater than 1, they are interpreted as pixels; if all are not greater than 1, they are interpreted as ratios. Mixed values will return InvalidParameter. It is recommended to always explicitly specify.</p>
    */
    @SerializedName("BoundingBoxUnitType")
    @Expose
    private Long BoundingBoxUnitType;

    /**
     * Get <p>Layer stacking sequence, required. It cannot be repeated in the same request. The larger the value, the higher the layer (it is recommended to start consecutive numbering from 0).</p> 
     * @return ZIndex <p>Layer stacking sequence, required. It cannot be repeated in the same request. The larger the value, the higher the layer (it is recommended to start consecutive numbering from 0).</p>
     */
    public Long getZIndex() {
        return this.ZIndex;
    }

    /**
     * Set <p>Layer stacking sequence, required. It cannot be repeated in the same request. The larger the value, the higher the layer (it is recommended to start consecutive numbering from 0).</p>
     * @param ZIndex <p>Layer stacking sequence, required. It cannot be repeated in the same request. The larger the value, the higher the layer (it is recommended to start consecutive numbering from 0).</p>
     */
    public void setZIndex(Long ZIndex) {
        this.ZIndex = ZIndex;
    }

    /**
     * Get <p>Layer source, required. Supports URL / COS / AWS-S3 / VOD.</p> 
     * @return InputInfo <p>Layer source, required. Supports URL / COS / AWS-S3 / VOD.</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>Layer source, required. Supports URL / COS / AWS-S3 / VOD.</p>
     * @param InputInfo <p>Layer source, required. Supports URL / COS / AWS-S3 / VOD.</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>The position and size of the layer in the canvas. Required. An array of length 4 [X1, Y1, X2, Y2]: coordinates of the top-left and bottom-right corners. X2 > X1 and Y2 > Y1 are required.</p><p>Two semantics (aligned with the BoundingBox of the image removal capability):</p><ul><li>Pixel: coordinate values in the range of [-10240, 10240]. Negative values or values beyond the canvas are allowed (the excess part is cropped).</li><li>Ratio: each value ∈ [-1, 1], converted based on the canvas width and height (x multiplied by canvas width, y multiplied by canvas height).</li></ul><p>The layer is scaled to fill this rectangle. Any part beyond the canvas is cropped, and the output size is always equal to the canvas size.</p> 
     * @return BoundingBox <p>The position and size of the layer in the canvas. Required. An array of length 4 [X1, Y1, X2, Y2]: coordinates of the top-left and bottom-right corners. X2 > X1 and Y2 > Y1 are required.</p><p>Two semantics (aligned with the BoundingBox of the image removal capability):</p><ul><li>Pixel: coordinate values in the range of [-10240, 10240]. Negative values or values beyond the canvas are allowed (the excess part is cropped).</li><li>Ratio: each value ∈ [-1, 1], converted based on the canvas width and height (x multiplied by canvas width, y multiplied by canvas height).</li></ul><p>The layer is scaled to fill this rectangle. Any part beyond the canvas is cropped, and the output size is always equal to the canvas size.</p>
     */
    public Float [] getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set <p>The position and size of the layer in the canvas. Required. An array of length 4 [X1, Y1, X2, Y2]: coordinates of the top-left and bottom-right corners. X2 > X1 and Y2 > Y1 are required.</p><p>Two semantics (aligned with the BoundingBox of the image removal capability):</p><ul><li>Pixel: coordinate values in the range of [-10240, 10240]. Negative values or values beyond the canvas are allowed (the excess part is cropped).</li><li>Ratio: each value ∈ [-1, 1], converted based on the canvas width and height (x multiplied by canvas width, y multiplied by canvas height).</li></ul><p>The layer is scaled to fill this rectangle. Any part beyond the canvas is cropped, and the output size is always equal to the canvas size.</p>
     * @param BoundingBox <p>The position and size of the layer in the canvas. Required. An array of length 4 [X1, Y1, X2, Y2]: coordinates of the top-left and bottom-right corners. X2 > X1 and Y2 > Y1 are required.</p><p>Two semantics (aligned with the BoundingBox of the image removal capability):</p><ul><li>Pixel: coordinate values in the range of [-10240, 10240]. Negative values or values beyond the canvas are allowed (the excess part is cropped).</li><li>Ratio: each value ∈ [-1, 1], converted based on the canvas width and height (x multiplied by canvas width, y multiplied by canvas height).</li></ul><p>The layer is scaled to fill this rectangle. Any part beyond the canvas is cropped, and the output size is always equal to the canvas size.</p>
     */
    public void setBoundingBox(Float [] BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get <p>Coordinate unit, aligned with the image removal capacity. Values:</p><ul><li>0: automatic judgment (default value if not passed);</li><li>1: ratio;</li><li>2: pixel.</li></ul><p>Automatic judgment rules: if all four values are greater than 1, they are interpreted as pixels; if all are not greater than 1, they are interpreted as ratios. Mixed values will return InvalidParameter. It is recommended to always explicitly specify.</p> 
     * @return BoundingBoxUnitType <p>Coordinate unit, aligned with the image removal capacity. Values:</p><ul><li>0: automatic judgment (default value if not passed);</li><li>1: ratio;</li><li>2: pixel.</li></ul><p>Automatic judgment rules: if all four values are greater than 1, they are interpreted as pixels; if all are not greater than 1, they are interpreted as ratios. Mixed values will return InvalidParameter. It is recommended to always explicitly specify.</p>
     */
    public Long getBoundingBoxUnitType() {
        return this.BoundingBoxUnitType;
    }

    /**
     * Set <p>Coordinate unit, aligned with the image removal capacity. Values:</p><ul><li>0: automatic judgment (default value if not passed);</li><li>1: ratio;</li><li>2: pixel.</li></ul><p>Automatic judgment rules: if all four values are greater than 1, they are interpreted as pixels; if all are not greater than 1, they are interpreted as ratios. Mixed values will return InvalidParameter. It is recommended to always explicitly specify.</p>
     * @param BoundingBoxUnitType <p>Coordinate unit, aligned with the image removal capacity. Values:</p><ul><li>0: automatic judgment (default value if not passed);</li><li>1: ratio;</li><li>2: pixel.</li></ul><p>Automatic judgment rules: if all four values are greater than 1, they are interpreted as pixels; if all are not greater than 1, they are interpreted as ratios. Mixed values will return InvalidParameter. It is recommended to always explicitly specify.</p>
     */
    public void setBoundingBoxUnitType(Long BoundingBoxUnitType) {
        this.BoundingBoxUnitType = BoundingBoxUnitType;
    }

    public ImageComposeLayer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageComposeLayer(ImageComposeLayer source) {
        if (source.ZIndex != null) {
            this.ZIndex = new Long(source.ZIndex);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.BoundingBox != null) {
            this.BoundingBox = new Float[source.BoundingBox.length];
            for (int i = 0; i < source.BoundingBox.length; i++) {
                this.BoundingBox[i] = new Float(source.BoundingBox[i]);
            }
        }
        if (source.BoundingBoxUnitType != null) {
            this.BoundingBoxUnitType = new Long(source.BoundingBoxUnitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZIndex", this.ZIndex);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamArraySimple(map, prefix + "BoundingBox.", this.BoundingBox);
        this.setParamSimple(map, prefix + "BoundingBoxUnitType", this.BoundingBoxUnitType);

    }
}

