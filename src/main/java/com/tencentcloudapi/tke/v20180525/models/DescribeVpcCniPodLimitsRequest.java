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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcCniPodLimitsRequest extends AbstractModel{

    /**
    * The availability zone of the model to query, for example, `ap-guangzhou-3`. This field is left empty by default, that is, do not filter by the availability zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The instance family to query, for example, `S5`. This field is left empty by default, that is, do not filter by the instance family.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * The instance model to query, for example, `S5.LARGE8`. This field is empty by default, that is, do not filter by instance type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get The availability zone of the model to query, for example, `ap-guangzhou-3`. This field is left empty by default, that is, do not filter by the availability zone. 
     * @return Zone The availability zone of the model to query, for example, `ap-guangzhou-3`. This field is left empty by default, that is, do not filter by the availability zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone of the model to query, for example, `ap-guangzhou-3`. This field is left empty by default, that is, do not filter by the availability zone.
     * @param Zone The availability zone of the model to query, for example, `ap-guangzhou-3`. This field is left empty by default, that is, do not filter by the availability zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The instance family to query, for example, `S5`. This field is left empty by default, that is, do not filter by the instance family. 
     * @return InstanceFamily The instance family to query, for example, `S5`. This field is left empty by default, that is, do not filter by the instance family.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set The instance family to query, for example, `S5`. This field is left empty by default, that is, do not filter by the instance family.
     * @param InstanceFamily The instance family to query, for example, `S5`. This field is left empty by default, that is, do not filter by the instance family.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get The instance model to query, for example, `S5.LARGE8`. This field is empty by default, that is, do not filter by instance type. 
     * @return InstanceType The instance model to query, for example, `S5.LARGE8`. This field is empty by default, that is, do not filter by instance type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The instance model to query, for example, `S5.LARGE8`. This field is empty by default, that is, do not filter by instance type.
     * @param InstanceType The instance model to query, for example, `S5.LARGE8`. This field is empty by default, that is, do not filter by instance type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DescribeVpcCniPodLimitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcCniPodLimitsRequest(DescribeVpcCniPodLimitsRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

