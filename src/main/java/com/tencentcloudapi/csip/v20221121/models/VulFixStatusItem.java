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

public class VulFixStatusItem extends AbstractModel {

    /**
    * Vulnerability ID (empty for KB patch fix tasks)
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Patch ID (empty for vulnerability repair tasks)
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * Vulnerability name or KB patch name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Remediation status of the vulnerability
Enumeration value:
0: In remediation
1: All successful
2: partially failed
3: All failed
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * Total hosts associated with the vulnerability/KB patch
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Number of hosts successfully fixed by the vulnerability/KB patch
    */
    @SerializedName("SuccessHostCount")
    @Expose
    private Long SuccessHostCount;

    /**
    * Number of hosts failed to be fixed for the vulnerability/KB patch
    */
    @SerializedName("FailHostCount")
    @Expose
    private Long FailHostCount;

    /**
     * Get Vulnerability ID (empty for KB patch fix tasks) 
     * @return VulId Vulnerability ID (empty for KB patch fix tasks)
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID (empty for KB patch fix tasks)
     * @param VulId Vulnerability ID (empty for KB patch fix tasks)
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Patch ID (empty for vulnerability repair tasks) 
     * @return KBId Patch ID (empty for vulnerability repair tasks)
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set Patch ID (empty for vulnerability repair tasks)
     * @param KBId Patch ID (empty for vulnerability repair tasks)
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get Vulnerability name or KB patch name 
     * @return VulName Vulnerability name or KB patch name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name or KB patch name
     * @param VulName Vulnerability name or KB patch name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Remediation status of the vulnerability
Enumeration value:
0: In remediation
1: All successful
2: partially failed
3: All failed 
     * @return FixStatus Remediation status of the vulnerability
Enumeration value:
0: In remediation
1: All successful
2: partially failed
3: All failed
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set Remediation status of the vulnerability
Enumeration value:
0: In remediation
1: All successful
2: partially failed
3: All failed
     * @param FixStatus Remediation status of the vulnerability
Enumeration value:
0: In remediation
1: All successful
2: partially failed
3: All failed
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get Total hosts associated with the vulnerability/KB patch 
     * @return HostCount Total hosts associated with the vulnerability/KB patch
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Total hosts associated with the vulnerability/KB patch
     * @param HostCount Total hosts associated with the vulnerability/KB patch
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Number of hosts successfully fixed by the vulnerability/KB patch 
     * @return SuccessHostCount Number of hosts successfully fixed by the vulnerability/KB patch
     */
    public Long getSuccessHostCount() {
        return this.SuccessHostCount;
    }

    /**
     * Set Number of hosts successfully fixed by the vulnerability/KB patch
     * @param SuccessHostCount Number of hosts successfully fixed by the vulnerability/KB patch
     */
    public void setSuccessHostCount(Long SuccessHostCount) {
        this.SuccessHostCount = SuccessHostCount;
    }

    /**
     * Get Number of hosts failed to be fixed for the vulnerability/KB patch 
     * @return FailHostCount Number of hosts failed to be fixed for the vulnerability/KB patch
     */
    public Long getFailHostCount() {
        return this.FailHostCount;
    }

    /**
     * Set Number of hosts failed to be fixed for the vulnerability/KB patch
     * @param FailHostCount Number of hosts failed to be fixed for the vulnerability/KB patch
     */
    public void setFailHostCount(Long FailHostCount) {
        this.FailHostCount = FailHostCount;
    }

    public VulFixStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixStatusItem(VulFixStatusItem source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.SuccessHostCount != null) {
            this.SuccessHostCount = new Long(source.SuccessHostCount);
        }
        if (source.FailHostCount != null) {
            this.FailHostCount = new Long(source.FailHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "SuccessHostCount", this.SuccessHostCount);
        this.setParamSimple(map, prefix + "FailHostCount", this.FailHostCount);

    }
}

