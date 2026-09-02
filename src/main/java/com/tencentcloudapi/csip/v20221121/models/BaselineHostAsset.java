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

public class BaselineHostAsset extends AbstractModel {

    /**
    * <p>Cloud host instance ID, e.g. ins-instanceid.</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Host unique identifier QUUID.</p>
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * <p>UUID submitted by the Host Agent.</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * <p>Public IP address of the host.</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>Private IP of the host.</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>CWP Agent status. Valid values:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALLED: not installed</li></ul>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>Cloud virtual machine instance running status. Parameter values:</p><ul><li>RUNNING: running</li><li>STOPPED: stopped</li><li>UNKNOWN: unknown</li></ul>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Appid of the tenant associated with the host.</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>CSIP internal asset tag list.</p>
    */
    @SerializedName("TagItem")
    @Expose
    private MiniTagItem [] TagItem;

    /**
    * <p>Cloud natively asset Tag list.</p>
    */
    @SerializedName("CloudTag")
    @Expose
    private Tag [] CloudTag;

    /**
    * <p>Region information of the host.</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>Host operating system information (including distro and version number).</p>
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * <p>Host protection version. Value: NONE (no protection), BASIC (basic version), PRO (pro edition), ULTIMATE (flagship edition), PRO_LH (lite edition).</p>
    */
    @SerializedName("ProtectVersion")
    @Expose
    private String ProtectVersion;

    /**
     * Get <p>Cloud host instance ID, e.g. ins-instanceid.</p> 
     * @return InstanceID <p>Cloud host instance ID, e.g. ins-instanceid.</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Cloud host instance ID, e.g. ins-instanceid.</p>
     * @param InstanceID <p>Cloud host instance ID, e.g. ins-instanceid.</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Host unique identifier QUUID.</p> 
     * @return QUUID <p>Host unique identifier QUUID.</p>
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set <p>Host unique identifier QUUID.</p>
     * @param QUUID <p>Host unique identifier QUUID.</p>
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get <p>UUID submitted by the Host Agent.</p> 
     * @return UUID <p>UUID submitted by the Host Agent.</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>UUID submitted by the Host Agent.</p>
     * @param UUID <p>UUID submitted by the Host Agent.</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get <p>Public IP address of the host.</p> 
     * @return PublicIP <p>Public IP address of the host.</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>Public IP address of the host.</p>
     * @param PublicIP <p>Public IP address of the host.</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>Private IP of the host.</p> 
     * @return PrivateIP <p>Private IP of the host.</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>Private IP of the host.</p>
     * @param PrivateIP <p>Private IP of the host.</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>CWP Agent status. Valid values:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALLED: not installed</li></ul> 
     * @return AgentStatus <p>CWP Agent status. Valid values:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALLED: not installed</li></ul>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>CWP Agent status. Valid values:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALLED: not installed</li></ul>
     * @param AgentStatus <p>CWP Agent status. Valid values:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALLED: not installed</li></ul>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>Cloud virtual machine instance running status. Parameter values:</p><ul><li>RUNNING: running</li><li>STOPPED: stopped</li><li>UNKNOWN: unknown</li></ul> 
     * @return InstanceStatus <p>Cloud virtual machine instance running status. Parameter values:</p><ul><li>RUNNING: running</li><li>STOPPED: stopped</li><li>UNKNOWN: unknown</li></ul>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Cloud virtual machine instance running status. Parameter values:</p><ul><li>RUNNING: running</li><li>STOPPED: stopped</li><li>UNKNOWN: unknown</li></ul>
     * @param InstanceStatus <p>Cloud virtual machine instance running status. Parameter values:</p><ul><li>RUNNING: running</li><li>STOPPED: stopped</li><li>UNKNOWN: unknown</li></ul>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
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
     * Get <p>Appid of the tenant associated with the host.</p> 
     * @return Appid <p>Appid of the tenant associated with the host.</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>Appid of the tenant associated with the host.</p>
     * @param Appid <p>Appid of the tenant associated with the host.</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>CSIP internal asset tag list.</p> 
     * @return TagItem <p>CSIP internal asset tag list.</p>
     */
    public MiniTagItem [] getTagItem() {
        return this.TagItem;
    }

    /**
     * Set <p>CSIP internal asset tag list.</p>
     * @param TagItem <p>CSIP internal asset tag list.</p>
     */
    public void setTagItem(MiniTagItem [] TagItem) {
        this.TagItem = TagItem;
    }

    /**
     * Get <p>Cloud natively asset Tag list.</p> 
     * @return CloudTag <p>Cloud natively asset Tag list.</p>
     */
    public Tag [] getCloudTag() {
        return this.CloudTag;
    }

    /**
     * Set <p>Cloud natively asset Tag list.</p>
     * @param CloudTag <p>Cloud natively asset Tag list.</p>
     */
    public void setCloudTag(Tag [] CloudTag) {
        this.CloudTag = CloudTag;
    }

    /**
     * Get <p>Region information of the host.</p> 
     * @return RegionInfo <p>Region information of the host.</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>Region information of the host.</p>
     * @param RegionInfo <p>Region information of the host.</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>Host operating system information (including distro and version number).</p> 
     * @return OsInfo <p>Host operating system information (including distro and version number).</p>
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set <p>Host operating system information (including distro and version number).</p>
     * @param OsInfo <p>Host operating system information (including distro and version number).</p>
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get <p>Host protection version. Value: NONE (no protection), BASIC (basic version), PRO (pro edition), ULTIMATE (flagship edition), PRO_LH (lite edition).</p> 
     * @return ProtectVersion <p>Host protection version. Value: NONE (no protection), BASIC (basic version), PRO (pro edition), ULTIMATE (flagship edition), PRO_LH (lite edition).</p>
     */
    public String getProtectVersion() {
        return this.ProtectVersion;
    }

    /**
     * Set <p>Host protection version. Value: NONE (no protection), BASIC (basic version), PRO (pro edition), ULTIMATE (flagship edition), PRO_LH (lite edition).</p>
     * @param ProtectVersion <p>Host protection version. Value: NONE (no protection), BASIC (basic version), PRO (pro edition), ULTIMATE (flagship edition), PRO_LH (lite edition).</p>
     */
    public void setProtectVersion(String ProtectVersion) {
        this.ProtectVersion = ProtectVersion;
    }

    public BaselineHostAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHostAsset(BaselineHostAsset source) {
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
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
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
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.ProtectVersion != null) {
            this.ProtectVersion = new String(source.ProtectVersion);
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
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamArrayObj(map, prefix + "TagItem.", this.TagItem);
        this.setParamArrayObj(map, prefix + "CloudTag.", this.CloudTag);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "ProtectVersion", this.ProtectVersion);

    }
}

