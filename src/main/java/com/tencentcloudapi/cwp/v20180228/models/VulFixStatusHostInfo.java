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

public class VulFixStatusHostInfo extends AbstractModel {

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Status. 0: initial status; 1: task issued (fixing); 2: completed (successful); 3: fixing failed (failed); 4: fixing failed due to snapshot creation failure (unfixed).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Fixing time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Fixing failure cause
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host IP 
     * @return HostIp Host IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP
     * @param HostIp Host IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Status. 0: initial status; 1: task issued (fixing); 2: completed (successful); 3: fixing failed (failed); 4: fixing failed due to snapshot creation failure (unfixed). 
     * @return Status Status. 0: initial status; 1: task issued (fixing); 2: completed (successful); 3: fixing failed (failed); 4: fixing failed due to snapshot creation failure (unfixed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: initial status; 1: task issued (fixing); 2: completed (successful); 3: fixing failed (failed); 4: fixing failed due to snapshot creation failure (unfixed).
     * @param Status Status. 0: initial status; 1: task issued (fixing); 2: completed (successful); 3: fixing failed (failed); 4: fixing failed due to snapshot creation failure (unfixed).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Fixing time 
     * @return ModifyTime Fixing time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Fixing time
     * @param ModifyTime Fixing time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Fixing failure cause
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailReason Fixing failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Fixing failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailReason Fixing failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    public VulFixStatusHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixStatusHostInfo(VulFixStatusHostInfo source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);

    }
}

