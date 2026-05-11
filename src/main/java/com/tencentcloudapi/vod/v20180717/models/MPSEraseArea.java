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

public class MPSEraseArea extends AbstractModel {

    /**
    * <p>Top-left X-axis coordinate of the region. When Unit is set to 1 (using percentage unit), 0.05 means the horizontal distance from the top-left corner of the region to the top-left corner of the entire image is 5% of the image width.</p>
    */
    @SerializedName("LeftTopX")
    @Expose
    private Float LeftTopX;

    /**
    * <p>Y-axis coordinate of the top-left corner. For example, when Unit is set to 1 (using percentage), 0.1 means the vertical distance from the top-left corner of the region to the top-left corner of the entire frame is 10% of the screen height.</p>
    */
    @SerializedName("LeftTopY")
    @Expose
    private Float LeftTopY;

    /**
    * <p>X coordinate of the bottom-right corner of the region. For example, when Unit is 1 (using percentage as the measurement unit), 0.75 means the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
    */
    @SerializedName("RightBottomX")
    @Expose
    private Float RightBottomX;

    /**
    * <p>Y-axis coordinate of the bottom-right corner. For example, when Unit is 1 (using percentage), 0.9 means the vertical distance from the top-left corner to the bottom-right corner is 90% of the screen height.</p>
    */
    @SerializedName("RightBottomY")
    @Expose
    private Float RightBottomY;

    /**
    * <p>Coordinate unit - 1 percentage - 2 pixel value</p>
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
     * Get <p>Top-left X-axis coordinate of the region. When Unit is set to 1 (using percentage unit), 0.05 means the horizontal distance from the top-left corner of the region to the top-left corner of the entire image is 5% of the image width.</p> 
     * @return LeftTopX <p>Top-left X-axis coordinate of the region. When Unit is set to 1 (using percentage unit), 0.05 means the horizontal distance from the top-left corner of the region to the top-left corner of the entire image is 5% of the image width.</p>
     */
    public Float getLeftTopX() {
        return this.LeftTopX;
    }

    /**
     * Set <p>Top-left X-axis coordinate of the region. When Unit is set to 1 (using percentage unit), 0.05 means the horizontal distance from the top-left corner of the region to the top-left corner of the entire image is 5% of the image width.</p>
     * @param LeftTopX <p>Top-left X-axis coordinate of the region. When Unit is set to 1 (using percentage unit), 0.05 means the horizontal distance from the top-left corner of the region to the top-left corner of the entire image is 5% of the image width.</p>
     */
    public void setLeftTopX(Float LeftTopX) {
        this.LeftTopX = LeftTopX;
    }

    /**
     * Get <p>Y-axis coordinate of the top-left corner. For example, when Unit is set to 1 (using percentage), 0.1 means the vertical distance from the top-left corner of the region to the top-left corner of the entire frame is 10% of the screen height.</p> 
     * @return LeftTopY <p>Y-axis coordinate of the top-left corner. For example, when Unit is set to 1 (using percentage), 0.1 means the vertical distance from the top-left corner of the region to the top-left corner of the entire frame is 10% of the screen height.</p>
     */
    public Float getLeftTopY() {
        return this.LeftTopY;
    }

    /**
     * Set <p>Y-axis coordinate of the top-left corner. For example, when Unit is set to 1 (using percentage), 0.1 means the vertical distance from the top-left corner of the region to the top-left corner of the entire frame is 10% of the screen height.</p>
     * @param LeftTopY <p>Y-axis coordinate of the top-left corner. For example, when Unit is set to 1 (using percentage), 0.1 means the vertical distance from the top-left corner of the region to the top-left corner of the entire frame is 10% of the screen height.</p>
     */
    public void setLeftTopY(Float LeftTopY) {
        this.LeftTopY = LeftTopY;
    }

    /**
     * Get <p>X coordinate of the bottom-right corner of the region. For example, when Unit is 1 (using percentage as the measurement unit), 0.75 means the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p> 
     * @return RightBottomX <p>X coordinate of the bottom-right corner of the region. For example, when Unit is 1 (using percentage as the measurement unit), 0.75 means the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
     */
    public Float getRightBottomX() {
        return this.RightBottomX;
    }

    /**
     * Set <p>X coordinate of the bottom-right corner of the region. For example, when Unit is 1 (using percentage as the measurement unit), 0.75 means the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
     * @param RightBottomX <p>X coordinate of the bottom-right corner of the region. For example, when Unit is 1 (using percentage as the measurement unit), 0.75 means the horizontal distance from the bottom-right corner of the region to the top-left corner of the entire frame is 75% of the frame width.</p>
     */
    public void setRightBottomX(Float RightBottomX) {
        this.RightBottomX = RightBottomX;
    }

    /**
     * Get <p>Y-axis coordinate of the bottom-right corner. For example, when Unit is 1 (using percentage), 0.9 means the vertical distance from the top-left corner to the bottom-right corner is 90% of the screen height.</p> 
     * @return RightBottomY <p>Y-axis coordinate of the bottom-right corner. For example, when Unit is 1 (using percentage), 0.9 means the vertical distance from the top-left corner to the bottom-right corner is 90% of the screen height.</p>
     */
    public Float getRightBottomY() {
        return this.RightBottomY;
    }

    /**
     * Set <p>Y-axis coordinate of the bottom-right corner. For example, when Unit is 1 (using percentage), 0.9 means the vertical distance from the top-left corner to the bottom-right corner is 90% of the screen height.</p>
     * @param RightBottomY <p>Y-axis coordinate of the bottom-right corner. For example, when Unit is 1 (using percentage), 0.9 means the vertical distance from the top-left corner to the bottom-right corner is 90% of the screen height.</p>
     */
    public void setRightBottomY(Float RightBottomY) {
        this.RightBottomY = RightBottomY;
    }

    /**
     * Get <p>Coordinate unit - 1 percentage - 2 pixel value</p> 
     * @return Unit <p>Coordinate unit - 1 percentage - 2 pixel value</p>
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>Coordinate unit - 1 percentage - 2 pixel value</p>
     * @param Unit <p>Coordinate unit - 1 percentage - 2 pixel value</p>
     */
    public void setUnit(Long Unit) {
        this.Unit = Unit;
    }

    public MPSEraseArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSEraseArea(MPSEraseArea source) {
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

