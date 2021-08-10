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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunVersionPod extends AbstractModel{

    /**
    * Shell address
    */
    @SerializedName("Webshell")
    @Expose
    private String Webshell;

    /**
    * Pod ID
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Pod IP.
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Availability zone.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Deployed version.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * Number of Restarts
Note: This is field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
     * Get Shell address 
     * @return Webshell Shell address
     */
    public String getWebshell() {
        return this.Webshell;
    }

    /**
     * Set Shell address
     * @param Webshell Shell address
     */
    public void setWebshell(String Webshell) {
        this.Webshell = Webshell;
    }

    /**
     * Get Pod ID 
     * @return PodId Pod ID
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set Pod ID
     * @param PodId Pod ID
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Pod IP. 
     * @return PodIp Pod IP.
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set Pod IP.
     * @param PodIp Pod IP.
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get Availability zone.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Zone Availability zone.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Zone Availability zone.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Deployed version.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return DeployVersion Deployed version.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set Deployed version.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param DeployVersion Deployed version.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get Number of Restarts
Note: This is field may return `null`, indicating that no valid value can be obtained. 
     * @return RestartCount Number of Restarts
Note: This is field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set Number of Restarts
Note: This is field may return `null`, indicating that no valid value can be obtained.
     * @param RestartCount Number of Restarts
Note: This is field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    public RunVersionPod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunVersionPod(RunVersionPod source) {
        if (source.Webshell != null) {
            this.Webshell = new String(source.Webshell);
        }
        if (source.PodId != null) {
            this.PodId = new String(source.PodId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Webshell", this.Webshell);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);

    }
}

