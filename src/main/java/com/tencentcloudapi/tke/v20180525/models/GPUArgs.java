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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUArgs extends AbstractModel {

    /**
    * Whether to enable MIG
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MIGEnable")
    @Expose
    private Boolean MIGEnable;

    /**
    * GPU driver version
    */
    @SerializedName("Driver")
    @Expose
    private DriverVersion Driver;

    /**
    * CUDA version
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CUDA")
    @Expose
    private DriverVersion CUDA;

    /**
    * cuDNN version
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CUDNN")
    @Expose
    private CUDNN CUDNN;

    /**
    * Custom GPU driver
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomDriver")
    @Expose
    private CustomDriver CustomDriver;

    /**
     * Get Whether to enable MIG
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return MIGEnable Whether to enable MIG
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getMIGEnable() {
        return this.MIGEnable;
    }

    /**
     * Set Whether to enable MIG
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param MIGEnable Whether to enable MIG
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMIGEnable(Boolean MIGEnable) {
        this.MIGEnable = MIGEnable;
    }

    /**
     * Get GPU driver version 
     * @return Driver GPU driver version
     */
    public DriverVersion getDriver() {
        return this.Driver;
    }

    /**
     * Set GPU driver version
     * @param Driver GPU driver version
     */
    public void setDriver(DriverVersion Driver) {
        this.Driver = Driver;
    }

    /**
     * Get CUDA version
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CUDA CUDA version
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public DriverVersion getCUDA() {
        return this.CUDA;
    }

    /**
     * Set CUDA version
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CUDA CUDA version
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCUDA(DriverVersion CUDA) {
        this.CUDA = CUDA;
    }

    /**
     * Get cuDNN version
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CUDNN cuDNN version
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public CUDNN getCUDNN() {
        return this.CUDNN;
    }

    /**
     * Set cuDNN version
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CUDNN cuDNN version
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCUDNN(CUDNN CUDNN) {
        this.CUDNN = CUDNN;
    }

    /**
     * Get Custom GPU driver
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CustomDriver Custom GPU driver
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public CustomDriver getCustomDriver() {
        return this.CustomDriver;
    }

    /**
     * Set Custom GPU driver
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CustomDriver Custom GPU driver
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCustomDriver(CustomDriver CustomDriver) {
        this.CustomDriver = CustomDriver;
    }

    public GPUArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUArgs(GPUArgs source) {
        if (source.MIGEnable != null) {
            this.MIGEnable = new Boolean(source.MIGEnable);
        }
        if (source.Driver != null) {
            this.Driver = new DriverVersion(source.Driver);
        }
        if (source.CUDA != null) {
            this.CUDA = new DriverVersion(source.CUDA);
        }
        if (source.CUDNN != null) {
            this.CUDNN = new CUDNN(source.CUDNN);
        }
        if (source.CustomDriver != null) {
            this.CustomDriver = new CustomDriver(source.CustomDriver);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MIGEnable", this.MIGEnable);
        this.setParamObj(map, prefix + "Driver.", this.Driver);
        this.setParamObj(map, prefix + "CUDA.", this.CUDA);
        this.setParamObj(map, prefix + "CUDNN.", this.CUDNN);
        this.setParamObj(map, prefix + "CustomDriver.", this.CustomDriver);

    }
}

