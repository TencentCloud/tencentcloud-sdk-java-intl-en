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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNativeGatewayServiceSourceRequest extends AbstractModel {

    /**
    * Gateway instance ID
    */
    @SerializedName("GatewayID")
    @Expose
    private String GatewayID;

    /**
    * Service Source Instance ID
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
    * Service Source Name
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Service source instance additional information
    */
    @SerializedName("SourceInfo")
    @Expose
    private SourceInfo SourceInfo;

    /**
     * Get Gateway instance ID 
     * @return GatewayID Gateway instance ID
     */
    public String getGatewayID() {
        return this.GatewayID;
    }

    /**
     * Set Gateway instance ID
     * @param GatewayID Gateway instance ID
     */
    public void setGatewayID(String GatewayID) {
        this.GatewayID = GatewayID;
    }

    /**
     * Get Service Source Instance ID 
     * @return SourceID Service Source Instance ID
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set Service Source Instance ID
     * @param SourceID Service Source Instance ID
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    /**
     * Get Service Source Name 
     * @return SourceName Service Source Name
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Service Source Name
     * @param SourceName Service Source Name
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Service source instance additional information 
     * @return SourceInfo Service source instance additional information
     */
    public SourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set Service source instance additional information
     * @param SourceInfo Service source instance additional information
     */
    public void setSourceInfo(SourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public ModifyNativeGatewayServiceSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNativeGatewayServiceSourceRequest(ModifyNativeGatewayServiceSourceRequest source) {
        if (source.GatewayID != null) {
            this.GatewayID = new String(source.GatewayID);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new SourceInfo(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayID", this.GatewayID);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

