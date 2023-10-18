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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether it is an open-source instance. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IfCommunity")
    @Expose
    private Boolean IfCommunity;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed 
     * @return Status Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
     * @param Status Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether it is an open-source instance. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IfCommunity Whether it is an open-source instance. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIfCommunity() {
        return this.IfCommunity;
    }

    /**
     * Set Whether it is an open-source instance. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IfCommunity Whether it is an open-source instance. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIfCommunity(Boolean IfCommunity) {
        this.IfCommunity = IfCommunity;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IfCommunity != null) {
            this.IfCommunity = new Boolean(source.IfCommunity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IfCommunity", this.IfCommunity);

    }
}

