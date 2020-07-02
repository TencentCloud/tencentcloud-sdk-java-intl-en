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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GameServerSession extends AbstractModel{

    /**
    * Game server session creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Creator ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Current number of players
    */
    @SerializedName("CurrentPlayerSessionCount")
    @Expose
    private Long CurrentPlayerSessionCount;

    /**
    * CVM DNS ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * Fleet ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * Game server session attribute details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * Game server session ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * CVM IP address
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * Battle progress details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchmakerData")
    @Expose
    private String MatchmakerData;

    /**
    * Maximum number of players
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * Game server session name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Player session creation policy
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayerSessionCreationPolicy")
    @Expose
    private String PlayerSessionCreationPolicy;

    /**
    * Port number
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Game server session status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Additional information of game server session status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * Termination time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TerminationTime")
    @Expose
    private String TerminationTime;

    /**
    * Instance type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Current custom count
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentCustomCount")
    @Expose
    private Long CurrentCustomCount;

    /**
    * Maximum custom count
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxCustomCount")
    @Expose
    private Long MaxCustomCount;

    /**
    * Weight
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Session availability status, i.e., whether it is blocked
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailabilityStatus")
    @Expose
    private String AvailabilityStatus;

    /**
     * Get Game server session creation time 
     * @return CreationTime Game server session creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Game server session creation time
     * @param CreationTime Game server session creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Creator ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatorId Creator ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set Creator ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatorId Creator ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get Current number of players 
     * @return CurrentPlayerSessionCount Current number of players
     */
    public Long getCurrentPlayerSessionCount() {
        return this.CurrentPlayerSessionCount;
    }

    /**
     * Set Current number of players
     * @param CurrentPlayerSessionCount Current number of players
     */
    public void setCurrentPlayerSessionCount(Long CurrentPlayerSessionCount) {
        this.CurrentPlayerSessionCount = CurrentPlayerSessionCount;
    }

    /**
     * Get CVM DNS ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DnsName CVM DNS ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set CVM DNS ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DnsName CVM DNS ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    /**
     * Get Fleet ID 
     * @return FleetId Fleet ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Fleet ID
     * @param FleetId Fleet ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Game attributes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameProperties Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameProperties Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get Game server session attribute details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameServerSessionData Game server session attribute details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set Game server session attribute details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameServerSessionData Game server session attribute details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get Game server session ID 
     * @return GameServerSessionId Game server session ID
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Game server session ID
     * @param GameServerSessionId Game server session ID
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get CVM IP address 
     * @return IpAddress CVM IP address
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set CVM IP address
     * @param IpAddress CVM IP address
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get Battle progress details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MatchmakerData Battle progress details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMatchmakerData() {
        return this.MatchmakerData;
    }

    /**
     * Set Battle progress details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MatchmakerData Battle progress details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMatchmakerData(String MatchmakerData) {
        this.MatchmakerData = MatchmakerData;
    }

    /**
     * Get Maximum number of players 
     * @return MaximumPlayerSessionCount Maximum number of players
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set Maximum number of players
     * @param MaximumPlayerSessionCount Maximum number of players
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get Game server session name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name Game server session name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Game server session name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name Game server session name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Player session creation policy
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlayerSessionCreationPolicy Player session creation policy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPlayerSessionCreationPolicy() {
        return this.PlayerSessionCreationPolicy;
    }

    /**
     * Set Player session creation policy
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlayerSessionCreationPolicy Player session creation policy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayerSessionCreationPolicy(String PlayerSessionCreationPolicy) {
        this.PlayerSessionCreationPolicy = PlayerSessionCreationPolicy;
    }

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
     * Get Game server session status 
     * @return Status Game server session status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Game server session status
     * @param Status Game server session status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Additional information of game server session status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusReason Additional information of game server session status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set Additional information of game server session status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusReason Additional information of game server session status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get Termination time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TerminationTime Termination time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTerminationTime() {
        return this.TerminationTime;
    }

    /**
     * Set Termination time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TerminationTime Termination time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTerminationTime(String TerminationTime) {
        this.TerminationTime = TerminationTime;
    }

    /**
     * Get Instance type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Current custom count
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CurrentCustomCount Current custom count
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentCustomCount() {
        return this.CurrentCustomCount;
    }

    /**
     * Set Current custom count
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CurrentCustomCount Current custom count
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentCustomCount(Long CurrentCustomCount) {
        this.CurrentCustomCount = CurrentCustomCount;
    }

    /**
     * Get Maximum custom count
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxCustomCount Maximum custom count
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxCustomCount() {
        return this.MaxCustomCount;
    }

    /**
     * Set Maximum custom count
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxCustomCount Maximum custom count
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxCustomCount(Long MaxCustomCount) {
        this.MaxCustomCount = MaxCustomCount;
    }

    /**
     * Get Weight
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Weight Weight
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Weight Weight
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Session availability status, i.e., whether it is blocked
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AvailabilityStatus Session availability status, i.e., whether it is blocked
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAvailabilityStatus() {
        return this.AvailabilityStatus;
    }

    /**
     * Set Session availability status, i.e., whether it is blocked
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AvailabilityStatus Session availability status, i.e., whether it is blocked
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailabilityStatus(String AvailabilityStatus) {
        this.AvailabilityStatus = AvailabilityStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "CurrentPlayerSessionCount", this.CurrentPlayerSessionCount);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "MatchmakerData", this.MatchmakerData);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PlayerSessionCreationPolicy", this.PlayerSessionCreationPolicy);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "TerminationTime", this.TerminationTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "CurrentCustomCount", this.CurrentCustomCount);
        this.setParamSimple(map, prefix + "MaxCustomCount", this.MaxCustomCount);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "AvailabilityStatus", this.AvailabilityStatus);

    }
}

