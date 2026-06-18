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
    * <p>Allowlisted users (multiple users separated by commas)</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Allowlisted dimension information recorded after the update</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

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
    * <p>Remark</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Whether it applies to all servers: 0 - no; 1 - yes</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>Allowlist ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Server list</p>
    */
    @SerializedName("Hosts")
    @Expose
    private HostInfo [] Hosts;

    /**
    * <p>Region list</p>
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
     * Get <p>Allowlisted users (multiple users separated by commas)</p> 
     * @return UserName <p>Allowlisted users (multiple users separated by commas)</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Allowlisted users (multiple users separated by commas)</p>
     * @param UserName <p>Allowlisted users (multiple users separated by commas)</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Allowlisted dimension information recorded after the update</p> 
     * @return SrcIp <p>Allowlisted dimension information recorded after the update</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>Allowlisted dimension information recorded after the update</p>
     * @param SrcIp <p>Allowlisted dimension information recorded after the update</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
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
     * Get <p>Remark</p> 
     * @return Remark <p>Remark</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remark</p>
     * @param Remark <p>Remark</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Whether it applies to all servers: 0 - no; 1 - yes</p> 
     * @return IsGlobal <p>Whether it applies to all servers: 0 - no; 1 - yes</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>Whether it applies to all servers: 0 - no; 1 - yes</p>
     * @param IsGlobal <p>Whether it applies to all servers: 0 - no; 1 - yes</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
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
     * Get <p>Server list</p> 
     * @return Hosts <p>Server list</p>
     */
    public HostInfo [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set <p>Server list</p>
     * @param Hosts <p>Server list</p>
     */
    public void setHosts(HostInfo [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get <p>Region list</p> 
     * @return Places <p>Region list</p>
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>Region list</p>
     * @param Places <p>Region list</p>
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

