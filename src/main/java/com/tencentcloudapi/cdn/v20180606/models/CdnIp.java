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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnIp extends AbstractModel {

    /**
    * IP to be queried
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * IP ownership:
yes: Tencent Cloud CDN node
no: non-Tencent Cloud CDN node
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Node district/country
unknown: unknown node location
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Activation and deactivation history of the node.
    */
    @SerializedName("History")
    @Expose
    private CdnIpHistory [] History;

    /**
    * Node region
`mainland`: Acceleration nodes inside the Chinese mainland
`overseas`: Acceleration nodes outside the Chinese mainland
`unknown`: Service region unknown
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * City where the nodes reside
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
     * Get IP to be queried 
     * @return Ip IP to be queried
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP to be queried
     * @param Ip IP to be queried
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get IP ownership:
yes: Tencent Cloud CDN node
no: non-Tencent Cloud CDN node 
     * @return Platform IP ownership:
yes: Tencent Cloud CDN node
no: non-Tencent Cloud CDN node
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set IP ownership:
yes: Tencent Cloud CDN node
no: non-Tencent Cloud CDN node
     * @param Platform IP ownership:
yes: Tencent Cloud CDN node
no: non-Tencent Cloud CDN node
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Node district/country
unknown: unknown node location 
     * @return Location Node district/country
unknown: unknown node location
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Node district/country
unknown: unknown node location
     * @param Location Node district/country
unknown: unknown node location
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Activation and deactivation history of the node. 
     * @return History Activation and deactivation history of the node.
     */
    public CdnIpHistory [] getHistory() {
        return this.History;
    }

    /**
     * Set Activation and deactivation history of the node.
     * @param History Activation and deactivation history of the node.
     */
    public void setHistory(CdnIpHistory [] History) {
        this.History = History;
    }

    /**
     * Get Node region
`mainland`: Acceleration nodes inside the Chinese mainland
`overseas`: Acceleration nodes outside the Chinese mainland
`unknown`: Service region unknown 
     * @return Area Node region
`mainland`: Acceleration nodes inside the Chinese mainland
`overseas`: Acceleration nodes outside the Chinese mainland
`unknown`: Service region unknown
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Node region
`mainland`: Acceleration nodes inside the Chinese mainland
`overseas`: Acceleration nodes outside the Chinese mainland
`unknown`: Service region unknown
     * @param Area Node region
`mainland`: Acceleration nodes inside the Chinese mainland
`overseas`: Acceleration nodes outside the Chinese mainland
`unknown`: Service region unknown
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get City where the nodes reside
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return City City where the nodes reside
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City where the nodes reside
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param City City where the nodes reside
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCity(String City) {
        this.City = City;
    }

    public CdnIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdnIp(CdnIp source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.History != null) {
            this.History = new CdnIpHistory[source.History.length];
            for (int i = 0; i < source.History.length; i++) {
                this.History[i] = new CdnIpHistory(source.History[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "History.", this.History);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "City", this.City);

    }
}

