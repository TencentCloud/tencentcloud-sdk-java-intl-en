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
    * 
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * 
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * 
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 
    */
    @SerializedName("LineOperator")
    @Expose
    private String [] LineOperator;

    /**
    * 
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AvailablePortType")
    @Expose
    private String [] AvailablePortType;

    /**
     * Get  
     * @return AccessPointName 
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set 
     * @param AccessPointName 
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get  
     * @return AccessPointId 
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set 
     * @param AccessPointId 
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get  
     * @return State 
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 
     * @param State 
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get  
     * @return Location 
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 
     * @param Location 
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get  
     * @return LineOperator 
     */
    public String [] getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set 
     * @param LineOperator 
     */
    public void setLineOperator(String [] LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get  
     * @return RegionId 
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 
     * @param RegionId 
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AvailablePortType Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String [] getAvailablePortType() {
        return this.AvailablePortType;
    }

    /**
     * Set Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AvailablePortType Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAvailablePortType(String [] AvailablePortType) {
        this.AvailablePortType = AvailablePortType;
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
        this.setParamArraySimple(map, prefix + "AvailablePortType.", this.AvailablePortType);

    }
}

