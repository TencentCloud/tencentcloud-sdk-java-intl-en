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

public class HostBriefInfo extends AbstractModel {

    /**
    * Cloud host instance ID
Parameter format: such as ins-instance
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Host QUUID (CWP internal unique identifier)
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * Host UUID
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * Public network IP address
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * CWP Agent status
Enumeration value:
ONLINE: Online
OFFLINE: Offline
UNINSTALLED: Not installed
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * CVM instance status
Enumeration value:
RUNNING: running.
STOPPED: Stopped
UNKNOWN: unknown
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Host name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Account information belonging to
    */
    @SerializedName("Account")
    @Expose
    private AccountBriefInfo Account;

    /**
    * Asset tag list (CSIP internal assets)
    */
    @SerializedName("TagItem")
    @Expose
    private MiniTagItem [] TagItem;

    /**
    * Tag list on cloud (Tag on cloud asset)
    */
    @SerializedName("CloudTag")
    @Expose
    private Tag [] CloudTag;

    /**
     * Get Cloud host instance ID
Parameter format: such as ins-instance 
     * @return InstanceID Cloud host instance ID
Parameter format: such as ins-instance
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Cloud host instance ID
Parameter format: such as ins-instance
     * @param InstanceID Cloud host instance ID
Parameter format: such as ins-instance
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Host QUUID (CWP internal unique identifier) 
     * @return QUUID Host QUUID (CWP internal unique identifier)
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set Host QUUID (CWP internal unique identifier)
     * @param QUUID Host QUUID (CWP internal unique identifier)
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get Host UUID 
     * @return UUID Host UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set Host UUID
     * @param UUID Host UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get Public network IP address 
     * @return PublicIP Public network IP address
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public network IP address
     * @param PublicIP Public network IP address
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Private IP address 
     * @return PrivateIP Private IP address
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set Private IP address
     * @param PrivateIP Private IP address
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get CWP Agent status
Enumeration value:
ONLINE: Online
OFFLINE: Offline
UNINSTALLED: Not installed 
     * @return AgentStatus CWP Agent status
Enumeration value:
ONLINE: Online
OFFLINE: Offline
UNINSTALLED: Not installed
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set CWP Agent status
Enumeration value:
ONLINE: Online
OFFLINE: Offline
UNINSTALLED: Not installed
     * @param AgentStatus CWP Agent status
Enumeration value:
ONLINE: Online
OFFLINE: Offline
UNINSTALLED: Not installed
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get CVM instance status
Enumeration value:
RUNNING: running.
STOPPED: Stopped
UNKNOWN: unknown 
     * @return InstanceStatus CVM instance status
Enumeration value:
RUNNING: running.
STOPPED: Stopped
UNKNOWN: unknown
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set CVM instance status
Enumeration value:
RUNNING: running.
STOPPED: Stopped
UNKNOWN: unknown
     * @param InstanceStatus CVM instance status
Enumeration value:
RUNNING: running.
STOPPED: Stopped
UNKNOWN: unknown
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Host name 
     * @return Name Host name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Host name
     * @param Name Host name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Account information belonging to 
     * @return Account Account information belonging to
     */
    public AccountBriefInfo getAccount() {
        return this.Account;
    }

    /**
     * Set Account information belonging to
     * @param Account Account information belonging to
     */
    public void setAccount(AccountBriefInfo Account) {
        this.Account = Account;
    }

    /**
     * Get Asset tag list (CSIP internal assets) 
     * @return TagItem Asset tag list (CSIP internal assets)
     */
    public MiniTagItem [] getTagItem() {
        return this.TagItem;
    }

    /**
     * Set Asset tag list (CSIP internal assets)
     * @param TagItem Asset tag list (CSIP internal assets)
     */
    public void setTagItem(MiniTagItem [] TagItem) {
        this.TagItem = TagItem;
    }

    /**
     * Get Tag list on cloud (Tag on cloud asset) 
     * @return CloudTag Tag list on cloud (Tag on cloud asset)
     */
    public Tag [] getCloudTag() {
        return this.CloudTag;
    }

    /**
     * Set Tag list on cloud (Tag on cloud asset)
     * @param CloudTag Tag list on cloud (Tag on cloud asset)
     */
    public void setCloudTag(Tag [] CloudTag) {
        this.CloudTag = CloudTag;
    }

    public HostBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostBriefInfo(HostBriefInfo source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Account != null) {
            this.Account = new AccountBriefInfo(source.Account);
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
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamArrayObj(map, prefix + "TagItem.", this.TagItem);
        this.setParamArrayObj(map, prefix + "CloudTag.", this.CloudTag);

    }
}

