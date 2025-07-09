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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpStatus extends AbstractModel {

    /**
    * Node IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Region of the node
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * ISP of the node
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * City of the node
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Status of the node
`online`: The node is active and scheduling normally.
`offline`: The node is inactive.
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
     * Get Region of the node 
     * @return District Region of the node
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set Region of the node
     * @param District Region of the node
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get ISP of the node 
     * @return Isp ISP of the node
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set ISP of the node
     * @param Isp ISP of the node
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get City of the node 
     * @return City City of the node
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City of the node
     * @param City City of the node
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Status of the node
`online`: The node is active and scheduling normally.
`offline`: The node is inactive. 
     * @return Status Status of the node
`online`: The node is active and scheduling normally.
`offline`: The node is inactive.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the node
`online`: The node is active and scheduling normally.
`offline`: The node is inactive.
     * @param Status Status of the node
`online`: The node is active and scheduling normally.
`offline`: The node is inactive.
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

