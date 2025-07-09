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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResultsResultDetailLocation extends AbstractModel {

    /**
    * This parameter is used to indicate the pixel position of the **abscissa (X)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * This parameter is used to indicate the pixel position of the **ordinate (Y)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
    * This parameter is used to indicate the **width of the OCR detection frame** (the length starting from the top-left corner and extending to the right on the X axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * This parameter is used to indicate the **height of the OCR detection frame** (the length starting from the top-left corner and extending down the Y axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * This parameter is used to indicate the **rotation angle of the OCR detection frame**. Valid values: **0–360** (**degrees**), and the direction is **counterclockwise rotation**. This parameter can be combined with the `X` and `Y` coordinate parameters to uniquely determine the specific position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rotate")
    @Expose
    private Float Rotate;

    /**
     * Get This parameter is used to indicate the pixel position of the **abscissa (X)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return X This parameter is used to indicate the pixel position of the **abscissa (X)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set This parameter is used to indicate the pixel position of the **abscissa (X)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param X This parameter is used to indicate the pixel position of the **abscissa (X)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get This parameter is used to indicate the pixel position of the **ordinate (Y)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Y This parameter is used to indicate the pixel position of the **ordinate (Y)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set This parameter is used to indicate the pixel position of the **ordinate (Y)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Y This parameter is used to indicate the pixel position of the **ordinate (Y)** of the top-left corner of the OCR detection frame. It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    /**
     * Get This parameter is used to indicate the **width of the OCR detection frame** (the length starting from the top-left corner and extending to the right on the X axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Width This parameter is used to indicate the **width of the OCR detection frame** (the length starting from the top-left corner and extending to the right on the X axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set This parameter is used to indicate the **width of the OCR detection frame** (the length starting from the top-left corner and extending to the right on the X axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Width This parameter is used to indicate the **width of the OCR detection frame** (the length starting from the top-left corner and extending to the right on the X axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get This parameter is used to indicate the **height of the OCR detection frame** (the length starting from the top-left corner and extending down the Y axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Height This parameter is used to indicate the **height of the OCR detection frame** (the length starting from the top-left corner and extending down the Y axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set This parameter is used to indicate the **height of the OCR detection frame** (the length starting from the top-left corner and extending down the Y axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Height This parameter is used to indicate the **height of the OCR detection frame** (the length starting from the top-left corner and extending down the Y axis). It can be combined with other parameters to uniquely determine the size and position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get This parameter is used to indicate the **rotation angle of the OCR detection frame**. Valid values: **0–360** (**degrees**), and the direction is **counterclockwise rotation**. This parameter can be combined with the `X` and `Y` coordinate parameters to uniquely determine the specific position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Rotate This parameter is used to indicate the **rotation angle of the OCR detection frame**. Valid values: **0–360** (**degrees**), and the direction is **counterclockwise rotation**. This parameter can be combined with the `X` and `Y` coordinate parameters to uniquely determine the specific position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getRotate() {
        return this.Rotate;
    }

    /**
     * Set This parameter is used to indicate the **rotation angle of the OCR detection frame**. Valid values: **0–360** (**degrees**), and the direction is **counterclockwise rotation**. This parameter can be combined with the `X` and `Y` coordinate parameters to uniquely determine the specific position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Rotate This parameter is used to indicate the **rotation angle of the OCR detection frame**. Valid values: **0–360** (**degrees**), and the direction is **counterclockwise rotation**. This parameter can be combined with the `X` and `Y` coordinate parameters to uniquely determine the specific position of the detection frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRotate(Float Rotate) {
        this.Rotate = Rotate;
    }

    public ImageResultsResultDetailLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageResultsResultDetailLocation(ImageResultsResultDetailLocation source) {
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Rotate != null) {
            this.Rotate = new Float(source.Rotate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);

    }
}

