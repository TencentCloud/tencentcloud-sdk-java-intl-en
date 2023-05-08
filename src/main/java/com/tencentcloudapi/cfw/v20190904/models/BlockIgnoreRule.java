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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlockIgnoreRule extends AbstractModel{

    /**
    * Domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule IP.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
    * Threat level.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Source event name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Direction. Valid values: 0: outbound; 1: inbound.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Rule type. Valid values: 1: block; 2: allow.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * Time when a rule starts to take effect.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Time when a rule expires.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Reason for ignoring.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoreReason")
    @Expose
    private String IgnoreReason;

    /**
    * Security event source.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * Number of rule matching times.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchTimes")
    @Expose
    private Long MatchTimes;

    /**
    * Country.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Rule IP.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ioc Rule IP.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set Rule IP.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ioc Rule IP.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    /**
     * Get Threat level.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Threat level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Threat level.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Threat level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Source event name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventName Source event name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Source event name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventName Source event name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Direction. Valid values: 0: outbound; 1: inbound.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Direction Direction. Valid values: 0: outbound; 1: inbound.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. Valid values: 0: outbound; 1: inbound.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Direction Direction. Valid values: 0: outbound; 1: inbound.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Protocol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Rule type. Valid values: 1: block; 2: allow.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action Rule type. Valid values: 1: block; 2: allow.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set Rule type. Valid values: 1: block; 2: allow.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action Rule type. Valid values: 1: block; 2: allow.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get Time when a rule starts to take effect.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Time when a rule starts to take effect.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Time when a rule starts to take effect.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Time when a rule starts to take effect.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Time when a rule expires.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Time when a rule expires.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Time when a rule expires.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Time when a rule expires.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Reason for ignoring.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IgnoreReason Reason for ignoring.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIgnoreReason() {
        return this.IgnoreReason;
    }

    /**
     * Set Reason for ignoring.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IgnoreReason Reason for ignoring.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIgnoreReason(String IgnoreReason) {
        this.IgnoreReason = IgnoreReason;
    }

    /**
     * Get Security event source.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Source Security event source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Security event source.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Source Security event source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Rule ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqueId Rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set Rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqueId Rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get Number of rule matching times.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MatchTimes Number of rule matching times.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMatchTimes() {
        return this.MatchTimes;
    }

    /**
     * Set Number of rule matching times.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MatchTimes Number of rule matching times.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMatchTimes(Long MatchTimes) {
        this.MatchTimes = MatchTimes;
    }

    /**
     * Get Country.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Country Country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Country Country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public BlockIgnoreRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockIgnoreRule(BlockIgnoreRule source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IgnoreReason != null) {
            this.IgnoreReason = new String(source.IgnoreReason);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
        if (source.MatchTimes != null) {
            this.MatchTimes = new Long(source.MatchTimes);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IgnoreReason", this.IgnoreReason);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);
        this.setParamSimple(map, prefix + "MatchTimes", this.MatchTimes);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

