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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessDeviceRiskRsp extends AbstractModel {

    /**
    * <p>The risk score information of the device</p>
    */
    @SerializedName("Score")
    @Expose
    private DataScore Score;

    /**
    * <p>The basic information of the device</p>
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
     * Get <p>The risk score information of the device</p> 
     * @return Score <p>The risk score information of the device</p>
     */
    public DataScore getScore() {
        return this.Score;
    }

    /**
     * Set <p>The risk score information of the device</p>
     * @param Score <p>The risk score information of the device</p>
     */
    public void setScore(DataScore Score) {
        this.Score = Score;
    }

    /**
     * Get <p>The basic information of the device</p> 
     * @return Device <p>The basic information of the device</p>
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set <p>The basic information of the device</p>
     * @param Device <p>The basic information of the device</p>
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    public AssessDeviceRiskRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessDeviceRiskRsp(AssessDeviceRiskRsp source) {
        if (source.Score != null) {
            this.Score = new DataScore(source.Score);
        }
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Score.", this.Score);
        this.setParamObj(map, prefix + "Device.", this.Device);

    }
}

