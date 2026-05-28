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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRoleRequest extends AbstractModel {

    /**
    * RoleArn info
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
    * Role description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Role name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Authorized path list in cos
    */
    @SerializedName("CosPermissionList")
    @Expose
    private CosPermission [] CosPermissionList;

    /**
    * cam policy json
    */
    @SerializedName("PermissionJson")
    @Expose
    private String PermissionJson;

    /**
    * Whether resident is set to: 1 non-resident (default), 2 resident (only able to set one resident).
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get RoleArn info 
     * @return Arn RoleArn info
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set RoleArn info
     * @param Arn RoleArn info
     */
    public void setArn(String Arn) {
        this.Arn = Arn;
    }

    /**
     * Get Role description 
     * @return Desc Role description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Role description
     * @param Desc Role description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Role name 
     * @return Name Role name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Role name
     * @param Name Role name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Authorized path list in cos 
     * @return CosPermissionList Authorized path list in cos
     */
    public CosPermission [] getCosPermissionList() {
        return this.CosPermissionList;
    }

    /**
     * Set Authorized path list in cos
     * @param CosPermissionList Authorized path list in cos
     */
    public void setCosPermissionList(CosPermission [] CosPermissionList) {
        this.CosPermissionList = CosPermissionList;
    }

    /**
     * Get cam policy json 
     * @return PermissionJson cam policy json
     */
    public String getPermissionJson() {
        return this.PermissionJson;
    }

    /**
     * Set cam policy json
     * @param PermissionJson cam policy json
     */
    public void setPermissionJson(String PermissionJson) {
        this.PermissionJson = PermissionJson;
    }

    /**
     * Get Whether resident is set to: 1 non-resident (default), 2 resident (only able to set one resident). 
     * @return IsDefault Whether resident is set to: 1 non-resident (default), 2 resident (only able to set one resident).
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether resident is set to: 1 non-resident (default), 2 resident (only able to set one resident).
     * @param IsDefault Whether resident is set to: 1 non-resident (default), 2 resident (only able to set one resident).
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    public CreateUserRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRoleRequest(CreateUserRoleRequest source) {
        if (source.Arn != null) {
            this.Arn = new String(source.Arn);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Arn", this.Arn);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "CosPermissionList.", this.CosPermissionList);
        this.setParamSimple(map, prefix + "PermissionJson", this.PermissionJson);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

