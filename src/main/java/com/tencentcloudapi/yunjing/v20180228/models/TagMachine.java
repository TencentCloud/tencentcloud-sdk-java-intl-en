/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagMachine extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Server ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Server name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Private IP of server
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Public IP of server
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Server region
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Server region type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get ID 
     * @return Id ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Server ID 
     * @return Quuid Server ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server ID
     * @param Quuid Server ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Server name 
     * @return MachineName Server name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name
     * @param MachineName Server name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Private IP of server 
     * @return MachineIp Private IP of server
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP of server
     * @param MachineIp Private IP of server
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Public IP of server 
     * @return MachineWanIp Public IP of server
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP of server
     * @param MachineWanIp Public IP of server
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Server region 
     * @return MachineRegion Server region
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Server region
     * @param MachineRegion Server region
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Server region type 
     * @return MachineType Server region type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server region type
     * @param MachineType Server region type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public TagMachine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagMachine(TagMachine source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

