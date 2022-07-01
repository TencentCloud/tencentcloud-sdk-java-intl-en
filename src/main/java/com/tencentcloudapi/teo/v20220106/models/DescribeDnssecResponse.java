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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnssecResponse extends AbstractModel{

    /**
    * Site ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Site name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNSSEC status. Valid values:
- `enabled`: Enabled
- `disabled`: Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("Dnssec")
    @Expose
    private DnssecInfo Dnssec;

    /**
    * Modification time
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
     * Get Site ID 
     * @return Id Site ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Site ID
     * @param Id Site ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Site name 
     * @return Name Site name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Site name
     * @param Name Site name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNSSEC status. Valid values:
- `enabled`: Enabled
- `disabled`: Disabled 
     * @return Status DNSSEC status. Valid values:
- `enabled`: Enabled
- `disabled`: Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DNSSEC status. Valid values:
- `enabled`: Enabled
- `disabled`: Disabled
     * @param Status DNSSEC status. Valid values:
- `enabled`: Enabled
- `disabled`: Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return Dnssec 
     */
    public DnssecInfo getDnssec() {
        return this.Dnssec;
    }

    /**
     * Set 
     * @param Dnssec 
     */
    public void setDnssec(DnssecInfo Dnssec) {
        this.Dnssec = Dnssec;
    }

    /**
     * Get Modification time 
     * @return ModifiedOn Modification time
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Modification time
     * @param ModifiedOn Modification time
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Dnssec != null) {
            this.Dnssec = new DnssecInfo(source.Dnssec);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Dnssec.", this.Dnssec);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

