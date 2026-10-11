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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectMachine extends AbstractModel {

    /**
    * Machine name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Machine IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Number of protection directories
    */
    @SerializedName("SafeguardDirNum")
    @Expose
    private Long SafeguardDirNum;

    /**
     * Get Machine name 
     * @return HostName Machine name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Machine name
     * @param HostName Machine name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Machine IP address 
     * @return HostIp Machine IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Machine IP address
     * @param HostIp Machine IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Number of protection directories 
     * @return SafeguardDirNum Number of protection directories
     */
    public Long getSafeguardDirNum() {
        return this.SafeguardDirNum;
    }

    /**
     * Set Number of protection directories
     * @param SafeguardDirNum Number of protection directories
     */
    public void setSafeguardDirNum(Long SafeguardDirNum) {
        this.SafeguardDirNum = SafeguardDirNum;
    }

    public ProtectMachine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectMachine(ProtectMachine source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.SafeguardDirNum != null) {
            this.SafeguardDirNum = new Long(source.SafeguardDirNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "SafeguardDirNum", this.SafeguardDirNum);

    }
}

