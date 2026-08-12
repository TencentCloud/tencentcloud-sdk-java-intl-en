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

public class VulHostBriefInfo extends AbstractModel {

    /**
    * <p>Cloud host instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Public network IP address</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>Private IP address</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>Protection edition<br>Enumeration value:<br>NONE: No protection<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition<br>PRO_LH: Lightweight edition</p>
    */
    @SerializedName("DefendVersion")
    @Expose
    private String DefendVersion;

    /**
    * <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>Associated account information</p>
    */
    @SerializedName("Account")
    @Expose
    private AccountBriefInfo Account;

    /**
    * <p>Cloud host instance status<br>Enumeration value:<br>RUNNING: running<br>STOPPED: stopped<br>UNKNOWN: unknown</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Remediation status enumeration values.</p><p>Enumeration values: </p><ul><li>PENDING: To be fixed, </li><li>SCANNING: Scan in progress, </li><li>FIXED: Fixed, </li><li>IGNORED: Ignored, </li><li>FIXING: In remediation, </li><li>FIX_FAILED: Fix failure, </li><li>NEED_REBOOT: Pending restart.</li></ul>
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * <p>VPR rating information (including rating result and details in each dimension)</p>
    */
    @SerializedName("VPRRating")
    @Expose
    private VPRRatingInfo VPRRating;

    /**
    * <p>CWP Agent status<br>Enumeration value:<br>ONLINE: Online<br>OFFLINE: Offline<br>UNINSTALLED: Not installed</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>Asset tag list (CSIP internal asset tag)</p>
    */
    @SerializedName("TagItem")
    @Expose
    private MiniTagItem [] TagItem;

    /**
    * <p>Cloud tag list (cloud asset side Tag)</p>
    */
    @SerializedName("CloudTag")
    @Expose
    private Tag [] CloudTag;

    /**
     * Get <p>Cloud host instance ID<br>Parameter format: such as ins-xxxxxxxx</p> 
     * @return InstanceID <p>Cloud host instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Cloud host instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
     * @param InstanceID <p>Cloud host instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Host name.</p> 
     * @return Name <p>Host name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Host name.</p>
     * @param Name <p>Host name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Public network IP address</p> 
     * @return PublicIP <p>Public network IP address</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>Public network IP address</p>
     * @param PublicIP <p>Public network IP address</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>Private IP address</p> 
     * @return PrivateIP <p>Private IP address</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>Private IP address</p>
     * @param PrivateIP <p>Private IP address</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>Protection edition<br>Enumeration value:<br>NONE: No protection<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition<br>PRO_LH: Lightweight edition</p> 
     * @return DefendVersion <p>Protection edition<br>Enumeration value:<br>NONE: No protection<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition<br>PRO_LH: Lightweight edition</p>
     */
    public String getDefendVersion() {
        return this.DefendVersion;
    }

    /**
     * Set <p>Protection edition<br>Enumeration value:<br>NONE: No protection<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition<br>PRO_LH: Lightweight edition</p>
     * @param DefendVersion <p>Protection edition<br>Enumeration value:<br>NONE: No protection<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition<br>PRO_LH: Lightweight edition</p>
     */
    public void setDefendVersion(String DefendVersion) {
        this.DefendVersion = DefendVersion;
    }

    /**
     * Get <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p> 
     * @return DefendStatus <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
     * @param DefendStatus <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>Associated account information</p> 
     * @return Account <p>Associated account information</p>
     */
    public AccountBriefInfo getAccount() {
        return this.Account;
    }

    /**
     * Set <p>Associated account information</p>
     * @param Account <p>Associated account information</p>
     */
    public void setAccount(AccountBriefInfo Account) {
        this.Account = Account;
    }

