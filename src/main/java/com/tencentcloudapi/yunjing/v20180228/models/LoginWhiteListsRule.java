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

public class LoginWhiteListsRule extends AbstractModel {

    /**
    * Whitelisted location
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * Whitelisted IPs (separated by commas). This parameter can be an IP range.
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Whitelisted usernames (separated by commas)
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Whether this rule is applied to all servers under the current account
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * Server for which the allowlist takes effect
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Rule ID, used for rule updating
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
     * Get Whitelisted IPs (separated by commas). This parameter can be an IP range. 
     * @return SrcIp Whitelisted IPs (separated by commas). This parameter can be an IP range.
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Whitelisted IPs (separated by commas). This parameter can be an IP range.
     * @param SrcIp Whitelisted IPs (separated by commas). This parameter can be an IP range.
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Whitelisted usernames (separated by commas) 
     * @return UserName Whitelisted usernames (separated by commas)
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Whitelisted usernames (separated by commas)
     * @param UserName Whitelisted usernames (separated by commas)
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get Server for which the allowlist takes effect 
     * @return HostIp Server for which the allowlist takes effect
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Server for which the allowlist takes effect
     * @param HostIp Server for which the allowlist takes effect
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Rule ID, used for rule updating 
     * @return Id Rule ID, used for rule updating
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID, used for rule updating
     * @param Id Rule ID, used for rule updating
     */
    public void setId(Long Id) {
        this.Id = Id;
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

    public LoginWhiteListsRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhiteListsRule(LoginWhiteListsRule source) {
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

