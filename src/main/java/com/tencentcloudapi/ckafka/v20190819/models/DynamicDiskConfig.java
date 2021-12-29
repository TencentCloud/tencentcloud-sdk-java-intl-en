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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicDiskConfig extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 
    */
    @SerializedName("StepForwardPercentage")
    @Expose
    private Long StepForwardPercentage;

    /**
    * 
    */
    @SerializedName("DiskQuotaPercentage")
    @Expose
    private Long DiskQuotaPercentage;

    /**
    * 
    */
    @SerializedName("MaxDiskSpace")
    @Expose
    private Long MaxDiskSpace;

    /**
     * Get  
     * @return Enable 
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 
     * @param Enable 
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get  
     * @return StepForwardPercentage 
     */
    public Long getStepForwardPercentage() {
        return this.StepForwardPercentage;
    }

    /**
     * Set 
     * @param StepForwardPercentage 
     */
    public void setStepForwardPercentage(Long StepForwardPercentage) {
        this.StepForwardPercentage = StepForwardPercentage;
    }

    /**
     * Get  
     * @return DiskQuotaPercentage 
     */
    public Long getDiskQuotaPercentage() {
        return this.DiskQuotaPercentage;
    }

    /**
     * Set 
     * @param DiskQuotaPercentage 
     */
    public void setDiskQuotaPercentage(Long DiskQuotaPercentage) {
        this.DiskQuotaPercentage = DiskQuotaPercentage;
    }

    /**
     * Get  
     * @return MaxDiskSpace 
     */
    public Long getMaxDiskSpace() {
        return this.MaxDiskSpace;
    }

    /**
     * Set 
     * @param MaxDiskSpace 
     */
    public void setMaxDiskSpace(Long MaxDiskSpace) {
        this.MaxDiskSpace = MaxDiskSpace;
    }

    public DynamicDiskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicDiskConfig(DynamicDiskConfig source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.StepForwardPercentage != null) {
            this.StepForwardPercentage = new Long(source.StepForwardPercentage);
        }
        if (source.DiskQuotaPercentage != null) {
            this.DiskQuotaPercentage = new Long(source.DiskQuotaPercentage);
        }
        if (source.MaxDiskSpace != null) {
            this.MaxDiskSpace = new Long(source.MaxDiskSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "StepForwardPercentage", this.StepForwardPercentage);
        this.setParamSimple(map, prefix + "DiskQuotaPercentage", this.DiskQuotaPercentage);
        this.setParamSimple(map, prefix + "MaxDiskSpace", this.MaxDiskSpace);

    }
}

