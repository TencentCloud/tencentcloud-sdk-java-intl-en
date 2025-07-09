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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogoRect extends AbstractModel {

    /**
    * X-axis coordinate of the upper left corner
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Y-axis coordinate of the upper left corner
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Box width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Box height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get X-axis coordinate of the upper left corner 
     * @return X X-axis coordinate of the upper left corner
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set X-axis coordinate of the upper left corner
     * @param X X-axis coordinate of the upper left corner
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Y-axis coordinate of the upper left corner 
     * @return Y Y-axis coordinate of the upper left corner
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y-axis coordinate of the upper left corner
     * @param Y Y-axis coordinate of the upper left corner
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Box width 
     * @return Width Box width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Box width
     * @param Width Box width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Box height 
     * @return Height Box height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Box height
     * @param Height Box height
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public LogoRect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogoRect(LogoRect source) {
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

