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

public class FaceDetailAttributesInfo extends AbstractModel {

    /**
    * Age. Value range: [0,65], where 65 indicates 65 years old or above. 
If `FaceAttributesType` does not include `Age` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * Beauty score. Value range: [0,100]. 
If `FaceAttributesType` does not include `Beauty` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Beauty")
    @Expose
    private Long Beauty;

    /**
    * Emotion, including relaxed, happy, surprised, angry, sad, disgusted, and scared. 
The `Type` values of the `AttributeItem` include: 0: relaxed; 1: happy; 2: surprised; 3: angry; 4: sad; 5: disgusted; 6: scared.
If `FaceAttributesType` does not include `Emotion` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Emotion")
    @Expose
    private AttributeItem Emotion;

    /**
    * Eye information, including whether glasses are worn, whether eyes are closed, whether the person has double eyelids, and the eye size. 
If `FaceAttributesType` does not include `Eye` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Eye")
    @Expose
    private Eye Eye;

    /**
    * Eyebrow information, including whether the eyebrows are thick, curved, or long. 
If `FaceAttributesType` does not include `Eyebrow` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Eyebrow")
    @Expose
    private Eyebrow Eyebrow;

    /**
    * Gender information. 
The `Type` values of the `AttributeItem` include: 0: male; 1: female.	
If `FaceAttributesType` does not include `Gender` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Gender")
    @Expose
    private AttributeItem Gender;

    /**
    * Hair information, including length, bang, and color. 
If `FaceAttributesType` does not include `Hair` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Hair")
    @Expose
    private Hair Hair;

    /**
    * Hat information, including whether a hat is worn, hat style, and hat color. 
If `FaceAttributesType` does not include `Hat` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Hat")
    @Expose
    private Hat Hat;

    /**
    * Pose information, including the face pitch, yaw, and roll. 
If `FaceAttributesType` does not include `Headpose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("HeadPose")
    @Expose
    private HeadPose HeadPose;

    /**
    * Mask information. 
The `Type` values of the `AttributeItem` include: 0: no mask; 1: the mask is worn and does not cover the face; 2: the mask is worn and covers the chin; 3: the mask is worn and covers the mouth; 4: the mask is worn properly.
If `FaceAttributesType` does not include `Mask` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Mask")
    @Expose
    private AttributeItem Mask;

    /**
    * Mouth information, including whether the mouth is open and the lip thickness. 
If `FaceAttributesType` does not include `Mouth` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Mouth")
    @Expose
    private Mouth Mouth;

    /**
    * Beard information.
The `Type` values of the `AttributeItem` include: 0: no beard; 1: beard detected. 
If `FaceAttributesType` does not include `Moustache` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Moustache")
    @Expose
    private AttributeItem Moustache;

    /**
    * Nose information. 
The `Type` values of the `AttributeItem` include: 0: upturned nose; 1: aquiline nose; 2: general nose; 3: bulbous nose.
If `FaceAttributesType` does not include `Nose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Nose")
    @Expose
    private AttributeItem Nose;

    /**
    * Face shape information. 
The `Type` values of the `AttributeItem` include: 0: square; 1: triangular; 2: oval; 3: heart-shaped; 4: round.
If `FaceAttributesType` does not include `Shape` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Shape")
    @Expose
    private AttributeItem Shape;

    /**
    * Skin color information. 
The `Type` values of the `AttributeItem` include: 0: yellow; 1: brown; 2: black; 3: white.
If `FaceAttributesType` does not include `Skin` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Skin")
    @Expose
    private AttributeItem Skin;

    /**
    * Smile level. Value range: [0,100]. 
If `FaceAttributesType` does not include `Smile` or more than 5 faces are detected, this parameter will still be returned but meaningless.
    */
    @SerializedName("Smile")
    @Expose
    private Long Smile;

