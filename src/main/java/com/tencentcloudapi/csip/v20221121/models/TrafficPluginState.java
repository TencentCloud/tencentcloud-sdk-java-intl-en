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

public class TrafficPluginState extends AbstractModel {

    /**
    * Plugin installation status (upper layer aggregation)
Enumeration value:
NONE: Not installed
INSTALLING
INSTALLED: Installed
INSTALL_FAIL: Installation failure
    */
    @SerializedName("InstallStatus")
    @Expose
    private String InstallStatus;

    /**
    * Plugin installation sub-status. The value corresponds to InstallStatus: empty string when not installed (InstallStatus=UNINSTALL); SUCCESS when successfully installed (InstallStatus=INSTALLED); specific failure reason when installation failure (InstallStatus=INSTALL_FAIL).
Enumeration value:
NOT_SUPPORT: Unsupported environment
CONTAINER_NOT_FOUND: Container does not exist.
RESTART required
CA_FAILED: CA failed
EBPF_FAILED: eBPF failed
IPTABLE_FAILED: iptables failed.
REDIRECT_FAILED: Traffic redirection failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status copywriting (internationalization description derived from Status based on request language)
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Recent activity time of the plug-in
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("ActivityTime")
    @Expose
    private String ActivityTime;

    /**
     * Get Plugin installation status (upper layer aggregation)
Enumeration value:
NONE: Not installed
INSTALLING
INSTALLED: Installed
INSTALL_FAIL: Installation failure 
     * @return InstallStatus Plugin installation status (upper layer aggregation)
Enumeration value:
NONE: Not installed
INSTALLING
INSTALLED: Installed
INSTALL_FAIL: Installation failure
     */
    public String getInstallStatus() {
        return this.InstallStatus;
    }

    /**
     * Set Plugin installation status (upper layer aggregation)
Enumeration value:
NONE: Not installed
INSTALLING
INSTALLED: Installed
INSTALL_FAIL: Installation failure
     * @param InstallStatus Plugin installation status (upper layer aggregation)
Enumeration value:
NONE: Not installed
INSTALLING
INSTALLED: Installed
INSTALL_FAIL: Installation failure
     */
    public void setInstallStatus(String InstallStatus) {
        this.InstallStatus = InstallStatus;
    }

    /**
     * Get Plugin installation sub-status. The value corresponds to InstallStatus: empty string when not installed (InstallStatus=UNINSTALL); SUCCESS when successfully installed (InstallStatus=INSTALLED); specific failure reason when installation failure (InstallStatus=INSTALL_FAIL).
Enumeration value:
NOT_SUPPORT: Unsupported environment
CONTAINER_NOT_FOUND: Container does not exist.
RESTART required
CA_FAILED: CA failed
EBPF_FAILED: eBPF failed
IPTABLE_FAILED: iptables failed.
REDIRECT_FAILED: Traffic redirection failed. 
     * @return Status Plugin installation sub-status. The value corresponds to InstallStatus: empty string when not installed (InstallStatus=UNINSTALL); SUCCESS when successfully installed (InstallStatus=INSTALLED); specific failure reason when installation failure (InstallStatus=INSTALL_FAIL).
Enumeration value:
NOT_SUPPORT: Unsupported environment
CONTAINER_NOT_FOUND: Container does not exist.
RESTART required
CA_FAILED: CA failed
EBPF_FAILED: eBPF failed
IPTABLE_FAILED: iptables failed.
REDIRECT_FAILED: Traffic redirection failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Plugin installation sub-status. The value corresponds to InstallStatus: empty string when not installed (InstallStatus=UNINSTALL); SUCCESS when successfully installed (InstallStatus=INSTALLED); specific failure reason when installation failure (InstallStatus=INSTALL_FAIL).
Enumeration value:
NOT_SUPPORT: Unsupported environment
CONTAINER_NOT_FOUND: Container does not exist.
RESTART required
CA_FAILED: CA failed
EBPF_FAILED: eBPF failed
IPTABLE_FAILED: iptables failed.
REDIRECT_FAILED: Traffic redirection failed.
     * @param Status Plugin installation sub-status. The value corresponds to InstallStatus: empty string when not installed (InstallStatus=UNINSTALL); SUCCESS when successfully installed (InstallStatus=INSTALLED); specific failure reason when installation failure (InstallStatus=INSTALL_FAIL).
Enumeration value:
NOT_SUPPORT: Unsupported environment
CONTAINER_NOT_FOUND: Container does not exist.
RESTART required
CA_FAILED: CA failed
EBPF_FAILED: eBPF failed
IPTABLE_FAILED: iptables failed.
REDIRECT_FAILED: Traffic redirection failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status copywriting (internationalization description derived from Status based on request language) 
     * @return Message Status copywriting (internationalization description derived from Status based on request language)
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Status copywriting (internationalization description derived from Status based on request language)
     * @param Message Status copywriting (internationalization description derived from Status based on request language)
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Recent activity time of the plug-in
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return ActivityTime Recent activity time of the plug-in
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getActivityTime() {
        return this.ActivityTime;
    }

    /**
     * Set Recent activity time of the plug-in
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param ActivityTime Recent activity time of the plug-in
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setActivityTime(String ActivityTime) {
        this.ActivityTime = ActivityTime;
    }

    public TrafficPluginState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPluginState(TrafficPluginState source) {
        if (source.InstallStatus != null) {
            this.InstallStatus = new String(source.InstallStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ActivityTime != null) {
            this.ActivityTime = new String(source.ActivityTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstallStatus", this.InstallStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ActivityTime", this.ActivityTime);

    }
}

