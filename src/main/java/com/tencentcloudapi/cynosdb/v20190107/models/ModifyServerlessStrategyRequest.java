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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServerlessStrategyRequest extends AbstractModel {

    /**
    * Specifies the serverless cluster id.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Specifies whether the cluster automatically pauses. valid values for the optional range.
<li>yes</li>
<li>no</li>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * Specifies the delay for cluster auto-pause in seconds. the value range is [600,691200]. the default value is 600.
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * The parameter is temporarily unavailable.
    */
    @SerializedName("AutoScaleUpDelay")
    @Expose
    private Long AutoScaleUpDelay;

    /**
    * The parameter is temporarily unavailable.
    */
    @SerializedName("AutoScaleDownDelay")
    @Expose
    private Long AutoScaleDownDelay;

    /**
    * Minimum value of cpu. for the optional range, refer to the API response of DescribeServerlessInstanceSpecs.
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * Maximum value of cpu, optional range refers to the API response of DescribeServerlessInstanceSpecs.
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * Minimum cpu value of a read-only instance. for valid values, refer to the API response of DescribeServerlessInstanceSpecs.
    */
    @SerializedName("MinRoCpu")
    @Expose
    private Float MinRoCpu;

    /**
    * Maximum value of read-only cpu, optional range refer to the API response of DescribeServerlessInstanceSpecs.
    */
    @SerializedName("MaxRoCpu")
    @Expose
    private Float MaxRoCpu;

    /**
    * Specifies the minimum count of read-only nodes.
    */
    @SerializedName("MinRoCount")
    @Expose
    private Long MinRoCount;

    /**
    * Maximum number of read-only nodes.
    */
    @SerializedName("MaxRoCount")
    @Expose
    private Long MaxRoCount;

    /**
     * Get Specifies the serverless cluster id. 
     * @return ClusterId Specifies the serverless cluster id.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Specifies the serverless cluster id.
     * @param ClusterId Specifies the serverless cluster id.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Specifies whether the cluster automatically pauses. valid values for the optional range.
<li>yes</li>
<li>no</li> 
     * @return AutoPause Specifies whether the cluster automatically pauses. valid values for the optional range.
<li>yes</li>
<li>no</li>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set Specifies whether the cluster automatically pauses. valid values for the optional range.
<li>yes</li>
<li>no</li>
     * @param AutoPause Specifies whether the cluster automatically pauses. valid values for the optional range.
<li>yes</li>
<li>no</li>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get Specifies the delay for cluster auto-pause in seconds. the value range is [600,691200]. the default value is 600. 
     * @return AutoPauseDelay Specifies the delay for cluster auto-pause in seconds. the value range is [600,691200]. the default value is 600.
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set Specifies the delay for cluster auto-pause in seconds. the value range is [600,691200]. the default value is 600.
     * @param AutoPauseDelay Specifies the delay for cluster auto-pause in seconds. the value range is [600,691200]. the default value is 600.
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get The parameter is temporarily unavailable. 
     * @return AutoScaleUpDelay The parameter is temporarily unavailable.
     */
    public Long getAutoScaleUpDelay() {
        return this.AutoScaleUpDelay;
    }

    /**
     * Set The parameter is temporarily unavailable.
     * @param AutoScaleUpDelay The parameter is temporarily unavailable.
     */
    public void setAutoScaleUpDelay(Long AutoScaleUpDelay) {
        this.AutoScaleUpDelay = AutoScaleUpDelay;
    }

    /**
     * Get The parameter is temporarily unavailable. 
     * @return AutoScaleDownDelay The parameter is temporarily unavailable.
     */
    public Long getAutoScaleDownDelay() {
        return this.AutoScaleDownDelay;
    }

    /**
     * Set The parameter is temporarily unavailable.
     * @param AutoScaleDownDelay The parameter is temporarily unavailable.
     */
    public void setAutoScaleDownDelay(Long AutoScaleDownDelay) {
        this.AutoScaleDownDelay = AutoScaleDownDelay;
    }

    /**
     * Get Minimum value of cpu. for the optional range, refer to the API response of DescribeServerlessInstanceSpecs. 
     * @return MinCpu Minimum value of cpu. for the optional range, refer to the API response of DescribeServerlessInstanceSpecs.
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set Minimum value of cpu. for the optional range, refer to the API response of DescribeServerlessInstanceSpecs.
     * @param MinCpu Minimum value of cpu. for the optional range, refer to the API response of DescribeServerlessInstanceSpecs.
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get Maximum value of cpu, optional range refers to the API response of DescribeServerlessInstanceSpecs. 
     * @return MaxCpu Maximum value of cpu, optional range refers to the API response of DescribeServerlessInstanceSpecs.
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set Maximum value of cpu, optional range refers to the API response of DescribeServerlessInstanceSpecs.
     * @param MaxCpu Maximum value of cpu, optional range refers to the API response of DescribeServerlessInstanceSpecs.
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get Minimum cpu value of a read-only instance. for valid values, refer to the API response of DescribeServerlessInstanceSpecs. 
     * @return MinRoCpu Minimum cpu value of a read-only instance. for valid values, refer to the API response of DescribeServerlessInstanceSpecs.
     */
    public Float getMinRoCpu() {
        return this.MinRoCpu;
    }

    /**
     * Set Minimum cpu value of a read-only instance. for valid values, refer to the API response of DescribeServerlessInstanceSpecs.
     * @param MinRoCpu Minimum cpu value of a read-only instance. for valid values, refer to the API response of DescribeServerlessInstanceSpecs.
     */
    public void setMinRoCpu(Float MinRoCpu) {
        this.MinRoCpu = MinRoCpu;
    }

    /**
     * Get Maximum value of read-only cpu, optional range refer to the API response of DescribeServerlessInstanceSpecs. 
     * @return MaxRoCpu Maximum value of read-only cpu, optional range refer to the API response of DescribeServerlessInstanceSpecs.
     */
    public Float getMaxRoCpu() {
        return this.MaxRoCpu;
    }

    /**
     * Set Maximum value of read-only cpu, optional range refer to the API response of DescribeServerlessInstanceSpecs.
     * @param MaxRoCpu Maximum value of read-only cpu, optional range refer to the API response of DescribeServerlessInstanceSpecs.
     */
    public void setMaxRoCpu(Float MaxRoCpu) {
        this.MaxRoCpu = MaxRoCpu;
    }

    /**
     * Get Specifies the minimum count of read-only nodes. 
     * @return MinRoCount Specifies the minimum count of read-only nodes.
     */
    public Long getMinRoCount() {
        return this.MinRoCount;
    }

    /**
     * Set Specifies the minimum count of read-only nodes.
     * @param MinRoCount Specifies the minimum count of read-only nodes.
     */
    public void setMinRoCount(Long MinRoCount) {
        this.MinRoCount = MinRoCount;
    }

    /**
     * Get Maximum number of read-only nodes. 
     * @return MaxRoCount Maximum number of read-only nodes.
     */
    public Long getMaxRoCount() {
        return this.MaxRoCount;
    }

    /**
     * Set Maximum number of read-only nodes.
     * @param MaxRoCount Maximum number of read-only nodes.
     */
    public void setMaxRoCount(Long MaxRoCount) {
        this.MaxRoCount = MaxRoCount;
    }

    public ModifyServerlessStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServerlessStrategyRequest(ModifyServerlessStrategyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.AutoScaleUpDelay != null) {
            this.AutoScaleUpDelay = new Long(source.AutoScaleUpDelay);
        }
        if (source.AutoScaleDownDelay != null) {
            this.AutoScaleDownDelay = new Long(source.AutoScaleDownDelay);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.MinRoCpu != null) {
            this.MinRoCpu = new Float(source.MinRoCpu);
        }
        if (source.MaxRoCpu != null) {
            this.MaxRoCpu = new Float(source.MaxRoCpu);
        }
        if (source.MinRoCount != null) {
            this.MinRoCount = new Long(source.MinRoCount);
        }
        if (source.MaxRoCount != null) {
            this.MaxRoCount = new Long(source.MaxRoCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamSimple(map, prefix + "AutoScaleUpDelay", this.AutoScaleUpDelay);
        this.setParamSimple(map, prefix + "AutoScaleDownDelay", this.AutoScaleDownDelay);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "MinRoCpu", this.MinRoCpu);
        this.setParamSimple(map, prefix + "MaxRoCpu", this.MaxRoCpu);
        this.setParamSimple(map, prefix + "MinRoCount", this.MinRoCount);
        this.setParamSimple(map, prefix + "MaxRoCount", this.MaxRoCount);

    }
}

