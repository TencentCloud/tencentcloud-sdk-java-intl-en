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
    * Shared unit ID.
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * Shared unit name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Shared unit administrator UIN.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Shared unit administrator OwnerUin.
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Shared unit region.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Description.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The number of resources in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShareResourceNum")
    @Expose
    private Long ShareResourceNum;

    /**
    * The number of members in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShareMemberNum")
    @Expose
    private Long ShareMemberNum;

    /**
    * Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
     * Get Shared unit ID. 
     * @return UnitId Shared unit ID.
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set Shared unit ID.
     * @param UnitId Shared unit ID.
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get Shared unit name. 
     * @return Name Shared unit name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Shared unit name.
     * @param Name Shared unit name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Shared unit administrator UIN. 
     * @return Uin Shared unit administrator UIN.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Shared unit administrator UIN.
     * @param Uin Shared unit administrator UIN.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Shared unit administrator OwnerUin. 
     * @return OwnerUin Shared unit administrator OwnerUin.
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Shared unit administrator OwnerUin.
     * @param OwnerUin Shared unit administrator OwnerUin.
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Shared unit region. 
     * @return Area Shared unit region.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Shared unit region.
     * @param Area Shared unit region.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Description.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The number of resources in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShareResourceNum The number of resources in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShareResourceNum() {
        return this.ShareResourceNum;
    }

    /**
     * Set The number of resources in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShareResourceNum The number of resources in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShareResourceNum(Long ShareResourceNum) {
        this.ShareResourceNum = ShareResourceNum;
    }

    /**
     * Get The number of members in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShareMemberNum The number of members in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShareMemberNum() {
        return this.ShareMemberNum;
    }

    /**
     * Set The number of members in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShareMemberNum The number of members in a shared unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShareMemberNum(Long ShareMemberNum) {
        this.ShareMemberNum = ShareMemberNum;
    }

    /**
     * Get Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShareScope Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShareScope Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
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

    }
}