    /**
     * Get <p>Cloud host instance status<br>Enumeration value:<br>RUNNING: running<br>STOPPED: stopped<br>UNKNOWN: unknown</p> 
     * @return InstanceStatus <p>Cloud host instance status<br>Enumeration value:<br>RUNNING: running<br>STOPPED: stopped<br>UNKNOWN: unknown</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Cloud host instance status<br>Enumeration value:<br>RUNNING: running<br>STOPPED: stopped<br>UNKNOWN: unknown</p>
     * @param InstanceStatus <p>Cloud host instance status<br>Enumeration value:<br>RUNNING: running<br>STOPPED: stopped<br>UNKNOWN: unknown</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Remediation status enumeration values.</p><p>Enumeration values: </p><ul><li>PENDING: To be fixed, </li><li>SCANNING: Scan in progress, </li><li>FIXED: Fixed, </li><li>IGNORED: Ignored, </li><li>FIXING: In remediation, </li><li>FIX_FAILED: Fix failure, </li><li>NEED_REBOOT: Pending restart.</li></ul> 
     * @return RiskStatus <p>Remediation status enumeration values.</p><p>Enumeration values: </p><ul><li>PENDING: To be fixed, </li><li>SCANNING: Scan in progress, </li><li>FIXED: Fixed, </li><li>IGNORED: Ignored, </li><li>FIXING: In remediation, </li><li>FIX_FAILED: Fix failure, </li><li>NEED_REBOOT: Pending restart.</li></ul>
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>Remediation status enumeration values.</p><p>Enumeration values: </p><ul><li>PENDING: To be fixed, </li><li>SCANNING: Scan in progress, </li><li>FIXED: Fixed, </li><li>IGNORED: Ignored, </li><li>FIXING: In remediation, </li><li>FIX_FAILED: Fix failure, </li><li>NEED_REBOOT: Pending restart.</li></ul>
     * @param RiskStatus <p>Remediation status enumeration values.</p><p>Enumeration values: </p><ul><li>PENDING: To be fixed, </li><li>SCANNING: Scan in progress, </li><li>FIXED: Fixed, </li><li>IGNORED: Ignored, </li><li>FIXING: In remediation, </li><li>FIX_FAILED: Fix failure, </li><li>NEED_REBOOT: Pending restart.</li></ul>
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>VPR rating information (including rating result and details in each dimension)</p> 
     * @return VPRRating <p>VPR rating information (including rating result and details in each dimension)</p>
     */
    public VPRRatingInfo getVPRRating() {
        return this.VPRRating;
    }

    /**
     * Set <p>VPR rating information (including rating result and details in each dimension)</p>
     * @param VPRRating <p>VPR rating information (including rating result and details in each dimension)</p>
     */
    public void setVPRRating(VPRRatingInfo VPRRating) {
        this.VPRRating = VPRRating;
    }

    /**
     * Get <p>CWP Agent status<br>Enumeration value:<br>ONLINE: Online<br>OFFLINE: Offline<br>UNINSTALLED: Not installed</p> 
     * @return AgentStatus <p>CWP Agent status<br>Enumeration value:<br>ONLINE: Online<br>OFFLINE: Offline<br>UNINSTALLED: Not installed</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>CWP Agent status<br>Enumeration value:<br>ONLINE: Online<br>OFFLINE: Offline<br>UNINSTALLED: Not installed</p>
     * @param AgentStatus <p>CWP Agent status<br>Enumeration value:<br>ONLINE: Online<br>OFFLINE: Offline<br>UNINSTALLED: Not installed</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>Asset tag list (CSIP internal asset tag)</p> 
     * @return TagItem <p>Asset tag list (CSIP internal asset tag)</p>
     */
    public MiniTagItem [] getTagItem() {
        return this.TagItem;
    }

    /**
     * Set <p>Asset tag list (CSIP internal asset tag)</p>
     * @param TagItem <p>Asset tag list (CSIP internal asset tag)</p>
     */
    public void setTagItem(MiniTagItem [] TagItem) {
        this.TagItem = TagItem;
    }

    /**
     * Get <p>Cloud tag list (cloud asset side Tag)</p> 
     * @return CloudTag <p>Cloud tag list (cloud asset side Tag)</p>
     */
    public Tag [] getCloudTag() {
        return this.CloudTag;
    }

    /**
     * Set <p>Cloud tag list (cloud asset side Tag)</p>
     * @param CloudTag <p>Cloud tag list (cloud asset side Tag)</p>
     */
    public void setCloudTag(Tag [] CloudTag) {
        this.CloudTag = CloudTag;
    }

    public VulHostBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulHostBriefInfo(VulHostBriefInfo source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.DefendVersion != null) {
            this.DefendVersion = new String(source.DefendVersion);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.Account != null) {
            this.Account = new AccountBriefInfo(source.Account);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.VPRRating != null) {
            this.VPRRating = new VPRRatingInfo(source.VPRRating);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.TagItem != null) {
            this.TagItem = new MiniTagItem[source.TagItem.length];
            for (int i = 0; i < source.TagItem.length; i++) {
                this.TagItem[i] = new MiniTagItem(source.TagItem[i]);
            }
        }
        if (source.CloudTag != null) {
            this.CloudTag = new Tag[source.CloudTag.length];
            for (int i = 0; i < source.CloudTag.length; i++) {
                this.CloudTag[i] = new Tag(source.CloudTag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "DefendVersion", this.DefendVersion);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamObj(map, prefix + "VPRRating.", this.VPRRating);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamArrayObj(map, prefix + "TagItem.", this.TagItem);
        this.setParamArrayObj(map, prefix + "CloudTag.", this.CloudTag);

    }
}

