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
    * <p>serverless cluster id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Whether the cluster auto pauses, optional range</p><li>yes</li><li>no</li>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>Delay of Cluster Auto-Pause, in seconds. Optional range: [600,691200]. Default: 600</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * <p>This parameter is temporarily unavailable.</p>
    */
    @SerializedName("AutoScaleUpDelay")
    @Expose
    private Long AutoScaleUpDelay;

    /**
    * <p>This parameter is temporarily unavailable.</p>
    */
    @SerializedName("AutoScaleDownDelay")
    @Expose
    private Long AutoScaleDownDelay;

    /**
    * <p>Minimum cpu value. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>Minimum cpu value of the read-only instance. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
    */
    @SerializedName("MinRoCpu")
    @Expose
    private Float MinRoCpu;

    /**
    * <p>Read-only maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
    */
    @SerializedName("MaxRoCpu")
    @Expose
    private Float MaxRoCpu;

    /**
    * <p>Minimum number of read-only nodes</p>
    */
    @SerializedName("MinRoCount")
    @Expose
    private Long MinRoCount;

    /**
    * <p>Maximum number of read-only nodes</p>
    */
    @SerializedName("MaxRoCount")
    @Expose
    private Long MaxRoCount;

    /**
    * <p>Whether archive is enabled, optional range<li>yes</li><li>no</li>Default value: yes</p>
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * <p>Upgrade type. Default value: upgradeImmediate. Available values: upgradeImmediate: complete the modification immediately; upgradeInMaintain: complete the modification during the maintenance window</p>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * <p>List of security groups that the newly-added read-only instances need to bind to. This only binds security groups to read-only instances newly generated during this adjustment of policies, and existing instances are not bound.</p>
    */
    @SerializedName("SecurityGroupIdsForNewRo")
    @Expose
    private String [] SecurityGroupIdsForNewRo;

    /**
     * Get <p>serverless cluster id</p> 
     * @return ClusterId <p>serverless cluster id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>serverless cluster id</p>
     * @param ClusterId <p>serverless cluster id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Whether the cluster auto pauses, optional range</p><li>yes</li><li>no</li> 
     * @return AutoPause <p>Whether the cluster auto pauses, optional range</p><li>yes</li><li>no</li>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>Whether the cluster auto pauses, optional range</p><li>yes</li><li>no</li>
     * @param AutoPause <p>Whether the cluster auto pauses, optional range</p><li>yes</li><li>no</li>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>Delay of Cluster Auto-Pause, in seconds. Optional range: [600,691200]. Default: 600</p> 
     * @return AutoPauseDelay <p>Delay of Cluster Auto-Pause, in seconds. Optional range: [600,691200]. Default: 600</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>Delay of Cluster Auto-Pause, in seconds. Optional range: [600,691200]. Default: 600</p>
     * @param AutoPauseDelay <p>Delay of Cluster Auto-Pause, in seconds. Optional range: [600,691200]. Default: 600</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get <p>This parameter is temporarily unavailable.</p> 
     * @return AutoScaleUpDelay <p>This parameter is temporarily unavailable.</p>
     */
    public Long getAutoScaleUpDelay() {
        return this.AutoScaleUpDelay;
    }

    /**
     * Set <p>This parameter is temporarily unavailable.</p>
     * @param AutoScaleUpDelay <p>This parameter is temporarily unavailable.</p>
     */
    public void setAutoScaleUpDelay(Long AutoScaleUpDelay) {
        this.AutoScaleUpDelay = AutoScaleUpDelay;
    }

    /**
     * Get <p>This parameter is temporarily unavailable.</p> 
     * @return AutoScaleDownDelay <p>This parameter is temporarily unavailable.</p>
     */
    public Long getAutoScaleDownDelay() {
        return this.AutoScaleDownDelay;
    }

    /**
     * Set <p>This parameter is temporarily unavailable.</p>
     * @param AutoScaleDownDelay <p>This parameter is temporarily unavailable.</p>
     */
    public void setAutoScaleDownDelay(Long AutoScaleDownDelay) {
        this.AutoScaleDownDelay = AutoScaleDownDelay;
    }

    /**
     * Get <p>Minimum cpu value. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p> 
     * @return MinCpu <p>Minimum cpu value. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>Minimum cpu value. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     * @param MinCpu <p>Minimum cpu value. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p> 
     * @return MaxCpu <p>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
     * @param MaxCpu <p>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>Minimum cpu value of the read-only instance. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p> 
     * @return MinRoCpu <p>Minimum cpu value of the read-only instance. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
     */
    public Float getMinRoCpu() {
        return this.MinRoCpu;
    }

    /**
     * Set <p>Minimum cpu value of the read-only instance. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
     * @param MinRoCpu <p>Minimum cpu value of the read-only instance. For the optional range, see the API response of DescribeServerlessInstanceSpecs</p>
     */
    public void setMinRoCpu(Float MinRoCpu) {
        this.MinRoCpu = MinRoCpu;
    }

    /**
     * Get <p>Read-only maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p> 
     * @return MaxRoCpu <p>Read-only maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     */
    public Float getMaxRoCpu() {
        return this.MaxRoCpu;
    }

    /**
     * Set <p>Read-only maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     * @param MaxRoCpu <p>Read-only maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     */
    public void setMaxRoCpu(Float MaxRoCpu) {
        this.MaxRoCpu = MaxRoCpu;
    }

    /**
     * Get <p>Minimum number of read-only nodes</p> 
     * @return MinRoCount <p>Minimum number of read-only nodes</p>
     */
    public Long getMinRoCount() {
        return this.MinRoCount;
    }

    /**
     * Set <p>Minimum number of read-only nodes</p>
     * @param MinRoCount <p>Minimum number of read-only nodes</p>
     */
    public void setMinRoCount(Long MinRoCount) {
        this.MinRoCount = MinRoCount;
    }

    /**
     * Get <p>Maximum number of read-only nodes</p> 
     * @return MaxRoCount <p>Maximum number of read-only nodes</p>
     */
    public Long getMaxRoCount() {
        return this.MaxRoCount;
    }

    /**
     * Set <p>Maximum number of read-only nodes</p>
     * @param MaxRoCount <p>Maximum number of read-only nodes</p>
     */
    public void setMaxRoCount(Long MaxRoCount) {
        this.MaxRoCount = MaxRoCount;
    }

    /**
     * Get <p>Whether archive is enabled, optional range<li>yes</li><li>no</li>Default value: yes</p> 
     * @return AutoArchive <p>Whether archive is enabled, optional range<li>yes</li><li>no</li>Default value: yes</p>
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set <p>Whether archive is enabled, optional range<li>yes</li><li>no</li>Default value: yes</p>
     * @param AutoArchive <p>Whether archive is enabled, optional range<li>yes</li><li>no</li>Default value: yes</p>
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get <p>Upgrade type. Default value: upgradeImmediate. Available values: upgradeImmediate: complete the modification immediately; upgradeInMaintain: complete the modification during the maintenance window</p> 
     * @return UpgradeType <p>Upgrade type. Default value: upgradeImmediate. Available values: upgradeImmediate: complete the modification immediately; upgradeInMaintain: complete the modification during the maintenance window</p>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set <p>Upgrade type. Default value: upgradeImmediate. Available values: upgradeImmediate: complete the modification immediately; upgradeInMaintain: complete the modification during the maintenance window</p>
     * @param UpgradeType <p>Upgrade type. Default value: upgradeImmediate. Available values: upgradeImmediate: complete the modification immediately; upgradeInMaintain: complete the modification during the maintenance window</p>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get <p>List of security groups that the newly-added read-only instances need to bind to. This only binds security groups to read-only instances newly generated during this adjustment of policies, and existing instances are not bound.</p> 
     * @return SecurityGroupIdsForNewRo <p>List of security groups that the newly-added read-only instances need to bind to. This only binds security groups to read-only instances newly generated during this adjustment of policies, and existing instances are not bound.</p>
     */
    public String [] getSecurityGroupIdsForNewRo() {
        return this.SecurityGroupIdsForNewRo;
    }

    /**
     * Set <p>List of security groups that the newly-added read-only instances need to bind to. This only binds security groups to read-only instances newly generated during this adjustment of policies, and existing instances are not bound.</p>
     * @param SecurityGroupIdsForNewRo <p>List of security groups that the newly-added read-only instances need to bind to. This only binds security groups to read-only instances newly generated during this adjustment of policies, and existing instances are not bound.</p>
     */
    public void setSecurityGroupIdsForNewRo(String [] SecurityGroupIdsForNewRo) {
        this.SecurityGroupIdsForNewRo = SecurityGroupIdsForNewRo;
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
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.SecurityGroupIdsForNewRo != null) {
            this.SecurityGroupIdsForNewRo = new String[source.SecurityGroupIdsForNewRo.length];
            for (int i = 0; i < source.SecurityGroupIdsForNewRo.length; i++) {
                this.SecurityGroupIdsForNewRo[i] = new String(source.SecurityGroupIdsForNewRo[i]);
            }
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
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdsForNewRo.", this.SecurityGroupIdsForNewRo);

    }
}

