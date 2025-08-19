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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Project extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Project logo.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * Project name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Background color of the logo.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColorCode")
    @Expose
    private String ColorCode;

    /**
    * Creator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Number of members.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * Number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * Last modified report and dashboard names.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyName")
    @Expose
    private String LastModifyName;

    /**
    * ""
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * ""
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Apply")
    @Expose
    private Boolean Apply;

    /**
    * ""
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * ""
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * ""
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * ""
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * ""
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * Permission list in the project.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthList")
    @Expose
    private String [] AuthList;

    /**
    * Default dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PanelScope")
    @Expose
    private String PanelScope;

    /**
    * Whether it is managed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsExternalManage")
    @Expose
    private Boolean IsExternalManage;

    /**
    * Management platform name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
    * Customization parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigList")
    @Expose
    private ProjectConfigList [] ConfigList;

    /**
    * Creator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedUserName")
    @Expose
    private String CreatedUserName;

    /**
    * Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Associated person.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * Number of dashboard pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NormalCount")
    @Expose
    private Long NormalCount;

    /**
    * Number of free canvas pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FreeCount")
    @Expose
    private Long FreeCount;

    /**
    * Number of ad-hoc analysis pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdhocCount")
    @Expose
    private Long AdhocCount;

    /**
    * Number of pages in the briefing
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BriefingCount")
    @Expose
    private Long BriefingCount;

    /**
     * Get Project ID. 
     * @return Id Project ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Project ID.
     * @param Id Project ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Project logo.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Logo Project logo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Project logo.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Logo Project logo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get Project name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Background color of the logo.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColorCode Background color of the logo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColorCode() {
        return this.ColorCode;
    }

    /**
     * Set Background color of the logo.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColorCode Background color of the logo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColorCode(String ColorCode) {
        this.ColorCode = ColorCode;
    }

    /**
     * Get Creator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Number of members.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberCount Number of members.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set Number of members.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberCount Number of members.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get Number of pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageCount Number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set Number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageCount Number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get Last modified report and dashboard names.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyName Last modified report and dashboard names.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastModifyName() {
        return this.LastModifyName;
    }

    /**
     * Set Last modified report and dashboard names.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastModifyName Last modified report and dashboard names.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyName(String LastModifyName) {
        this.LastModifyName = LastModifyName;
    }

    /**
     * Get ""
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Source ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set ""
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Source ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get ""
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Apply ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getApply() {
        return this.Apply;
    }

    /**
     * Set ""
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Apply ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApply(Boolean Apply) {
        this.Apply = Apply;
    }

    /**
     * Get ""
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedUser ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set ""
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedUser ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get ""
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set ""
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get ""
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CorpId ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set ""
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CorpId ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get ""
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mark ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set ""
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mark ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get ""
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Seed ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set ""
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Seed ""
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get Permission list in the project.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthList Permission list in the project.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAuthList() {
        return this.AuthList;
    }

    /**
     * Set Permission list in the project.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthList Permission list in the project.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthList(String [] AuthList) {
        this.AuthList = AuthList;
    }

    /**
     * Get Default dashboard.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PanelScope Default dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPanelScope() {
        return this.PanelScope;
    }

    /**
     * Set Default dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PanelScope Default dashboard.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPanelScope(String PanelScope) {
        this.PanelScope = PanelScope;
    }

    /**
     * Get Whether it is managed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsExternalManage Whether it is managed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsExternalManage() {
        return this.IsExternalManage;
    }

    /**
     * Set Whether it is managed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsExternalManage Whether it is managed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsExternalManage(Boolean IsExternalManage) {
        this.IsExternalManage = IsExternalManage;
    }

    /**
     * Get Management platform name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManagePlatform Management platform name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set Management platform name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManagePlatform Management platform name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    /**
     * Get Customization parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigList Customization parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProjectConfigList [] getConfigList() {
        return this.ConfigList;
    }

    /**
     * Set Customization parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigList Customization parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigList(ProjectConfigList [] ConfigList) {
        this.ConfigList = ConfigList;
    }

    /**
     * Get Creator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedUserName Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedUserName() {
        return this.CreatedUserName;
    }

    /**
     * Set Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedUserName Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedUserName(String CreatedUserName) {
        this.CreatedUserName = CreatedUserName;
    }

    /**
     * Get Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Owner Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Owner Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Associated person.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerName Associated person.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set Associated person.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerName Associated person.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get Number of dashboard pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NormalCount Number of dashboard pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNormalCount() {
        return this.NormalCount;
    }

    /**
     * Set Number of dashboard pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NormalCount Number of dashboard pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNormalCount(Long NormalCount) {
        this.NormalCount = NormalCount;
    }

    /**
     * Get Number of free canvas pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FreeCount Number of free canvas pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFreeCount() {
        return this.FreeCount;
    }

    /**
     * Set Number of free canvas pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FreeCount Number of free canvas pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFreeCount(Long FreeCount) {
        this.FreeCount = FreeCount;
    }

    /**
     * Get Number of ad-hoc analysis pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdhocCount Number of ad-hoc analysis pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAdhocCount() {
        return this.AdhocCount;
    }

    /**
     * Set Number of ad-hoc analysis pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdhocCount Number of ad-hoc analysis pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdhocCount(Long AdhocCount) {
        this.AdhocCount = AdhocCount;
    }

    /**
     * Get Number of pages in the briefing
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BriefingCount Number of pages in the briefing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBriefingCount() {
        return this.BriefingCount;
    }

    /**
     * Set Number of pages in the briefing
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BriefingCount Number of pages in the briefing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBriefingCount(Long BriefingCount) {
        this.BriefingCount = BriefingCount;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ColorCode != null) {
            this.ColorCode = new String(source.ColorCode);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.LastModifyName != null) {
            this.LastModifyName = new String(source.LastModifyName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Apply != null) {
            this.Apply = new Boolean(source.Apply);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.AuthList != null) {
            this.AuthList = new String[source.AuthList.length];
            for (int i = 0; i < source.AuthList.length; i++) {
                this.AuthList[i] = new String(source.AuthList[i]);
            }
        }
        if (source.PanelScope != null) {
            this.PanelScope = new String(source.PanelScope);
        }
        if (source.IsExternalManage != null) {
            this.IsExternalManage = new Boolean(source.IsExternalManage);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
        if (source.ConfigList != null) {
            this.ConfigList = new ProjectConfigList[source.ConfigList.length];
            for (int i = 0; i < source.ConfigList.length; i++) {
                this.ConfigList[i] = new ProjectConfigList(source.ConfigList[i]);
            }
        }
        if (source.CreatedUserName != null) {
            this.CreatedUserName = new String(source.CreatedUserName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.NormalCount != null) {
            this.NormalCount = new Long(source.NormalCount);
        }
        if (source.FreeCount != null) {
            this.FreeCount = new Long(source.FreeCount);
        }
        if (source.AdhocCount != null) {
            this.AdhocCount = new Long(source.AdhocCount);
        }
        if (source.BriefingCount != null) {
            this.BriefingCount = new Long(source.BriefingCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ColorCode", this.ColorCode);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "LastModifyName", this.LastModifyName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Apply", this.Apply);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamArraySimple(map, prefix + "AuthList.", this.AuthList);
        this.setParamSimple(map, prefix + "PanelScope", this.PanelScope);
        this.setParamSimple(map, prefix + "IsExternalManage", this.IsExternalManage);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);
        this.setParamArrayObj(map, prefix + "ConfigList.", this.ConfigList);
        this.setParamSimple(map, prefix + "CreatedUserName", this.CreatedUserName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "NormalCount", this.NormalCount);
        this.setParamSimple(map, prefix + "FreeCount", this.FreeCount);
        this.setParamSimple(map, prefix + "AdhocCount", this.AdhocCount);
        this.setParamSimple(map, prefix + "BriefingCount", this.BriefingCount);

    }
}

