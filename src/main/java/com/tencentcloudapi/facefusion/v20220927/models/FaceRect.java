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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceRect extends AbstractModel {

    /**
    * Top-left X-axis coordinate of the face box
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Top-left Y-axis coordinate of the face box
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Face box width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Face box height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Top-left X-axis coordinate of the face box 
     * @return X Top-left X-axis coordinate of the face box
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set Top-left X-axis coordinate of the face box
     * @param X Top-left X-axis coordinate of the face box
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Top-left Y-axis coordinate of the face box 
     * @return Y Top-left Y-axis coordinate of the face box
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Top-left Y-axis coordinate of the face box
     * @param Y Top-left Y-axis coordinate of the face box
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Face box width 
     * @return Width Face box width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Face box width
     * @param Width Face box width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Face box height 
     * @return Height Face box height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Face box height
     * @param Height Face box height
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public FaceRect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceRect(FaceRect source) {
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

