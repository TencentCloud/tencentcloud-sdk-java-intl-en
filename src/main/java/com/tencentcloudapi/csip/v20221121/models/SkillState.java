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

public class SkillState extends AbstractModel {

    /**
    * SKILL Installation Status
Enumeration value:
0: Not installed
Installing
2: Installed
3: Installation failure
4: Uninstalling
5: Uninstallation failed.
    */
    @SerializedName("SkillInstallStatus")
    @Expose
    private Long SkillInstallStatus;

    /**
    * SKILL installation/uninstallation operation time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("SkillInstallTime")
    @Expose
    private String SkillInstallTime;

    /**
    * SKILL installation/uninstallation result description information
    */
    @SerializedName("SkillInstallResult")
    @Expose
    private String SkillInstallResult;

    /**
     * Get SKILL Installation Status
Enumeration value:
0: Not installed
Installing
2: Installed
3: Installation failure
4: Uninstalling
5: Uninstallation failed. 
     * @return SkillInstallStatus SKILL Installation Status
Enumeration value:
0: Not installed
Installing
2: Installed
3: Installation failure
4: Uninstalling
5: Uninstallation failed.
     */
    public Long getSkillInstallStatus() {
        return this.SkillInstallStatus;
    }

    /**
     * Set SKILL Installation Status
Enumeration value:
0: Not installed
Installing
2: Installed
3: Installation failure
4: Uninstalling
5: Uninstallation failed.
     * @param SkillInstallStatus SKILL Installation Status
Enumeration value:
0: Not installed
Installing
2: Installed
3: Installation failure
4: Uninstalling
5: Uninstallation failed.
     */
    public void setSkillInstallStatus(Long SkillInstallStatus) {
        this.SkillInstallStatus = SkillInstallStatus;
    }

    /**
     * Get SKILL installation/uninstallation operation time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return SkillInstallTime SKILL installation/uninstallation operation time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getSkillInstallTime() {
        return this.SkillInstallTime;
    }

    /**
     * Set SKILL installation/uninstallation operation time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param SkillInstallTime SKILL installation/uninstallation operation time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setSkillInstallTime(String SkillInstallTime) {
        this.SkillInstallTime = SkillInstallTime;
    }

    /**
     * Get SKILL installation/uninstallation result description information 
     * @return SkillInstallResult SKILL installation/uninstallation result description information
     */
    public String getSkillInstallResult() {
        return this.SkillInstallResult;
    }

    /**
     * Set SKILL installation/uninstallation result description information
     * @param SkillInstallResult SKILL installation/uninstallation result description information
     */
    public void setSkillInstallResult(String SkillInstallResult) {
        this.SkillInstallResult = SkillInstallResult;
    }

    public SkillState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillState(SkillState source) {
        if (source.SkillInstallStatus != null) {
            this.SkillInstallStatus = new Long(source.SkillInstallStatus);
        }
        if (source.SkillInstallTime != null) {
            this.SkillInstallTime = new String(source.SkillInstallTime);
        }
        if (source.SkillInstallResult != null) {
            this.SkillInstallResult = new String(source.SkillInstallResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillInstallStatus", this.SkillInstallStatus);
        this.setParamSimple(map, prefix + "SkillInstallTime", this.SkillInstallTime);
        this.setParamSimple(map, prefix + "SkillInstallResult", this.SkillInstallResult);

    }
}

