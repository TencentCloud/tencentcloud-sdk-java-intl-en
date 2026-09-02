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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserCallRecord extends AbstractModel {

    /**
    * Source IP of the api call
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * Invocation type
0: Console invocation
1:API
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * Number of calls.
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * Call error code
0: Successful
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * First call time
    */
    @SerializedName("FirstCallTime")
    @Expose
    private String FirstCallTime;

    /**
    * Last call time
    */
    @SerializedName("LastCallTime")
    @Expose
    private String LastCallTime;

    /**
    * Remark on source IP of the api call
    */
    @SerializedName("SourceIPRemark")
    @Expose
    private String SourceIPRemark;

    /**
    * Region of the source IP of the api call
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * User/role name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Aggregation date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * appid
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Internet service provider.
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
     * Get Source IP of the api call 
     * @return SourceIP Source IP of the api call
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set Source IP of the api call
     * @param SourceIP Source IP of the api call
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get Invocation type
0: Console invocation
1:API 
     * @return EventType Invocation type
0: Console invocation
1:API
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Invocation type
0: Console invocation
1:API
     * @param EventType Invocation type
0: Console invocation
1:API
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Number of calls. 
     * @return CallCount Number of calls.
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set Number of calls.
     * @param CallCount Number of calls.
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get Call error code
0: Successful 
     * @return Code Call error code
0: Successful
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Call error code
0: Successful
     * @param Code Call error code
0: Successful
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get First call time 
     * @return FirstCallTime First call time
     */
    public String getFirstCallTime() {
        return this.FirstCallTime;
    }

    /**
     * Set First call time
     * @param FirstCallTime First call time
     */
    public void setFirstCallTime(String FirstCallTime) {
        this.FirstCallTime = FirstCallTime;
    }

    /**
     * Get Last call time 
     * @return LastCallTime Last call time
     */
    public String getLastCallTime() {
        return this.LastCallTime;
    }

    /**
     * Set Last call time
     * @param LastCallTime Last call time
     */
    public void setLastCallTime(String LastCallTime) {
        this.LastCallTime = LastCallTime;
    }

    /**
     * Get Remark on source IP of the api call 
     * @return SourceIPRemark Remark on source IP of the api call
     */
    public String getSourceIPRemark() {
        return this.SourceIPRemark;
    }

    /**
     * Set Remark on source IP of the api call
     * @param SourceIPRemark Remark on source IP of the api call
     */
    public void setSourceIPRemark(String SourceIPRemark) {
        this.SourceIPRemark = SourceIPRemark;
    }

    /**
     * Get Region of the source IP of the api call 
     * @return Region Region of the source IP of the api call
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the source IP of the api call
     * @param Region Region of the source IP of the api call
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get User/role name 
     * @return UserName User/role name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User/role name
     * @param UserName User/role name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Aggregation date 
     * @return Date Aggregation date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Aggregation date
     * @param Date Aggregation date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get appid 
     * @return AppID appid
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set appid
     * @param AppID appid
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Internet service provider. 
     * @return ISP Internet service provider.
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set Internet service provider.
     * @param ISP Internet service provider.
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    public UserCallRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserCallRecord(UserCallRecord source) {
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.FirstCallTime != null) {
            this.FirstCallTime = new String(source.FirstCallTime);
        }
        if (source.LastCallTime != null) {
            this.LastCallTime = new String(source.LastCallTime);
        }
        if (source.SourceIPRemark != null) {
            this.SourceIPRemark = new String(source.SourceIPRemark);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "FirstCallTime", this.FirstCallTime);
        this.setParamSimple(map, prefix + "LastCallTime", this.LastCallTime);
        this.setParamSimple(map, prefix + "SourceIPRemark", this.SourceIPRemark);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ISP", this.ISP);

    }
}

