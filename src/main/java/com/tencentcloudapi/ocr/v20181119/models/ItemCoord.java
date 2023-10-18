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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemCoord extends AbstractModel {

    /**
    * X-coordinate of top-left point.
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Y-coordinate of top-left point.
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get X-coordinate of top-left point. 
     * @return X X-coordinate of top-left point.
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set X-coordinate of top-left point.
     * @param X X-coordinate of top-left point.
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Y-coordinate of top-left point. 
     * @return Y Y-coordinate of top-left point.
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y-coordinate of top-left point.
     * @param Y Y-coordinate of top-left point.
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Width 
     * @return Width Width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width
     * @param Width Width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height 
     * @return Height Height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height
     * @param Height Height
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public ItemCoord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemCoord(ItemCoord source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
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

    }
}

