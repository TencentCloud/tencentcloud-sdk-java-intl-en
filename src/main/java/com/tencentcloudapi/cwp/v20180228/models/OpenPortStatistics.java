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

public class OpenPortStatistics extends AbstractModel {

    /**
    * Port number
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Number of Hosts
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
     * Get Port number 
     * @return Port Port number
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number
     * @param Port Port number
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Number of Hosts 
     * @return MachineNum Number of Hosts
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set Number of Hosts
     * @param MachineNum Number of Hosts
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    public OpenPortStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenPortStatistics(OpenPortStatistics source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.MachineNum != null) {
            this.MachineNum = new Long(source.MachineNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);

    }
}

