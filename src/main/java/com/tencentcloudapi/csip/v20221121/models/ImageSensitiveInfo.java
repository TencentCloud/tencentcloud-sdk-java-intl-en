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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSensitiveInfo extends AbstractModel {

    /**
    * <p>Sensitive information behavior types</p><p>Enumeration values:</p><ul><li>1: start up with root account</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * <p>Rule type.</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Risk level</p><p>Enumeration values:</p><ul><li>1: Low risk</li><li>2: Medium risk</li><li>3: High-risk</li><li>4: Severe risk</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>Risk description</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>Risk content</p>
    */
    @SerializedName("InstructionContent")
    @Expose
    private String InstructionContent;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Associated account name</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>Associated account uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>appid of the associated account</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>Numbers of affected images</p>
    */
    @SerializedName("AffectImageCount")
    @Expose
    private Long AffectImageCount;

    /**
    * <p>Image layer Id</p>
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * <p>Image Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("FirstFoundTime")
    @Expose
    private String FirstFoundTime;

    /**
    * <p>Most recent discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * <p>Image layer serial number</p>
    */
    @SerializedName("LayerIndex")
    @Expose
    private Long LayerIndex;

    /**
     * Get <p>Sensitive information behavior types</p><p>Enumeration values:</p><ul><li>1: start up with root account</li><li>2: code leakage</li><li>3: credential leakage</li></ul> 
     * @return Behavior <p>Sensitive information behavior types</p><p>Enumeration values:</p><ul><li>1: start up with root account</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set <p>Sensitive information behavior types</p><p>Enumeration values:</p><ul><li>1: start up with root account</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
     * @param Behavior <p>Sensitive information behavior types</p><p>Enumeration values:</p><ul><li>1: start up with root account</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get <p>Rule type.</p> 
     * @return Type <p>Rule type.</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Rule type.</p>
     * @param Type <p>Rule type.</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Risk level</p><p>Enumeration values:</p><ul><li>1: Low risk</li><li>2: Medium risk</li><li>3: High-risk</li><li>4: Severe risk</li></ul> 
     * @return Level <p>Risk level</p><p>Enumeration values:</p><ul><li>1: Low risk</li><li>2: Medium risk</li><li>3: High-risk</li><li>4: Severe risk</li></ul>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Risk level</p><p>Enumeration values:</p><ul><li>1: Low risk</li><li>2: Medium risk</li><li>3: High-risk</li><li>4: Severe risk</li></ul>
     * @param Level <p>Risk level</p><p>Enumeration values:</p><ul><li>1: Low risk</li><li>2: Medium risk</li><li>3: High-risk</li><li>4: Severe risk</li></ul>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Risk description</p> 
     * @return Describe <p>Risk description</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>Risk description</p>
     * @param Describe <p>Risk description</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>Risk content</p> 
     * @return InstructionContent <p>Risk content</p>
     */
    public String getInstructionContent() {
        return this.InstructionContent;
    }

    /**
     * Set <p>Risk content</p>
     * @param InstructionContent <p>Risk content</p>
     */
    public void setInstructionContent(String InstructionContent) {
        this.InstructionContent = InstructionContent;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageId <p>Image ID.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageId <p>Image ID.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Associated account name</p> 
     * @return OwnerAccountName <p>Associated account name</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Associated account name</p>
     * @param OwnerAccountName <p>Associated account name</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>Associated account uin</p> 
     * @return OwnerUin <p>Associated account uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Associated account uin</p>
     * @param OwnerUin <p>Associated account uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>appid of the associated account</p> 
     * @return OwnerAppId <p>appid of the associated account</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the associated account</p>
     * @param OwnerAppId <p>appid of the associated account</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>Numbers of affected images</p> 
     * @return AffectImageCount <p>Numbers of affected images</p>
     */
    public Long getAffectImageCount() {
        return this.AffectImageCount;
    }

    /**
     * Set <p>Numbers of affected images</p>
     * @param AffectImageCount <p>Numbers of affected images</p>
     */
    public void setAffectImageCount(Long AffectImageCount) {
        this.AffectImageCount = AffectImageCount;
    }

    /**
     * Get <p>Image layer Id</p> 
     * @return LayerId <p>Image layer Id</p>
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set <p>Image layer Id</p>
     * @param LayerId <p>Image layer Id</p>
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get <p>Image Id</p> 
     * @return Id <p>Image Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Image Id</p>
     * @param Id <p>Image Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return FirstFoundTime <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getFirstFoundTime() {
        return this.FirstFoundTime;
    }

    /**
     * Set <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param FirstFoundTime <p>First discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setFirstFoundTime(String FirstFoundTime) {
        this.FirstFoundTime = FirstFoundTime;
    }

    /**
     * Get <p>Most recent discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestFoundTime <p>Most recent discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set <p>Most recent discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param LatestFoundTime <p>Most recent discovery time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get <p>Image layer serial number</p> 
     * @return LayerIndex <p>Image layer serial number</p>
     */
    public Long getLayerIndex() {
        return this.LayerIndex;
    }

    /**
     * Set <p>Image layer serial number</p>
     * @param LayerIndex <p>Image layer serial number</p>
     */
    public void setLayerIndex(Long LayerIndex) {
        this.LayerIndex = LayerIndex;
    }

    public ImageSensitiveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSensitiveInfo(ImageSensitiveInfo source) {
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.InstructionContent != null) {
            this.InstructionContent = new String(source.InstructionContent);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.AffectImageCount != null) {
            this.AffectImageCount = new Long(source.AffectImageCount);
        }
        if (source.LayerId != null) {
            this.LayerId = new String(source.LayerId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FirstFoundTime != null) {
            this.FirstFoundTime = new String(source.FirstFoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.LayerIndex != null) {
            this.LayerIndex = new Long(source.LayerIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "InstructionContent", this.InstructionContent);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "AffectImageCount", this.AffectImageCount);
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FirstFoundTime", this.FirstFoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "LayerIndex", this.LayerIndex);

    }
}

