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

public class LoginWhiteCombinedInfo extends AbstractModel {

    /**
    * <p>Allowlist region</p>
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * <p>allowlisted users (multiple users separated by commas)</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Allowlisted IPs (multiple IPs separated by commas)</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>Region string</p>
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list'</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Return the server name when the allowlist applies to only one server.</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>Allowlist ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modification time</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Server Uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Login location</p>
    */
    @SerializedName("Locations")
    @Expose
    private String Locations;

    /**
     * Get <p>Allowlist region</p> 
     * @return Places <p>Allowlist region</p>
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>Allowlist region</p>
     * @param Places <p>Allowlist region</p>
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get <p>allowlisted users (multiple users separated by commas)</p> 
     * @return UserName <p>allowlisted users (multiple users separated by commas)</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>allowlisted users (multiple users separated by commas)</p>
     * @param UserName <p>allowlisted users (multiple users separated by commas)</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Allowlisted IPs (multiple IPs separated by commas)</p> 
     * @return SrcIp <p>Allowlisted IPs (multiple IPs separated by commas)</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>Allowlisted IPs (multiple IPs separated by commas)</p>
     * @param SrcIp <p>Allowlisted IPs (multiple IPs separated by commas)</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>Region string</p> 
     * @return Locale <p>Region string</p>
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set <p>Region string</p>
     * @param Locale <p>Region string</p>
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time.</p> 
     * @return EndTime <p>End time.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time.</p>
     * @param EndTime <p>End time.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list'</p> 
     * @return IsGlobal <p>Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list'</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list'</p>
     * @param IsGlobal <p>Whether the settings take effect globally. 1: take effect globally; 0: take effect on the specified host list'</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.</p> 
     * @return Name <p>Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.</p>
     * @param Name <p>Allowlist name. If IsLocal is set to 1, the name is fixed as All servers. If the allowlist applies to only a single server, the name is the server's private IP Address. If the allowlist applies to multiple servers, the name is the number of servers, such as 11.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Return the server name when the allowlist applies to only one server.</p> 
     * @return Desc <p>Return the server name when the allowlist applies to only one server.</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>Return the server name when the allowlist applies to only one server.</p>
     * @param Desc <p>Return the server name when the allowlist applies to only one server.</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>Allowlist ID</p> 
     * @return Id <p>Allowlist ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Allowlist ID</p>
     * @param Id <p>Allowlist ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last modification time</p> 
     * @return ModifyTime <p>Last modification time</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Last modification time</p>
     * @param ModifyTime <p>Last modification time</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Server Uuid</p> 
     * @return Uuid <p>Server Uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Server Uuid</p>
     * @param Uuid <p>Server Uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Login location</p> 
     * @return Locations <p>Login location</p>
     */
    public String getLocations() {
        return this.Locations;
    }

    /**
     * Set <p>Login location</p>
     * @param Locations <p>Login location</p>
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

