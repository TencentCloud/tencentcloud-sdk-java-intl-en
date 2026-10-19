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

public class CosAssetFileIdentifyInfo extends AbstractModel {

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File path</p>
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

    /**
    * <p>Details of categorical data items</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private CosIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>Bucket information</p>
    */
    @SerializedName("BucketInfo")
    @Expose
    private CosBucketInfo BucketInfo;

    /**
    * <p>Last scan time</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private Long LastScanTime;

    /**
    * <p>Handling status</p>
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * <p>Result unique ID</p>
    */
    @SerializedName("ResultId")
    @Expose
    private String ResultId;

    /**
    * <p>Rule details</p>
    */
    @SerializedName("RuleDetails")
    @Expose
    private CosIdentifyRuleDetail [] RuleDetails;

    /**
    * <p>Level details</p>
    */
    @SerializedName("LevelDetails")
    @Expose
    private CosIdentifyLevelDetail [] LevelDetails;

    /**
    * <p>Template ID.</p>
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
     * Get <p>File name.</p> 
     * @return FileName <p>File name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name.</p>
     * @param FileName <p>File name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File path</p> 
     * @return DirName <p>File path</p>
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set <p>File path</p>
     * @param DirName <p>File path</p>
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
    }

    /**
     * Get <p>Details of categorical data items</p> 
     * @return CategoryDetails <p>Details of categorical data items</p>
     */
    public CosIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>Details of categorical data items</p>
     * @param CategoryDetails <p>Details of categorical data items</p>
     */
    public void setCategoryDetails(CosIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>Bucket information</p> 
     * @return BucketInfo <p>Bucket information</p>
     */
    public CosBucketInfo getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set <p>Bucket information</p>
     * @param BucketInfo <p>Bucket information</p>
     */
    public void setBucketInfo(CosBucketInfo BucketInfo) {
        this.BucketInfo = BucketInfo;
    }

    /**
     * Get <p>Last scan time</p> 
     * @return LastScanTime <p>Last scan time</p>
     */
    public Long getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>Last scan time</p>
     * @param LastScanTime <p>Last scan time</p>
     */
    public void setLastScanTime(Long LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get <p>Handling status</p> 
     * @return HandleStatus <p>Handling status</p>
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set <p>Handling status</p>
     * @param HandleStatus <p>Handling status</p>
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get <p>Result unique ID</p> 
     * @return ResultId <p>Result unique ID</p>
     */
    public String getResultId() {
        return this.ResultId;
    }

    /**
     * Set <p>Result unique ID</p>
     * @param ResultId <p>Result unique ID</p>
     */
    public void setResultId(String ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get <p>Rule details</p> 
     * @return RuleDetails <p>Rule details</p>
     */
    public CosIdentifyRuleDetail [] getRuleDetails() {
        return this.RuleDetails;
    }

    /**
     * Set <p>Rule details</p>
     * @param RuleDetails <p>Rule details</p>
     */
    public void setRuleDetails(CosIdentifyRuleDetail [] RuleDetails) {
        this.RuleDetails = RuleDetails;
    }

    /**
     * Get <p>Level details</p> 
     * @return LevelDetails <p>Level details</p>
     */
    public CosIdentifyLevelDetail [] getLevelDetails() {
        return this.LevelDetails;
    }

    /**
     * Set <p>Level details</p>
     * @param LevelDetails <p>Level details</p>
     */
    public void setLevelDetails(CosIdentifyLevelDetail [] LevelDetails) {
        this.LevelDetails = LevelDetails;
    }

    /**
     * Get <p>Template ID.</p> 
     * @return ComplianceId <p>Template ID.</p>
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set <p>Template ID.</p>
     * @param ComplianceId <p>Template ID.</p>
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    public CosAssetFileIdentifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAssetFileIdentifyInfo(CosAssetFileIdentifyInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.DirName != null) {
            this.DirName = new String(source.DirName);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new CosIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new CosIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.BucketInfo != null) {
            this.BucketInfo = new CosBucketInfo(source.BucketInfo);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new Long(source.LastScanTime);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.ResultId != null) {
            this.ResultId = new String(source.ResultId);
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
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "DirName", this.DirName);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamObj(map, prefix + "BucketInfo.", this.BucketInfo);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamArrayObj(map, prefix + "RuleDetails.", this.RuleDetails);
        this.setParamArrayObj(map, prefix + "LevelDetails.", this.LevelDetails);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);

    }
}

