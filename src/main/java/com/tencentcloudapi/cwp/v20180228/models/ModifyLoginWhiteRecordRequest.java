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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoginWhiteRecordRequest extends AbstractModel {

    /**
    * Allowlisted users (Multiple users are separated by commas.)
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Allowlisted dimension information recorded after the update
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

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
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether it applies to all servers: 0: no; 1: yes
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Allowlist ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Server list
    */
    @SerializedName("Hosts")
    @Expose
    private HostInfo [] Hosts;

    /**
    * Region list
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

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
     * Get Allowlisted dimension information recorded after the update 
     * @return SrcIp Allowlisted dimension information recorded after the update
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Allowlisted dimension information recorded after the update
     * @param SrcIp Allowlisted dimension information recorded after the update
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
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
     * Get Whether it applies to all servers: 0: no; 1: yes 
     * @return IsGlobal Whether it applies to all servers: 0: no; 1: yes
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether it applies to all servers: 0: no; 1: yes
     * @param IsGlobal Whether it applies to all servers: 0: no; 1: yes
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
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
     * Get Server list 
     * @return Hosts Server list
     */
    public HostInfo [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Server list
     * @param Hosts Server list
     */
    public void setHosts(HostInfo [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Region list 
     * @return Places Region list
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set Region list
     * @param Places Region list
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    public ModifyLoginWhiteRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginWhiteRecordRequest(ModifyLoginWhiteRecordRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Hosts != null) {
            this.Hosts = new HostInfo[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new HostInfo(source.Hosts[i]);
            }
        }
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Hosts.", this.Hosts);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);

    }
}

