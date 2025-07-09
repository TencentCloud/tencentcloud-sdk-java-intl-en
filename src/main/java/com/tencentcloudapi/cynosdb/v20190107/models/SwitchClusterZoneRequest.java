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

public class SwitchClusterZoneRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The current AZ
    */
    @SerializedName("OldZone")
    @Expose
    private String OldZone;

    /**
    * New AZ
    */
    @SerializedName("NewZone")
    @Expose
    private String NewZone;

    /**
    * Valid values: `yes` (execute during maintenance time), `no` (execute now)
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The current AZ 
     * @return OldZone The current AZ
     */
    public String getOldZone() {
        return this.OldZone;
    }

    /**
     * Set The current AZ
     * @param OldZone The current AZ
     */
    public void setOldZone(String OldZone) {
        this.OldZone = OldZone;
    }

    /**
     * Get New AZ 
     * @return NewZone New AZ
     */
    public String getNewZone() {
        return this.NewZone;
    }

    /**
     * Set New AZ
     * @param NewZone New AZ
     */
    public void setNewZone(String NewZone) {
        this.NewZone = NewZone;
    }

    /**
     * Get Valid values: `yes` (execute during maintenance time), `no` (execute now) 
     * @return IsInMaintainPeriod Valid values: `yes` (execute during maintenance time), `no` (execute now)
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set Valid values: `yes` (execute during maintenance time), `no` (execute now)
     * @param IsInMaintainPeriod Valid values: `yes` (execute during maintenance time), `no` (execute now)
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    public SwitchClusterZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchClusterZoneRequest(SwitchClusterZoneRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OldZone != null) {
            this.OldZone = new String(source.OldZone);
        }
        if (source.NewZone != null) {
            this.NewZone = new String(source.NewZone);
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "OldZone", this.OldZone);
        this.setParamSimple(map, prefix + "NewZone", this.NewZone);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}

