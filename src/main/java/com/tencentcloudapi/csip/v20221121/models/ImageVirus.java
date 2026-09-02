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

public class ImageVirus extends AbstractModel {

    /**
    * <p>Trojan path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Risk level</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Category</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Trojan name</p>
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * <p>Trojan Tag</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * <p>File type</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File md5</p>
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * <p>File size</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>First detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("FirstDetectedTime")
    @Expose
    private String FirstDetectedTime;

    /**
    * <p>Last detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestDetectedTime")
    @Expose
    private String LatestDetectedTime;

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
    * <p>Detection platform</p>
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String CheckPlatform;

    /**
    * <p>Numbers of affected images</p>
    */
    @SerializedName("AffectImageCount")
    @Expose
    private Long AffectImageCount;

    /**
    * <p>Image layer id</p>
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * <p>Trojan record id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Trojan handling suggestions</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>Trojan description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Trojan horse type</p>
    */
    @SerializedName("VirusType")
    @Expose
    private String VirusType;

    /**
     * Get <p>Trojan path</p> 
     * @return Path <p>Trojan path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Trojan path</p>
     * @param Path <p>Trojan path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Risk level</p> 
     * @return RiskLevel <p>Risk level</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level</p>
     * @param RiskLevel <p>Risk level</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Category</p> 
     * @return Category <p>Category</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Category</p>
     * @param Category <p>Category</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Trojan name</p> 
     * @return VirusName <p>Trojan name</p>
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set <p>Trojan name</p>
     * @param VirusName <p>Trojan name</p>
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get <p>Trojan Tag</p> 
     * @return Tags <p>Trojan Tag</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Trojan Tag</p>
     * @param Tags <p>Trojan Tag</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>File type</p> 
     * @return FileType <p>File type</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type</p>
     * @param FileType <p>File type</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>File name.</p> 
     * @return FileName <p>File name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name.</p>
     * @param FileName <p>File name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File md5</p> 
     * @return FileMd5 <p>File md5</p>
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set <p>File md5</p>
     * @param FileMd5 <p>File md5</p>
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get <p>File size</p> 
     * @return FileSize <p>File size</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>File size</p>
     * @param FileSize <p>File size</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>First detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return FirstDetectedTime <p>First detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getFirstDetectedTime() {
        return this.FirstDetectedTime;
    }

    /**
     * Set <p>First detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param FirstDetectedTime <p>First detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setFirstDetectedTime(String FirstDetectedTime) {
        this.FirstDetectedTime = FirstDetectedTime;
    }

    /**
     * Get <p>Last detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestDetectedTime <p>Last detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestDetectedTime() {
        return this.LatestDetectedTime;
    }

    /**
     * Set <p>Last detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param LatestDetectedTime <p>Last detection time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestDetectedTime(String LatestDetectedTime) {
        this.LatestDetectedTime = LatestDetectedTime;
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
     * Get <p>Detection platform</p> 
     * @return CheckPlatform <p>Detection platform</p>
     */
    public String getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set <p>Detection platform</p>
     * @param CheckPlatform <p>Detection platform</p>
     */
    public void setCheckPlatform(String CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
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
     * Get <p>Image layer id</p> 
     * @return LayerId <p>Image layer id</p>
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set <p>Image layer id</p>
     * @param LayerId <p>Image layer id</p>
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get <p>Trojan record id</p> 
     * @return Id <p>Trojan record id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Trojan record id</p>
     * @param Id <p>Trojan record id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Trojan handling suggestions</p> 
     * @return Suggestion <p>Trojan handling suggestions</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>Trojan handling suggestions</p>
     * @param Suggestion <p>Trojan handling suggestions</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>Trojan description</p> 
     * @return Description <p>Trojan description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Trojan description</p>
     * @param Description <p>Trojan description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Trojan horse type</p> 
     * @return VirusType <p>Trojan horse type</p>
     */
    public String getVirusType() {
        return this.VirusType;
    }

    /**
     * Set <p>Trojan horse type</p>
     * @param VirusType <p>Trojan horse type</p>
     */
    public void setVirusType(String VirusType) {
        this.VirusType = VirusType;
    }

    public ImageVirus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVirus(ImageVirus source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FirstDetectedTime != null) {
            this.FirstDetectedTime = new String(source.FirstDetectedTime);
        }
        if (source.LatestDetectedTime != null) {
            this.LatestDetectedTime = new String(source.LatestDetectedTime);
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
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String(source.CheckPlatform);
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
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VirusType != null) {
            this.VirusType = new String(source.VirusType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FirstDetectedTime", this.FirstDetectedTime);
        this.setParamSimple(map, prefix + "LatestDetectedTime", this.LatestDetectedTime);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "CheckPlatform", this.CheckPlatform);
        this.setParamSimple(map, prefix + "AffectImageCount", this.AffectImageCount);
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VirusType", this.VirusType);

    }
}

