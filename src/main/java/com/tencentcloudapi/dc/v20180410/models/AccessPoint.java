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
    * Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AvailablePortType")
    @Expose
    private String [] AvailablePortType;

    /**
    * Latitude and longitude of the access point
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Coordinate")
    @Expose
    private Coordinate Coordinate;

    /**
    * City where the access point is located
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Access point region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

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
     * Get Latitude and longitude of the access point
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Coordinate Latitude and longitude of the access point
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Coordinate getCoordinate() {
        return this.Coordinate;
    }

    /**
     * Set Latitude and longitude of the access point
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Coordinate Latitude and longitude of the access point
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCoordinate(Coordinate Coordinate) {
        this.Coordinate = Coordinate;
    }

    /**
     * Get City where the access point is located
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return City City where the access point is located
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City where the access point is located
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param City City where the access point is located
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Access point region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Area Access point region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Access point region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Area Access point region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public AccessPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessPoint(AccessPoint source) {
        if (source.AccessPointName != null) {
            this.AccessPointName = new String(source.AccessPointName);
        }
        if (source.AccessPointId != null) {
            this.AccessPointId = new String(source.AccessPointId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.LineOperator != null) {
            this.LineOperator = new String[source.LineOperator.length];
            for (int i = 0; i < source.LineOperator.length; i++) {
                this.LineOperator[i] = new String(source.LineOperator[i]);
            }
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.AvailablePortType != null) {
            this.AvailablePortType = new String[source.AvailablePortType.length];
            for (int i = 0; i < source.AvailablePortType.length; i++) {
                this.AvailablePortType[i] = new String(source.AvailablePortType[i]);
            }
        }
        if (source.Coordinate != null) {
            this.Coordinate = new Coordinate(source.Coordinate);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
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
        this.setParamObj(map, prefix + "Coordinate.", this.Coordinate);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

