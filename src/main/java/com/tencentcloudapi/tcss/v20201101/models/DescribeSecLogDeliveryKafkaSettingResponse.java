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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogDeliveryKafkaSettingResponse extends AbstractModel{

    /**
    * Message queue instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Message queue instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Domain
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * List of log types
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogTypeList")
    @Expose
    private SecLogDeliveryKafkaSettingInfo [] LogTypeList;

    /**
    * Username
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Region ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RegionID")
    @Expose
    private String RegionID;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Message queue instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceID Message queue instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Message queue instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceID Message queue instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Message queue instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Message queue instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Message queue instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Message queue instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Domain
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get List of log types
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogTypeList List of log types
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecLogDeliveryKafkaSettingInfo [] getLogTypeList() {
        return this.LogTypeList;
    }

    /**
     * Set List of log types
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogTypeList List of log types
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogTypeList(SecLogDeliveryKafkaSettingInfo [] LogTypeList) {
        this.LogTypeList = LogTypeList;
    }

    /**
     * Get Username
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return User Username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username
Note: This field may return null, indicating that no valid values can be obtained.
     * @param User Username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Region ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RegionID Region ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getRegionID() {
        return this.RegionID;
    }

    /**
     * Set Region ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param RegionID Region ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
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

    public DescribeSecLogDeliveryKafkaSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogDeliveryKafkaSettingResponse(DescribeSecLogDeliveryKafkaSettingResponse source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LogTypeList != null) {
            this.LogTypeList = new SecLogDeliveryKafkaSettingInfo[source.LogTypeList.length];
            for (int i = 0; i < source.LogTypeList.length; i++) {
                this.LogTypeList[i] = new SecLogDeliveryKafkaSettingInfo(source.LogTypeList[i]);
            }
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.RegionID != null) {
            this.RegionID = new String(source.RegionID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "LogTypeList.", this.LogTypeList);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

