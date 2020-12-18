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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Backend extends AbstractModel{

    /**
    * Real server type. Valid values: CVM, ENI.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Listening port of a real server
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Public IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * Private IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * Real server instance names
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Bound time of a real server
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegisteredTime")
    @Expose
    private String RegisteredTime;

    /**
    * Unique ENI ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
     * Get Real server type. Valid values: CVM, ENI. 
     * @return Type Real server type. Valid values: CVM, ENI.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Real server type. Valid values: CVM, ENI.
     * @param Type Real server type. Valid values: CVM, ENI.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API 
     * @return InstanceId Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
     * @param InstanceId Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Listening port of a real server 
     * @return Port Listening port of a real server
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listening port of a real server
     * @param Port Listening port of a real server
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Forwarding weight of a real server. Value range: [0, 100]. Default value: 10. 
     * @return Weight Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     * @param Weight Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Public IP of a real server
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicIpAddresses Public IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Public IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicIpAddresses Public IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Private IP of a real server
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIpAddresses Private IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set Private IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateIpAddresses Private IP of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get Real server instance names
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Real server instance names
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Real server instance names
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Real server instance names
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Bound time of a real server
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegisteredTime Bound time of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegisteredTime() {
        return this.RegisteredTime;
    }

    /**
     * Set Bound time of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegisteredTime Bound time of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegisteredTime(String RegisteredTime) {
        this.RegisteredTime = RegisteredTime;
    }

    /**
     * Get Unique ENI ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EniId Unique ENI ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set Unique ENI ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EniId Unique ENI ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegisteredTime", this.RegisteredTime);
        this.setParamSimple(map, prefix + "EniId", this.EniId);

    }
}

