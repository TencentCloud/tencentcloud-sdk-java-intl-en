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

public class FaceAttributesInfo extends AbstractModel{

    /**
    * Gender. The gender is female for the value range [0,49] and male for the value range [50,100]. The closer the value to 0 or 100, the higher the confidence. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * Age. Value range: [0,100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * Expression. Value range: [0 (normal)–50 (smile)–100 (laugh)]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Expression")
    @Expose
    private Long Expression;

    /**
    * Whether glasses are present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Glass")
    @Expose
    private Boolean Glass;

    /**
    * Vertical offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
    */
    @SerializedName("Pitch")
    @Expose
    private Long Pitch;

    /**
    * Horizontal offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
    */
    @SerializedName("Yaw")
    @Expose
    private Long Yaw;

    /**
    * Horizontal rotation in degrees. Value range: [-180,180]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.  
You are recommended to select images in the [-20,20] range for adding faces.
    */
    @SerializedName("Roll")
    @Expose
    private Long Roll;

    /**
    * Beauty. Value range: [0–100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Beauty")
    @Expose
    private Long Beauty;

    /**
    * Whether hat is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Hat")
    @Expose
    private Boolean Hat;

    /**
    * Whether mask is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mask")
    @Expose
    private Boolean Mask;

    /**
    * Hair information, including length, bang, and color. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Hair")
    @Expose
    private FaceHairAttributesInfo Hair;

    /**
    * Whether the eyes are open. Valid values: [true,false]. As long as there is more than one eye closed, `false` will be returned. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EyeOpen")
    @Expose
    private Boolean EyeOpen;

    /**
     * Get Gender. The gender is female for the value range [0,49] and male for the value range [50,100]. The closer the value to 0 or 100, the higher the confidence. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Gender Gender. The gender is female for the value range [0,49] and male for the value range [50,100]. The closer the value to 0 or 100, the higher the confidence. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set Gender. The gender is female for the value range [0,49] and male for the value range [50,100]. The closer the value to 0 or 100, the higher the confidence. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Gender Gender. The gender is female for the value range [0,49] and male for the value range [50,100]. The closer the value to 0 or 100, the higher the confidence. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get Age. Value range: [0,100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Age Age. Value range: [0,100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set Age. Value range: [0,100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Age Age. Value range: [0,100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get Expression. Value range: [0 (normal)–50 (smile)–100 (laugh)]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Expression Expression. Value range: [0 (normal)–50 (smile)–100 (laugh)]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Long getExpression() {
        return this.Expression;
    }

    /**
     * Set Expression. Value range: [0 (normal)–50 (smile)–100 (laugh)]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Expression Expression. Value range: [0 (normal)–50 (smile)–100 (laugh)]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setExpression(Long Expression) {
        this.Expression = Expression;
    }

    /**
     * Get Whether glasses are present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Glass Whether glasses are present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Boolean getGlass() {
        return this.Glass;
    }

    /**
     * Set Whether glasses are present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Glass Whether glasses are present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setGlass(Boolean Glass) {
        this.Glass = Glass;
    }

    /**
     * Get Vertical offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces. 
     * @return Pitch Vertical offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
     */
    public Long getPitch() {
        return this.Pitch;
    }

    /**
     * Set Vertical offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
     * @param Pitch Vertical offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
     */
    public void setPitch(Long Pitch) {
        this.Pitch = Pitch;
    }

    /**
     * Get Horizontal offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces. 
     * @return Yaw Horizontal offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
     */
    public Long getYaw() {
        return this.Yaw;
    }

    /**
     * Set Horizontal offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
     * @param Yaw Horizontal offset in degrees. Value range: [-30,30]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
You are recommended to select images in the [-10,10] range for adding faces.
     */
    public void setYaw(Long Yaw) {
        this.Yaw = Yaw;
    }

    /**
     * Get Horizontal rotation in degrees. Value range: [-180,180]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.  
You are recommended to select images in the [-20,20] range for adding faces. 
     * @return Roll Horizontal rotation in degrees. Value range: [-180,180]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.  
You are recommended to select images in the [-20,20] range for adding faces.
     */
    public Long getRoll() {
        return this.Roll;
    }

    /**
     * Set Horizontal rotation in degrees. Value range: [-180,180]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.  
You are recommended to select images in the [-20,20] range for adding faces.
     * @param Roll Horizontal rotation in degrees. Value range: [-180,180]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.  
You are recommended to select images in the [-20,20] range for adding faces.
     */
    public void setRoll(Long Roll) {
        this.Roll = Roll;
    }

    /**
     * Get Beauty. Value range: [0–100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Beauty Beauty. Value range: [0–100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Long getBeauty() {
        return this.Beauty;
    }

    /**
     * Set Beauty. Value range: [0–100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Beauty Beauty. Value range: [0–100]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setBeauty(Long Beauty) {
        this.Beauty = Beauty;
    }

    /**
     * Get Whether hat is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Hat Whether hat is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHat() {
        return this.Hat;
    }

    /**
     * Set Whether hat is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Hat Whether hat is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHat(Boolean Hat) {
        this.Hat = Hat;
    }

    /**
     * Get Whether mask is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Mask Whether mask is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getMask() {
        return this.Mask;
    }

    /**
     * Set Whether mask is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Mask Whether mask is present. Valid values: [true,false]. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMask(Boolean Mask) {
        this.Mask = Mask;
    }

    /**
     * Get Hair information, including length, bang, and color. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Hair Hair information, including length, bang, and color. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FaceHairAttributesInfo getHair() {
        return this.Hair;
    }

    /**
     * Set Hair information, including length, bang, and color. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Hair Hair information, including length, bang, and color. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHair(FaceHairAttributesInfo Hair) {
        this.Hair = Hair;
    }

    /**
     * Get Whether the eyes are open. Valid values: [true,false]. As long as there is more than one eye closed, `false` will be returned. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EyeOpen Whether the eyes are open. Valid values: [true,false]. As long as there is more than one eye closed, `false` will be returned. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEyeOpen() {
        return this.EyeOpen;
    }

    /**
     * Set Whether the eyes are open. Valid values: [true,false]. As long as there is more than one eye closed, `false` will be returned. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EyeOpen Whether the eyes are open. Valid values: [true,false]. As long as there is more than one eye closed, `false` will be returned. If `NeedFaceAttributes` is not 1 or more than 5 faces are detected, this parameter will still be returned but meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEyeOpen(Boolean EyeOpen) {
        this.EyeOpen = EyeOpen;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Expression", this.Expression);
        this.setParamSimple(map, prefix + "Glass", this.Glass);
        this.setParamSimple(map, prefix + "Pitch", this.Pitch);
        this.setParamSimple(map, prefix + "Yaw", this.Yaw);
        this.setParamSimple(map, prefix + "Roll", this.Roll);
        this.setParamSimple(map, prefix + "Beauty", this.Beauty);
        this.setParamSimple(map, prefix + "Hat", this.Hat);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamObj(map, prefix + "Hair.", this.Hair);
        this.setParamSimple(map, prefix + "EyeOpen", this.EyeOpen);

    }
}

