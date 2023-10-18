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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdentificationResponse extends AbstractModel {

    /**
    * Site name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Verification status. Valid values:
- `pending`: Verifying
- `finished`: The site is verified.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * Record type
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Record value
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * NS records of the domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Verification status. Valid values:
- `pending`: Verifying
- `finished`: The site is verified. 
     * @return Status Verification status. Valid values:
- `pending`: Verifying
- `finished`: The site is verified.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Verification status. Valid values:
- `pending`: Verifying
- `finished`: The site is verified.
     * @param Status Verification status. Valid values:
- `pending`: Verifying
- `finished`: The site is verified.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return Subdomain 
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 
     * @param Subdomain 
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get Record type 
     * @return RecordType Record type
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type
     * @param RecordType Record type
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Record value 
     * @return RecordValue Record value
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set Record value
     * @param RecordValue Record value
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    /**
     * Get NS records of the domain name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginalNameServers NS records of the domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set NS records of the domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginalNameServers NS records of the domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
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

    public DescribeIdentificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIdentificationResponse(DescribeIdentificationResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

