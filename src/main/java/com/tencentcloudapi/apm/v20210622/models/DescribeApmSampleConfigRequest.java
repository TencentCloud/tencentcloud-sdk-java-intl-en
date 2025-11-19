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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmSampleConfigRequest extends AbstractModel {

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sampling rule name.
    */
    @SerializedName("SampleName")
    @Expose
    private String SampleName;

    /**
     * Get Business system ID 
     * @return InstanceId Business system ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system ID
     * @param InstanceId Business system ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sampling rule name. 
     * @return SampleName Sampling rule name.
     */
    public String getSampleName() {
        return this.SampleName;
    }

    /**
     * Set Sampling rule name.
     * @param SampleName Sampling rule name.
     */
    public void setSampleName(String SampleName) {
        this.SampleName = SampleName;
    }

    public DescribeApmSampleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmSampleConfigRequest(DescribeApmSampleConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SampleName != null) {
            this.SampleName = new String(source.SampleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SampleName", this.SampleName);

    }
}

