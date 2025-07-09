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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginWhiteLists extends AbstractModel {

    /**
    * Record ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWP agent ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Whitelisted location
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * Whitelisted users (separated by commas)
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Whitelisted IPs (separated by commas)
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Whether this rule is applied to all servers under the current account
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * Whitelist creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whitelist modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Server name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Server IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

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
     * Get Record ID 
     * @return Id Record ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Record ID
     * @param Id Record ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWP agent ID 
     * @return Uuid CWP agent ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent ID
     * @param Uuid CWP agent ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Whitelisted location 
     * @return Places Whitelisted location
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set Whitelisted location
     * @param Places Whitelisted location
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get Whitelisted users (separated by commas) 
     * @return UserName Whitelisted users (separated by commas)
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Whitelisted users (separated by commas)
     * @param UserName Whitelisted users (separated by commas)
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Whitelisted IPs (separated by commas) 
     * @return SrcIp Whitelisted IPs (separated by commas)
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Whitelisted IPs (separated by commas)
     * @param SrcIp Whitelisted IPs (separated by commas)
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Whether this rule is applied to all servers under the current account 
     * @return IsGlobal Whether this rule is applied to all servers under the current account
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether this rule is applied to all servers under the current account
     * @param IsGlobal Whether this rule is applied to all servers under the current account
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Whitelist creation time 
     * @return CreateTime Whitelist creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Whitelist creation time
     * @param CreateTime Whitelist creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whitelist modification time 
     * @return ModifyTime Whitelist modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Whitelist modification time
     * @param ModifyTime Whitelist modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Server name 
     * @return MachineName Server name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name
     * @param MachineName Server name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Server IP 
     * @return HostIp Server IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Server IP
     * @param HostIp Server IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
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

    public LoginWhiteLists() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhiteLists(LoginWhiteLists source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
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
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

