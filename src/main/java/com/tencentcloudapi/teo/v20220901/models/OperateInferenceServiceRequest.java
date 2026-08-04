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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateInferenceServiceRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * ID of the inference service.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Operation type, including the following: <li>Stop: stop;</li><li>Resume: start up;</li><li>Delete: delete.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get ID of the inference service. 
     * @return ServiceId ID of the inference service.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set ID of the inference service.
     * @param ServiceId ID of the inference service.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Operation type, including the following: <li>Stop: stop;</li><li>Resume: start up;</li><li>Delete: delete.</li> 
     * @return Operation Operation type, including the following: <li>Stop: stop;</li><li>Resume: start up;</li><li>Delete: delete.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type, including the following: <li>Stop: stop;</li><li>Resume: start up;</li><li>Delete: delete.</li>
     * @param Operation Operation type, including the following: <li>Stop: stop;</li><li>Resume: start up;</li><li>Delete: delete.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public OperateInferenceServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateInferenceServiceRequest(OperateInferenceServiceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

