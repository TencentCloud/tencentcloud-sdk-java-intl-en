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

public class FaceShape extends AbstractModel{

    /**
    * 21 points that describe the face contour.
    */
    @SerializedName("FaceProfile")
    @Expose
    private Point [] FaceProfile;

    /**
    * 8 points that describe the left eye.
    */
    @SerializedName("LeftEye")
    @Expose
    private Point [] LeftEye;

    /**
    * 8 points that describe the right eye.
    */
    @SerializedName("RightEye")
    @Expose
    private Point [] RightEye;

    /**
    * 8 points that describe the left eyebrow.
    */
    @SerializedName("LeftEyeBrow")
    @Expose
    private Point [] LeftEyeBrow;

    /**
    * 8 points that describe the right eyebrow.
    */
    @SerializedName("RightEyeBrow")
    @Expose
    private Point [] RightEyeBrow;

    /**
    * 22 points that describe the mouth.
    */
    @SerializedName("Mouth")
    @Expose
    private Point [] Mouth;

    /**
    * 13 points that describe the nose.
    */
    @SerializedName("Nose")
    @Expose
    private Point [] Nose;

    /**
    * 1 point that describes the left pupil.
    */
    @SerializedName("LeftPupil")
    @Expose
    private Point [] LeftPupil;

    /**
    * 1 point that describes the right pupil.
    */
    @SerializedName("RightPupil")
    @Expose
    private Point [] RightPupil;

    /**
     * Get 21 points that describe the face contour. 
     * @return FaceProfile 21 points that describe the face contour.
     */
    public Point [] getFaceProfile() {
        return this.FaceProfile;
    }

    /**
     * Set 21 points that describe the face contour.
     * @param FaceProfile 21 points that describe the face contour.
     */
    public void setFaceProfile(Point [] FaceProfile) {
        this.FaceProfile = FaceProfile;
    }

    /**
     * Get 8 points that describe the left eye. 
     * @return LeftEye 8 points that describe the left eye.
     */
    public Point [] getLeftEye() {
        return this.LeftEye;
    }

    /**
     * Set 8 points that describe the left eye.
     * @param LeftEye 8 points that describe the left eye.
     */
    public void setLeftEye(Point [] LeftEye) {
        this.LeftEye = LeftEye;
    }

    /**
     * Get 8 points that describe the right eye. 
     * @return RightEye 8 points that describe the right eye.
     */
    public Point [] getRightEye() {
        return this.RightEye;
    }

    /**
     * Set 8 points that describe the right eye.
     * @param RightEye 8 points that describe the right eye.
     */
    public void setRightEye(Point [] RightEye) {
        this.RightEye = RightEye;
    }

    /**
     * Get 8 points that describe the left eyebrow. 
     * @return LeftEyeBrow 8 points that describe the left eyebrow.
     */
    public Point [] getLeftEyeBrow() {
        return this.LeftEyeBrow;
    }

    /**
     * Set 8 points that describe the left eyebrow.
     * @param LeftEyeBrow 8 points that describe the left eyebrow.
     */
    public void setLeftEyeBrow(Point [] LeftEyeBrow) {
        this.LeftEyeBrow = LeftEyeBrow;
    }

    /**
     * Get 8 points that describe the right eyebrow. 
     * @return RightEyeBrow 8 points that describe the right eyebrow.
     */
    public Point [] getRightEyeBrow() {
        return this.RightEyeBrow;
    }

    /**
     * Set 8 points that describe the right eyebrow.
     * @param RightEyeBrow 8 points that describe the right eyebrow.
     */
    public void setRightEyeBrow(Point [] RightEyeBrow) {
        this.RightEyeBrow = RightEyeBrow;
    }

    /**
     * Get 22 points that describe the mouth. 
     * @return Mouth 22 points that describe the mouth.
     */
    public Point [] getMouth() {
        return this.Mouth;
    }

    /**
     * Set 22 points that describe the mouth.
     * @param Mouth 22 points that describe the mouth.
     */
    public void setMouth(Point [] Mouth) {
        this.Mouth = Mouth;
    }

    /**
     * Get 13 points that describe the nose. 
     * @return Nose 13 points that describe the nose.
     */
    public Point [] getNose() {
        return this.Nose;
    }

    /**
     * Set 13 points that describe the nose.
     * @param Nose 13 points that describe the nose.
     */
    public void setNose(Point [] Nose) {
        this.Nose = Nose;
    }

    /**
     * Get 1 point that describes the left pupil. 
     * @return LeftPupil 1 point that describes the left pupil.
     */
    public Point [] getLeftPupil() {
        return this.LeftPupil;
    }

    /**
     * Set 1 point that describes the left pupil.
     * @param LeftPupil 1 point that describes the left pupil.
     */
    public void setLeftPupil(Point [] LeftPupil) {
        this.LeftPupil = LeftPupil;
    }

    /**
     * Get 1 point that describes the right pupil. 
     * @return RightPupil 1 point that describes the right pupil.
     */
    public Point [] getRightPupil() {
        return this.RightPupil;
    }

    /**
     * Set 1 point that describes the right pupil.
     * @param RightPupil 1 point that describes the right pupil.
     */
    public void setRightPupil(Point [] RightPupil) {
        this.RightPupil = RightPupil;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FaceProfile.", this.FaceProfile);
        this.setParamArrayObj(map, prefix + "LeftEye.", this.LeftEye);
        this.setParamArrayObj(map, prefix + "RightEye.", this.RightEye);
        this.setParamArrayObj(map, prefix + "LeftEyeBrow.", this.LeftEyeBrow);
        this.setParamArrayObj(map, prefix + "RightEyeBrow.", this.RightEyeBrow);
        this.setParamArrayObj(map, prefix + "Mouth.", this.Mouth);
        this.setParamArrayObj(map, prefix + "Nose.", this.Nose);
        this.setParamArrayObj(map, prefix + "LeftPupil.", this.LeftPupil);
        this.setParamArrayObj(map, prefix + "RightPupil.", this.RightPupil);

    }
}

