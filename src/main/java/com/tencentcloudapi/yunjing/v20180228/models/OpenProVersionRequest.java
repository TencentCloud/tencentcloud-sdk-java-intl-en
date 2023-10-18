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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenProVersionRequest extends AbstractModel {

    /**
    * Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Server region
Examples: ap-guangzhou, ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Server `Uuid` array.
`InstanceId` for BM or `Uuid` for CVM
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * Event ID.
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
     * Get Server type.
<li>CVM: CVM</li>
<li>BM: BM</li> 
     * @return MachineType Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     * @param MachineType Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Server region
Examples: ap-guangzhou, ap-shanghai 
     * @return MachineRegion Server region
Examples: ap-guangzhou, ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Server region
Examples: ap-guangzhou, ap-shanghai
     * @param MachineRegion Server region
Examples: ap-guangzhou, ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Server `Uuid` array.
`InstanceId` for BM or `Uuid` for CVM 
     * @return Quuids Server `Uuid` array.
`InstanceId` for BM or `Uuid` for CVM
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Server `Uuid` array.
`InstanceId` for BM or `Uuid` for CVM
     * @param Quuids Server `Uuid` array.
`InstanceId` for BM or `Uuid` for CVM
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Event ID. 
     * @return ActivityId Event ID.
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Event ID.
     * @param ActivityId Event ID.
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    public OpenProVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenProVersionRequest(OpenProVersionRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);

    }
}

