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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollingUpdateApplicationByVersionRequest extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Update version. For image-based deployment, it is the value. For deployment with JAR/WAR files, it is `Version`.
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * JAR/WAR package name. It’s only required for deployment with JAR/WAR files.
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * Request source. Options: `IntelliJ`, `Coding`
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * The deployment policy. Values: `AUTO` (automatically deploy), `BETA` (deploy a small batch first to test the result, and deploy the rest automatically) and `MANUAL` (manually deploy)
    */
    @SerializedName("DeployStrategyType")
    @Expose
    private String DeployStrategyType;

    /**
    * Total number of batches
    */
    @SerializedName("TotalBatchCount")
    @Expose
    private Long TotalBatchCount;

    /**
    * Interval between the batches
    */
    @SerializedName("BatchInterval")
    @Expose
    private Long BatchInterval;

    /**
    * Number of instances in a beta batch
    */
    @SerializedName("BetaBatchNum")
    @Expose
    private Long BetaBatchNum;

    /**
    * Minimum number of available instances during the deployment
    */
    @SerializedName("MinAvailable")
    @Expose
    private Long MinAvailable;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Update version. For image-based deployment, it is the value. For deployment with JAR/WAR files, it is `Version`. 
     * @return DeployVersion Update version. For image-based deployment, it is the value. For deployment with JAR/WAR files, it is `Version`.
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set Update version. For image-based deployment, it is the value. For deployment with JAR/WAR files, it is `Version`.
     * @param DeployVersion Update version. For image-based deployment, it is the value. For deployment with JAR/WAR files, it is `Version`.
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get JAR/WAR package name. It’s only required for deployment with JAR/WAR files. 
     * @return PackageName JAR/WAR package name. It’s only required for deployment with JAR/WAR files.
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set JAR/WAR package name. It’s only required for deployment with JAR/WAR files.
     * @param PackageName JAR/WAR package name. It’s only required for deployment with JAR/WAR files.
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Request source. Options: `IntelliJ`, `Coding` 
     * @return From Request source. Options: `IntelliJ`, `Coding`
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Request source. Options: `IntelliJ`, `Coding`
     * @param From Request source. Options: `IntelliJ`, `Coding`
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get The deployment policy. Values: `AUTO` (automatically deploy), `BETA` (deploy a small batch first to test the result, and deploy the rest automatically) and `MANUAL` (manually deploy) 
     * @return DeployStrategyType The deployment policy. Values: `AUTO` (automatically deploy), `BETA` (deploy a small batch first to test the result, and deploy the rest automatically) and `MANUAL` (manually deploy)
     */
    public String getDeployStrategyType() {
        return this.DeployStrategyType;
    }

    /**
     * Set The deployment policy. Values: `AUTO` (automatically deploy), `BETA` (deploy a small batch first to test the result, and deploy the rest automatically) and `MANUAL` (manually deploy)
     * @param DeployStrategyType The deployment policy. Values: `AUTO` (automatically deploy), `BETA` (deploy a small batch first to test the result, and deploy the rest automatically) and `MANUAL` (manually deploy)
     */
    public void setDeployStrategyType(String DeployStrategyType) {
        this.DeployStrategyType = DeployStrategyType;
    }

    /**
     * Get Total number of batches 
     * @return TotalBatchCount Total number of batches
     */
    public Long getTotalBatchCount() {
        return this.TotalBatchCount;
    }

    /**
     * Set Total number of batches
     * @param TotalBatchCount Total number of batches
     */
    public void setTotalBatchCount(Long TotalBatchCount) {
        this.TotalBatchCount = TotalBatchCount;
    }

    /**
     * Get Interval between the batches 
     * @return BatchInterval Interval between the batches
     */
    public Long getBatchInterval() {
        return this.BatchInterval;
    }

    /**
     * Set Interval between the batches
     * @param BatchInterval Interval between the batches
     */
    public void setBatchInterval(Long BatchInterval) {
        this.BatchInterval = BatchInterval;
    }

    /**
     * Get Number of instances in a beta batch 
     * @return BetaBatchNum Number of instances in a beta batch
     */
    public Long getBetaBatchNum() {
        return this.BetaBatchNum;
    }

    /**
     * Set Number of instances in a beta batch
     * @param BetaBatchNum Number of instances in a beta batch
     */
    public void setBetaBatchNum(Long BetaBatchNum) {
        this.BetaBatchNum = BetaBatchNum;
    }

    /**
     * Get Minimum number of available instances during the deployment 
     * @return MinAvailable Minimum number of available instances during the deployment
     */
    public Long getMinAvailable() {
        return this.MinAvailable;
    }

    /**
     * Set Minimum number of available instances during the deployment
     * @param MinAvailable Minimum number of available instances during the deployment
     */
    public void setMinAvailable(Long MinAvailable) {
        this.MinAvailable = MinAvailable;
    }

    public RollingUpdateApplicationByVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollingUpdateApplicationByVersionRequest(RollingUpdateApplicationByVersionRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.DeployStrategyType != null) {
            this.DeployStrategyType = new String(source.DeployStrategyType);
        }
        if (source.TotalBatchCount != null) {
            this.TotalBatchCount = new Long(source.TotalBatchCount);
        }
        if (source.BatchInterval != null) {
            this.BatchInterval = new Long(source.BatchInterval);
        }
        if (source.BetaBatchNum != null) {
            this.BetaBatchNum = new Long(source.BetaBatchNum);
        }
        if (source.MinAvailable != null) {
            this.MinAvailable = new Long(source.MinAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "DeployStrategyType", this.DeployStrategyType);
        this.setParamSimple(map, prefix + "TotalBatchCount", this.TotalBatchCount);
        this.setParamSimple(map, prefix + "BatchInterval", this.BatchInterval);
        this.setParamSimple(map, prefix + "BetaBatchNum", this.BetaBatchNum);
        this.setParamSimple(map, prefix + "MinAvailable", this.MinAvailable);

    }
}

