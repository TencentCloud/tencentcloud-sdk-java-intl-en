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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayoutParams extends AbstractModel{

    /**
    * Stream image width. Value range: [2,3000]
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Stream image height. Value range: [2,3000]
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Offset of the top point in the upper-left corner of the current image to the X axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Offset of the top point in the upper-left corner of the current image to the Y axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Z-axis position of the image. The default value is 0.
The Z axis determines the overlap sequence of images. The image with the largest z-axis value is at the top layer.
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
     * Get Stream image width. Value range: [2,3000] 
     * @return Width Stream image width. Value range: [2,3000]
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Stream image width. Value range: [2,3000]
     * @param Width Stream image width. Value range: [2,3000]
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Stream image height. Value range: [2,3000] 
     * @return Height Stream image height. Value range: [2,3000]
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Stream image height. Value range: [2,3000]
     * @param Height Stream image height. Value range: [2,3000]
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Offset of the top point in the upper-left corner of the current image to the X axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000]. 
     * @return X Offset of the top point in the upper-left corner of the current image to the X axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set Offset of the top point in the upper-left corner of the current image to the X axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
     * @param X Offset of the top point in the upper-left corner of the current image to the X axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Offset of the top point in the upper-left corner of the current image to the Y axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000]. 
     * @return Y Offset of the top point in the upper-left corner of the current image to the Y axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Offset of the top point in the upper-left corner of the current image to the Y axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
     * @param Y Offset of the top point in the upper-left corner of the current image to the Y axis of the top point in the upper-left corner of the canvas. Default value: 0. Value range: [0,3000].
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Z-axis position of the image. The default value is 0.
The Z axis determines the overlap sequence of images. The image with the largest z-axis value is at the top layer. 
     * @return ZOrder Z-axis position of the image. The default value is 0.
The Z axis determines the overlap sequence of images. The image with the largest z-axis value is at the top layer.
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set Z-axis position of the image. The default value is 0.
The Z axis determines the overlap sequence of images. The image with the largest z-axis value is at the top layer.
     * @param ZOrder Z-axis position of the image. The default value is 0.
The Z axis determines the overlap sequence of images. The image with the largest z-axis value is at the top layer.
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);

    }
}

