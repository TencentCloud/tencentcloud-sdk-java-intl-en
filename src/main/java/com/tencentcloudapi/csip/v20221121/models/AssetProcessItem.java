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

public class AssetProcessItem extends AbstractModel {

    /**
    * Cloud account ID.
    */
    @SerializedName("CloudAccountID")
    @Expose
    private String CloudAccountID;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Tenant ID.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Account name.
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Process ID
    */
    @SerializedName("ProcessID")
    @Expose
    private String ProcessID;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Command line
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Listening port list.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get Cloud account ID. 
     * @return CloudAccountID Cloud account ID.
     */
    public String getCloudAccountID() {
        return this.CloudAccountID;
    }

    /**
     * Set Cloud account ID.
     * @param CloudAccountID Cloud account ID.
     */
    public void setCloudAccountID(String CloudAccountID) {
        this.CloudAccountID = CloudAccountID;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Tenant ID. 
     * @return AppID Tenant ID.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Tenant ID.
     * @param AppID Tenant ID.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Account name. 
     * @return CloudAccountName Account name.
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set Account name.
     * @param CloudAccountName Account name.
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get Instance ID. 
     * @return InstanceID Instance ID.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID.
     * @param InstanceID Instance ID.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Public IP address 
     * @return PublicIp Public IP address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
     * @param PublicIp Public IP address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP address 
     * @return PrivateIp Private IP address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
     * @param PrivateIp Private IP address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Process ID 
     * @return ProcessID Process ID
     */
    public String getProcessID() {
        return this.ProcessID;
    }

    /**
     * Set Process ID
     * @param ProcessID Process ID
     */
    public void setProcessID(String ProcessID) {
        this.ProcessID = ProcessID;
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
     * Get Command line 
     * @return CmdLine Command line
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Command line
     * @param CmdLine Command line
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Listening port list. 
     * @return Port Listening port list.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Listening port list.
     * @param Port Listening port list.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public AssetProcessItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetProcessItem(AssetProcessItem source) {
        if (source.CloudAccountID != null) {
            this.CloudAccountID = new String(source.CloudAccountID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.ProcessID != null) {
            this.ProcessID = new String(source.ProcessID);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudAccountID", this.CloudAccountID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "ProcessID", this.ProcessID);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

