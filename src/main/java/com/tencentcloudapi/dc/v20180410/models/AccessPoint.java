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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessPoint extends AbstractModel{

    /**
    * Access point name.
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * Unique access point ID.
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * Access point status. Valid values: available, unavailable.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Access point location.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * List of ISPs supported by access point.
    */
    @SerializedName("LineOperator")
    @Expose
    private String [] LineOperator;

    /**
    * ID of the region that manages the access point.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get Access point name. 
     * @return AccessPointName Access point name.
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set Access point name.
     * @param AccessPointName Access point name.
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get Unique access point ID. 
     * @return AccessPointId Unique access point ID.
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set Unique access point ID.
     * @param AccessPointId Unique access point ID.
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get Access point status. Valid values: available, unavailable. 
     * @return State Access point status. Valid values: available, unavailable.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Access point status. Valid values: available, unavailable.
     * @param State Access point status. Valid values: available, unavailable.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Access point location. 
     * @return Location Access point location.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Access point location.
     * @param Location Access point location.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get List of ISPs supported by access point. 
     * @return LineOperator List of ISPs supported by access point.
     */
    public String [] getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set List of ISPs supported by access point.
     * @param LineOperator List of ISPs supported by access point.
     */
    public void setLineOperator(String [] LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get ID of the region that manages the access point. 
     * @return RegionId ID of the region that manages the access point.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set ID of the region that manages the access point.
     * @param RegionId ID of the region that manages the access point.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessPointName", this.AccessPointName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArraySimple(map, prefix + "LineOperator.", this.LineOperator);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

