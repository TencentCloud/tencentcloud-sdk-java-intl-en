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

public class HostLoginWhiteObj extends AbstractModel {

    /**
    * Allowlisted region
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Allowlisted username separated by commas
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Whether the allowlist is effective globally. 1: all hosts; 0: only a single host.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * List of information on machines where the allowlist is effective
    */
    @SerializedName("HostInfos")
    @Expose
    private HostInfo [] HostInfos;

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
     * Get Allowlisted region 
     * @return Places Allowlisted region
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set Allowlisted region
     * @param Places Allowlisted region
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas. 
     * @return SrcIp Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.
     * @param SrcIp Allowlisted source IP address. IP ranges are supported. Multiple IPs are separated by commas.
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Allowlisted username separated by commas 
     * @return UserName Allowlisted username separated by commas
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Allowlisted username separated by commas
     * @param UserName Allowlisted username separated by commas
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Whether the allowlist is effective globally. 1: all hosts; 0: only a single host. 
     * @return IsGlobal Whether the allowlist is effective globally. 1: all hosts; 0: only a single host.
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the allowlist is effective globally. 1: all hosts; 0: only a single host.
     * @param IsGlobal Whether the allowlist is effective globally. 1: all hosts; 0: only a single host.
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get List of information on machines where the allowlist is effective 
     * @return HostInfos List of information on machines where the allowlist is effective
     */
    public HostInfo [] getHostInfos() {
        return this.HostInfos;
    }

    /**
     * Set List of information on machines where the allowlist is effective
     * @param HostInfos List of information on machines where the allowlist is effective
     */
    public void setHostInfos(HostInfo [] HostInfos) {
        this.HostInfos = HostInfos;
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

