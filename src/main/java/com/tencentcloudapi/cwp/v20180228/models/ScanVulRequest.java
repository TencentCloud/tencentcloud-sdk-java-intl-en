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

public class ScanVulRequest extends AbstractModel {

    /**
    * Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
    */
    @SerializedName("VulLevels")
    @Expose
    private String VulLevels;

    /**
    * Server type. 1: Pro Edition server; 2: selected server.
    */
    @SerializedName("HostType")
    @Expose
    private Long HostType;

    /**
    * Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability (separate multiple values by commas).
    */
    @SerializedName("VulCategories")
    @Expose
    private String VulCategories;

    /**
    * String array of host QUUIDs. This parameter is effective for selected servers.
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * Whether it is an emergency vulnerability. 0: no; 1: yes.
    */
    @SerializedName("VulEmergency")
    @Expose
    private Long VulEmergency;

    /**
    * Scan duration, in seconds. Default duration: 3,600 second.
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
    * IDs of vulnerabilities to be scanned
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * 
    */
    @SerializedName("ScanMethod")
    @Expose
    private Long ScanMethod;

    /**
     * Get Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities. 
     * @return VulLevels Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
     */
    public String getVulLevels() {
        return this.VulLevels;
    }

    /**
     * Set Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
     * @param VulLevels Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
     */
    public void setVulLevels(String VulLevels) {
        this.VulLevels = VulLevels;
    }

    /**
     * Get Server type. 1: Pro Edition server; 2: selected server. 
     * @return HostType Server type. 1: Pro Edition server; 2: selected server.
     */
    public Long getHostType() {
        return this.HostType;
    }

    /**
     * Set Server type. 1: Pro Edition server; 2: selected server.
     * @param HostType Server type. 1: Pro Edition server; 2: selected server.
     */
    public void setHostType(Long HostType) {
        this.HostType = HostType;
    }

    /**
     * Get Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability (separate multiple values by commas). 
     * @return VulCategories Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability (separate multiple values by commas).
     */
    public String getVulCategories() {
        return this.VulCategories;
    }

    /**
     * Set Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability (separate multiple values by commas).
     * @param VulCategories Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability (separate multiple values by commas).
     */
    public void setVulCategories(String VulCategories) {
        this.VulCategories = VulCategories;
    }

    /**
     * Get String array of host QUUIDs. This parameter is effective for selected servers. 
     * @return QuuidList String array of host QUUIDs. This parameter is effective for selected servers.
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set String array of host QUUIDs. This parameter is effective for selected servers.
     * @param QuuidList String array of host QUUIDs. This parameter is effective for selected servers.
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get Whether it is an emergency vulnerability. 0: no; 1: yes. 
     * @return VulEmergency Whether it is an emergency vulnerability. 0: no; 1: yes.
     */
    public Long getVulEmergency() {
        return this.VulEmergency;
    }

    /**
     * Set Whether it is an emergency vulnerability. 0: no; 1: yes.
     * @param VulEmergency Whether it is an emergency vulnerability. 0: no; 1: yes.
     */
    public void setVulEmergency(Long VulEmergency) {
        this.VulEmergency = VulEmergency;
    }

    /**
     * Get Scan duration, in seconds. Default duration: 3,600 second. 
     * @return TimeoutPeriod Scan duration, in seconds. Default duration: 3,600 second.
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set Scan duration, in seconds. Default duration: 3,600 second.
     * @param TimeoutPeriod Scan duration, in seconds. Default duration: 3,600 second.
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    /**
     * Get IDs of vulnerabilities to be scanned 
     * @return VulIds IDs of vulnerabilities to be scanned
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set IDs of vulnerabilities to be scanned
     * @param VulIds IDs of vulnerabilities to be scanned
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get  
     * @return ScanMethod 
     */
    public Long getScanMethod() {
        return this.ScanMethod;
    }

    /**
     * Set 
     * @param ScanMethod 
     */
    public void setScanMethod(Long ScanMethod) {
        this.ScanMethod = ScanMethod;
    }

    public ScanVulRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanVulRequest(ScanVulRequest source) {
        if (source.VulLevels != null) {
            this.VulLevels = new String(source.VulLevels);
        }
        if (source.HostType != null) {
            this.HostType = new Long(source.HostType);
        }
        if (source.VulCategories != null) {
            this.VulCategories = new String(source.VulCategories);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.VulEmergency != null) {
            this.VulEmergency = new Long(source.VulEmergency);
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.ScanMethod != null) {
            this.ScanMethod = new Long(source.ScanMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulLevels", this.VulLevels);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "VulCategories", this.VulCategories);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "VulEmergency", this.VulEmergency);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamSimple(map, prefix + "ScanMethod", this.ScanMethod);

    }
}

