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

public class VulFixStatusInfo extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability fixing progress: 1-100;
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Vulnerability fixing status for corresponding hosts
    */
    @SerializedName("HostList")
    @Expose
    private VulFixStatusHostInfo [] HostList;

    /**
    * Number of hosts with failed vulnerability fixing
    */
    @SerializedName("FailCnt")
    @Expose
    private Long FailCnt;

    /**
    * Number of successful repairs
    */
    @SerializedName("FixSuccessCnt")
    @Expose
    private Long FixSuccessCnt;

    /**
    * Repair method. 0: Update components or install patches. 1: Disable service.
    */
    @SerializedName("FixMethod")
    @Expose
    private Long FixMethod;

    /**
    * kb ID
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * kb number
    */
    @SerializedName("KbNumber")
    @Expose
    private String KbNumber;

    /**
    * kb name
    */
    @SerializedName("KbName")
    @Expose
    private String KbName;

    /**
    * Pre kb list
    */
    @SerializedName("PreKbList")
    @Expose
    private String [] PreKbList;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability fixing progress: 1-100; 
     * @return Progress Vulnerability fixing progress: 1-100;
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Vulnerability fixing progress: 1-100;
     * @param Progress Vulnerability fixing progress: 1-100;
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Vulnerability fixing status for corresponding hosts 
     * @return HostList Vulnerability fixing status for corresponding hosts
     */
    public VulFixStatusHostInfo [] getHostList() {
        return this.HostList;
    }

    /**
     * Set Vulnerability fixing status for corresponding hosts
     * @param HostList Vulnerability fixing status for corresponding hosts
     */
    public void setHostList(VulFixStatusHostInfo [] HostList) {
        this.HostList = HostList;
    }

    /**
     * Get Number of hosts with failed vulnerability fixing 
     * @return FailCnt Number of hosts with failed vulnerability fixing
     */
    public Long getFailCnt() {
        return this.FailCnt;
    }

    /**
     * Set Number of hosts with failed vulnerability fixing
     * @param FailCnt Number of hosts with failed vulnerability fixing
     */
    public void setFailCnt(Long FailCnt) {
        this.FailCnt = FailCnt;
    }

    /**
     * Get Number of successful repairs 
     * @return FixSuccessCnt Number of successful repairs
     */
    public Long getFixSuccessCnt() {
        return this.FixSuccessCnt;
    }

    /**
     * Set Number of successful repairs
     * @param FixSuccessCnt Number of successful repairs
     */
    public void setFixSuccessCnt(Long FixSuccessCnt) {
        this.FixSuccessCnt = FixSuccessCnt;
    }

    /**
     * Get Repair method. 0: Update components or install patches. 1: Disable service. 
     * @return FixMethod Repair method. 0: Update components or install patches. 1: Disable service.
     */
    public Long getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set Repair method. 0: Update components or install patches. 1: Disable service.
     * @param FixMethod Repair method. 0: Update components or install patches. 1: Disable service.
     */
    public void setFixMethod(Long FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get kb ID 
     * @return KbId kb ID
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set kb ID
     * @param KbId kb ID
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get kb number 
     * @return KbNumber kb number
     */
    public String getKbNumber() {
        return this.KbNumber;
    }

    /**
     * Set kb number
     * @param KbNumber kb number
     */
    public void setKbNumber(String KbNumber) {
        this.KbNumber = KbNumber;
    }

    /**
     * Get kb name 
     * @return KbName kb name
     */
    public String getKbName() {
        return this.KbName;
    }

    /**
     * Set kb name
     * @param KbName kb name
     */
    public void setKbName(String KbName) {
        this.KbName = KbName;
    }

    /**
     * Get Pre kb list 
     * @return PreKbList Pre kb list
     */
    public String [] getPreKbList() {
        return this.PreKbList;
    }

    /**
     * Set Pre kb list
     * @param PreKbList Pre kb list
     */
    public void setPreKbList(String [] PreKbList) {
        this.PreKbList = PreKbList;
    }

    public VulFixStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixStatusInfo(VulFixStatusInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.HostList != null) {
            this.HostList = new VulFixStatusHostInfo[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new VulFixStatusHostInfo(source.HostList[i]);
            }
        }
        if (source.FailCnt != null) {
            this.FailCnt = new Long(source.FailCnt);
        }
        if (source.FixSuccessCnt != null) {
            this.FixSuccessCnt = new Long(source.FixSuccessCnt);
        }
        if (source.FixMethod != null) {
            this.FixMethod = new Long(source.FixMethod);
        }
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.KbNumber != null) {
            this.KbNumber = new String(source.KbNumber);
        }
        if (source.KbName != null) {
            this.KbName = new String(source.KbName);
        }
        if (source.PreKbList != null) {
            this.PreKbList = new String[source.PreKbList.length];
            for (int i = 0; i < source.PreKbList.length; i++) {
                this.PreKbList[i] = new String(source.PreKbList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArrayObj(map, prefix + "HostList.", this.HostList);
        this.setParamSimple(map, prefix + "FailCnt", this.FailCnt);
        this.setParamSimple(map, prefix + "FixSuccessCnt", this.FixSuccessCnt);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "KbNumber", this.KbNumber);
        this.setParamSimple(map, prefix + "KbName", this.KbName);
        this.setParamArraySimple(map, prefix + "PreKbList.", this.PreKbList);

    }
}

