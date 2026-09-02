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

public class ModifyLoginTypeFailInfo extends AbstractModel {

    /**
    * <p>Host name.</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Host instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Host private IP address</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>Public IP of the server</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>Host availability zone</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Specific host types</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>The following fixed values require special handling on the frontend. Other failure reasons can be displayed directly:</p><ol><li>UNINSTALLED -- not installed</li><li>NEED_UPGRADE -- requires upgrading</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- password login is not enabled, so QR code login cannot be enabled</li></ol>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Failure reason</p>
    */
    @SerializedName("MessageDesc")
    @Expose
    private String MessageDesc;

    /**
     * Get <p>Host name.</p> 
     * @return MachineName <p>Host name.</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>Host name.</p>
     * @param MachineName <p>Host name.</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Host instance ID.</p> 
     * @return InstanceId <p>Host instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Host instance ID.</p>
     * @param InstanceId <p>Host instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Host private IP address</p> 
     * @return MachineIp <p>Host private IP address</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>Host private IP address</p>
     * @param MachineIp <p>Host private IP address</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>Public IP of the server</p> 
     * @return MachineWanIp <p>Public IP of the server</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>Public IP of the server</p>
     * @param MachineWanIp <p>Public IP of the server</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>Host availability zone</p> 
     * @return Region <p>Host availability zone</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Host availability zone</p>
     * @param Region <p>Host availability zone</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Specific host types</p> 
     * @return MachineType <p>Specific host types</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>Specific host types</p>
     * @param MachineType <p>Specific host types</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>The following fixed values require special handling on the frontend. Other failure reasons can be displayed directly:</p><ol><li>UNINSTALLED -- not installed</li><li>NEED_UPGRADE -- requires upgrading</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- password login is not enabled, so QR code login cannot be enabled</li></ol> 
     * @return Message <p>The following fixed values require special handling on the frontend. Other failure reasons can be displayed directly:</p><ol><li>UNINSTALLED -- not installed</li><li>NEED_UPGRADE -- requires upgrading</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- password login is not enabled, so QR code login cannot be enabled</li></ol>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>The following fixed values require special handling on the frontend. Other failure reasons can be displayed directly:</p><ol><li>UNINSTALLED -- not installed</li><li>NEED_UPGRADE -- requires upgrading</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- password login is not enabled, so QR code login cannot be enabled</li></ol>
     * @param Message <p>The following fixed values require special handling on the frontend. Other failure reasons can be displayed directly:</p><ol><li>UNINSTALLED -- not installed</li><li>NEED_UPGRADE -- requires upgrading</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- password login is not enabled, so QR code login cannot be enabled</li></ol>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Failure reason</p> 
     * @return MessageDesc <p>Failure reason</p>
     */
    public String getMessageDesc() {
        return this.MessageDesc;
    }

    /**
     * Set <p>Failure reason</p>
     * @param MessageDesc <p>Failure reason</p>
     */
    public void setMessageDesc(String MessageDesc) {
        this.MessageDesc = MessageDesc;
    }

    public ModifyLoginTypeFailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginTypeFailInfo(ModifyLoginTypeFailInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.MessageDesc != null) {
            this.MessageDesc = new String(source.MessageDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "MessageDesc", this.MessageDesc);

    }
}

