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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceRect extends AbstractModel {

    /**
    * Horizontal coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Vertical coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Face width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Face height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Horizontal coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement. 
     * @return X Horizontal coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set Horizontal coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
     * @param X Horizontal coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Vertical coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement. 
     * @return Y Vertical coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Vertical coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
     * @param Y Vertical coordinate of the top-left vertex of face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the completeness score meets the requirement.
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Face width 
     * @return Width Face width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Face width
     * @param Width Face width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Face height 
     * @return Height Face height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Face height
     * @param Height Face height
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

