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

public class UebaUserSummaryElement extends AbstractModel {

    /**
    * Attendee id
    */
    @SerializedName("MemberID")
    @Expose
    private String MemberID;

    /**
    * Log type
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * UID basis field
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * Quantity.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Attendee id 
     * @return MemberID Attendee id
     */
    public String getMemberID() {
        return this.MemberID;
    }

    /**
     * Set Attendee id
     * @param MemberID Attendee id
     */
    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    /**
     * Get Log type 
     * @return LogType Log type
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type
     * @param LogType Log type
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get UID basis field 
     * @return UserID UID basis field
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set UID basis field
     * @param UserID UID basis field
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get Quantity. 
     * @return Count Quantity.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantity.
     * @param Count Quantity.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public UebaUserSummaryElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaUserSummaryElement(UebaUserSummaryElement source) {
        if (source.MemberID != null) {
            this.MemberID = new String(source.MemberID);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberID", this.MemberID);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

