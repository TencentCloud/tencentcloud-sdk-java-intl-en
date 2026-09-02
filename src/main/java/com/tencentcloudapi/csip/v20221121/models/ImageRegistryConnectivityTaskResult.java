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

public class ImageRegistryConnectivityTaskResult extends AbstractModel {

    /**
    * <p>Check result</p>
    */
    @SerializedName("ConnDetectMessage")
    @Expose
    private String ConnDetectMessage;

    /**
    * <p>Check status</p>
    */
    @SerializedName("ConnDetectStatus")
    @Expose
    private String ConnDetectStatus;

    /**
    * <p>Failure reason</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>Host Quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Troubleshoot solution</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>Host Uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get <p>Check result</p> 
     * @return ConnDetectMessage <p>Check result</p>
     */
    public String getConnDetectMessage() {
        return this.ConnDetectMessage;
    }

    /**
     * Set <p>Check result</p>
     * @param ConnDetectMessage <p>Check result</p>
     */
    public void setConnDetectMessage(String ConnDetectMessage) {
        this.ConnDetectMessage = ConnDetectMessage;
    }

    /**
     * Get <p>Check status</p> 
     * @return ConnDetectStatus <p>Check status</p>
     */
    public String getConnDetectStatus() {
        return this.ConnDetectStatus;
    }

    /**
     * Set <p>Check status</p>
     * @param ConnDetectStatus <p>Check status</p>
     */
    public void setConnDetectStatus(String ConnDetectStatus) {
        this.ConnDetectStatus = ConnDetectStatus;
    }

    /**
     * Get <p>Failure reason</p> 
     * @return FailReason <p>Failure reason</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>Failure reason</p>
     * @param FailReason <p>Failure reason</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>Host Quuid</p> 
     * @return Quuid <p>Host Quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host Quuid</p>
     * @param Quuid <p>Host Quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Troubleshoot solution</p> 
     * @return Solution <p>Troubleshoot solution</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>Troubleshoot solution</p>
     * @param Solution <p>Troubleshoot solution</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>Host Uuid</p> 
     * @return Uuid <p>Host Uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Host Uuid</p>
     * @param Uuid <p>Host Uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public ImageRegistryConnectivityTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryConnectivityTaskResult(ImageRegistryConnectivityTaskResult source) {
        if (source.ConnDetectMessage != null) {
            this.ConnDetectMessage = new String(source.ConnDetectMessage);
        }
        if (source.ConnDetectStatus != null) {
            this.ConnDetectStatus = new String(source.ConnDetectStatus);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnDetectMessage", this.ConnDetectMessage);
        this.setParamSimple(map, prefix + "ConnDetectStatus", this.ConnDetectStatus);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

