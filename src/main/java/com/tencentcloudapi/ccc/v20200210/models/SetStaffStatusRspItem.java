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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetStaffStatusRspItem extends AbstractModel {

    /**
    * Agent account.
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * Error code. see the overall error code in the protocol.
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * Error message.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Current status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status if it is on break. specifies the reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Previous status.
    */
    @SerializedName("PreviousStatus")
    @Expose
    private String PreviousStatus;

    /**
    * If the earlier status is on break, this is the reason.
    */
    @SerializedName("PreviousReason")
    @Expose
    private String PreviousReason;

    /**
     * Get Agent account. 
     * @return StaffUserId Agent account.
     */
    public String getStaffUserId() {
        return this.StaffUserId;
    }

    /**
     * Set Agent account.
     * @param StaffUserId Agent account.
     */
    public void setStaffUserId(String StaffUserId) {
        this.StaffUserId = StaffUserId;
    }

    /**
     * Get Error code. see the overall error code in the protocol. 
     * @return ErrorCode Error code. see the overall error code in the protocol.
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Error code. see the overall error code in the protocol.
     * @param ErrorCode Error code. see the overall error code in the protocol.
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Error message. 
     * @return ErrorMessage Error message.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Error message.
     * @param ErrorMessage Error message.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Current status. 
     * @return Status Current status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current status.
     * @param Status Current status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status if it is on break. specifies the reason. 
     * @return Reason Status if it is on break. specifies the reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Status if it is on break. specifies the reason.
     * @param Reason Status if it is on break. specifies the reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Previous status. 
     * @return PreviousStatus Previous status.
     */
    public String getPreviousStatus() {
        return this.PreviousStatus;
    }

    /**
     * Set Previous status.
     * @param PreviousStatus Previous status.
     */
    public void setPreviousStatus(String PreviousStatus) {
        this.PreviousStatus = PreviousStatus;
    }

    /**
     * Get If the earlier status is on break, this is the reason. 
     * @return PreviousReason If the earlier status is on break, this is the reason.
     */
    public String getPreviousReason() {
        return this.PreviousReason;
    }

    /**
     * Set If the earlier status is on break, this is the reason.
     * @param PreviousReason If the earlier status is on break, this is the reason.
     */
    public void setPreviousReason(String PreviousReason) {
        this.PreviousReason = PreviousReason;
    }

    public SetStaffStatusRspItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetStaffStatusRspItem(SetStaffStatusRspItem source) {
        if (source.StaffUserId != null) {
            this.StaffUserId = new String(source.StaffUserId);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.PreviousStatus != null) {
            this.PreviousStatus = new String(source.PreviousStatus);
        }
        if (source.PreviousReason != null) {
            this.PreviousReason = new String(source.PreviousReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StaffUserId", this.StaffUserId);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "PreviousStatus", this.PreviousStatus);
        this.setParamSimple(map, prefix + "PreviousReason", this.PreviousReason);

    }
}

