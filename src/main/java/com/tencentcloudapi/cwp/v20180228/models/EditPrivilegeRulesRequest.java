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

public class EditPrivilegeRulesRequest extends AbstractModel {

    /**
    * Rule ID (Leave it blank when adding rules.)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID array
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * Host IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Whether it is a S permission process
    */
    @SerializedName("SMode")
    @Expose
    private Long SMode;

    /**
    * Whether the rule is global (not global by default)
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * ID of the associated event when the user clicks Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get Rule ID (Leave it blank when adding rules.) 
     * @return Id Rule ID (Leave it blank when adding rules.)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID (Leave it blank when adding rules.)
     * @param Id Rule ID (Leave it blank when adding rules.)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Client ID array 
     * @return Uuids Client ID array
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Client ID array
     * @param Uuids Client ID array
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
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
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Whether it is a S permission process 
     * @return SMode Whether it is a S permission process
     */
    public Long getSMode() {
        return this.SMode;
    }

    /**
     * Set Whether it is a S permission process
     * @param SMode Whether it is a S permission process
     */
    public void setSMode(Long SMode) {
        this.SMode = SMode;
    }

    /**
     * Get Whether the rule is global (not global by default) 
     * @return IsGlobal Whether the rule is global (not global by default)
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the rule is global (not global by default)
     * @param IsGlobal Whether the rule is global (not global by default)
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get ID of the associated event when the user clicks Add to Allowlist on the event list and details page (leave this parameter blank for rule addition) 
     * @return EventId ID of the associated event when the user clicks Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set ID of the associated event when the user clicks Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
     * @param EventId ID of the associated event when the user clicks Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public EditPrivilegeRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditPrivilegeRulesRequest(EditPrivilegeRulesRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.SMode != null) {
            this.SMode = new Long(source.SMode);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "SMode", this.SMode);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

