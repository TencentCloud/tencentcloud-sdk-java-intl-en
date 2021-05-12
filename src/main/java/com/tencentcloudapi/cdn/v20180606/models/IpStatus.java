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

public class IpStatus extends AbstractModel{

    /**
    * Node IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Node region
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * Node ISP
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * Node city
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Node status
online: the node is online; scheduling service running
offline: the node is offline
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Node IP 
     * @return Ip Node IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Node IP
     * @param Ip Node IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Node region 
     * @return District Node region
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set Node region
     * @param District Node region
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get Node ISP 
     * @return Isp Node ISP
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set Node ISP
     * @param Isp Node ISP
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get Node city 
     * @return City Node city
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set Node city
     * @param City Node city
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Node status
online: the node is online; scheduling service running
offline: the node is offline 
     * @return Status Node status
online: the node is online; scheduling service running
offline: the node is offline
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status
online: the node is online; scheduling service running
offline: the node is offline
     * @param Status Node status
online: the node is online; scheduling service running
offline: the node is offline
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public IpStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpStatus(IpStatus source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

