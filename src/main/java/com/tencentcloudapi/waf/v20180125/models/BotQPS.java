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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotQPS extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * Expiration time
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * Resource quantity.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Resource Location
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Maximum QPS Usage
    */
    @SerializedName("MaxBotQPS")
    @Expose
    private Long MaxBotQPS;

    /**
    * Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
     * Get Resource ID 
     * @return ResourceIds Resource ID
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID
     * @param ResourceIds Resource ID
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Expiration time 
     * @return ValidTime Expiration time
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set Expiration time
     * @param ValidTime Expiration time
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get Resource quantity. 
     * @return Count Resource quantity.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Resource quantity.
     * @param Count Resource quantity.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Resource Location 
     * @return Region Resource Location
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Resource Location
     * @param Region Resource Location
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Maximum QPS Usage 
     * @return MaxBotQPS Maximum QPS Usage
     */
    public Long getMaxBotQPS() {
        return this.MaxBotQPS;
    }

    /**
     * Set Maximum QPS Usage
     * @param MaxBotQPS Maximum QPS Usage
     */
    public void setMaxBotQPS(Long MaxBotQPS) {
        this.MaxBotQPS = MaxBotQPS;
    }

    /**
     * Get Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public BotQPS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotQPS(BotQPS source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.MaxBotQPS != null) {
            this.MaxBotQPS = new Long(source.MaxBotQPS);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "MaxBotQPS", this.MaxBotQPS);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

