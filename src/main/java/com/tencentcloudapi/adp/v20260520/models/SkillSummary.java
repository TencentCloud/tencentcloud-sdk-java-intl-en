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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillSummary extends AbstractModel {

    /**
    * Classification information
    */
    @SerializedName("ClassificationInfo")
    @Expose
    private SkillClassification ClassificationInfo;

    /**
    * Current version information
    */
    @SerializedName("CurrentVersionInfo")
    @Expose
    private SkillVersion CurrentVersionInfo;

    /**
    * Whether the current user collects it
    */
    @SerializedName("IsFavorite")
    @Expose
    private Boolean IsFavorite;

    /**
    * Basic information
    */
    @SerializedName("Profile")
    @Expose
    private SkillProfile Profile;

    /**
    * Skill ID
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * Skill exception notification list
    */
    @SerializedName("NoticeList")
    @Expose
    private SkillNotice [] NoticeList;

    /**
    * List of resource operation permission bits of the current user for this Skill. This parameter is fixed as an empty array for built-in or shared skills.
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

    /**
    * Share information; there may be two entries, one is shared and the other is under review.
    */
    @SerializedName("ShareList")
    @Expose
    private SkillShare [] ShareList;

    /**
    * Skill status 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Initialization (no published versions, and the latest version is in INITIALIZED/UNRELEASED) |
Security detection in progress (no published versions, and the latest version is in AUDITING)
| 2 | To be released (no published versions, and the latest version is in PENDING_RELEASE) |
| 3 | Released (any RELEASED version exists, absorbent state) |
    */
    @SerializedName("SkillStatus")
    @Expose
    private Long SkillStatus;

    /**
     * Get Classification information 
     * @return ClassificationInfo Classification information
     */
    public SkillClassification getClassificationInfo() {
        return this.ClassificationInfo;
    }

    /**
     * Set Classification information
     * @param ClassificationInfo Classification information
     */
    public void setClassificationInfo(SkillClassification ClassificationInfo) {
        this.ClassificationInfo = ClassificationInfo;
    }

    /**
     * Get Current version information 
     * @return CurrentVersionInfo Current version information
     */
    public SkillVersion getCurrentVersionInfo() {
        return this.CurrentVersionInfo;
    }

    /**
     * Set Current version information
     * @param CurrentVersionInfo Current version information
     */
    public void setCurrentVersionInfo(SkillVersion CurrentVersionInfo) {
        this.CurrentVersionInfo = CurrentVersionInfo;
    }

    /**
     * Get Whether the current user collects it 
     * @return IsFavorite Whether the current user collects it
     */
    public Boolean getIsFavorite() {
        return this.IsFavorite;
    }

    /**
     * Set Whether the current user collects it
     * @param IsFavorite Whether the current user collects it
     */
    public void setIsFavorite(Boolean IsFavorite) {
        this.IsFavorite = IsFavorite;
    }

    /**
     * Get Basic information 
     * @return Profile Basic information
     */
    public SkillProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set Basic information
     * @param Profile Basic information
     */
    public void setProfile(SkillProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Skill ID 
     * @return SkillId Skill ID
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set Skill ID
     * @param SkillId Skill ID
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get Skill exception notification list 
     * @return NoticeList Skill exception notification list
     */
    public SkillNotice [] getNoticeList() {
        return this.NoticeList;
    }

    /**
     * Set Skill exception notification list
     * @param NoticeList Skill exception notification list
     */
    public void setNoticeList(SkillNotice [] NoticeList) {
        this.NoticeList = NoticeList;
    }

    /**
     * Get List of resource operation permission bits of the current user for this Skill. This parameter is fixed as an empty array for built-in or shared skills. 
     * @return PermissionIdList List of resource operation permission bits of the current user for this Skill. This parameter is fixed as an empty array for built-in or shared skills.
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set List of resource operation permission bits of the current user for this Skill. This parameter is fixed as an empty array for built-in or shared skills.
     * @param PermissionIdList List of resource operation permission bits of the current user for this Skill. This parameter is fixed as an empty array for built-in or shared skills.
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
    }

    /**
     * Get Share information; there may be two entries, one is shared and the other is under review. 
     * @return ShareList Share information; there may be two entries, one is shared and the other is under review.
     */
    public SkillShare [] getShareList() {
        return this.ShareList;
    }

    /**
     * Set Share information; there may be two entries, one is shared and the other is under review.
     * @param ShareList Share information; there may be two entries, one is shared and the other is under review.
     */
    public void setShareList(SkillShare [] ShareList) {
        this.ShareList = ShareList;
    }

    /**
     * Get Skill status 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Initialization (no published versions, and the latest version is in INITIALIZED/UNRELEASED) |
Security detection in progress (no published versions, and the latest version is in AUDITING)
| 2 | To be released (no published versions, and the latest version is in PENDING_RELEASE) |
| 3 | Released (any RELEASED version exists, absorbent state) | 
     * @return SkillStatus Skill status 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Initialization (no published versions, and the latest version is in INITIALIZED/UNRELEASED) |
Security detection in progress (no published versions, and the latest version is in AUDITING)
| 2 | To be released (no published versions, and the latest version is in PENDING_RELEASE) |
| 3 | Released (any RELEASED version exists, absorbent state) |
     */
    public Long getSkillStatus() {
        return this.SkillStatus;
    }

    /**
     * Set Skill status 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Initialization (no published versions, and the latest version is in INITIALIZED/UNRELEASED) |
Security detection in progress (no published versions, and the latest version is in AUDITING)
| 2 | To be released (no published versions, and the latest version is in PENDING_RELEASE) |
| 3 | Released (any RELEASED version exists, absorbent state) |
     * @param SkillStatus Skill status 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Initialization (no published versions, and the latest version is in INITIALIZED/UNRELEASED) |
Security detection in progress (no published versions, and the latest version is in AUDITING)
| 2 | To be released (no published versions, and the latest version is in PENDING_RELEASE) |
| 3 | Released (any RELEASED version exists, absorbent state) |
     */
    public void setSkillStatus(Long SkillStatus) {
        this.SkillStatus = SkillStatus;
    }

    public SkillSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillSummary(SkillSummary source) {
        if (source.ClassificationInfo != null) {
            this.ClassificationInfo = new SkillClassification(source.ClassificationInfo);
        }
        if (source.CurrentVersionInfo != null) {
            this.CurrentVersionInfo = new SkillVersion(source.CurrentVersionInfo);
        }
        if (source.IsFavorite != null) {
            this.IsFavorite = new Boolean(source.IsFavorite);
        }
        if (source.Profile != null) {
            this.Profile = new SkillProfile(source.Profile);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.NoticeList != null) {
            this.NoticeList = new SkillNotice[source.NoticeList.length];
            for (int i = 0; i < source.NoticeList.length; i++) {
                this.NoticeList[i] = new SkillNotice(source.NoticeList[i]);
            }
        }
        if (source.PermissionIdList != null) {
            this.PermissionIdList = new String[source.PermissionIdList.length];
            for (int i = 0; i < source.PermissionIdList.length; i++) {
                this.PermissionIdList[i] = new String(source.PermissionIdList[i]);
            }
        }
        if (source.ShareList != null) {
            this.ShareList = new SkillShare[source.ShareList.length];
            for (int i = 0; i < source.ShareList.length; i++) {
                this.ShareList[i] = new SkillShare(source.ShareList[i]);
            }
        }
        if (source.SkillStatus != null) {
            this.SkillStatus = new Long(source.SkillStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClassificationInfo.", this.ClassificationInfo);
        this.setParamObj(map, prefix + "CurrentVersionInfo.", this.CurrentVersionInfo);
        this.setParamSimple(map, prefix + "IsFavorite", this.IsFavorite);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamArrayObj(map, prefix + "NoticeList.", this.NoticeList);
        this.setParamArraySimple(map, prefix + "PermissionIdList.", this.PermissionIdList);
        this.setParamArrayObj(map, prefix + "ShareList.", this.ShareList);
        this.setParamSimple(map, prefix + "SkillStatus", this.SkillStatus);

    }
}

