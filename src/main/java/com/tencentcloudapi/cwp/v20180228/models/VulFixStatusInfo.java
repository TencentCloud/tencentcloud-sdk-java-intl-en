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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostList")
    @Expose
    private VulFixStatusHostInfo [] HostList;

    /**
    * Number of hosts with failed vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailCnt")
    @Expose
    private Long FailCnt;

    /**
    * Number of hosts with successful vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixSuccessCnt")
    @Expose
    private Long FixSuccessCnt;

    /**
    * 
    */
    @SerializedName("FixMethod")
    @Expose
    private Long FixMethod;

    /**
     * Get Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulId Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulId Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostList Vulnerability fixing status for corresponding hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VulFixStatusHostInfo [] getHostList() {
        return this.HostList;
    }

    /**
     * Set Vulnerability fixing status for corresponding hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostList Vulnerability fixing status for corresponding hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostList(VulFixStatusHostInfo [] HostList) {
        this.HostList = HostList;
    }

    /**
     * Get Number of hosts with failed vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailCnt Number of hosts with failed vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFailCnt() {
        return this.FailCnt;
    }

    /**
     * Set Number of hosts with failed vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailCnt Number of hosts with failed vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailCnt(Long FailCnt) {
        this.FailCnt = FailCnt;
    }

    /**
     * Get Number of hosts with successful vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FixSuccessCnt Number of hosts with successful vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFixSuccessCnt() {
        return this.FixSuccessCnt;
    }

    /**
     * Set Number of hosts with successful vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FixSuccessCnt Number of hosts with successful vulnerability fixing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFixSuccessCnt(Long FixSuccessCnt) {
        this.FixSuccessCnt = FixSuccessCnt;
    }

    /**
     * Get  
     * @return FixMethod 
     */
    public Long getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set 
     * @param FixMethod 
     */
    public void setFixMethod(Long FixMethod) {
        this.FixMethod = FixMethod;
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

    }
}

