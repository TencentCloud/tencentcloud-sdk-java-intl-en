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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnssecResponse extends AbstractModel{

    /**
    * The DNSSEC status. Values:
<li>`enabled`: Enabled</li>
<li>`disabled`: Disabled</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The DNSSEC information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DnssecInfo")
    @Expose
    private DnssecInfo DnssecInfo;

    /**
    * The update time of the site information.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The DNSSEC status. Values:
<li>`enabled`: Enabled</li>
<li>`disabled`: Disabled</li> 
     * @return Status The DNSSEC status. Values:
<li>`enabled`: Enabled</li>
<li>`disabled`: Disabled</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The DNSSEC status. Values:
<li>`enabled`: Enabled</li>
<li>`disabled`: Disabled</li>
     * @param Status The DNSSEC status. Values:
<li>`enabled`: Enabled</li>
<li>`disabled`: Disabled</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The DNSSEC information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DnssecInfo The DNSSEC information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DnssecInfo getDnssecInfo() {
        return this.DnssecInfo;
    }

    /**
     * Set The DNSSEC information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DnssecInfo The DNSSEC information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDnssecInfo(DnssecInfo DnssecInfo) {
        this.DnssecInfo = DnssecInfo;
    }

    /**
     * Get The update time of the site information. 
     * @return ModifiedOn The update time of the site information.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set The update time of the site information.
     * @param ModifiedOn The update time of the site information.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDnssecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnssecResponse(DescribeDnssecResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DnssecInfo != null) {
            this.DnssecInfo = new DnssecInfo(source.DnssecInfo);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "DnssecInfo.", this.DnssecInfo);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

