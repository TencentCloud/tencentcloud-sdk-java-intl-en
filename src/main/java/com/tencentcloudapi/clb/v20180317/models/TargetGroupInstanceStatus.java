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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInstanceStatus extends AbstractModel {

    /**
    * IP of backend RS
    */
    @SerializedName("InstanceIp")
    @Expose
    private String InstanceIp;

    /**
    * Health check status. Parameter values and meanings are as follows:
● on: Indicates checking.
● off: means health check disabled.
● Health: Indicates healthy.
● unhealth: indicates being abnormal.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * NIC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
     * Get IP of backend RS 
     * @return InstanceIp IP of backend RS
     */
    public String getInstanceIp() {
        return this.InstanceIp;
    }

    /**
     * Set IP of backend RS
     * @param InstanceIp IP of backend RS
     */
    public void setInstanceIp(String InstanceIp) {
        this.InstanceIp = InstanceIp;
    }

    /**
     * Get Health check status. Parameter values and meanings are as follows:
● on: Indicates checking.
● off: means health check disabled.
● Health: Indicates healthy.
● unhealth: indicates being abnormal. 
     * @return Status Health check status. Parameter values and meanings are as follows:
● on: Indicates checking.
● off: means health check disabled.
● Health: Indicates healthy.
● unhealth: indicates being abnormal.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Health check status. Parameter values and meanings are as follows:
● on: Indicates checking.
● off: means health check disabled.
● Health: Indicates healthy.
● unhealth: indicates being abnormal.
     * @param Status Health check status. Parameter values and meanings are as follows:
● on: Indicates checking.
● off: means health check disabled.
● Health: Indicates healthy.
● unhealth: indicates being abnormal.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get NIC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EniId NIC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set NIC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EniId NIC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    public TargetGroupInstanceStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupInstanceStatus(TargetGroupInstanceStatus source) {
        if (source.InstanceIp != null) {
            this.InstanceIp = new String(source.InstanceIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.EniId != null) {
            this.EniId = new String(source.EniId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceIp", this.InstanceIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "EniId", this.EniId);

    }
}

