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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnIp extends AbstractModel{

    /**
    * IP of the node.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Whether the IP is a Tencent Cloud CDN cache node. `yes`: it is a Tencent Cloud CDN cache node; `no`: it is not.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * District/country where the node is located. `unknown`: the node location is unknown.
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
    * Service region of the node. `mainland`: Mainland China; `overseas`: outside Mainland China; `unknown`: unknown
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get IP of the node. 
     * @return Ip IP of the node.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP of the node.
     * @param Ip IP of the node.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Whether the IP is a Tencent Cloud CDN cache node. `yes`: it is a Tencent Cloud CDN cache node; `no`: it is not. 
     * @return Platform Whether the IP is a Tencent Cloud CDN cache node. `yes`: it is a Tencent Cloud CDN cache node; `no`: it is not.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Whether the IP is a Tencent Cloud CDN cache node. `yes`: it is a Tencent Cloud CDN cache node; `no`: it is not.
     * @param Platform Whether the IP is a Tencent Cloud CDN cache node. `yes`: it is a Tencent Cloud CDN cache node; `no`: it is not.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get District/country where the node is located. `unknown`: the node location is unknown. 
     * @return Location District/country where the node is located. `unknown`: the node location is unknown.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set District/country where the node is located. `unknown`: the node location is unknown.
     * @param Location District/country where the node is located. `unknown`: the node location is unknown.
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
     * Get Service region of the node. `mainland`: Mainland China; `overseas`: outside Mainland China; `unknown`: unknown 
     * @return Area Service region of the node. `mainland`: Mainland China; `overseas`: outside Mainland China; `unknown`: unknown
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Service region of the node. `mainland`: Mainland China; `overseas`: outside Mainland China; `unknown`: unknown
     * @param Area Service region of the node. `mainland`: Mainland China; `overseas`: outside Mainland China; `unknown`: unknown
     */
    public void setArea(String Area) {
        this.Area = Area;
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

    }
}

