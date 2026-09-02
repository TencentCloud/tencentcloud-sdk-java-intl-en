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

public class HostLoginWhiteObj extends AbstractModel {

    /**
    * <p>Add a region to the allowlist</p>
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * <p>Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>Allowlisted username separated by commas</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Whether it is effective globally. 1: all hosts; 0: only a single host&#39;</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>Machine information list with allowlist effective</p>
    */
    @SerializedName("HostInfos")
    @Expose
    private HostInfo [] HostInfos;

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
     * Get <p>Add a region to the allowlist</p> 
     * @return Places <p>Add a region to the allowlist</p>
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>Add a region to the allowlist</p>
     * @param Places <p>Add a region to the allowlist</p>
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get <p>Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.</p> 
     * @return SrcIp <p>Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.</p>
     * @param SrcIp <p>Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>Allowlisted username separated by commas</p> 
     * @return UserName <p>Allowlisted username separated by commas</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Allowlisted username separated by commas</p>
     * @param UserName <p>Allowlisted username separated by commas</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Whether it is effective globally. 1: all hosts; 0: only a single host&#39;</p> 
     * @return IsGlobal <p>Whether it is effective globally. 1: all hosts; 0: only a single host&#39;</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>Whether it is effective globally. 1: all hosts; 0: only a single host&#39;</p>
     * @param IsGlobal <p>Whether it is effective globally. 1: all hosts; 0: only a single host&#39;</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>Machine information list with allowlist effective</p> 
     * @return HostInfos <p>Machine information list with allowlist effective</p>
     */
    public HostInfo [] getHostInfos() {
        return this.HostInfos;
    }

    /**
     * Set <p>Machine information list with allowlist effective</p>
     * @param HostInfos <p>Machine information list with allowlist effective</p>
     */
    public void setHostInfos(HostInfo [] HostInfos) {
        this.HostInfos = HostInfos;
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

    public HostLoginWhiteObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostLoginWhiteObj(HostLoginWhiteObj source) {
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
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.HostInfos != null) {
            this.HostInfos = new HostInfo[source.HostInfos.length];
            for (int i = 0; i < source.HostInfos.length; i++) {
                this.HostInfos[i] = new HostInfo(source.HostInfos[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArrayObj(map, prefix + "HostInfos.", this.HostInfos);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

