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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryConnDetectResult extends AbstractModel {

    /**
    * Host quuid or backend for Connectivity Detection
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host uuid or backend for Connectivity Detection
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Detection Result Status
    */
    @SerializedName("ConnDetectStatus")
    @Expose
    private String ConnDetectStatus;

    /**
    * Detection Result Information
    */
    @SerializedName("ConnDetectMessage")
    @Expose
    private String ConnDetectMessage;

    /**
    * Failure Resolution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Failure Cause
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
     * Get Host quuid or backend for Connectivity Detection 
     * @return Quuid Host quuid or backend for Connectivity Detection
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host quuid or backend for Connectivity Detection
     * @param Quuid Host quuid or backend for Connectivity Detection
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host uuid or backend for Connectivity Detection 
     * @return Uuid Host uuid or backend for Connectivity Detection
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host uuid or backend for Connectivity Detection
     * @param Uuid Host uuid or backend for Connectivity Detection
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Detection Result Status 
     * @return ConnDetectStatus Detection Result Status
     */
    public String getConnDetectStatus() {
        return this.ConnDetectStatus;
    }

    /**
     * Set Detection Result Status
     * @param ConnDetectStatus Detection Result Status
     */
    public void setConnDetectStatus(String ConnDetectStatus) {
        this.ConnDetectStatus = ConnDetectStatus;
    }

    /**
     * Get Detection Result Information 
     * @return ConnDetectMessage Detection Result Information
     */
    public String getConnDetectMessage() {
        return this.ConnDetectMessage;
    }

    /**
     * Set Detection Result Information
     * @param ConnDetectMessage Detection Result Information
     */
    public void setConnDetectMessage(String ConnDetectMessage) {
        this.ConnDetectMessage = ConnDetectMessage;
    }

    /**
     * Get Failure Resolution 
     * @return Solution Failure Resolution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Failure Resolution
     * @param Solution Failure Resolution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Failure Cause 
     * @return FailReason Failure Cause
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Failure Cause
     * @param FailReason Failure Cause
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    public RegistryConnDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryConnDetectResult(RegistryConnDetectResult source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.ConnDetectStatus != null) {
            this.ConnDetectStatus = new String(source.ConnDetectStatus);
        }
        if (source.ConnDetectMessage != null) {
            this.ConnDetectMessage = new String(source.ConnDetectMessage);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "ConnDetectStatus", this.ConnDetectStatus);
        this.setParamSimple(map, prefix + "ConnDetectMessage", this.ConnDetectMessage);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);

    }
}

