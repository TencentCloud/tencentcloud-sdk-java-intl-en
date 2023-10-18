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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserRole extends AbstractModel {

    /**
    * The role ID.
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * The user's app ID.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * The user ID.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * The role permission.
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
    * The last modified timestamp.
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * The role description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * The role name.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * The creator UIN.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * The COS permission list.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("CosPermissionList")
    @Expose
    private CosPermission [] CosPermissionList;

    /**
    * The CAM policy in JSON.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("PermissionJson")
    @Expose
    private String PermissionJson;

    /**
     * Get The role ID. 
     * @return RoleId The role ID.
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set The role ID.
     * @param RoleId The role ID.
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get The user's app ID. 
     * @return AppId The user's app ID.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set The user's app ID.
     * @param AppId The user's app ID.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get The user ID. 
     * @return Uin The user ID.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set The user ID.
     * @param Uin The user ID.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get The role permission. 
     * @return Arn The role permission.
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set The role permission.
     * @param Arn The role permission.
     */
    public void setArn(String Arn) {
        this.Arn = Arn;
    }

    /**
     * Get The last modified timestamp. 
     * @return ModifyTime The last modified timestamp.
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set The last modified timestamp.
     * @param ModifyTime The last modified timestamp.
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get The role description. 
     * @return Desc The role description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set The role description.
     * @param Desc The role description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get The role name.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return RoleName The role name.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set The role name.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param RoleName The role name.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get The creator UIN.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Creator The creator UIN.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set The creator UIN.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Creator The creator UIN.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get The COS permission list.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return CosPermissionList The COS permission list.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public CosPermission [] getCosPermissionList() {
        return this.CosPermissionList;
    }

    /**
     * Set The COS permission list.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param CosPermissionList The COS permission list.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setCosPermissionList(CosPermission [] CosPermissionList) {
        this.CosPermissionList = CosPermissionList;
    }

    /**
     * Get The CAM policy in JSON.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return PermissionJson The CAM policy in JSON.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getPermissionJson() {
        return this.PermissionJson;
    }

    /**
     * Set The CAM policy in JSON.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param PermissionJson The CAM policy in JSON.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setPermissionJson(String PermissionJson) {
        this.PermissionJson = PermissionJson;
    }

    public UserRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRole(UserRole source) {
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Arn != null) {
            this.Arn = new String(source.Arn);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CosPermissionList != null) {
            this.CosPermissionList = new CosPermission[source.CosPermissionList.length];
            for (int i = 0; i < source.CosPermissionList.length; i++) {
                this.CosPermissionList[i] = new CosPermission(source.CosPermissionList[i]);
            }
        }
        if (source.PermissionJson != null) {
            this.PermissionJson = new String(source.PermissionJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Arn", this.Arn);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamArrayObj(map, prefix + "CosPermissionList.", this.CosPermissionList);
        this.setParamSimple(map, prefix + "PermissionJson", this.PermissionJson);

    }
}

