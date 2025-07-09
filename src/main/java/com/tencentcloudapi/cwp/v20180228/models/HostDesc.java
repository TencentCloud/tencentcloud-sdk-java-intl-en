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

public class HostDesc extends AbstractModel {

    /**
    * Yunjing client ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Machine name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Machine IP address. This parameter is left blank for terminated servers.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Public IP address. This parameter is left blank for terminated servers.
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Tag information array
    */
    @SerializedName("Tags")
    @Expose
    private MachineTag [] Tags;

    /**
     * Get Yunjing client ID 
     * @return Quuid Yunjing client ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Yunjing client ID
     * @param Quuid Yunjing client ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host ID 
     * @return Uuid Host ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host ID
     * @param Uuid Host ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Machine name 
     * @return MachineName Machine name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Machine name
     * @param MachineName Machine name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Machine IP address. This parameter is left blank for terminated servers. 
     * @return MachineIp Machine IP address. This parameter is left blank for terminated servers.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Machine IP address. This parameter is left blank for terminated servers.
     * @param MachineIp Machine IP address. This parameter is left blank for terminated servers.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Public IP address. This parameter is left blank for terminated servers. 
     * @return MachineWanIp Public IP address. This parameter is left blank for terminated servers.
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address. This parameter is left blank for terminated servers.
     * @param MachineWanIp Public IP address. This parameter is left blank for terminated servers.
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Tag information array 
     * @return Tags Tag information array
     */
    public MachineTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information array
     * @param Tags Tag information array
     */
    public void setTags(MachineTag [] Tags) {
        this.Tags = Tags;
    }

    public HostDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostDesc(HostDesc source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Tags != null) {
            this.Tags = new MachineTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new MachineTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

