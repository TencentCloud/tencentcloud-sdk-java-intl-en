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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatefulSetCondition extends AbstractModel {

    /**
    * Information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Reason.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Status of the condition, True, False or Unknown.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Type.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Last update time.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTransitionTime")
    @Expose
    private String LastTransitionTime;

    /**
    * Last update time.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
     * Get Information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Reason.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason Reason.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason Reason.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Status of the condition, True, False or Unknown.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status of the condition, True, False or Unknown.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the condition, True, False or Unknown.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status of the condition, True, False or Unknown.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Type.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Last update time.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastTransitionTime Last update time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTransitionTime() {
        return this.LastTransitionTime;
    }

    /**
     * Set Last update time.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastTransitionTime Last update time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTransitionTime(String LastTransitionTime) {
        this.LastTransitionTime = LastTransitionTime;
    }

    /**
     * Get Last update time.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateTime Last update time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last update time.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateTime Last update time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public StatefulSetCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatefulSetCondition(StatefulSetCondition source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LastTransitionTime != null) {
            this.LastTransitionTime = new String(source.LastTransitionTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LastTransitionTime", this.LastTransitionTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

