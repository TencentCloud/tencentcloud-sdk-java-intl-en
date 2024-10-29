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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryConnDetectResult extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 
    */
    @SerializedName("ConnDetectStatus")
    @Expose
    private String ConnDetectStatus;

    /**
    * 
    */
    @SerializedName("ConnDetectMessage")
    @Expose
    private String ConnDetectMessage;

    /**
    * 
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
     * Get  
     * @return Quuid 
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 
     * @param Quuid 
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get  
     * @return Uuid 
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 
     * @param Uuid 
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get  
     * @return ConnDetectStatus 
     */
    public String getConnDetectStatus() {
        return this.ConnDetectStatus;
    }

    /**
     * Set 
     * @param ConnDetectStatus 
     */
    public void setConnDetectStatus(String ConnDetectStatus) {
        this.ConnDetectStatus = ConnDetectStatus;
    }

    /**
     * Get  
     * @return ConnDetectMessage 
     */
    public String getConnDetectMessage() {
        return this.ConnDetectMessage;
    }

    /**
     * Set 
     * @param ConnDetectMessage 
     */
    public void setConnDetectMessage(String ConnDetectMessage) {
        this.ConnDetectMessage = ConnDetectMessage;
    }

    /**
     * Get  
     * @return Solution 
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 
     * @param Solution 
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get  
     * @return FailReason 
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 
     * @param FailReason 
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

