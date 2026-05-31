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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewLibraDBClustersRequest extends AbstractModel {

    /**
    * Time interval
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Time unit
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Analysis Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Order mode
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
     * Get Time interval 
     * @return TimeSpan Time interval
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Time interval
     * @param TimeSpan Time interval
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Time unit 
     * @return TimeUnit Time unit
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit
     * @param TimeUnit Time unit
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Analysis Cluster ID 
     * @return ClusterId Analysis Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Analysis Cluster ID
     * @param ClusterId Analysis Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Order mode 
     * @return DealMode Order mode
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Order mode
     * @param DealMode Order mode
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    public RenewLibraDBClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewLibraDBClustersRequest(RenewLibraDBClustersRequest source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);

    }
}

