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
    * <p>Top-left X-axis coordinate of the area.<br>For example, when Unit is 1, meaning percentage is used, 0.05 indicates the horizontal distance from the top-left corner of the area to the top-left corner of the entire frame is 5% of the frame width.</p>
    */
    @SerializedName("LeftTopX")
    @Expose
    private Float LeftTopX;

    /**
    * <p>Y-coordinate of the upper left corner of the region.<br>For example, when Unit is 1, meaning usage percentage, 0.1 indicates the vertical distance from the upper left corner of the region to the upper left corner of the entire frame is 10% of the screen height.</p>
    */
    @SerializedName("LeftTopY")
    @Expose
    private Float LeftTopY;

    /**
    * <p>X-coordinate of the bottom-right corner of the region.<br>For example, when Unit is 1, meaning percentage is used, 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
    */
    @SerializedName("RightBottomX")
    @Expose
    private Float RightBottomX;

    /**
    * <p>Y-coordinate of the region's bottom-right corner.<br>For example, when Unit is 1 (percentage), 0.9 means the vertical distance from the bottom-right corner of the region to the top-left corner of the entire frame is 90% of the screen height.</p>
    */
    @SerializedName("RightBottomY")
    @Expose
    private Float RightBottomY;

    /**
    * <p>Coordinate unit</p><ul><li>1 Percentage</li><li>2 Pixel value</li></ul>
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
     * Get <p>Top-left X-axis coordinate of the area.<br>For example, when Unit is 1, meaning percentage is used, 0.05 indicates the horizontal distance from the top-left corner of the area to the top-left corner of the entire frame is 5% of the frame width.</p> 
     * @return LeftTopX <p>Top-left X-axis coordinate of the area.<br>For example, when Unit is 1, meaning percentage is used, 0.05 indicates the horizontal distance from the top-left corner of the area to the top-left corner of the entire frame is 5% of the frame width.</p>
     */
    public Float getLeftTopX() {
        return this.LeftTopX;
    }

    /**
     * Set <p>Top-left X-axis coordinate of the area.<br>For example, when Unit is 1, meaning percentage is used, 0.05 indicates the horizontal distance from the top-left corner of the area to the top-left corner of the entire frame is 5% of the frame width.</p>
     * @param LeftTopX <p>Top-left X-axis coordinate of the area.<br>For example, when Unit is 1, meaning percentage is used, 0.05 indicates the horizontal distance from the top-left corner of the area to the top-left corner of the entire frame is 5% of the frame width.</p>
     */
    public void setLeftTopX(Float LeftTopX) {
        this.LeftTopX = LeftTopX;
    }

    /**
     * Get <p>Y-coordinate of the upper left corner of the region.<br>For example, when Unit is 1, meaning usage percentage, 0.1 indicates the vertical distance from the upper left corner of the region to the upper left corner of the entire frame is 10% of the screen height.</p> 
     * @return LeftTopY <p>Y-coordinate of the upper left corner of the region.<br>For example, when Unit is 1, meaning usage percentage, 0.1 indicates the vertical distance from the upper left corner of the region to the upper left corner of the entire frame is 10% of the screen height.</p>
     */
    public Float getLeftTopY() {
        return this.LeftTopY;
    }

    /**
     * Set <p>Y-coordinate of the upper left corner of the region.<br>For example, when Unit is 1, meaning usage percentage, 0.1 indicates the vertical distance from the upper left corner of the region to the upper left corner of the entire frame is 10% of the screen height.</p>
     * @param LeftTopY <p>Y-coordinate of the upper left corner of the region.<br>For example, when Unit is 1, meaning usage percentage, 0.1 indicates the vertical distance from the upper left corner of the region to the upper left corner of the entire frame is 10% of the screen height.</p>
     */
    public void setLeftTopY(Float LeftTopY) {
        this.LeftTopY = LeftTopY;
    }

    /**
     * Get <p>X-coordinate of the bottom-right corner of the region.<br>For example, when Unit is 1, meaning percentage is used, 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p> 
     * @return RightBottomX <p>X-coordinate of the bottom-right corner of the region.<br>For example, when Unit is 1, meaning percentage is used, 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
     */
    public Float getRightBottomX() {
        return this.RightBottomX;
    }

    /**
     * Set <p>X-coordinate of the bottom-right corner of the region.<br>For example, when Unit is 1, meaning percentage is used, 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
     * @param RightBottomX <p>X-coordinate of the bottom-right corner of the region.<br>For example, when Unit is 1, meaning percentage is used, 0.75 indicates the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
     */
    public void setRightBottomX(Float RightBottomX) {
        this.RightBottomX = RightBottomX;
    }

    /**
     * Get <p>Y-coordinate of the region's bottom-right corner.<br>For example, when Unit is 1 (percentage), 0.9 means the vertical distance from the bottom-right corner of the region to the top-left corner of the entire frame is 90% of the screen height.</p> 
     * @return RightBottomY <p>Y-coordinate of the region's bottom-right corner.<br>For example, when Unit is 1 (percentage), 0.9 means the vertical distance from the bottom-right corner of the region to the top-left corner of the entire frame is 90% of the screen height.</p>
     */
    public Float getRightBottomY() {
        return this.RightBottomY;
    }

    /**
     * Set <p>Y-coordinate of the region's bottom-right corner.<br>For example, when Unit is 1 (percentage), 0.9 means the vertical distance from the bottom-right corner of the region to the top-left corner of the entire frame is 90% of the screen height.</p>
     * @param RightBottomY <p>Y-coordinate of the region's bottom-right corner.<br>For example, when Unit is 1 (percentage), 0.9 means the vertical distance from the bottom-right corner of the region to the top-left corner of the entire frame is 90% of the screen height.</p>
     */
    public void setRightBottomY(Float RightBottomY) {
        this.RightBottomY = RightBottomY;
    }

    /**
     * Get <p>Coordinate unit</p><ul><li>1 Percentage</li><li>2 Pixel value</li></ul> 
     * @return Unit <p>Coordinate unit</p><ul><li>1 Percentage</li><li>2 Pixel value</li></ul>
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>Coordinate unit</p><ul><li>1 Percentage</li><li>2 Pixel value</li></ul>
     * @param Unit <p>Coordinate unit</p><ul><li>1 Percentage</li><li>2 Pixel value</li></ul>
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

