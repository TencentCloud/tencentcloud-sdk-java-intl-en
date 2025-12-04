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

public class ImageAreaBoxInfo extends AbstractModel {

    /**
    * Type of the box selection area in the image. Valid values:
<li>logo: icon.</li>
<li>Text: text.</li>
Default value: logo.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Coordinates (pixel-level) of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. Note: The maximum value of this field is 4096.
For example, [101, 85, 111, 95].
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Coordinates of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. This field takes effect when AreaCoordSet is not specified. When it indicates the pixel, the maximum value of this field is 4096.
- [0.1, 0.1, 0.3, 0.3]: indicates the ratio (values are less than 1).
- [50, 50, 350, 280]: indicates the pixel (values are greater than or equal to 1).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BoundingBox")
    @Expose
    private Float [] BoundingBox;

    /**
    * BoundingBox field unit. When the value is set to 0, select the unit automatically according to the field rule. When it is set to 1, the unit is ratio. When it is set to 2, the unit is pixel.
    */
    @SerializedName("BoundingBoxUnitType")
    @Expose
    private Long BoundingBoxUnitType;

    /**
     * Get Type of the box selection area in the image. Valid values:
<li>logo: icon.</li>
<li>Text: text.</li>
Default value: logo.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Type of the box selection area in the image. Valid values:
<li>logo: icon.</li>
<li>Text: text.</li>
Default value: logo.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the box selection area in the image. Valid values:
<li>logo: icon.</li>
<li>Text: text.</li>
Default value: logo.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type Type of the box selection area in the image. Valid values:
<li>logo: icon.</li>
<li>Text: text.</li>
Default value: logo.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Coordinates (pixel-level) of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. Note: The maximum value of this field is 4096.
For example, [101, 85, 111, 95].
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AreaCoordSet Coordinates (pixel-level) of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. Note: The maximum value of this field is 4096.
For example, [101, 85, 111, 95].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Coordinates (pixel-level) of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. Note: The maximum value of this field is 4096.
For example, [101, 85, 111, 95].
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AreaCoordSet Coordinates (pixel-level) of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. Note: The maximum value of this field is 4096.
For example, [101, 85, 111, 95].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Coordinates of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. This field takes effect when AreaCoordSet is not specified. When it indicates the pixel, the maximum value of this field is 4096.
- [0.1, 0.1, 0.3, 0.3]: indicates the ratio (values are less than 1).
- [50, 50, 350, 280]: indicates the pixel (values are greater than or equal to 1).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BoundingBox Coordinates of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. This field takes effect when AreaCoordSet is not specified. When it indicates the pixel, the maximum value of this field is 4096.
- [0.1, 0.1, 0.3, 0.3]: indicates the ratio (values are less than 1).
- [50, 50, 350, 280]: indicates the pixel (values are greater than or equal to 1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float [] getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set Coordinates of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. This field takes effect when AreaCoordSet is not specified. When it indicates the pixel, the maximum value of this field is 4096.
- [0.1, 0.1, 0.3, 0.3]: indicates the ratio (values are less than 1).
- [50, 50, 350, 280]: indicates the pixel (values are greater than or equal to 1).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BoundingBox Coordinates of the box selection area in the image, in the format of [x1, y1, x2, y2]. It indicates the coordinates of the top left corner and the bottom right corner. This field takes effect when AreaCoordSet is not specified. When it indicates the pixel, the maximum value of this field is 4096.
- [0.1, 0.1, 0.3, 0.3]: indicates the ratio (values are less than 1).
- [50, 50, 350, 280]: indicates the pixel (values are greater than or equal to 1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBoundingBox(Float [] BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get BoundingBox field unit. When the value is set to 0, select the unit automatically according to the field rule. When it is set to 1, the unit is ratio. When it is set to 2, the unit is pixel. 
     * @return BoundingBoxUnitType BoundingBox field unit. When the value is set to 0, select the unit automatically according to the field rule. When it is set to 1, the unit is ratio. When it is set to 2, the unit is pixel.
     */
    public Long getBoundingBoxUnitType() {
        return this.BoundingBoxUnitType;
    }

    /**
     * Set BoundingBox field unit. When the value is set to 0, select the unit automatically according to the field rule. When it is set to 1, the unit is ratio. When it is set to 2, the unit is pixel.
     * @param BoundingBoxUnitType BoundingBox field unit. When the value is set to 0, select the unit automatically according to the field rule. When it is set to 1, the unit is ratio. When it is set to 2, the unit is pixel.
     */
    public void setBoundingBoxUnitType(Long BoundingBoxUnitType) {
        this.BoundingBoxUnitType = BoundingBoxUnitType;
    }

    public ImageAreaBoxInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAreaBoxInfo(ImageAreaBoxInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamArraySimple(map, prefix + "BoundingBox.", this.BoundingBox);
        this.setParamSimple(map, prefix + "BoundingBoxUnitType", this.BoundingBoxUnitType);

    }
}

