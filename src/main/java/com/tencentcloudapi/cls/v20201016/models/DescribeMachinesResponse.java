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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachinesResponse extends AbstractModel{

    /**
    * Group of machine status information
    */
    @SerializedName("Machines")
    @Expose
    private MachineInfo [] Machines;

    /**
    * Whether to enable the automatic update feature for the machine group
    */
    @SerializedName("AutoUpdate")
    @Expose
    private Long AutoUpdate;

    /**
    * Preset start time of automatic update of machine group
    */
    @SerializedName("UpdateStartTime")
    @Expose
    private String UpdateStartTime;

    /**
    * Preset end time of automatic update of machine group
    */
    @SerializedName("UpdateEndTime")
    @Expose
    private String UpdateEndTime;

    /**
    * Latest LogListener version available to the current user
    */
    @SerializedName("LatestAgentVersion")
    @Expose
    private String LatestAgentVersion;

    /**
    * Whether to enable the service log
    */
    @SerializedName("ServiceLogging")
    @Expose
    private Boolean ServiceLogging;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Group of machine status information 
     * @return Machines Group of machine status information
     */
    public MachineInfo [] getMachines() {
        return this.Machines;
    }

    /**
     * Set Group of machine status information
     * @param Machines Group of machine status information
     */
    public void setMachines(MachineInfo [] Machines) {
        this.Machines = Machines;
    }

    /**
     * Get Whether to enable the automatic update feature for the machine group 
     * @return AutoUpdate Whether to enable the automatic update feature for the machine group
     */
    public Long getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set Whether to enable the automatic update feature for the machine group
     * @param AutoUpdate Whether to enable the automatic update feature for the machine group
     */
    public void setAutoUpdate(Long AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get Preset start time of automatic update of machine group 
     * @return UpdateStartTime Preset start time of automatic update of machine group
     */
    public String getUpdateStartTime() {
        return this.UpdateStartTime;
    }

    /**
     * Set Preset start time of automatic update of machine group
     * @param UpdateStartTime Preset start time of automatic update of machine group
     */
    public void setUpdateStartTime(String UpdateStartTime) {
        this.UpdateStartTime = UpdateStartTime;
    }

    /**
     * Get Preset end time of automatic update of machine group 
     * @return UpdateEndTime Preset end time of automatic update of machine group
     */
    public String getUpdateEndTime() {
        return this.UpdateEndTime;
    }

    /**
     * Set Preset end time of automatic update of machine group
     * @param UpdateEndTime Preset end time of automatic update of machine group
     */
    public void setUpdateEndTime(String UpdateEndTime) {
        this.UpdateEndTime = UpdateEndTime;
    }

    /**
     * Get Latest LogListener version available to the current user 
     * @return LatestAgentVersion Latest LogListener version available to the current user
     */
    public String getLatestAgentVersion() {
        return this.LatestAgentVersion;
    }

    /**
     * Set Latest LogListener version available to the current user
     * @param LatestAgentVersion Latest LogListener version available to the current user
     */
    public void setLatestAgentVersion(String LatestAgentVersion) {
        this.LatestAgentVersion = LatestAgentVersion;
    }

    /**
     * Get Whether to enable the service log 
     * @return ServiceLogging Whether to enable the service log
     */
    public Boolean getServiceLogging() {
        return this.ServiceLogging;
    }

    /**
     * Set Whether to enable the service log
     * @param ServiceLogging Whether to enable the service log
     */
    public void setServiceLogging(Boolean ServiceLogging) {
        this.ServiceLogging = ServiceLogging;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMachinesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachinesResponse(DescribeMachinesResponse source) {
        if (source.Machines != null) {
            this.Machines = new MachineInfo[source.Machines.length];
            for (int i = 0; i < source.Machines.length; i++) {
                this.Machines[i] = new MachineInfo(source.Machines[i]);
            }
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new Long(source.AutoUpdate);
        }
        if (source.UpdateStartTime != null) {
            this.UpdateStartTime = new String(source.UpdateStartTime);
        }
        if (source.UpdateEndTime != null) {
            this.UpdateEndTime = new String(source.UpdateEndTime);
        }
        if (source.LatestAgentVersion != null) {
            this.LatestAgentVersion = new String(source.LatestAgentVersion);
        }
        if (source.ServiceLogging != null) {
            this.ServiceLogging = new Boolean(source.ServiceLogging);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);
        this.setParamSimple(map, prefix + "AutoUpdate", this.AutoUpdate);
        this.setParamSimple(map, prefix + "UpdateStartTime", this.UpdateStartTime);
        this.setParamSimple(map, prefix + "UpdateEndTime", this.UpdateEndTime);
        this.setParamSimple(map, prefix + "LatestAgentVersion", this.LatestAgentVersion);
        this.setParamSimple(map, prefix + "ServiceLogging", this.ServiceLogging);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

