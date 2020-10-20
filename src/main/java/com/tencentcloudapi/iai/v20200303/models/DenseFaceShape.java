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

public class DenseFaceShape extends AbstractModel{

    /**
    * X-coordinate of the top-left vertex of the face frame.
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Y-coordinate of the top-left vertex of the face frame.
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
    * XX points that outline the left eye.
    */
    @SerializedName("LeftEye")
    @Expose
    private Point [] LeftEye;

    /**
    * XX points that outline the right eye.
    */
    @SerializedName("RightEye")
    @Expose
    private Point [] RightEye;

    /**
    * XX points that outline the left eyebrow.
    */
    @SerializedName("LeftEyeBrow")
    @Expose
    private Point [] LeftEyeBrow;

    /**
    * XX points that outline the right eyebrow.
    */
    @SerializedName("RightEyeBrow")
    @Expose
    private Point [] RightEyeBrow;

    /**
    * XX points that outline the outer contour of the mouth, which are returned from left anticlockwise.
    */
    @SerializedName("MouthOutside")
    @Expose
    private Point [] MouthOutside;

    /**
    * XX points that outline the inner contour of the mouth, which are returned from left anticlockwise.
    */
    @SerializedName("MouthInside")
    @Expose
    private Point [] MouthInside;

    /**
    * XX points that outline the nose.
    */
    @SerializedName("Nose")
    @Expose
    private Point [] Nose;

    /**
    * XX points that outline the left pupil.
    */
    @SerializedName("LeftPupil")
    @Expose
    private Point [] LeftPupil;

    /**
    * XX points that outline the right pupil.
    */
    @SerializedName("RightPupil")
    @Expose
    private Point [] RightPupil;

    /**
    * XX points that outline the midline.
    */
    @SerializedName("CentralAxis")
    @Expose
    private Point [] CentralAxis;

    /**
    * XX points that outline the chin.
    */
    @SerializedName("Chin")
    @Expose
    private Point [] Chin;

    /**
    * XX points that outline the left eye bag.
    */
    @SerializedName("LeftEyeBags")
    @Expose
    private Point [] LeftEyeBags;

    /**
    * XX points that outline the right eye bag.
    */
    @SerializedName("RightEyeBags")
    @Expose
    private Point [] RightEyeBags;

    /**
    * XX points that outline the forehead.
    */
    @SerializedName("Forehead")
    @Expose
    private Point [] Forehead;

    /**
     * Get X-coordinate of the top-left vertex of the face frame. 
     * @return X X-coordinate of the top-left vertex of the face frame.
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set X-coordinate of the top-left vertex of the face frame.
     * @param X X-coordinate of the top-left vertex of the face frame.
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Y-coordinate of the top-left vertex of the face frame. 
     * @return Y Y-coordinate of the top-left vertex of the face frame.
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y-coordinate of the top-left vertex of the face frame.
     * @param Y Y-coordinate of the top-left vertex of the face frame.
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
     * Get XX points that outline the left eye. 
     * @return LeftEye XX points that outline the left eye.
     */
    public Point [] getLeftEye() {
        return this.LeftEye;
    }

    /**
     * Set XX points that outline the left eye.
     * @param LeftEye XX points that outline the left eye.
     */
    public void setLeftEye(Point [] LeftEye) {
        this.LeftEye = LeftEye;
    }

    /**
     * Get XX points that outline the right eye. 
     * @return RightEye XX points that outline the right eye.
     */
    public Point [] getRightEye() {
        return this.RightEye;
    }

    /**
     * Set XX points that outline the right eye.
     * @param RightEye XX points that outline the right eye.
     */
    public void setRightEye(Point [] RightEye) {
        this.RightEye = RightEye;
    }

    /**
     * Get XX points that outline the left eyebrow. 
     * @return LeftEyeBrow XX points that outline the left eyebrow.
     */
    public Point [] getLeftEyeBrow() {
        return this.LeftEyeBrow;
    }

    /**
     * Set XX points that outline the left eyebrow.
     * @param LeftEyeBrow XX points that outline the left eyebrow.
     */
    public void setLeftEyeBrow(Point [] LeftEyeBrow) {
        this.LeftEyeBrow = LeftEyeBrow;
    }

    /**
     * Get XX points that outline the right eyebrow. 
     * @return RightEyeBrow XX points that outline the right eyebrow.
     */
    public Point [] getRightEyeBrow() {
        return this.RightEyeBrow;
    }

    /**
     * Set XX points that outline the right eyebrow.
     * @param RightEyeBrow XX points that outline the right eyebrow.
     */
    public void setRightEyeBrow(Point [] RightEyeBrow) {
        this.RightEyeBrow = RightEyeBrow;
    }

    /**
     * Get XX points that outline the outer contour of the mouth, which are returned from left anticlockwise. 
     * @return MouthOutside XX points that outline the outer contour of the mouth, which are returned from left anticlockwise.
     */
    public Point [] getMouthOutside() {
        return this.MouthOutside;
    }

    /**
     * Set XX points that outline the outer contour of the mouth, which are returned from left anticlockwise.
     * @param MouthOutside XX points that outline the outer contour of the mouth, which are returned from left anticlockwise.
     */
    public void setMouthOutside(Point [] MouthOutside) {
        this.MouthOutside = MouthOutside;
    }

