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

public class FaceDetailInfo extends AbstractModel{

    /**
    * Position of the detected face frame.
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * Face attribute information. According to the types specified in `FaceAttributesType`, the following face attributes will be returned: age (Age), beauty score (Beauty), 
emotion (Emotion), eye information (Eye), eyebrow information (Eyebrow), gender (Gender), 
hair information (Hair), hat information (Hat), pose (Headpose), mask information (Mask), mouth information (Mouse), beard information (Moustache), 
nose information (Nose), face shape (Shape), skin color (Skin), and smile information (Smile), etc.  
If no types are specified in `FaceAttributesType`, the detailed items returned by `FaceDetaiAttributesInfo` will be meaningless.
    */
    @SerializedName("FaceDetailAttributesInfo")
    @Expose
    private FaceDetailAttributesInfo FaceDetailAttributesInfo;

    /**
     * Get Position of the detected face frame. 
     * @return FaceRect Position of the detected face frame.
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set Position of the detected face frame.
     * @param FaceRect Position of the detected face frame.
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get Face attribute information. According to the types specified in `FaceAttributesType`, the following face attributes will be returned: age (Age), beauty score (Beauty), 
emotion (Emotion), eye information (Eye), eyebrow information (Eyebrow), gender (Gender), 
hair information (Hair), hat information (Hat), pose (Headpose), mask information (Mask), mouth information (Mouse), beard information (Moustache), 
nose information (Nose), face shape (Shape), skin color (Skin), and smile information (Smile), etc.  
If no types are specified in `FaceAttributesType`, the detailed items returned by `FaceDetaiAttributesInfo` will be meaningless. 
     * @return FaceDetailAttributesInfo Face attribute information. According to the types specified in `FaceAttributesType`, the following face attributes will be returned: age (Age), beauty score (Beauty), 
emotion (Emotion), eye information (Eye), eyebrow information (Eyebrow), gender (Gender), 
hair information (Hair), hat information (Hat), pose (Headpose), mask information (Mask), mouth information (Mouse), beard information (Moustache), 
nose information (Nose), face shape (Shape), skin color (Skin), and smile information (Smile), etc.  
If no types are specified in `FaceAttributesType`, the detailed items returned by `FaceDetaiAttributesInfo` will be meaningless.
     */
    public FaceDetailAttributesInfo getFaceDetailAttributesInfo() {
        return this.FaceDetailAttributesInfo;
    }

    /**
     * Set Face attribute information. According to the types specified in `FaceAttributesType`, the following face attributes will be returned: age (Age), beauty score (Beauty), 
emotion (Emotion), eye information (Eye), eyebrow information (Eyebrow), gender (Gender), 
hair information (Hair), hat information (Hat), pose (Headpose), mask information (Mask), mouth information (Mouse), beard information (Moustache), 
nose information (Nose), face shape (Shape), skin color (Skin), and smile information (Smile), etc.  
If no types are specified in `FaceAttributesType`, the detailed items returned by `FaceDetaiAttributesInfo` will be meaningless.
     * @param FaceDetailAttributesInfo Face attribute information. According to the types specified in `FaceAttributesType`, the following face attributes will be returned: age (Age), beauty score (Beauty), 
emotion (Emotion), eye information (Eye), eyebrow information (Eyebrow), gender (Gender), 
hair information (Hair), hat information (Hat), pose (Headpose), mask information (Mask), mouth information (Mouse), beard information (Moustache), 
nose information (Nose), face shape (Shape), skin color (Skin), and smile information (Smile), etc.  
If no types are specified in `FaceAttributesType`, the detailed items returned by `FaceDetaiAttributesInfo` will be meaningless.
     */
    public void setFaceDetailAttributesInfo(FaceDetailAttributesInfo FaceDetailAttributesInfo) {
        this.FaceDetailAttributesInfo = FaceDetailAttributesInfo;
    }

    public FaceDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceDetailInfo(FaceDetailInfo source) {
        if (source.FaceRect != null) {
            this.FaceRect = new FaceRect(source.FaceRect);
        }
        if (source.FaceDetailAttributesInfo != null) {
            this.FaceDetailAttributesInfo = new FaceDetailAttributesInfo(source.FaceDetailAttributesInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamObj(map, prefix + "FaceDetailAttributesInfo.", this.FaceDetailAttributesInfo);

    }
}

