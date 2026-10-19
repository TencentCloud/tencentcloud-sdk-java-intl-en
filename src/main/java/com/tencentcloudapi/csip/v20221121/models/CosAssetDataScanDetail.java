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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAssetDataScanDetail extends AbstractModel {

    /**
    * <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Recognition progress</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>Last scan time.</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private Long LatestScanTime;

    /**
    * <p>Recognition failed information.</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * <p>Recognition result category details</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private CosIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>None.</p>
    */
    @SerializedName("RuleDetails")
    @Expose
    private CosIdentifyRuleDetail [] RuleDetails;

    /**
    * <p>None.</p>
    */
    @SerializedName("LevelDetails")
    @Expose
    private CosIdentifyLevelDetail [] LevelDetails;

    /**
    * <p>Whether a full scan has been initiated</p>
    */
    @SerializedName("IsFullScanned")
    @Expose
    private Boolean IsFullScanned;

    /**
     * Get <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p> 
     * @return Status <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     * @param Status <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Recognition progress</p> 
     * @return Progress <p>Recognition progress</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Recognition progress</p>
     * @param Progress <p>Recognition progress</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Last scan time.</p> 
     * @return LatestScanTime <p>Last scan time.</p>
     */
    public Long getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>Last scan time.</p>
     * @param LatestScanTime <p>Last scan time.</p>
     */
    public void setLatestScanTime(Long LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>Recognition failed information.</p> 
     * @return ErrorInfo <p>Recognition failed information.</p>
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>Recognition failed information.</p>
     * @param ErrorInfo <p>Recognition failed information.</p>
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>Recognition result category details</p> 
     * @return CategoryDetails <p>Recognition result category details</p>
     */
    public CosIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>Recognition result category details</p>
     * @param CategoryDetails <p>Recognition result category details</p>
     */
    public void setCategoryDetails(CosIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>None.</p> 
     * @return RuleDetails <p>None.</p>
     */
    public CosIdentifyRuleDetail [] getRuleDetails() {
        return this.RuleDetails;
    }

    /**
     * Set <p>None.</p>
     * @param RuleDetails <p>None.</p>
     */
    public void setRuleDetails(CosIdentifyRuleDetail [] RuleDetails) {
        this.RuleDetails = RuleDetails;
    }

    /**
     * Get <p>None.</p> 
     * @return LevelDetails <p>None.</p>
     */
    public CosIdentifyLevelDetail [] getLevelDetails() {
        return this.LevelDetails;
    }

    /**
     * Set <p>None.</p>
     * @param LevelDetails <p>None.</p>
     */
    public void setLevelDetails(CosIdentifyLevelDetail [] LevelDetails) {
        this.LevelDetails = LevelDetails;
    }

    /**
     * Get <p>Whether a full scan has been initiated</p> 
     * @return IsFullScanned <p>Whether a full scan has been initiated</p>
     */
    public Boolean getIsFullScanned() {
        return this.IsFullScanned;
    }

    /**
     * Set <p>Whether a full scan has been initiated</p>
     * @param IsFullScanned <p>Whether a full scan has been initiated</p>
     */
    public void setIsFullScanned(Boolean IsFullScanned) {
        this.IsFullScanned = IsFullScanned;
    }

    public CosAssetDataScanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAssetDataScanDetail(CosAssetDataScanDetail source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new Long(source.LatestScanTime);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new CosIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new CosIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.RuleDetails != null) {
            this.RuleDetails = new CosIdentifyRuleDetail[source.RuleDetails.length];
            for (int i = 0; i < source.RuleDetails.length; i++) {
                this.RuleDetails[i] = new CosIdentifyRuleDetail(source.RuleDetails[i]);
            }
        }
        if (source.LevelDetails != null) {
            this.LevelDetails = new CosIdentifyLevelDetail[source.LevelDetails.length];
            for (int i = 0; i < source.LevelDetails.length; i++) {
                this.LevelDetails[i] = new CosIdentifyLevelDetail(source.LevelDetails[i]);
            }
        }
        if (source.IsFullScanned != null) {
            this.IsFullScanned = new Boolean(source.IsFullScanned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamArrayObj(map, prefix + "RuleDetails.", this.RuleDetails);
        this.setParamArrayObj(map, prefix + "LevelDetails.", this.LevelDetails);
        this.setParamSimple(map, prefix + "IsFullScanned", this.IsFullScanned);

    }
}