    /**
     * Get Age. Value range: [0,65], where 65 indicates 65 years old or above. 
If `FaceAttributesType` does not include `Age` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Age Age. Value range: [0,65], where 65 indicates 65 years old or above. 
If `FaceAttributesType` does not include `Age` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set Age. Value range: [0,65], where 65 indicates 65 years old or above. 
If `FaceAttributesType` does not include `Age` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Age Age. Value range: [0,65], where 65 indicates 65 years old or above. 
If `FaceAttributesType` does not include `Age` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get Beauty score. Value range: [0,100]. 
If `FaceAttributesType` does not include `Beauty` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Beauty Beauty score. Value range: [0,100]. 
If `FaceAttributesType` does not include `Beauty` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Long getBeauty() {
        return this.Beauty;
    }

    /**
     * Set Beauty score. Value range: [0,100]. 
If `FaceAttributesType` does not include `Beauty` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Beauty Beauty score. Value range: [0,100]. 
If `FaceAttributesType` does not include `Beauty` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setBeauty(Long Beauty) {
        this.Beauty = Beauty;
    }

    /**
     * Get Emotion, including relaxed, happy, surprised, angry, sad, disgusted, and scared. 
The `Type` values of the `AttributeItem` include: 0: relaxed; 1: happy; 2: surprised; 3: angry; 4: sad; 5: disgusted; 6: scared.
If `FaceAttributesType` does not include `Emotion` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Emotion Emotion, including relaxed, happy, surprised, angry, sad, disgusted, and scared. 
The `Type` values of the `AttributeItem` include: 0: relaxed; 1: happy; 2: surprised; 3: angry; 4: sad; 5: disgusted; 6: scared.
If `FaceAttributesType` does not include `Emotion` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public AttributeItem getEmotion() {
        return this.Emotion;
    }

    /**
     * Set Emotion, including relaxed, happy, surprised, angry, sad, disgusted, and scared. 
The `Type` values of the `AttributeItem` include: 0: relaxed; 1: happy; 2: surprised; 3: angry; 4: sad; 5: disgusted; 6: scared.
If `FaceAttributesType` does not include `Emotion` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Emotion Emotion, including relaxed, happy, surprised, angry, sad, disgusted, and scared. 
The `Type` values of the `AttributeItem` include: 0: relaxed; 1: happy; 2: surprised; 3: angry; 4: sad; 5: disgusted; 6: scared.
If `FaceAttributesType` does not include `Emotion` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setEmotion(AttributeItem Emotion) {
        this.Emotion = Emotion;
    }

    /**
     * Get Eye information, including whether glasses are worn, whether eyes are closed, whether the person has double eyelids, and the eye size. 
If `FaceAttributesType` does not include `Eye` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Eye Eye information, including whether glasses are worn, whether eyes are closed, whether the person has double eyelids, and the eye size. 
If `FaceAttributesType` does not include `Eye` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Eye getEye() {
        return this.Eye;
    }

    /**
     * Set Eye information, including whether glasses are worn, whether eyes are closed, whether the person has double eyelids, and the eye size. 
If `FaceAttributesType` does not include `Eye` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Eye Eye information, including whether glasses are worn, whether eyes are closed, whether the person has double eyelids, and the eye size. 
If `FaceAttributesType` does not include `Eye` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setEye(Eye Eye) {
        this.Eye = Eye;
    }

    /**
     * Get Eyebrow information, including whether the eyebrows are thick, curved, or long. 
If `FaceAttributesType` does not include `Eyebrow` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Eyebrow Eyebrow information, including whether the eyebrows are thick, curved, or long. 
If `FaceAttributesType` does not include `Eyebrow` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Eyebrow getEyebrow() {
        return this.Eyebrow;
    }

    /**
     * Set Eyebrow information, including whether the eyebrows are thick, curved, or long. 
If `FaceAttributesType` does not include `Eyebrow` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Eyebrow Eyebrow information, including whether the eyebrows are thick, curved, or long. 
If `FaceAttributesType` does not include `Eyebrow` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setEyebrow(Eyebrow Eyebrow) {
        this.Eyebrow = Eyebrow;
    }

    /**
     * Get Gender information. 
The `Type` values of the `AttributeItem` include: 0: male; 1: female.	
If `FaceAttributesType` does not include `Gender` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Gender Gender information. 
The `Type` values of the `AttributeItem` include: 0: male; 1: female.	
If `FaceAttributesType` does not include `Gender` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public AttributeItem getGender() {
        return this.Gender;
    }

    /**
     * Set Gender information. 
The `Type` values of the `AttributeItem` include: 0: male; 1: female.	
If `FaceAttributesType` does not include `Gender` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Gender Gender information. 
The `Type` values of the `AttributeItem` include: 0: male; 1: female.	
If `FaceAttributesType` does not include `Gender` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setGender(AttributeItem Gender) {
        this.Gender = Gender;
    }

    /**
     * Get Hair information, including length, bang, and color. 
If `FaceAttributesType` does not include `Hair` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Hair Hair information, including length, bang, and color. 
If `FaceAttributesType` does not include `Hair` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Hair getHair() {
        return this.Hair;
    }

    /**
     * Set Hair information, including length, bang, and color. 
If `FaceAttributesType` does not include `Hair` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Hair Hair information, including length, bang, and color. 
If `FaceAttributesType` does not include `Hair` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setHair(Hair Hair) {
        this.Hair = Hair;
    }

    /**
     * Get Hat information, including whether a hat is worn, hat style, and hat color. 
If `FaceAttributesType` does not include `Hat` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Hat Hat information, including whether a hat is worn, hat style, and hat color. 
If `FaceAttributesType` does not include `Hat` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Hat getHat() {
        return this.Hat;
    }

    /**
     * Set Hat information, including whether a hat is worn, hat style, and hat color. 
If `FaceAttributesType` does not include `Hat` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Hat Hat information, including whether a hat is worn, hat style, and hat color. 
If `FaceAttributesType` does not include `Hat` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setHat(Hat Hat) {
        this.Hat = Hat;
    }

    /**
     * Get Pose information, including the face pitch, yaw, and roll. 
If `FaceAttributesType` does not include `Headpose` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return HeadPose Pose information, including the face pitch, yaw, and roll. 
If `FaceAttributesType` does not include `Headpose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public HeadPose getHeadPose() {
        return this.HeadPose;
    }

    /**
     * Set Pose information, including the face pitch, yaw, and roll. 
If `FaceAttributesType` does not include `Headpose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param HeadPose Pose information, including the face pitch, yaw, and roll. 
If `FaceAttributesType` does not include `Headpose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setHeadPose(HeadPose HeadPose) {
        this.HeadPose = HeadPose;
    }

    /**
     * Get Mask information. 
The `Type` values of the `AttributeItem` include: 0: no mask; 1: the mask is worn and does not cover the face; 2: the mask is worn and covers the chin; 3: the mask is worn and covers the mouth; 4: the mask is worn properly.
If `FaceAttributesType` does not include `Mask` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Mask Mask information. 
The `Type` values of the `AttributeItem` include: 0: no mask; 1: the mask is worn and does not cover the face; 2: the mask is worn and covers the chin; 3: the mask is worn and covers the mouth; 4: the mask is worn properly.
If `FaceAttributesType` does not include `Mask` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public AttributeItem getMask() {
        return this.Mask;
    }

    /**
     * Set Mask information. 
The `Type` values of the `AttributeItem` include: 0: no mask; 1: the mask is worn and does not cover the face; 2: the mask is worn and covers the chin; 3: the mask is worn and covers the mouth; 4: the mask is worn properly.
If `FaceAttributesType` does not include `Mask` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Mask Mask information. 
The `Type` values of the `AttributeItem` include: 0: no mask; 1: the mask is worn and does not cover the face; 2: the mask is worn and covers the chin; 3: the mask is worn and covers the mouth; 4: the mask is worn properly.
If `FaceAttributesType` does not include `Mask` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setMask(AttributeItem Mask) {
        this.Mask = Mask;
    }

    /**
     * Get Mouth information, including whether the mouth is open and the lip thickness. 
If `FaceAttributesType` does not include `Mouth` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Mouth Mouth information, including whether the mouth is open and the lip thickness. 
If `FaceAttributesType` does not include `Mouth` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Mouth getMouth() {
        return this.Mouth;
    }

    /**
     * Set Mouth information, including whether the mouth is open and the lip thickness. 
If `FaceAttributesType` does not include `Mouth` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Mouth Mouth information, including whether the mouth is open and the lip thickness. 
If `FaceAttributesType` does not include `Mouth` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setMouth(Mouth Mouth) {
        this.Mouth = Mouth;
    }

    /**
     * Get Beard information.
The `Type` values of the `AttributeItem` include: 0: no beard; 1: beard detected. 
If `FaceAttributesType` does not include `Moustache` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Moustache Beard information.
The `Type` values of the `AttributeItem` include: 0: no beard; 1: beard detected. 
If `FaceAttributesType` does not include `Moustache` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public AttributeItem getMoustache() {
        return this.Moustache;
    }

    /**
     * Set Beard information.
The `Type` values of the `AttributeItem` include: 0: no beard; 1: beard detected. 
If `FaceAttributesType` does not include `Moustache` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Moustache Beard information.
The `Type` values of the `AttributeItem` include: 0: no beard; 1: beard detected. 
If `FaceAttributesType` does not include `Moustache` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setMoustache(AttributeItem Moustache) {
        this.Moustache = Moustache;
    }

    /**
     * Get Nose information. 
The `Type` values of the `AttributeItem` include: 0: upturned nose; 1: aquiline nose; 2: general nose; 3: bulbous nose.
If `FaceAttributesType` does not include `Nose` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Nose Nose information. 
The `Type` values of the `AttributeItem` include: 0: upturned nose; 1: aquiline nose; 2: general nose; 3: bulbous nose.
If `FaceAttributesType` does not include `Nose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public AttributeItem getNose() {
        return this.Nose;
    }

    /**
     * Set Nose information. 
The `Type` values of the `AttributeItem` include: 0: upturned nose; 1: aquiline nose; 2: general nose; 3: bulbous nose.
If `FaceAttributesType` does not include `Nose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Nose Nose information. 
The `Type` values of the `AttributeItem` include: 0: upturned nose; 1: aquiline nose; 2: general nose; 3: bulbous nose.
If `FaceAttributesType` does not include `Nose` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setNose(AttributeItem Nose) {
        this.Nose = Nose;
    }

    /**
     * Get Face shape information. 
The `Type` values of the `AttributeItem` include: 0: square; 1: triangular; 2: oval; 3: heart-shaped; 4: round.
If `FaceAttributesType` does not include `Shape` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Shape Face shape information. 
The `Type` values of the `AttributeItem` include: 0: square; 1: triangular; 2: oval; 3: heart-shaped; 4: round.
If `FaceAttributesType` does not include `Shape` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public AttributeItem getShape() {
        return this.Shape;
    }

    /**
     * Set Face shape information. 
The `Type` values of the `AttributeItem` include: 0: square; 1: triangular; 2: oval; 3: heart-shaped; 4: round.
If `FaceAttributesType` does not include `Shape` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Shape Face shape information. 
The `Type` values of the `AttributeItem` include: 0: square; 1: triangular; 2: oval; 3: heart-shaped; 4: round.
If `FaceAttributesType` does not include `Shape` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setShape(AttributeItem Shape) {
        this.Shape = Shape;
    }

    /**
     * Get Skin color information. 
The `Type` values of the `AttributeItem` include: 0: yellow; 1: brown; 2: black; 3: white.
If `FaceAttributesType` does not include `Skin` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Skin Skin color information. 
The `Type` values of the `AttributeItem` include: 0: yellow; 1: brown; 2: black; 3: white.
If `FaceAttributesType` does not include `Skin` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public AttributeItem getSkin() {
        return this.Skin;
    }

    /**
     * Set Skin color information. 
The `Type` values of the `AttributeItem` include: 0: yellow; 1: brown; 2: black; 3: white.
If `FaceAttributesType` does not include `Skin` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Skin Skin color information. 
The `Type` values of the `AttributeItem` include: 0: yellow; 1: brown; 2: black; 3: white.
If `FaceAttributesType` does not include `Skin` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setSkin(AttributeItem Skin) {
        this.Skin = Skin;
    }

    /**
     * Get Smile level. Value range: [0,100]. 
If `FaceAttributesType` does not include `Smile` or more than 5 faces are detected, this parameter will still be returned but meaningless. 
     * @return Smile Smile level. Value range: [0,100]. 
If `FaceAttributesType` does not include `Smile` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public Long getSmile() {
        return this.Smile;
    }

    /**
     * Set Smile level. Value range: [0,100]. 
If `FaceAttributesType` does not include `Smile` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     * @param Smile Smile level. Value range: [0,100]. 
If `FaceAttributesType` does not include `Smile` or more than 5 faces are detected, this parameter will still be returned but meaningless.
     */
    public void setSmile(Long Smile) {
        this.Smile = Smile;
    }

