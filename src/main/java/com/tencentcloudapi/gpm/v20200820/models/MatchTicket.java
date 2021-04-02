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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchTicket extends AbstractModel{

    /**
    * MatchTicket ID. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * MatchCode
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * Different structure serialized results will be returned according to the MatchType.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MatchResult")
    @Expose
    private String MatchResult;

    /**
    * Matchmaking type. Valid values: NORMAL, GSE
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Player information list
    */
    @SerializedName("Players")
    @Expose
    private Player [] Players;

    /**
    * Matching status. Valid values: SEARCHING (matching), PLACING (pending match), COMPLETED (match completed), CANCELLED (match cancelled), TIMEDOUT (match timeouts), FAILED (match failed)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Matching status descriptions
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * Reason for the matching status
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * The time when the GPM received the matchmaking request, for example "2020-08-17T08:14:38.077Z".
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The time when the matchmaking request stopped executing due to the completion, failure, timeout, or cancellation, for example "2020-08-17T08:14:38.077Z".
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get MatchTicket ID. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*. 
     * @return Id MatchTicket ID. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set MatchTicket ID. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
     * @param Id MatchTicket ID. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get MatchCode 
     * @return MatchCode MatchCode
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set MatchCode
     * @param MatchCode MatchCode
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get Different structure serialized results will be returned according to the MatchType.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MatchResult Different structure serialized results will be returned according to the MatchType.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getMatchResult() {
        return this.MatchResult;
    }

    /**
     * Set Different structure serialized results will be returned according to the MatchType.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MatchResult Different structure serialized results will be returned according to the MatchType.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMatchResult(String MatchResult) {
        this.MatchResult = MatchResult;
    }

    /**
     * Get Matchmaking type. Valid values: NORMAL, GSE
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MatchType Matchmaking type. Valid values: NORMAL, GSE
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Matchmaking type. Valid values: NORMAL, GSE
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MatchType Matchmaking type. Valid values: NORMAL, GSE
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Player information list 
     * @return Players Player information list
     */
    public Player [] getPlayers() {
        return this.Players;
    }

    /**
     * Set Player information list
     * @param Players Player information list
     */
    public void setPlayers(Player [] Players) {
        this.Players = Players;
    }

    /**
     * Get Matching status. Valid values: SEARCHING (matching), PLACING (pending match), COMPLETED (match completed), CANCELLED (match cancelled), TIMEDOUT (match timeouts), FAILED (match failed) 
     * @return Status Matching status. Valid values: SEARCHING (matching), PLACING (pending match), COMPLETED (match completed), CANCELLED (match cancelled), TIMEDOUT (match timeouts), FAILED (match failed)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Matching status. Valid values: SEARCHING (matching), PLACING (pending match), COMPLETED (match completed), CANCELLED (match cancelled), TIMEDOUT (match timeouts), FAILED (match failed)
     * @param Status Matching status. Valid values: SEARCHING (matching), PLACING (pending match), COMPLETED (match completed), CANCELLED (match cancelled), TIMEDOUT (match timeouts), FAILED (match failed)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Matching status descriptions
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return StatusMessage Matching status descriptions
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set Matching status descriptions
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param StatusMessage Matching status descriptions
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get Reason for the matching status
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return StatusReason Reason for the matching status
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set Reason for the matching status
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param StatusReason Reason for the matching status
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get The time when the GPM received the matchmaking request, for example "2020-08-17T08:14:38.077Z". 
     * @return StartTime The time when the GPM received the matchmaking request, for example "2020-08-17T08:14:38.077Z".
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The time when the GPM received the matchmaking request, for example "2020-08-17T08:14:38.077Z".
     * @param StartTime The time when the GPM received the matchmaking request, for example "2020-08-17T08:14:38.077Z".
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The time when the matchmaking request stopped executing due to the completion, failure, timeout, or cancellation, for example "2020-08-17T08:14:38.077Z".
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return EndTime The time when the matchmaking request stopped executing due to the completion, failure, timeout, or cancellation, for example "2020-08-17T08:14:38.077Z".
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The time when the matchmaking request stopped executing due to the completion, failure, timeout, or cancellation, for example "2020-08-17T08:14:38.077Z".
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param EndTime The time when the matchmaking request stopped executing due to the completion, failure, timeout, or cancellation, for example "2020-08-17T08:14:38.077Z".
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "MatchResult", this.MatchResult);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamArrayObj(map, prefix + "Players.", this.Players);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

