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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceInfo extends AbstractModel{

    /**
    * Horizontal coordinate of the top-left vertex of the face frame.
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Vertical coordinate of the top-left vertex of the face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Face frame width.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Face frame height.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Face attributes, including gender, age, expression, 
beauty, glass, mask, hair, and pose (pitch, roll, yaw). Valid information will be returned only if `NeedFaceAttributes` is set to 1.
    */
    @SerializedName("FaceAttributesInfo")
    @Expose
    private FaceAttributesInfo FaceAttributesInfo;

    /**
    * Face quality information, including score, sharpness, brightness, and completeness. Valid information will be returned only if `NeedFaceDetection` is set to 1.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceQualityInfo")
    @Expose
    private FaceQualityInfo FaceQualityInfo;

    /**
     * Get Horizontal coordinate of the top-left vertex of the face frame.
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement. 
     * @return X Horizontal coordinate of the top-left vertex of the face frame.
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set Horizontal coordinate of the top-left vertex of the face frame.
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
     * @param X Horizontal coordinate of the top-left vertex of the face frame.
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Vertical coordinate of the top-left vertex of the face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement. 
     * @return Y Vertical coordinate of the top-left vertex of the face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Vertical coordinate of the top-left vertex of the face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
     * @param Y Vertical coordinate of the top-left vertex of the face frame. 
The face frame encompasses the facial features and is extended accordingly. If it is larger than the image, the coordinates will be negative. 
If you want to capture a complete face, you can set the negative coordinates to 0 if the `completeness` score meets the requirement.
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Face frame width. 
     * @return Width Face frame width.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Face frame width.
     * @param Width Face frame width.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Face frame height. 
     * @return Height Face frame height.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Face frame height.
     * @param Height Face frame height.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Face attributes, including gender, age, expression, 
beauty, glass, mask, hair, and pose (pitch, roll, yaw). Valid information will be returned only if `NeedFaceAttributes` is set to 1. 
     * @return FaceAttributesInfo Face attributes, including gender, age, expression, 
beauty, glass, mask, hair, and pose (pitch, roll, yaw). Valid information will be returned only if `NeedFaceAttributes` is set to 1.
     */
    public FaceAttributesInfo getFaceAttributesInfo() {
        return this.FaceAttributesInfo;
    }

    /**
     * Set Face attributes, including gender, age, expression, 
beauty, glass, mask, hair, and pose (pitch, roll, yaw). Valid information will be returned only if `NeedFaceAttributes` is set to 1.
     * @param FaceAttributesInfo Face attributes, including gender, age, expression, 
beauty, glass, mask, hair, and pose (pitch, roll, yaw). Valid information will be returned only if `NeedFaceAttributes` is set to 1.
     */
    public void setFaceAttributesInfo(FaceAttributesInfo FaceAttributesInfo) {
        this.FaceAttributesInfo = FaceAttributesInfo;
    }

    /**
     * Get Face quality information, including score, sharpness, brightness, and completeness. Valid information will be returned only if `NeedFaceDetection` is set to 1.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceQualityInfo Face quality information, including score, sharpness, brightness, and completeness. Valid information will be returned only if `NeedFaceDetection` is set to 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FaceQualityInfo getFaceQualityInfo() {
        return this.FaceQualityInfo;
    }

    /**
     * Set Face quality information, including score, sharpness, brightness, and completeness. Valid information will be returned only if `NeedFaceDetection` is set to 1.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceQualityInfo Face quality information, including score, sharpness, brightness, and completeness. Valid information will be returned only if `NeedFaceDetection` is set to 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceQualityInfo(FaceQualityInfo FaceQualityInfo) {
        this.FaceQualityInfo = FaceQualityInfo;
    }

    public FaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceInfo(FaceInfo source) {
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
        if (source.FaceAttributesInfo != null) {
            this.FaceAttributesInfo = new FaceAttributesInfo(source.FaceAttributesInfo);
        }
        if (source.FaceQualityInfo != null) {
            this.FaceQualityInfo = new FaceQualityInfo(source.FaceQualityInfo);
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
        this.setParamObj(map, prefix + "FaceAttributesInfo.", this.FaceAttributesInfo);
        this.setParamObj(map, prefix + "FaceQualityInfo.", this.FaceQualityInfo);

    }
}