    public FaceDetailAttributesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceDetailAttributesInfo(FaceDetailAttributesInfo source) {
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Beauty != null) {
            this.Beauty = new Long(source.Beauty);
        }
        if (source.Emotion != null) {
            this.Emotion = new AttributeItem(source.Emotion);
        }
        if (source.Eye != null) {
            this.Eye = new Eye(source.Eye);
        }
        if (source.Eyebrow != null) {
            this.Eyebrow = new Eyebrow(source.Eyebrow);
        }
        if (source.Gender != null) {
            this.Gender = new AttributeItem(source.Gender);
        }
        if (source.Hair != null) {
            this.Hair = new Hair(source.Hair);
        }
        if (source.Hat != null) {
            this.Hat = new Hat(source.Hat);
        }
        if (source.HeadPose != null) {
            this.HeadPose = new HeadPose(source.HeadPose);
        }
        if (source.Mask != null) {
            this.Mask = new AttributeItem(source.Mask);
        }
        if (source.Mouth != null) {
            this.Mouth = new Mouth(source.Mouth);
        }
        if (source.Moustache != null) {
            this.Moustache = new AttributeItem(source.Moustache);
        }
        if (source.Nose != null) {
            this.Nose = new AttributeItem(source.Nose);
        }
        if (source.Shape != null) {
            this.Shape = new AttributeItem(source.Shape);
        }
        if (source.Skin != null) {
            this.Skin = new AttributeItem(source.Skin);
        }
        if (source.Smile != null) {
            this.Smile = new Long(source.Smile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Beauty", this.Beauty);
        this.setParamObj(map, prefix + "Emotion.", this.Emotion);
        this.setParamObj(map, prefix + "Eye.", this.Eye);
        this.setParamObj(map, prefix + "Eyebrow.", this.Eyebrow);
        this.setParamObj(map, prefix + "Gender.", this.Gender);
        this.setParamObj(map, prefix + "Hair.", this.Hair);
        this.setParamObj(map, prefix + "Hat.", this.Hat);
        this.setParamObj(map, prefix + "HeadPose.", this.HeadPose);
        this.setParamObj(map, prefix + "Mask.", this.Mask);
        this.setParamObj(map, prefix + "Mouth.", this.Mouth);
        this.setParamObj(map, prefix + "Moustache.", this.Moustache);
        this.setParamObj(map, prefix + "Nose.", this.Nose);
        this.setParamObj(map, prefix + "Shape.", this.Shape);
        this.setParamObj(map, prefix + "Skin.", this.Skin);
        this.setParamSimple(map, prefix + "Smile", this.Smile);

    }
}

