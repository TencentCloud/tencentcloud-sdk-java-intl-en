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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageCoordinates extends AbstractModel {

    /**
    * <p>Top-left horizontal coordinate of the avatar</p>
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * <p>Top-left vertical coordinate of the avatar</p>
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * <p>Avatar frame width.</p><p>Unit: px.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>Avatar frame height.</p><p>Unit: px.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get <p>Top-left horizontal coordinate of the avatar</p> 
     * @return X <p>Top-left horizontal coordinate of the avatar</p>
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set <p>Top-left horizontal coordinate of the avatar</p>
     * @param X <p>Top-left horizontal coordinate of the avatar</p>
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get <p>Top-left vertical coordinate of the avatar</p> 
     * @return Y <p>Top-left vertical coordinate of the avatar</p>
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set <p>Top-left vertical coordinate of the avatar</p>
     * @param Y <p>Top-left vertical coordinate of the avatar</p>
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get <p>Avatar frame width.</p><p>Unit: px.</p> 
     * @return Width <p>Avatar frame width.</p><p>Unit: px.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Avatar frame width.</p><p>Unit: px.</p>
     * @param Width <p>Avatar frame width.</p><p>Unit: px.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>Avatar frame height.</p><p>Unit: px.</p> 
     * @return Height <p>Avatar frame height.</p><p>Unit: px.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Avatar frame height.</p><p>Unit: px.</p>
     * @param Height <p>Avatar frame height.</p><p>Unit: px.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public ImageCoordinates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageCoordinates(ImageCoordinates source) {
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

