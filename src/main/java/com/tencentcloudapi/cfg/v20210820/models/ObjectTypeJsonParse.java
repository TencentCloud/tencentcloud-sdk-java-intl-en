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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTypeJsonParse extends AbstractModel {

    /**
    * Namespace

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * Workload name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * Node IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * Node ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Namespace

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NameSpace Namespace

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set Namespace

Note: This field may return null, indicating that no valid values can be obtained.
     * @param NameSpace Namespace

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get Workload name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkloadName Workload name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set Workload name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkloadName Workload name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get Node IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LanIP Node IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set Node IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LanIP Node IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get Node ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ObjectTypeJsonParse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectTypeJsonParse(ObjectTypeJsonParse source) {
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.LanIP != null) {
            this.LanIP = new String(source.LanIP);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

