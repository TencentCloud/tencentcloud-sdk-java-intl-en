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

public class HostDesc extends AbstractModel {

    /**
    * <p>Machine uuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Host security UID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Machine name</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Machine IP address. This parameter is left blank for terminated servers.</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>Public IP address. This parameter is left blank for terminated servers.</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>Tag information array</p>
    */
    @SerializedName("Tags")
    @Expose
    private MachineTag [] Tags;

    /**
     * Get <p>Machine uuid</p> 
     * @return Quuid <p>Machine uuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Machine uuid</p>
     * @param Quuid <p>Machine uuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Host security UID</p> 
     * @return Uuid <p>Host security UID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Host security UID</p>
     * @param Uuid <p>Host security UID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Machine name</p> 
     * @return MachineName <p>Machine name</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>Machine name</p>
     * @param MachineName <p>Machine name</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Machine IP address. This parameter is left blank for terminated servers.</p> 
     * @return MachineIp <p>Machine IP address. This parameter is left blank for terminated servers.</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>Machine IP address. This parameter is left blank for terminated servers.</p>
     * @param MachineIp <p>Machine IP address. This parameter is left blank for terminated servers.</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>Public IP address. This parameter is left blank for terminated servers.</p> 
     * @return MachineWanIp <p>Public IP address. This parameter is left blank for terminated servers.</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>Public IP address. This parameter is left blank for terminated servers.</p>
     * @param MachineWanIp <p>Public IP address. This parameter is left blank for terminated servers.</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>Tag information array</p> 
     * @return Tags <p>Tag information array</p>
     */
    public MachineTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag information array</p>
     * @param Tags <p>Tag information array</p>
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

