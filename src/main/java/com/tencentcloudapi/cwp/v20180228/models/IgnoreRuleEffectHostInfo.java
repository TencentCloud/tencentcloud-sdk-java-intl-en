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

public class IgnoreRuleEffectHostInfo extends AbstractModel {

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Severity level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Host tag array
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * Status: 0: failed; 1: ignore; 3: approved; 5: detecting
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Last detection time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Severity level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical 
     * @return Level Severity level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Severity level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     * @param Level Severity level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Host tag array 
     * @return TagList Host tag array
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Host tag array
     * @param TagList Host tag array
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Status: 0: failed; 1: ignore; 3: approved; 5: detecting 
     * @return Status Status: 0: failed; 1: ignore; 3: approved; 5: detecting
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status: 0: failed; 1: ignore; 3: approved; 5: detecting
     * @param Status Status: 0: failed; 1: ignore; 3: approved; 5: detecting
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Last detection time 
     * @return LastScanTime Last detection time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last detection time
     * @param LastScanTime Last detection time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public IgnoreRuleEffectHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IgnoreRuleEffectHostInfo(IgnoreRuleEffectHostInfo source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

