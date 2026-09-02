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

public class ImageAssociatedHostAsset extends AbstractModel {

    /**
    * <p>Host UUID.</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Host quuid</p>
    */
    @SerializedName("QUuid")
    @Expose
    private String QUuid;

    /**
    * <p>host name</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>Account name associated with the host</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>appid of the account associated with the host</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>uin of the account associated with the host</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Host private network address</p>
    */
    @SerializedName("InnerIp")
    @Expose
    private String InnerIp;

    /**
    * <p>Host public network address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>agent status on the host</p><p>Enumeration value:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALL: uninstalled</li></ul>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>Host instance ID.</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Host status</p>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
     * Get <p>Host UUID.</p> 
     * @return Uuid <p>Host UUID.</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Host UUID.</p>
     * @param Uuid <p>Host UUID.</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Host quuid</p> 
     * @return QUuid <p>Host quuid</p>
     */
    public String getQUuid() {
        return this.QUuid;
    }

    /**
     * Set <p>Host quuid</p>
     * @param QUuid <p>Host quuid</p>
     */
    public void setQUuid(String QUuid) {
        this.QUuid = QUuid;
    }

    /**
     * Get <p>host name</p> 
     * @return HostName <p>host name</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>host name</p>
     * @param HostName <p>host name</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>Account name associated with the host</p> 
     * @return OwnerAccountName <p>Account name associated with the host</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Account name associated with the host</p>
     * @param OwnerAccountName <p>Account name associated with the host</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>appid of the account associated with the host</p> 
     * @return OwnerAppId <p>appid of the account associated with the host</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the host</p>
     * @param OwnerAppId <p>appid of the account associated with the host</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>uin of the account associated with the host</p> 
     * @return OwnerUin <p>uin of the account associated with the host</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin of the account associated with the host</p>
     * @param OwnerUin <p>uin of the account associated with the host</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Host private network address</p> 
     * @return InnerIp <p>Host private network address</p>
     */
    public String getInnerIp() {
        return this.InnerIp;
    }

    /**
     * Set <p>Host private network address</p>
     * @param InnerIp <p>Host private network address</p>
     */
    public void setInnerIp(String InnerIp) {
        this.InnerIp = InnerIp;
    }

    /**
     * Get <p>Host public network address</p> 
     * @return PublicIp <p>Host public network address</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Host public network address</p>
     * @param PublicIp <p>Host public network address</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>agent status on the host</p><p>Enumeration value:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALL: uninstalled</li></ul> 
     * @return AgentStatus <p>agent status on the host</p><p>Enumeration value:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALL: uninstalled</li></ul>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>agent status on the host</p><p>Enumeration value:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALL: uninstalled</li></ul>
     * @param AgentStatus <p>agent status on the host</p><p>Enumeration value:</p><ul><li>ONLINE: ONLINE</li><li>OFFLINE: OFFLINE</li><li>UNINSTALL: uninstalled</li></ul>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>Host instance ID.</p> 
     * @return InstanceID <p>Host instance ID.</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Host instance ID.</p>
     * @param InstanceID <p>Host instance ID.</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Host status</p> 
     * @return InstanceState <p>Host status</p>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set <p>Host status</p>
     * @param InstanceState <p>Host status</p>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    public ImageAssociatedHostAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAssociatedHostAsset(ImageAssociatedHostAsset source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.QUuid != null) {
            this.QUuid = new String(source.QUuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.InnerIp != null) {
            this.InnerIp = new String(source.InnerIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "QUuid", this.QUuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InnerIp", this.InnerIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);

    }
}

