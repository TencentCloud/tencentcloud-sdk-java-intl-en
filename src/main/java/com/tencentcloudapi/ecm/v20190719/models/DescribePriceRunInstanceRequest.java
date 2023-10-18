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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceRunInstanceRequest extends AbstractModel {

    /**
    * Instance model information
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * System disk information
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Number of instances
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Data disk information
    */
    @SerializedName("DataDisk")
    @Expose
    private DataDisk [] DataDisk;

    /**
    * Instance billing type. Valid values:
`0`: Bill by daily resource usage peak (CPU, memory, and disk). It applies only to non-GNR models;
`1`: Bill by usage hours of an instance. It applies only to GNR models. It’s available to beta users now. To enable it, submit a ticket;
`2`: Bill by usage month of an instance. It applies only to GNR models.
If this field is left empty, `0` is selected by default for non-GNR models, and `2` is selected by default for GNR models.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
     * Get Instance model information 
     * @return InstanceType Instance model information
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model information
     * @param InstanceType Instance model information
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get System disk information 
     * @return SystemDisk System disk information
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk information
     * @param SystemDisk System disk information
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Number of instances 
     * @return InstanceCount Number of instances
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances
     * @param InstanceCount Number of instances
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Data disk information 
     * @return DataDisk Data disk information
     */
    public DataDisk [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set Data disk information
     * @param DataDisk Data disk information
     */
    public void setDataDisk(DataDisk [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get Instance billing type. Valid values:
`0`: Bill by daily resource usage peak (CPU, memory, and disk). It applies only to non-GNR models;
`1`: Bill by usage hours of an instance. It applies only to GNR models. It’s available to beta users now. To enable it, submit a ticket;
`2`: Bill by usage month of an instance. It applies only to GNR models.
If this field is left empty, `0` is selected by default for non-GNR models, and `2` is selected by default for GNR models. 
     * @return InstanceChargeType Instance billing type. Valid values:
`0`: Bill by daily resource usage peak (CPU, memory, and disk). It applies only to non-GNR models;
`1`: Bill by usage hours of an instance. It applies only to GNR models. It’s available to beta users now. To enable it, submit a ticket;
`2`: Bill by usage month of an instance. It applies only to GNR models.
If this field is left empty, `0` is selected by default for non-GNR models, and `2` is selected by default for GNR models.
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type. Valid values:
`0`: Bill by daily resource usage peak (CPU, memory, and disk). It applies only to non-GNR models;
`1`: Bill by usage hours of an instance. It applies only to GNR models. It’s available to beta users now. To enable it, submit a ticket;
`2`: Bill by usage month of an instance. It applies only to GNR models.
If this field is left empty, `0` is selected by default for non-GNR models, and `2` is selected by default for GNR models.
     * @param InstanceChargeType Instance billing type. Valid values:
`0`: Bill by daily resource usage peak (CPU, memory, and disk). It applies only to non-GNR models;
`1`: Bill by usage hours of an instance. It applies only to GNR models. It’s available to beta users now. To enable it, submit a ticket;
`2`: Bill by usage month of an instance. It applies only to GNR models.
If this field is left empty, `0` is selected by default for non-GNR models, and `2` is selected by default for GNR models.
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    public DescribePriceRunInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePriceRunInstanceRequest(DescribePriceRunInstanceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DataDisk[source.DataDisk.length];
            for (int i = 0; i < source.DataDisk.length; i++) {
                this.DataDisk[i] = new DataDisk(source.DataDisk[i]);
            }
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArrayObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

