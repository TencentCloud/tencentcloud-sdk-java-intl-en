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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraRiskInfo extends AbstractModel {

    /**
    * <p>A stable and unique person identifier within the customer's business domain, used to correlate multiple location reports from the same person to determine whether abnormal displacement exists.</p><p>Input restrictions: Length ≤ 128 characters; Must not contain control characters (ASCII &lt; 0x20 or 0x7F); It is recommended to pass a desensitized identifier instead of a plaintext ID number or mobile number.</p>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>Latitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Longitude; Valid range: [-90, 90]; Must be a valid number, NaN/Inf not accepted; Pass as a string in JSON (e.g., &quot;22.5431&quot;)</p>
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * <p>Longitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Latitude; Valid range: [-180, 180]; Other restrictions are the same as above</p>
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * <p>Public egress IP of the device at the time of collection    </p><p>Input restrictions: Length ≤ 64; Must be a resolvable IPv4/IPv6 address; Private, loopback, link-local, and multicast addresses are considered non-locatable</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get <p>A stable and unique person identifier within the customer's business domain, used to correlate multiple location reports from the same person to determine whether abnormal displacement exists.</p><p>Input restrictions: Length ≤ 128 characters; Must not contain control characters (ASCII &lt; 0x20 or 0x7F); It is recommended to pass a desensitized identifier instead of a plaintext ID number or mobile number.</p> 
     * @return PersonId <p>A stable and unique person identifier within the customer's business domain, used to correlate multiple location reports from the same person to determine whether abnormal displacement exists.</p><p>Input restrictions: Length ≤ 128 characters; Must not contain control characters (ASCII &lt; 0x20 or 0x7F); It is recommended to pass a desensitized identifier instead of a plaintext ID number or mobile number.</p>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>A stable and unique person identifier within the customer's business domain, used to correlate multiple location reports from the same person to determine whether abnormal displacement exists.</p><p>Input restrictions: Length ≤ 128 characters; Must not contain control characters (ASCII &lt; 0x20 or 0x7F); It is recommended to pass a desensitized identifier instead of a plaintext ID number or mobile number.</p>
     * @param PersonId <p>A stable and unique person identifier within the customer's business domain, used to correlate multiple location reports from the same person to determine whether abnormal displacement exists.</p><p>Input restrictions: Length ≤ 128 characters; Must not contain control characters (ASCII &lt; 0x20 or 0x7F); It is recommended to pass a desensitized identifier instead of a plaintext ID number or mobile number.</p>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>Latitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Longitude; Valid range: [-90, 90]; Must be a valid number, NaN/Inf not accepted; Pass as a string in JSON (e.g., &quot;22.5431&quot;)</p> 
     * @return Latitude <p>Latitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Longitude; Valid range: [-90, 90]; Must be a valid number, NaN/Inf not accepted; Pass as a string in JSON (e.g., &quot;22.5431&quot;)</p>
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set <p>Latitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Longitude; Valid range: [-90, 90]; Must be a valid number, NaN/Inf not accepted; Pass as a string in JSON (e.g., &quot;22.5431&quot;)</p>
     * @param Latitude <p>Latitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Longitude; Valid range: [-90, 90]; Must be a valid number, NaN/Inf not accepted; Pass as a string in JSON (e.g., &quot;22.5431&quot;)</p>
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get <p>Longitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Latitude; Valid range: [-180, 180]; Other restrictions are the same as above</p> 
     * @return Longitude <p>Longitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Latitude; Valid range: [-180, 180]; Other restrictions are the same as above</p>
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set <p>Longitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Latitude; Valid range: [-180, 180]; Other restrictions are the same as above</p>
     * @param Longitude <p>Longitude at the time of device collection, in WGS84 decimal degrees    </p><p>Input restrictions: Must be paired with Latitude; Valid range: [-180, 180]; Other restrictions are the same as above</p>
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get <p>Public egress IP of the device at the time of collection    </p><p>Input restrictions: Length ≤ 64; Must be a resolvable IPv4/IPv6 address; Private, loopback, link-local, and multicast addresses are considered non-locatable</p> 
     * @return Ip <p>Public egress IP of the device at the time of collection    </p><p>Input restrictions: Length ≤ 64; Must be a resolvable IPv4/IPv6 address; Private, loopback, link-local, and multicast addresses are considered non-locatable</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Public egress IP of the device at the time of collection    </p><p>Input restrictions: Length ≤ 64; Must be a resolvable IPv4/IPv6 address; Private, loopback, link-local, and multicast addresses are considered non-locatable</p>
     * @param Ip <p>Public egress IP of the device at the time of collection    </p><p>Input restrictions: Length ≤ 64; Must be a resolvable IPv4/IPv6 address; Private, loopback, link-local, and multicast addresses are considered non-locatable</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public ExtraRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraRiskInfo(ExtraRiskInfo source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

