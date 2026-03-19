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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagerShareUnit extends AbstractModel {

    /**
    * <p>Shared unit ID.</p>.
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * <P>Shared unit name.</p>.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Shared unit administrator Uin.</p>.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>Shared unit administrator OwnerUin.</p>.
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * <P>Shared unit region.</p>.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <P>Description.</P>.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <P>Creation time.</p>.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <P>The number of resources in a shared unit.</p>.
    */
    @SerializedName("ShareResourceNum")
    @Expose
    private Long ShareResourceNum;

    /**
    * <P>The number of members in a shared unit.</p>.
    */
    @SerializedName("ShareMemberNum")
    @Expose
    private Long ShareMemberNum;

    /**
    * <P>Sharing scope. valid values: 1: only sharing within a group organization is allowed; 2: sharing with any account is allowed.</p>.
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
    * <P>The number of departments in a shared unit.</p>.
    */
    @SerializedName("ShareNodeNum")
    @Expose
    private Long ShareNodeNum;

    /**
     * Get <p>Shared unit ID.</p>. 
     * @return UnitId <p>Shared unit ID.</p>.
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set <p>Shared unit ID.</p>.
     * @param UnitId <p>Shared unit ID.</p>.
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get <P>Shared unit name.</p>. 
     * @return Name <P>Shared unit name.</p>.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <P>Shared unit name.</p>.
     * @param Name <P>Shared unit name.</p>.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Shared unit administrator Uin.</p>. 
     * @return Uin <p>Shared unit administrator Uin.</p>.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Shared unit administrator Uin.</p>.
     * @param Uin <p>Shared unit administrator Uin.</p>.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Shared unit administrator OwnerUin.</p>. 
     * @return OwnerUin <p>Shared unit administrator OwnerUin.</p>.
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Shared unit administrator OwnerUin.</p>.
     * @param OwnerUin <p>Shared unit administrator OwnerUin.</p>.
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <P>Shared unit region.</p>. 
     * @return Area <P>Shared unit region.</p>.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <P>Shared unit region.</p>.
     * @param Area <P>Shared unit region.</p>.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <P>Description.</P>. 
     * @return Description <P>Description.</P>.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <P>Description.</P>.
     * @param Description <P>Description.</P>.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <P>Creation time.</p>. 
     * @return CreateTime <P>Creation time.</p>.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <P>Creation time.</p>.
     * @param CreateTime <P>Creation time.</p>.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <P>The number of resources in a shared unit.</p>. 
     * @return ShareResourceNum <P>The number of resources in a shared unit.</p>.
     */
    public Long getShareResourceNum() {
        return this.ShareResourceNum;
    }

    /**
     * Set <P>The number of resources in a shared unit.</p>.
     * @param ShareResourceNum <P>The number of resources in a shared unit.</p>.
     */
    public void setShareResourceNum(Long ShareResourceNum) {
        this.ShareResourceNum = ShareResourceNum;
    }

    /**
     * Get <P>The number of members in a shared unit.</p>. 
     * @return ShareMemberNum <P>The number of members in a shared unit.</p>.
     */
    public Long getShareMemberNum() {
        return this.ShareMemberNum;
    }

    /**
     * Set <P>The number of members in a shared unit.</p>.
     * @param ShareMemberNum <P>The number of members in a shared unit.</p>.
     */
    public void setShareMemberNum(Long ShareMemberNum) {
        this.ShareMemberNum = ShareMemberNum;
    }

    /**
     * Get <P>Sharing scope. valid values: 1: only sharing within a group organization is allowed; 2: sharing with any account is allowed.</p>. 
     * @return ShareScope <P>Sharing scope. valid values: 1: only sharing within a group organization is allowed; 2: sharing with any account is allowed.</p>.
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set <P>Sharing scope. valid values: 1: only sharing within a group organization is allowed; 2: sharing with any account is allowed.</p>.
     * @param ShareScope <P>Sharing scope. valid values: 1: only sharing within a group organization is allowed; 2: sharing with any account is allowed.</p>.
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    /**
     * Get <P>The number of departments in a shared unit.</p>. 
     * @return ShareNodeNum <P>The number of departments in a shared unit.</p>.
     */
    public Long getShareNodeNum() {
        return this.ShareNodeNum;
    }

    /**
     * Set <P>The number of departments in a shared unit.</p>.
     * @param ShareNodeNum <P>The number of departments in a shared unit.</p>.
     */
    public void setShareNodeNum(Long ShareNodeNum) {
        this.ShareNodeNum = ShareNodeNum;
    }

    public ManagerShareUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagerShareUnit(ManagerShareUnit source) {
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ShareResourceNum != null) {
            this.ShareResourceNum = new Long(source.ShareResourceNum);
        }
        if (source.ShareMemberNum != null) {
            this.ShareMemberNum = new Long(source.ShareMemberNum);
        }
        if (source.ShareScope != null) {
            this.ShareScope = new Long(source.ShareScope);
        }
        if (source.ShareNodeNum != null) {
            this.ShareNodeNum = new Long(source.ShareNodeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ShareResourceNum", this.ShareResourceNum);
        this.setParamSimple(map, prefix + "ShareMemberNum", this.ShareMemberNum);
        this.setParamSimple(map, prefix + "ShareScope", this.ShareScope);
        this.setParamSimple(map, prefix + "ShareNodeNum", this.ShareNodeNum);

    }
}

