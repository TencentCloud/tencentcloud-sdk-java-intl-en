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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogoRect extends AbstractModel {

    /**
    * X-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Y-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Box width

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Box height

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get X-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return X X-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set X-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
     * @param X X-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Y-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Y Y-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Y Y-axis coordinate of the upper left corner

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Box width

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Width Box width

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Box width

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Width Box width

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Box height

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Height Box height

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Box height

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Height Box height

Note: This field may return null, indicating that no valid values can be obtained.
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