    /**
     * Get XX points that outline the inner contour of the mouth, which are returned from left anticlockwise. 
     * @return MouthInside XX points that outline the inner contour of the mouth, which are returned from left anticlockwise.
     */
    public Point [] getMouthInside() {
        return this.MouthInside;
    }

    /**
     * Set XX points that outline the inner contour of the mouth, which are returned from left anticlockwise.
     * @param MouthInside XX points that outline the inner contour of the mouth, which are returned from left anticlockwise.
     */
    public void setMouthInside(Point [] MouthInside) {
        this.MouthInside = MouthInside;
    }

    /**
     * Get XX points that outline the nose. 
     * @return Nose XX points that outline the nose.
     */
    public Point [] getNose() {
        return this.Nose;
    }

    /**
     * Set XX points that outline the nose.
     * @param Nose XX points that outline the nose.
     */
    public void setNose(Point [] Nose) {
        this.Nose = Nose;
    }

    /**
     * Get XX points that outline the left pupil. 
     * @return LeftPupil XX points that outline the left pupil.
     */
    public Point [] getLeftPupil() {
        return this.LeftPupil;
    }

    /**
     * Set XX points that outline the left pupil.
     * @param LeftPupil XX points that outline the left pupil.
     */
    public void setLeftPupil(Point [] LeftPupil) {
        this.LeftPupil = LeftPupil;
    }

    /**
     * Get XX points that outline the right pupil. 
     * @return RightPupil XX points that outline the right pupil.
     */
    public Point [] getRightPupil() {
        return this.RightPupil;
    }

    /**
     * Set XX points that outline the right pupil.
     * @param RightPupil XX points that outline the right pupil.
     */
    public void setRightPupil(Point [] RightPupil) {
        this.RightPupil = RightPupil;
    }

    /**
     * Get XX points that outline the midline. 
     * @return CentralAxis XX points that outline the midline.
     */
    public Point [] getCentralAxis() {
        return this.CentralAxis;
    }

    /**
     * Set XX points that outline the midline.
     * @param CentralAxis XX points that outline the midline.
     */
    public void setCentralAxis(Point [] CentralAxis) {
        this.CentralAxis = CentralAxis;
    }

    /**
     * Get XX points that outline the chin. 
     * @return Chin XX points that outline the chin.
     */
    public Point [] getChin() {
        return this.Chin;
    }

    /**
     * Set XX points that outline the chin.
     * @param Chin XX points that outline the chin.
     */
    public void setChin(Point [] Chin) {
        this.Chin = Chin;
    }

    /**
     * Get XX points that outline the left eye bag. 
     * @return LeftEyeBags XX points that outline the left eye bag.
     */
    public Point [] getLeftEyeBags() {
        return this.LeftEyeBags;
    }

    /**
     * Set XX points that outline the left eye bag.
     * @param LeftEyeBags XX points that outline the left eye bag.
     */
    public void setLeftEyeBags(Point [] LeftEyeBags) {
        this.LeftEyeBags = LeftEyeBags;
    }

    /**
     * Get XX points that outline the right eye bag. 
     * @return RightEyeBags XX points that outline the right eye bag.
     */
    public Point [] getRightEyeBags() {
        return this.RightEyeBags;
    }

    /**
     * Set XX points that outline the right eye bag.
     * @param RightEyeBags XX points that outline the right eye bag.
     */
    public void setRightEyeBags(Point [] RightEyeBags) {
        this.RightEyeBags = RightEyeBags;
    }

    /**
     * Get XX points that outline the forehead. 
     * @return Forehead XX points that outline the forehead.
     */
    public Point [] getForehead() {
        return this.Forehead;
    }

    /**
     * Set XX points that outline the forehead.
     * @param Forehead XX points that outline the forehead.
     */
    public void setForehead(Point [] Forehead) {
        this.Forehead = Forehead;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "LeftEye.", this.LeftEye);
        this.setParamArrayObj(map, prefix + "RightEye.", this.RightEye);
        this.setParamArrayObj(map, prefix + "LeftEyeBrow.", this.LeftEyeBrow);
        this.setParamArrayObj(map, prefix + "RightEyeBrow.", this.RightEyeBrow);
        this.setParamArrayObj(map, prefix + "MouthOutside.", this.MouthOutside);
        this.setParamArrayObj(map, prefix + "MouthInside.", this.MouthInside);
        this.setParamArrayObj(map, prefix + "Nose.", this.Nose);
        this.setParamArrayObj(map, prefix + "LeftPupil.", this.LeftPupil);
        this.setParamArrayObj(map, prefix + "RightPupil.", this.RightPupil);
        this.setParamArrayObj(map, prefix + "CentralAxis.", this.CentralAxis);
        this.setParamArrayObj(map, prefix + "Chin.", this.Chin);
        this.setParamArrayObj(map, prefix + "LeftEyeBags.", this.LeftEyeBags);
        this.setParamArrayObj(map, prefix + "RightEyeBags.", this.RightEyeBags);
        this.setParamArrayObj(map, prefix + "Forehead.", this.Forehead);

    }
}

