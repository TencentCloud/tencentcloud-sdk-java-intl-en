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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HeadPose extends AbstractModel{

    /**
    * Pitch. Value range: [-30,30].
    */
    @SerializedName("Pitch")
    @Expose
    private Long Pitch;

    /**
    * Yaw. Value range: [-30,30].
    */
    @SerializedName("Yaw")
    @Expose
    private Long Yaw;

    /**
    * Roll. Value range: [-180,180].
    */
    @SerializedName("Roll")
    @Expose
    private Long Roll;

    /**
     * Get Pitch. Value range: [-30,30]. 
     * @return Pitch Pitch. Value range: [-30,30].
     */
    public Long getPitch() {
        return this.Pitch;
    }

    /**
     * Set Pitch. Value range: [-30,30].
     * @param Pitch Pitch. Value range: [-30,30].
     */
    public void setPitch(Long Pitch) {
        this.Pitch = Pitch;
    }

    /**
     * Get Yaw. Value range: [-30,30]. 
     * @return Yaw Yaw. Value range: [-30,30].
     */
    public Long getYaw() {
        return this.Yaw;
    }

    /**
     * Set Yaw. Value range: [-30,30].
     * @param Yaw Yaw. Value range: [-30,30].
     */
    public void setYaw(Long Yaw) {
        this.Yaw = Yaw;
    }

    /**
     * Get Roll. Value range: [-180,180]. 
     * @return Roll Roll. Value range: [-180,180].
     */
    public Long getRoll() {
        return this.Roll;
    }

    /**
     * Set Roll. Value range: [-180,180].
     * @param Roll Roll. Value range: [-180,180].
     */
    public void setRoll(Long Roll) {
        this.Roll = Roll;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pitch", this.Pitch);
        this.setParamSimple(map, prefix + "Yaw", this.Yaw);
        this.setParamSimple(map, prefix + "Roll", this.Roll);

    }
}

