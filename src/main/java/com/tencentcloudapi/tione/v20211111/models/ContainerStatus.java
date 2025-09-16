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

public class ContainerStatus extends AbstractModel {

    /**
    * Number of restarts.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * Status.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Whether it is ready.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ready")
    @Expose
    private Boolean Ready;

    /**
    * Status reason.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Container error message.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Number of restarts.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RestartCount Number of restarts.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set Number of restarts.Note: This field may return null, indicating that no valid values can be obtained.
     * @param RestartCount Number of restarts.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get Status.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return State Status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status.Note: This field may return null, indicating that no valid values can be obtained.
     * @param State Status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Whether it is ready.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ready Whether it is ready.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getReady() {
        return this.Ready;
    }

    /**
     * Set Whether it is ready.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ready Whether it is ready.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReady(Boolean Ready) {
        this.Ready = Ready;
    }

    /**
     * Get Status reason.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason Status reason.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Status reason.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason Status reason.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Container error message.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Container error message.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Container error message.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Container error message.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ContainerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerStatus(ContainerStatus source) {
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Ready != null) {
            this.Ready = new Boolean(source.Ready);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

