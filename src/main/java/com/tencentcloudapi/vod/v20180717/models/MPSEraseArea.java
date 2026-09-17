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
    * 
    */
    @SerializedName("LeftTopX")
    @Expose
    private Float LeftTopX;

    /**
    * 
    */
    @SerializedName("LeftTopY")
    @Expose
    private Float LeftTopY;

    /**
    * 
    */
    @SerializedName("RightBottomX")
    @Expose
    private Float RightBottomX;

    /**
    * 
    */
    @SerializedName("RightBottomY")
    @Expose
    private Float RightBottomY;

    /**
    * 
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
     * Get  
     * @return LeftTopX 
     */
    public Float getLeftTopX() {
        return this.LeftTopX;
    }

    /**
     * Set 
     * @param LeftTopX 
     */
    public void setLeftTopX(Float LeftTopX) {
        this.LeftTopX = LeftTopX;
    }

    /**
     * Get  
     * @return LeftTopY 
     */
    public Float getLeftTopY() {
        return this.LeftTopY;
    }

    /**
     * Set 
     * @param LeftTopY 
     */
    public void setLeftTopY(Float LeftTopY) {
        this.LeftTopY = LeftTopY;
    }

    /**
     * Get  
     * @return RightBottomX 
     */
    public Float getRightBottomX() {
        return this.RightBottomX;
    }

    /**
     * Set 
     * @param RightBottomX 
     */
    public void setRightBottomX(Float RightBottomX) {
        this.RightBottomX = RightBottomX;
    }

    /**
     * Get  
     * @return RightBottomY 
     */
    public Float getRightBottomY() {
        return this.RightBottomY;
    }

    /**
     * Set 
     * @param RightBottomY 
     */
    public void setRightBottomY(Float RightBottomY) {
        this.RightBottomY = RightBottomY;
    }

    /**
     * Get  
     * @return Unit 
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set 
     * @param Unit 
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

