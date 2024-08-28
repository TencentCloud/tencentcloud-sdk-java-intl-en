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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenAttackHotspot extends AbstractModel {

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Attacker IP address
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Victim IP address
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Event name 
     * @return EventName Event name
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name
     * @param EventName Event name
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Attacker IP address 
     * @return SrcIp Attacker IP address
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Attacker IP address
     * @param SrcIp Attacker IP address
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Victim IP address 
     * @return DstIp Victim IP address
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set Victim IP address
     * @param DstIp Victim IP address
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Time 
     * @return CreatedTime Time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Time
     * @param CreatedTime Time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public ScreenAttackHotspot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenAttackHotspot(ScreenAttackHotspot source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

