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

public class ClbTargetItem extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String PrivateIpAddresses;

    /**
    * <p>ENI ID.</p>
    */
    @SerializedName("EniID")
    @Expose
    private String EniID;

    /**
    * <p>Port</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceID <p>Instance ID.</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceID <p>Instance ID.</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIpAddresses <p>Private IP address.</p>
     */
    public String getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIpAddresses <p>Private IP address.</p>
     */
    public void setPrivateIpAddresses(String PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get <p>ENI ID.</p> 
     * @return EniID <p>ENI ID.</p>
     */
    public String getEniID() {
        return this.EniID;
    }

    /**
     * Set <p>ENI ID.</p>
     * @param EniID <p>ENI ID.</p>
     */
    public void setEniID(String EniID) {
        this.EniID = EniID;
    }

    /**
     * Get <p>Port</p> 
     * @return Port <p>Port</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port</p>
     * @param Port <p>Port</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public ClbTargetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbTargetItem(ClbTargetItem source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String(source.PrivateIpAddresses);
        }
        if (source.EniID != null) {
            this.EniID = new String(source.EniID);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PrivateIpAddresses", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "EniID", this.EniID);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

