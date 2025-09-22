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

public class EraseArea extends AbstractModel {

    /**
    * X-Axis coordinate of the upper left corner.
When Unit is set to 1 (percentage Unit), 0.05 indicates the horizontal distance from the upper left corner of the region to the top-left corner of the entire frame is 5% of the frame width.
    */
    @SerializedName("LeftTopX")
    @Expose
    private Float LeftTopX;

    /**
    * Y-Axis coordinate of the upper left corner.
When Unit is set to 1 (using percentage Unit), 0.1 indicates the vertical distance from the top-left corner of the area to the top-left corner of the entire frame is 10% of the screen height.
    */
    @SerializedName("LeftTopY")
    @Expose
    private Float LeftTopY;

    /**
    * X-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (percentage Unit), 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.
    */
    @SerializedName("RightBottomX")
    @Expose
    private Float RightBottomX;

    /**
    * Y-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (using percentage Unit), 0.9 indicates the vertical distance from the bottom-right corner of the area to the top-left corner of the entire frame is 90% of the screen height.
    */
    @SerializedName("RightBottomY")
    @Expose
    private Float RightBottomY;

    /**
    * Specifies the coordinate unit.
-Percentage.
-2 pixel values.
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
     * Get X-Axis coordinate of the upper left corner.
When Unit is set to 1 (percentage Unit), 0.05 indicates the horizontal distance from the upper left corner of the region to the top-left corner of the entire frame is 5% of the frame width. 
     * @return LeftTopX X-Axis coordinate of the upper left corner.
When Unit is set to 1 (percentage Unit), 0.05 indicates the horizontal distance from the upper left corner of the region to the top-left corner of the entire frame is 5% of the frame width.
     */
    public Float getLeftTopX() {
        return this.LeftTopX;
    }

    /**
     * Set X-Axis coordinate of the upper left corner.
When Unit is set to 1 (percentage Unit), 0.05 indicates the horizontal distance from the upper left corner of the region to the top-left corner of the entire frame is 5% of the frame width.
     * @param LeftTopX X-Axis coordinate of the upper left corner.
When Unit is set to 1 (percentage Unit), 0.05 indicates the horizontal distance from the upper left corner of the region to the top-left corner of the entire frame is 5% of the frame width.
     */
    public void setLeftTopX(Float LeftTopX) {
        this.LeftTopX = LeftTopX;
    }

    /**
     * Get Y-Axis coordinate of the upper left corner.
When Unit is set to 1 (using percentage Unit), 0.1 indicates the vertical distance from the top-left corner of the area to the top-left corner of the entire frame is 10% of the screen height. 
     * @return LeftTopY Y-Axis coordinate of the upper left corner.
When Unit is set to 1 (using percentage Unit), 0.1 indicates the vertical distance from the top-left corner of the area to the top-left corner of the entire frame is 10% of the screen height.
     */
    public Float getLeftTopY() {
        return this.LeftTopY;
    }

    /**
     * Set Y-Axis coordinate of the upper left corner.
When Unit is set to 1 (using percentage Unit), 0.1 indicates the vertical distance from the top-left corner of the area to the top-left corner of the entire frame is 10% of the screen height.
     * @param LeftTopY Y-Axis coordinate of the upper left corner.
When Unit is set to 1 (using percentage Unit), 0.1 indicates the vertical distance from the top-left corner of the area to the top-left corner of the entire frame is 10% of the screen height.
     */
    public void setLeftTopY(Float LeftTopY) {
        this.LeftTopY = LeftTopY;
    }

    /**
     * Get X-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (percentage Unit), 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width. 
     * @return RightBottomX X-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (percentage Unit), 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.
     */
    public Float getRightBottomX() {
        return this.RightBottomX;
    }

    /**
     * Set X-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (percentage Unit), 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.
     * @param RightBottomX X-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (percentage Unit), 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.
     */
    public void setRightBottomX(Float RightBottomX) {
        this.RightBottomX = RightBottomX;
    }

    /**
     * Get Y-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (using percentage Unit), 0.9 indicates the vertical distance from the bottom-right corner of the area to the top-left corner of the entire frame is 90% of the screen height. 
     * @return RightBottomY Y-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (using percentage Unit), 0.9 indicates the vertical distance from the bottom-right corner of the area to the top-left corner of the entire frame is 90% of the screen height.
     */
    public Float getRightBottomY() {
        return this.RightBottomY;
    }

    /**
     * Set Y-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (using percentage Unit), 0.9 indicates the vertical distance from the bottom-right corner of the area to the top-left corner of the entire frame is 90% of the screen height.
     * @param RightBottomY Y-Axis coordinate of the bottom-right corner.
When Unit is set to 1 (using percentage Unit), 0.9 indicates the vertical distance from the bottom-right corner of the area to the top-left corner of the entire frame is 90% of the screen height.
     */
    public void setRightBottomY(Float RightBottomY) {
        this.RightBottomY = RightBottomY;
    }

    /**
     * Get Specifies the coordinate unit.
-Percentage.
-2 pixel values. 
     * @return Unit Specifies the coordinate unit.
-Percentage.
-2 pixel values.
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set Specifies the coordinate unit.
-Percentage.
-2 pixel values.
     * @param Unit Specifies the coordinate unit.
-Percentage.
-2 pixel values.
     */
    public void setUnit(Long Unit) {
        this.Unit = Unit;
    }

    public EraseArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EraseArea(EraseArea source) {
        if (source.LeftTopX != null) {
            this.LeftTopX = new Float(source.LeftTopX);
        }
        if (source.LeftTopY != null) {
            this.LeftTopY = new Float(source.LeftTopY);
        }
        if (source.RightBottomX != null) {
            this.RightBottomX = new Float(source.RightBottomX);
        }
        if (source.RightBottomY != null) {
            this.RightBottomY = new Float(source.RightBottomY);
        }
        if (source.Unit != null) {
            this.Unit = new Long(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeftTopX", this.LeftTopX);
        this.setParamSimple(map, prefix + "LeftTopY", this.LeftTopY);
        this.setParamSimple(map, prefix + "RightBottomX", this.RightBottomX);
        this.setParamSimple(map, prefix + "RightBottomY", this.RightBottomY);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

