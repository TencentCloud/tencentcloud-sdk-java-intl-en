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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyDetailInfo extends AbstractModel{

    /**
    * The unique ID of the access layer (tcaproxy)
    */
    @SerializedName("ProxyUid")
    @Expose
    private String ProxyUid;

    /**
    * Machine type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * The speed of processing request packets
    */
    @SerializedName("ProcessSpeed")
    @Expose
    private Long ProcessSpeed;

    /**
    * Request packet delay
    */
    @SerializedName("AverageProcessDelay")
    @Expose
    private Long AverageProcessDelay;

    /**
    * The speed of processing delayed request packets
    */
    @SerializedName("SlowProcessSpeed")
    @Expose
    private Long SlowProcessSpeed;

    /**
     * Get The unique ID of the access layer (tcaproxy) 
     * @return ProxyUid The unique ID of the access layer (tcaproxy)
     */
    public String getProxyUid() {
        return this.ProxyUid;
    }

    /**
     * Set The unique ID of the access layer (tcaproxy)
     * @param ProxyUid The unique ID of the access layer (tcaproxy)
     */
    public void setProxyUid(String ProxyUid) {
        this.ProxyUid = ProxyUid;
    }

    /**
     * Get Machine type 
     * @return MachineType Machine type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine type
     * @param MachineType Machine type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get The speed of processing request packets 
     * @return ProcessSpeed The speed of processing request packets
     */
    public Long getProcessSpeed() {
        return this.ProcessSpeed;
    }

    /**
     * Set The speed of processing request packets
     * @param ProcessSpeed The speed of processing request packets
     */
    public void setProcessSpeed(Long ProcessSpeed) {
        this.ProcessSpeed = ProcessSpeed;
    }

    /**
     * Get Request packet delay 
     * @return AverageProcessDelay Request packet delay
     */
    public Long getAverageProcessDelay() {
        return this.AverageProcessDelay;
    }

    /**
     * Set Request packet delay
     * @param AverageProcessDelay Request packet delay
     */
    public void setAverageProcessDelay(Long AverageProcessDelay) {
        this.AverageProcessDelay = AverageProcessDelay;
    }

    /**
     * Get The speed of processing delayed request packets 
     * @return SlowProcessSpeed The speed of processing delayed request packets
     */
    public Long getSlowProcessSpeed() {
        return this.SlowProcessSpeed;
    }

    /**
     * Set The speed of processing delayed request packets
     * @param SlowProcessSpeed The speed of processing delayed request packets
     */
    public void setSlowProcessSpeed(Long SlowProcessSpeed) {
        this.SlowProcessSpeed = SlowProcessSpeed;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyUid", this.ProxyUid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "ProcessSpeed", this.ProcessSpeed);
        this.setParamSimple(map, prefix + "AverageProcessDelay", this.AverageProcessDelay);
        this.setParamSimple(map, prefix + "SlowProcessSpeed", this.SlowProcessSpeed);

    }
}

