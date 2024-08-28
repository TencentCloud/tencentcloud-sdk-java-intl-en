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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginWhiteCombinedInfo extends AbstractModel {

    /**
    * Allowlist region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * Allowlisted users (Multiple users are separated by commas.)
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Allowlisted IPs (Multiple IPs are separated by commas.)
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Region string
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Return the server name when the allowlist applies to only one server.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Allowlist ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Login Location
    */
    @SerializedName("Locations")
    @Expose
    private String Locations;

    /**
     * Get Allowlist region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Places Allowlist region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set Allowlist region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Places Allowlist region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get Allowlisted users (Multiple users are separated by commas.) 
     * @return UserName Allowlisted users (Multiple users are separated by commas.)
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Allowlisted users (Multiple users are separated by commas.)
     * @param UserName Allowlisted users (Multiple users are separated by commas.)
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Allowlisted IPs (Multiple IPs are separated by commas.) 
     * @return SrcIp Allowlisted IPs (Multiple IPs are separated by commas.)
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Allowlisted IPs (Multiple IPs are separated by commas.)
     * @param SrcIp Allowlisted IPs (Multiple IPs are separated by commas.)
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Region string 
     * @return Locale Region string
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set Region string
     * @param Locale Region string
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list. 
     * @return IsGlobal Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list.
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list.
     * @param IsGlobal Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list.
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11. 
     * @return Name Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.
     * @param Name Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Return the server name when the allowlist applies to only one server. 
     * @return Desc Return the server name when the allowlist applies to only one server.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Return the server name when the allowlist applies to only one server.
     * @param Desc Return the server name when the allowlist applies to only one server.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Allowlist ID 
     * @return Id Allowlist ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Allowlist ID
     * @param Id Allowlist ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time 
     * @return ModifyTime Last modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modification time
     * @param ModifyTime Last modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Login Location 
     * @return Locations Login Location
     */
    public String getLocations() {
        return this.Locations;
    }

    /**
     * Set Login Location
     * @param Locations Login Location
     */
    public void setLocations(String Locations) {
        this.Locations = Locations;
    }

    public LoginWhiteCombinedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhiteCombinedInfo(LoginWhiteCombinedInfo source) {
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.Locale != null) {
            this.Locale = new String(source.Locale);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Locations != null) {
            this.Locations = new String(source.Locations);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Locale", this.Locale);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Locations", this.Locations);

    }
}

