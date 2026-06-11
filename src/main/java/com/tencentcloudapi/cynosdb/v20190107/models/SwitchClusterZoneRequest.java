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
    * <p>Cluster Id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Current availability zone</p>
    */
    @SerializedName("OldZone")
    @Expose
    private String OldZone;

    /**
    * <p>Availability zone to switch to</p>
    */
    @SerializedName("NewZone")
    @Expose
    private String NewZone;

    /**
    * <p>Execute during maintenance period - yes, immediately execute - no</p>
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
     * Get <p>Cluster Id</p> 
     * @return ClusterId <p>Cluster Id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster Id</p>
     * @param ClusterId <p>Cluster Id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Current availability zone</p> 
     * @return OldZone <p>Current availability zone</p>
     */
    public String getOldZone() {
        return this.OldZone;
    }

    /**
     * Set <p>Current availability zone</p>
     * @param OldZone <p>Current availability zone</p>
     */
    public void setOldZone(String OldZone) {
        this.OldZone = OldZone;
    }

    /**
     * Get <p>Availability zone to switch to</p> 
     * @return NewZone <p>Availability zone to switch to</p>
     */
    public String getNewZone() {
        return this.NewZone;
    }

    /**
     * Set <p>Availability zone to switch to</p>
     * @param NewZone <p>Availability zone to switch to</p>
     */
    public void setNewZone(String NewZone) {
        this.NewZone = NewZone;
    }

    /**
     * Get <p>Execute during maintenance period - yes, immediately execute - no</p> 
     * @return IsInMaintainPeriod <p>Execute during maintenance period - yes, immediately execute - no</p>
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set <p>Execute during maintenance period - yes, immediately execute - no</p>
     * @param IsInMaintainPeriod <p>Execute during maintenance period - yes, immediately execute - no</p>
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

